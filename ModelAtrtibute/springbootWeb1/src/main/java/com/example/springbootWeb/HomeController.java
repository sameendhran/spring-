package com.example.springbootWeb;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@ModelAttribute("course")
	public String coursename() {
		return "Java";
	}
	
    @RequestMapping("/")
    public String home() {
        return "/index";
    }

    @RequestMapping("add")
    public ModelAndView add(int num1, int num2, ModelAndView mv) {
        int result = num1 + num2;
        mv.addObject("res", result);
        mv.setViewName("result");
        return mv;
    }
    
    @RequestMapping("addAlien")
	public String addAlien( Alien alien) {
		return "result";

		}
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

//    @RequestMapping("addAlien")
//	public ModelAndView addAlien(@RequestParam("aid") int aid, @RequestParam("aname") String aname, ModelAndView mv) {
//        Alien alien=new Alien();
//        alien.setAid(aid);
//        alien.setAname(aname);
//		mv.addObject("alien",alien);
//		mv.setViewName("result");
//		return mv;
//
//		}



//public String add(HttpServletRequest req, HttpSession session) {
//	
//int num1=Integer.parseInt(req.getParameter("num1"));
//int num2=Integer.parseInt(req.getParameter("num2"));
//int result=num1+num2;
//		session.setAttribute("resullt", result);return "/result";
//	}
