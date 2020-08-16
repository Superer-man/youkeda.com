package com.youkeda.notebook;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
//开启 swagger2 http://localhost:8086/swagger-ui.html
public class swagger2 {
    private ApiInfo apiService() {
        //作者信息
        Contact contact = new Contact("", "http://www.super-xx.cn/", "1291098155@qq.com");
        return new ApiInfo(
                "服务测试平台", // 标题
                "服务测试接口", // 描述
                "v1.0", // 版本
                "http://www.super-xx.cn/", // 组织链接
                contact, // 联系人信息
                "Apach 2.0 许可", // 许可
                "许可链接", // 许可连接
                new ArrayList<>()); // 扩展
    }
    @Bean
    public Docket serviceApi() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("服务测试平台")
                .apiInfo(apiService())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.youkeda.notebook.service.noteBook.controller"))
                .paths(PathSelectors.any())
                .build();
    }
}