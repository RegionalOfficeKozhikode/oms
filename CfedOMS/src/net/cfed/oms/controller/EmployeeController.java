/**
 * 
 */
package net.cfed.oms.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.cfed.oms.model.SendMailModel;
import net.cfed.oms.service.EmployeeService;
import net.cfed.oms.serviceImpl.EmployeeServiceImpl;

import org.apache.catalina.connector.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



/**
 * @author nijeshm
 *
 */
@Controller
public class EmployeeController {
	
	@RequestMapping("/team")
	public ModelAndView helloWorld() {

		String message = "Welcome admin";
		//System.out.println(message);
		return new ModelAndView("employees", "message", message);
	}
	
	@RequestMapping("/registration")
	public ModelAndView registraton(HttpServletRequest request, HttpServletResponse response) {
		System.out.println(" testing ");
		SendMailModel sendMailModel = new SendMailModel();
		
		String emailId = request.getParameter("emailId");
		String name = request.getParameter("firstName");
		String empId = request.getParameter("employeeId");
		int employeeId = Integer.parseInt(empId);
		System.out.println(" Email Id : "+emailId);
		sendMailModel.setEmailId(emailId);
		sendMailModel.setEmployeeId(employeeId);
		sendMailModel.setFirstName(name);
		
		EmployeeServiceImpl employeeServiceImpl = new EmployeeService();
		String message = employeeServiceImpl.sendRegistration(sendMailModel);
		
		System.out.println(" message : "+message);
		//System.out.println(message);
		return new ModelAndView("employees", "message", message);
	}
	
	@RequestMapping("/mailBusinessCard")
	public ModelAndView emailBusinessCard(HttpServletRequest request, HttpServletResponse response) {
		System.out.println(" sent Business card  ");
		SendMailModel sendMailModel = new SendMailModel();
		
		String emailId = request.getParameter("emailId");
		System.out.println(" Email Id : "+emailId);
		sendMailModel.setEmailId(emailId);
		
		EmployeeServiceImpl employeeServiceImpl = new EmployeeService();
		String message = employeeServiceImpl.sendBussinessCard(sendMailModel);
		
		System.out.println(" message : "+message);
		//System.out.println(message);
		return new ModelAndView("employees", "message", message);
	}

}
