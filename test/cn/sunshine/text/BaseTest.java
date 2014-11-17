package cn.sunshine.text;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.sunshine.domain.More;
import cn.sunshine.service.MoreService;
import cn.sunshine.service.VipService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:beans.xml")
public class BaseTest {
	@Autowired
	private VipService vipService;
	@Autowired
	private MoreService moreService;
	
	@Test
	public void testInsertVip() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		
		
		//System.out.println(ac.getBean("vipDao"));
		
		More more = moreService.get(4);
		System.out.println(more.getJoke());
		/*	Vip f = vipService.get("2");
			
			System.out.println(f.getVipStatus());*/
			
			/*Vip vip = new Vip();
			vip.setId(312);
			vip.setVuuid("423");
			vip.setVipGold("312");
			vip.setVipIntegral("312");
			vip.setVipLevel("无");
			vip.setVipStatus("不正常");
			vipService.insert(vip);*/
	}

}
