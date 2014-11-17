package cn.sunshine.message.req;

/**
 * 消息基类
 * @author xiaoxuan
 *
 */
public class BaseMessage {

	//开发者微信号
	private String ToUserName;
	//发送方账号（一个openId）
	private String FromUserName;
	//消息创建shijian（整形）
	private long CreateTime;
	//消息类型（text/image/location/link）
	private String MsgType;
	//消息id，64位整形
	private long MsgId;
	public String getToUserName() {
		return ToUserName;
	}
	public void setToUserName(String toUserName) {
		ToUserName = toUserName;
	}
	public String getFromUserName() {
		return FromUserName;
	}
	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}
	public long getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(long createTime) {
		CreateTime = createTime;
	}
	public String getMsgType() {
		return MsgType;
	}
	public void setMsgType(String msgType) {
		MsgType = msgType;
	}
	public long getMsgId() {
		return MsgId;
	}
	public void setMsgId(long msgId) {
		MsgId = msgId;
	}
	
	
}
