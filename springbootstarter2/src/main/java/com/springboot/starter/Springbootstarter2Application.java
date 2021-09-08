package com.springboot.starter;

import java.io.IOException;

import org.apache.catalina.LifecycleException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springbootstarter2Application {

	public static void main(String[] args) throws LifecycleException, IOException {
		
		SpringApplication.run(Springbootstarter2Application.class, args);
//		Tomcat tomcat = new Tomcat();
//		tomcat.setPort(8080);
//		
//		String docBase = Files.createTempDirectory("tomcat-basedir").toString();
//		Context context = tomcat.addContext("/", docBase);
//		
//		HttpServlet servlet = new HttpServlet() {
//			
//			@Override
//			protected void doGet(HttpServletRequest req, HttpServletResponse resp)
//					throws ServletException, IOException {
//				PrintWriter writer = resp.getWriter();
//				writer.println("<html><head><title>");
//				writer.println("Hey, Tomcat");
//				writer.println("</title></head><title>");
//				writer.println("</body><h1>Hello Tomcat</h1></body>");
//				writer.println("</html>");
//				
//			}
//			
//		};
//		String servletName = "helloServlet";
//		tomcat.addServlet("/", servletName, servlet);
//		context.addServletMappingDecoded("/hello", servletName);
//		
//		tomcat.start();
//		tomcat.getServer().await();
		//  이런일들을 내장 톰캣이 해준다.. 자동으로!@
	}

}
