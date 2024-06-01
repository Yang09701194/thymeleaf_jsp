package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.thymeleaf.spring6.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring6.view.ThymeleafViewResolver;


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

	

    
    @Autowired
    WebApplicationContext webApplicationContext;

    @Bean
    public SpringResourceTemplateResolver thymeleafTemplateResolver(){
        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
        templateResolver.setApplicationContext(webApplicationContext);
        templateResolver.setOrder(9);
        //templateResolver.setPrefix("/WEB-INF/views/");
        templateResolver.setPrefix("/");
        templateResolver.setSuffix("");
        return templateResolver;
    }

    @Bean
    public SpringTemplateEngine templateEngine() {
        SpringTemplateEngine springTemplateEngine= new SpringTemplateEngine();
        springTemplateEngine.setTemplateResolver(thymeleafTemplateResolver());
        springTemplateEngine.setEnableSpringELCompiler(true);
        return springTemplateEngine;
    }

    @Bean
    public ThymeleafViewResolver thymeleafViewResolver(){
        final ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
        viewResolver.setViewNames(new String[] {"*.html"});
        viewResolver.setExcludedViewNames(new String[] {"*.jsp"});
        viewResolver.setTemplateEngine(templateEngine());
        viewResolver.setCharacterEncoding("UTF-8");
        return viewResolver;
    }

    @Bean
    public InternalResourceViewResolver jspViewResolver(){
        final InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setOrder(10);
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/"); // webapp
        viewResolver.setSuffix("");
        viewResolver.setViewNames("*.jsp");
        return viewResolver;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
//	@Bean
//	public ClassLoaderTemplateResolver secondaryTemplateResolver() {
//	    ClassLoaderTemplateResolver secondaryTemplateResolver = new ClassLoaderTemplateResolver();
////	    secondaryTemplateResolver.setPrefix("templates-2/");
//	    secondaryTemplateResolver.setPrefix("templates/");
//	    secondaryTemplateResolver.setSuffix("");
//	    //secondaryTemplateResolver.setTemplateMode("jsp");
//	    //secondaryTemplateResolver.setTemplateMode(TemplateMode.HTML);
//	    secondaryTemplateResolver.setCharacterEncoding("UTF-8");
//	    //secondaryTemplateResolver.setResolvablePatterns(Collections.singleton("*.html"));
//	
//	    
//	    return secondaryTemplateResolver;
//	}
	
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
