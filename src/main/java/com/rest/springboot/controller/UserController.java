package com.rest.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController {
	
	
	  @GetMapping("/admin-dashboard")
	    public String admindashboard() {
		  System.out.println("user-admin-dashboard()");
	        return "views/admin-dashboard";
	    }
	  
	  @GetMapping("/appointment")
	    public String appointment() {
		  System.out.println("user-appointment()");
	        return "views/appointment";
	    }
	  
	  @GetMapping("/billing")
	    public String billing() {
		  System.out.println("user-billing()");
	        return "views/billing";
	    }
	  
	  @GetMapping("/departments")
	    public String departments() {
		  System.out.println("user-departments()");
	        return "views/departments";
	    }
	  
	  @GetMapping("/doctor-dashboard")
	    public String doctordashboard() {
		  System.out.println("user-doctor-dashboard()");
	        return "views/doctor-dashboard";
	    }
	  
	  @GetMapping("/doctors")
	    public String doctors() {
		  System.out.println("user-doctors()");
	        return "views/doctors";
	    }
	  
	  @GetMapping("/index")
	    public String index() {
		  System.out.println("user-index()");
	        return "views/index";
	    }
	  
	  @GetMapping("/login")
	    public String login() {
		  System.out.println("user-login()");
	        return "views/login";
	    }
	  
	  @GetMapping("/medical-records")
	    public String medicalrecords() {
		  System.out.println("user-medical-records()");
	        return "views/medical-records";
	    }
	  
	  @GetMapping("/my-appointments")
	    public String myappointments() {
		  System.out.println("user-my-appoinments()");
	        return "views/my-appointments";
	    }
	  
	  @GetMapping("/patient-dashboard")
	    public String patientdashboard() {
		  System.out.println("user-patient-dashboard()");
	        return "views/patient-dashboard";
	        }
	  
	  @GetMapping("/prescription")
	    public String prescription() {
		  System.out.println("user-prescription()");
	        return "views/prescription";
	    }
	  
	  @GetMapping("/profile")
	    public String profile() {
		  System.out.println("user-profile()");
	        return "views/profile";
	    }
	  
	  @GetMapping("/register")
	    public String register() {
		  System.out.println("user-register()");
	        return "views/register";
	    }
	
}



