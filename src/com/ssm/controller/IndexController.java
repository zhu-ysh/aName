/**
 * 
 */
package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wangli
 * 2018Äê1ÔÂ26ÈÕ
 * 
 */
@Controller
public class IndexController {
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/WEB-INF/view/index.jsp")
	public String index2() {
		System.out.println("asdads");
		return "aaa";
	}
}
