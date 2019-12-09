package com.tu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean       //注意此处的@Bean注解
    public Docket api(){   //创建了Docker的Bean
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())   //用来创建该API的基本信息(这些信息会展现在页面中)
                .select()  //
                //自行修改自己的包和路径
                .apis(RequestHandlerSelectors.basePackage("com.tu.controller"))
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("tu yu jie")
                .description("biu biu biu 鸭!")  //描述
                .termsOfServiceUrl("http://www/tu.cn")
                .version("1.0")
                .contact(new Contact("maren","http://tu.cn","1656004347@qq.com"))
                .build();
    }
}
