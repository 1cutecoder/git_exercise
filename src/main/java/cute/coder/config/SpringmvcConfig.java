package cute.coder.config;

import cute.coder.converter.MyDateConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.convert.support.ConfigurableConversionService;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.annotation.PostConstruct;

/**
 * Created by cute coder
 * 2019/5/15 19:59
 */
@Configuration
@EnableWebMvc
@ComponentScan("cute.coder.controller")
public class SpringmvcConfig implements WebMvcConfigurer {
    @Autowired
    ConfigurableConversionService configurableConversionService;

    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/view/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

    @Bean
    @Primary
    public ConfigurableConversionService configurableConversionService(){
        return configurableConversionService;
    }

    @PostConstruct
    public void addConverterToService(){
        configurableConversionService.addConverter(new MyDateConverter());
    }


}
