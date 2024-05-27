package com.example;

import java.time.Instant;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Aircraft;



@Controller
public class WebController {
	
	
	
	
	@GetMapping("/positions")
	public String getCurrentPositions(Model model) {
		
		
		Aircraft[] arr = new Aircraft[] {
				new Aircraft(81L,
		                "AAL608", "1451", "N754UW", "AA608", "IND-PHX", "A319", "A3",
		                36000, 255, 423, 0, 36000,
		                39.150284, -90.684795, 1012.8, 26.575562, 295.501994,
		                true, false,
		                Instant.parse("2020-11-27T21:29:35Z"),
		                Instant.parse("2020-11-27T21:29:34Z"),
		                Instant.parse("2020-11-27T21:29:27Z")) ,
				
				new Aircraft(81L,
		                "AAL608", "1451", "N754UW", "AA608", "IND-PHX", "A319", "A3",
		                36000, 255, 423, 0, 36000,
		                39.150284, -90.684795, 1012.8, 26.575562, 295.501994,
		                true, false,
		                Instant.parse("2020-11-27T21:29:35Z"),
		                Instant.parse("2020-11-27T21:29:34Z"),
		                Instant.parse("2020-11-27T21:29:27Z")) ,
				
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
