package cn.sunshine.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.sunshine.pojo.AccessToken;
import cn.sunshine.pojo.Button;
import cn.sunshine.pojo.CommonButton;
import cn.sunshine.pojo.ComplexButton;
import cn.sunshine.pojo.Menu;
import cn.sunshine.pojo.ViewButton;
import cn.sunshine.util.WeixinUtil;

/**
 * 菜单管理器类
 * @author xiaoxuan
 *
 */
public class MenuManager {
	private static Logger log = LoggerFactory.getLogger(MenuManager.class);
	
	public static void main(String[] args) {
		//第三方用户唯一凭证
		String appId = "wx7edb6c2fc0d30ebd";
		// 第三方用户唯一凭证密钥  
		String appSecret ="2a7c7cc436bba6c2a52a43f22bdbc19d";
		
		//调用接口获取access_token
		AccessToken at = WeixinUtil.getAccessToken(appId, appSecret);
		
		if(null != at){
			//调用接口创建菜单
			int result = WeixinUtil.createMenu(getMenu(),at.getToken());
			
			//判断菜单创建结果
			if(0 == result)
				log.info("菜单创建成功！");
			else
				log.info("菜单创建失败，错误码："+result);
		}
	}
	
	/**
	 * 组装菜单数据
	 * @return
	 */
	private static Menu getMenu(){
		CommonButton btn11 = new CommonButton();
		btn11.setName("我的积分");
		btn11.setType("click");
		btn11.setKey("11");

		CommonButton btn12 = new CommonButton();
		btn12.setName("我的金币");
		btn12.setType("click");
		btn12.setKey("12");

		CommonButton btn13 = new CommonButton();
		btn13.setName("我的会员等级");
		btn13.setType("click");
		btn13.setKey("13");

		CommonButton btn14 = new CommonButton();
		btn14.setName("我的状态");
		btn14.setType("click");
		btn14.setKey("14");

		CommonButton btn21 = new CommonButton();
		btn21.setName("联系方式");
		btn21.setType("click");
		btn21.setKey("21");

		CommonButton btn22 = new CommonButton();
		btn22.setName("服务范围");
		btn22.setType("click");
		btn22.setKey("22");

		CommonButton btn23 = new CommonButton();
		btn23.setName("服务时间");
		btn23.setType("click");
		btn23.setKey("23");

		CommonButton btn24 = new CommonButton();
		btn24.setName("优惠套餐");
		btn24.setType("click");
		btn24.setKey("24");

		CommonButton btn31 = new CommonButton();
		btn31.setName("幽默笑话");
		btn31.setType("click");
		btn31.setKey("31");

		ViewButton btn32 = new ViewButton();
		btn32.setName("使用帮助");
		btn32.setType("view");
		btn32.setUrl("http://www.caifuq.com/Demo2/help.jsp");

		ComplexButton mainBtn1 = new ComplexButton();
		mainBtn1.setName("我的会员");
		mainBtn1.setSub_button(new CommonButton[] { btn11, btn12, btn13, btn14 });

		ComplexButton mainBtn2 = new ComplexButton();
		mainBtn2.setName("关于我们");
		mainBtn2.setSub_button(new CommonButton[] { btn21, btn22, btn23, btn24});

		ComplexButton mainBtn3 = new ComplexButton();
		mainBtn3.setName("更多体验");
		mainBtn3.setSub_button(new Button[] { btn31,btn32});

		/**
		 * 这是公众号xiaoqrobot目前的菜单结构，每个一级菜单都有二级菜单项<br>
		 * 
		 * 在某个一级菜单下没有二级菜单的情况，menu该如何定义呢？<br>
		 * 比如，第三个一级菜单项不是“更多体验”，而直接是“幽默笑话”，那么menu应该这样定义：<br>
		 * menu.setButton(new Button[] { mainBtn1, mainBtn2, btn33 });
		 */
		Menu menu = new Menu();
		menu.setButton(new Button[] { mainBtn1, mainBtn2, mainBtn3 });

		return menu;
	}
}
