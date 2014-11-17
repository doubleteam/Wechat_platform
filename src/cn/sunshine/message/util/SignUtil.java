package cn.sunshine.message.util;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Iterator;

/**
 * 请求效验工具类
 * @author xiaoxuan
 *
 */
public class SignUtil {

	private static String token="sunshine";
	
	/**
	 * 验证签名
	 * @param signature
	 * @param timestamp
	 * @param nonce
	 * @return
	 */
	public static boolean checkSignature(String signature,String timestamp,String nonce){
		String []arr = new String[]{token,timestamp,nonce};
		//将token,timestamp,nonce进行字典序排序
		Arrays.sort(arr);
		StringBuilder content = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			content.append(arr[i]);
		}
		MessageDigest md = null;
		String tmpStr = null;
		
		try {
			md = MessageDigest.getInstance("SHA-1");
			//将三个参数字符串拼接成一个字符串进行sha1加密
			byte[] digest= md.digest(content.toString().getBytes());
			tmpStr=byteToStr(digest);
		} catch (Exception e) {
			e.printStackTrace();
		}
		content=null;
		//将sha1加密后的字符串与signature进行对比，标识请求来源于微信
		return tmpStr != null ?tmpStr.equals(signature.toUpperCase()):false;
	}

	/**
	 * 将字节数组转换为十六进制字符串 
	 * @param byteArray
	 * @return
	 */
	private static String byteToStr(byte[] byteArray) {
		String strDigest = "";
		for (int i = 0; i < byteArray.length; i++) {
			strDigest += byteToHexStr(byteArray[i]);
		}
		return strDigest;
	}

	/**
	 * 将字节转换为十六进制字符串
	 * @param mByte
	 * @return
	 */
	private static String byteToHexStr(byte mByte) {
		char[] Digit = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };  
		char[] tempArr = new char[2];
		tempArr[0] = Digit[(mByte >>> 4)& 0X0F];
		tempArr[1] = Digit[mByte & 0X0F];
		String s = new String(tempArr);
		return s;
	}
}
