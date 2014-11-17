package cn.sunshine.domain;

/**
 * 关于 实体类
 * @author xiaoxuan
 *
 */
public class About {

	private int id;
	//客服QQ
	private int customServiceQQ;
	//客服电话
	private String customServicePhone;
	//服务范围
	private String scope;
	//服务时间
	private String serviceTime;
	//价格
	private String price;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCustomServiceQQ() {
		return customServiceQQ;
	}
	public void setCustomServiceQQ(int customServiceQQ) {
		this.customServiceQQ = customServiceQQ;
	}
	public String getCustomServicePhone() {
		return customServicePhone;
	}
	public void setCustomServicePhone(String customServicePhone) {
		this.customServicePhone = customServicePhone;
	}
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	public String getServiceTime() {
		return serviceTime;
	}
	public void setServiceTime(String serviceTime) {
		this.serviceTime = serviceTime;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
}
