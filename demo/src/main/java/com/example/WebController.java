package com.example;

import java.time.Instant;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {
	
	@GetMapping("/data")
	public String getCurrentPositions(Model model) {
		Data[] arr = new Data[] {
				new Data(1L) ,
				new Data(2L) ,
		};
		model.addAttribute("positions", arr);
		return "index2.html";
	}
	
	@GetMapping("/user2")
	public String getUser(Model model) {
		//model.addAttribute("positions", arr);
		return "user-form.jsp";
	}
	
}


class Data {

	private Long id;

    private String callsign;
	public Data(Long id) {
		this.id = id;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
}


