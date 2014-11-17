package cn.sunshine.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import cn.sunshine.controller.CoreController;
import cn.sunshine.domain.Vip;
import cn.sunshine.message.util.SignUtil;
import cn.sunshine.service.AboutService;
import cn.sunshine.service.MoreService;
import cn.sunshine.service.VipService;


public class CoreServlet extends HttpServlet {

	private VipService vipService= null;  
	private AboutService aboutService= null;
	private MoreService moreService= null;
	
	
	public AboutService getAboutService() {
		return aboutService;
	}

	public void setAboutService(AboutService aboutService) {
		this.aboutService = aboutService;
	}

	public MoreService getMoreService() {
		return moreService;
	}

	public void setMoreService(MoreService moreService) {
		this.moreService = moreService;
	}

	public VipService getVipService() {  
	    return vipService;  
	}  
	  
	public void setVipService(VipService vipService) {  
	    this.vipService = vipService;  
	    System.out.println("VipService实例"+vipService);
	}  
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		ServletContext servletContext = this.getServletContext();
		WebApplicationContext context = null;
		context = WebApplicationContextUtils
				.getRequiredWebApplicationContext(servletContext);
		this.setVipService((VipService) context.getBean("vipService"));// Spring 配置 中的 bean id
		this.setAboutService((AboutService)context.getBean("aboutService"));
		this.setMoreService((MoreService)context.getBean("moreService"));
	}

	
	/**
	 * 确认来自微信服务器
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//微信加密签名
		String signature = request.getParameter("signature");
		//时间戳
		String timestamp = request.getParameter("timestamp");
		//随机数
		String nonce = request.getParameter("nonce");
		//随机字符串
		String echostr = request.getParameter("echostr");
		PrintWriter out = response.getWriter();
		//通过检验signature对请求进行校验，若校验成功则原样返回echostr，表示接入成功，否则接入失败
		if(SignUtil.checkSignature(signature, timestamp, nonce)){
			out.print(echostr);
		}
		out.close();
		out = null;
		
		
	}

	/**
	 * 响应
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print(new CoreController().processRequest(request,vipService,aboutService,moreService)+"。\n没获取到！");
	}

}
