package cn.sunshine.domain;

/**
 * Vip实体类
 * @author xiaoxuan
 *
 */
public class Vip {

	private int id;
	//用于识别当前vip
	private String vuuid;
	//vip等级
	private String vipLevel;
	//vip积分
	private String vipIntegral;
	//vip金币
	private String vipGold;
	//vip状态
	private String vipStatus;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getVuuid() {
		return vuuid;
	}
	public void setVuuid(String vuuid) {
		this.vuuid = vuuid;
	}
	public String getVipLevel() {
		return vipLevel;
	}
	public void setVipLevel(String vipLevel) {
		this.vipLevel = vipLevel;
	}
	public String getVipIntegral() {
		return vipIntegral;
	}
	public void setVipIntegral(String vipIntegral) {
		this.vipIntegral = vipIntegral;
	}
	public String getVipGold() {
		return vipGold;
	}
	public void setVipGold(String vipGold) {
		this.vipGold = vipGold;
	}
	public String getVipStatus() {
		return vipStatus;
	}
	public void setVipStatus(String vipStatus) {
		this.vipStatus = vipStatus;
	}
	
	
	
}
