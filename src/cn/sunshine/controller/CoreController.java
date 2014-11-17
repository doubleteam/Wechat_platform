package cn.sunshine.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.sunshine.domain.About;
import cn.sunshine.domain.More;
import cn.sunshine.domain.Vip;
import cn.sunshine.message.resp.Article;
import cn.sunshine.message.resp.NewsMessage;
import cn.sunshine.message.resp.TextMessage;
import cn.sunshine.message.util.MessageUtil;
import cn.sunshine.service.AboutService;
import cn.sunshine.service.MoreService;
import cn.sunshine.service.VipService;


/**
 * 核心管理 类
 * 
 * @author xiaoxuan
 * 
 */

@Controller
public class CoreController {
	
	@RequestMapping(value="/CoreServlet",method=RequestMethod.POST)
	public String processRequest(HttpServletRequest request,VipService vipService,AboutService aboutService,MoreService moreService){
		String respMessage = null;
		
		/*ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		VipService vipService = (VipService) context.getBean("vipService");*/
		
		try {
			
			//默认返回的文本消息内容
			String respContent = "请求处理异常，请稍等尝试！";
			
			// xml请求解析
			Map<String, String> requestMap = MessageUtil.parseXml(request);
			
			//发送方账号（open_id）
			String fromUserName = requestMap.get("FromUserName");
			//公众账号
			String toUserName = requestMap.get("ToUserName");
			//消息类型
			String msgType = requestMap.get("MsgType");
			
			//测试
			String remoteHost = request.getRemoteHost();
			String pathInfo = request.getPathInfo();
			int remotePort = request.getRemotePort();
			String remoteAddr = request.getRemoteAddr();
			String requestURI = request.getRequestURI();
			
			System.out.println(remoteHost+"remoteHost");
			System.out.println(pathInfo+"pathInfo");
			System.out.println(remotePort+"remotePort");
			System.out.println(remoteAddr+"remoteAddr");
			System.out.println(requestURI+"requestURI");
			System.out.println(vipService+"vipService");
    		System.out.println(aboutService+"aboutService");
    		System.out.println(moreService+"moreService");
			
    		//获取一个文本消息对象
    		TextMessage textMessage = CreateTextMessage(fromUserName,
					toUserName);
			
			// 文本消息  
			if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_TEXT)) {
			    String content =requestMap.get("Content");
			    //是QQ表情就返回该用户发送的QQ表情
			    if(MessageUtil.isQQFace(content)){
			    	respContent = content;
			    	textMessage.setContent(respContent);
			    	respMessage = MessageUtil.textMessageToXml(textMessage);
			    }else if(content == "？" || content == "?" || content.equals("？") || content.equals("?")){
			    	respContent = "您好，我是客服小X"+ MessageUtil.emoji(0x1F60A) + "\n"+
		    				"请回复数字选择服务：\n\n"  +  
		    				"1.新闻\n"+
		    				"2.待开放\n"+
		    				"3.待开放\n\n"+
		    				"回复“？”显示数字菜单"+ MessageUtil.emoji(0x2754);
		    	textMessage.setContent(respContent);
				respMessage = MessageUtil.textMessageToXml(textMessage);
			    }else if(content == "1" || content.equals("1")){
			    	NewsMessage newsMessage = new NewsMessage();
			    	newsMessage.setToUserName(fromUserName);
			    	newsMessage.setFromUserName(toUserName);
			    	newsMessage.setCreateTime(new Date().getTime());
			    	newsMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_NEWS);
			    	newsMessage.setFuncFlag(0);
			    	
			    	List<Article> articleList = new ArrayList<Article>();
			    	Article article1 = new Article();
			    	article1.setTitle("APEC单双号限行结束 北京早高峰重现拥堵1");
			    	article1.setDescription("2014年11月13日，北京机动车尾号限行恢复首日，早高峰重现拥堵状态。");
			    	article1.setPicUrl("http://www.caifuq.com/Demo2/image/news/news1.png");
			    	article1.setUrl("http://china.huanqiu.com/photo/2014-11/2752330.html");
			    	
			    	Article article2 = new Article();
			    	article2.setTitle("APEC单双号限行结束 北京早高峰重现拥堵2");
			    	article2.setDescription("2014年11月13日，北京机动车尾号限行恢复首日，早高峰重现拥堵状态。");
			    	article2.setPicUrl("http://www.caifuq.com/Demo2/image/news/news2.png");
			    	article2.setUrl("http://china.huanqiu.com/photo/2014-11/2752330.html");

			    	Article article3 = new Article();
			    	article3.setTitle("APEC单双号限行结束 北京早高峰重现拥堵3");
			    	article3.setDescription("2014年11月13日，北京机动车尾号限行恢复首日，早高峰重现拥堵状态。");
			    	article3.setPicUrl("http://www.caifuq.com/Demo2/image/news/news3.png");
			    	article3.setUrl("http://china.huanqiu.com/photo/2014-11/2752330.html");
			    	articleList.add(article1);
			    	articleList.add(article2);
			    	articleList.add(article3);
			    	//设置图文消息个数
			    	newsMessage.setArticleCount(articleList.size());
			    	// 设置图文消息包含的图文集合  
			    	newsMessage.setArticles(articleList);
			    	
			    	
			    	respMessage = MessageUtil.newsMessageToXml(newsMessage);
			    }
			    
			    else{
			    	respContent = "您说的太深奥了，可以换个说法吗？"+ MessageUtil.emoji(0x1F60A)+"\n\n"+
			    			"回复“？”显示菜单"+ MessageUtil.emoji(0x2754);
			    	textMessage.setContent(respContent);
			    	respMessage = MessageUtil.textMessageToXml(textMessage);
			    }
			    
			    
			}  
			// 图片消息  
			else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_IMAGE)) {
				respContent = "发张美女给我吧！" + MessageUtil.emoji(0x1F467);  

				textMessage.setContent(respContent);
				respMessage = MessageUtil.textMessageToXml(textMessage);
			}  
			// 地理位置消息  
			else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_LOCATION)) {  
				respContent = "一会我去找你！" + MessageUtil.emoji(0x1F37A);  

				textMessage.setContent(respContent);
				respMessage = MessageUtil.textMessageToXml(textMessage);
			}  
		    // 链接消息  
		    else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_LINK)) {  
		    	respContent = "我不点，有毒怎么办！"  + MessageUtil.emoji(0x1F44E);  

		    	textMessage.setContent(respContent);
				respMessage = MessageUtil.textMessageToXml(textMessage);
			}  
			// 音频消息  
		    else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_VOICE)) {  
		    	respContent = "我暂时还听不懂你在说什么哦！" + MessageUtil.emoji(0x1F4BF);  

		    	textMessage.setContent(respContent);
				respMessage = MessageUtil.textMessageToXml(textMessage);
			}  
			// 事件推送  
			
		    else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_EVENT)) {  
		    	//事件类型
		    	String eventType = requestMap.get("Event");
		    	//订阅
		    	if(eventType.equals(MessageUtil.EVENT_TYPE_SUBSCRIBE)){
		    		//SqlSession sqlSession = MybatisUtil.openSession();
		    		//VipDao vipDao = sqlSession.getMapper(VipDao.class);
		    		String uuid;
		    		//新关注会员的uuid
		    		uuid=UUID.randomUUID().toString();
		    		System.out.println("uuid"+uuid);
		    		Vip vip = new Vip();
		    		vip.setVuuid(fromUserName);
		    		vip.setVipGold("0");
		    		vip.setVipIntegral("0");
		    		vip.setVipLevel("黄铜");
		    		vip.setVipStatus("正常");
		    		vipService.insert(vip);
		    		respContent = "谢谢您的关注"+ MessageUtil.emoji(0x1F60A) + 
		    				"\n请回复数字选择服务："  +  
		    				"\n\n1.新闻"+
		    				"\n2.待开放"+
		    				"\n3.待开放"+
		    				"\n\n回复“？”显示数字菜单"+ MessageUtil.emoji(0x2754);
		    		textMessage.setContent(respContent);
		    		respMessage = MessageUtil.textMessageToXml(textMessage);
		    	}
		    	//取消订阅
		    	else if (eventType.equals(MessageUtil.EVENT_TYPE_UNSUBSCRIBE)){
		    		vipService.deleteByVuuid(fromUserName);
		    	}
		    	//自定义菜单点击事件
		    	else if(eventType.equals(MessageUtil.EVENT_TYPE_CLICK)){
		    		//事件key值，与创建自定义菜单时指定的key值对应
		    		String eventKey = requestMap.get("EventKey");
		    		//System.out.println(uuid);
		    		if (eventKey.equals("11")) {
		    			//获取当前的vip
		    			Vip vip = vipService.getVipId(fromUserName);
		    			respContent = "您的积分为："+vip.getVipIntegral()+"\n请充值（待开放）";  
		    		} else if (eventKey.equals("12")) { 
		    			Vip vip = vipService.getVipId(fromUserName);
                        respContent = "您的金币为："+vip.getVipGold()+"\n请充值（待开放）";  
		    		} else if (eventKey.equals("13")) {  
		    			Vip vip = vipService.getVipId(fromUserName);
		    			respContent = "您的会员等级为："+vip.getVipLevel();  
		    		} else if (eventKey.equals("14")) { 
		    			Vip vip = vipService.getVipId(fromUserName);
		    			respContent = "您的账号为："+fromUserName+"\n您的状态为："+vip.getVipStatus();  
		    		} else if (eventKey.equals("21")) {
		    			//获取服务商的信息，1为当前服务商id,
			    		About about = aboutService.get(1);
		    			respContent = "客服QQ："+about.getCustomServiceQQ()+"\n电话："+about.getCustomServicePhone();  
		    		} else if (eventKey.equals("22")) {  
		    			//获取服务商的信息，1为当前服务商id,
			    		About about = aboutService.get(1);
		    			respContent = "感谢您的关注，目前我们的服务范围为:"+about.getScope();  
		    		} else if (eventKey.equals("23")) {  
		    			//获取服务商的信息，1为当前服务商id,
			    		About about = aboutService.get(1);
		    			respContent = "我们的服务时间为："+about.getServiceTime()+"之间，其他时间请留言";  
		    		} else if (eventKey.equals("24")) {  
		    			//获取服务商的信息，1为当前服务商id,
			    		About about = aboutService.get(1);
		    			respContent = about.getPrice();  
		    		} else if (eventKey.equals("31")) { 
		    			//规定范围内的随机数，不出现0
		    			int num =ThreadLocalRandom.current().nextInt(MessageUtil.JOKE_COUNT_FIRST,MessageUtil.JOKE_COUNT_ALL);
		    			//随机查询一条幽默笑话
		    			More more =moreService.get(num);
		    			respContent = more.getJoke();  
                  }  
		    	}
		    	textMessage.setContent(respContent);
				respMessage = MessageUtil.textMessageToXml(textMessage);
		    }
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null == respMessage?"暂时未获取到您发的消息，请稍后！":respMessage;
	}

	/**
	 *  创建文本消息
	 *  
	 * @param fromUserName
	 * @param toUserName
	 * @return
	 */
	private TextMessage CreateTextMessage(String fromUserName, String toUserName) {
		//回复文本消息
		TextMessage textMessage = new TextMessage();
		textMessage.setToUserName(fromUserName);
		textMessage.setFromUserName(toUserName);
		textMessage.setCreateTime(new Date().getTime());
		textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);
		textMessage.setFuncFlag(0);
		return textMessage;
	}
}
