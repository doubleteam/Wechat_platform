package cn.sunshine.text;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.sunshine.domain.Vip;
import cn.sunshine.service.VipService;

/**
 * @Description: 使用spring整合jUnit测试
 * @Author: nutony
 * @Company: http://java.itcast.cn
 * @CreateDate: 2014-3-13
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:beans.xml")
public class TestSpring {
	@Autowired()
	VipService vipService;
	@Test
	public void testService() {
		/*Vip f = vipService.get("2");
		System.out.println(f.getVipStatus());*/
		Vip vip = new Vip();
		vip.setVuuid("");
		vip.setVipGold("999");
		vip.setVipIntegral("999");
		vip.setVipLevel("无");
		vip.setVipStatus("不正常");
		vipService.insert(vip);
	}
}
