package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
//import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;


@ServletComponentScan
@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer  {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(DemoApplication.class);
    }

	
//
//	@Bean
//	public ClassLoaderTemplateResolver secondaryTemplateResolver() {
//	    ClassLoaderTemplateResolver secondaryTemplateResolver = new ClassLoaderTemplateResolver();
////	    secondaryTemplateResolver.setPrefix("templates-2/");
//	    secondaryTemplateResolver.setPrefix("templates/");
//	    secondaryTemplateResolver.setSuffix("");
//	    secondaryTemplateResolver.setTemplateMode("jsp");
//	    //secondaryTemplateResolver.setTemplateMode(TemplateMode.HTML);
//	    secondaryTemplateResolver.setCharacterEncoding("UTF-8");
//	    //secondaryTemplateResolver.setResolvablePatterns(Collections.singleton("*.html"));
//	        
//	    return secondaryTemplateResolver;
//	}
//	
//	@Bean
//	public InternalResourceViewResolver secondaryTemplateResolver3() {
//		InternalResourceViewResolver secondaryTemplateResolver = new InternalResourceViewResolver();
////	    secondaryTemplateResolver.setPrefix("templates-2/");
//	    secondaryTemplateResolver.setPrefix("/WEB-INF/jsp/");
//	    secondaryTemplateResolver.setViewNames("");
//	    //secondaryTemplateResolver.setTemplateMode(TemplateMode.HTML);
//	    //secondaryTemplateResolver.setTemplateMode(TemplateMode.HTML);
//	    //secondaryTemplateResolver.setCharacterEncoding("UTF-8");
//	    //secondaryTemplateResolver.setResolvablePatterns(Collections.singleton("*.html"));
//	    //secondaryTemplateResolver.setCheckExistence(true);
//	        
//	    return secondaryTemplateResolver;
//	}
//	
//	
	
	

	
}
