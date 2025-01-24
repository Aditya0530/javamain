package com.adi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	/*
	 * @RequestMapping("/") public String home() { return "home"; }
	 */

    @RequestMapping("/reg")
    public String preLog() {
        System.out.println("The Constructor Click Me");
        return "success"; // This resolves to /WEB-INF/views/home.jsp
    }
}
