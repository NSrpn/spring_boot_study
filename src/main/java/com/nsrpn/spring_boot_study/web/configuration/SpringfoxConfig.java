package com.nsrpn.spring_boot_study.web.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.HashSet;

@Configuration
public class SpringfoxConfig {

  public static final String AUTHORS_TAG = "Authors list";
  public static final String BOOKS_TAG = "Books list";
  public static final String GENRES_TAG = "Genres list";

  @Bean
  public Docket docket() {
    return new Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.nsrpn.spring_boot_study.web.controllers"))
            .paths(PathSelectors.ant("/api/*"))
            .build()
            .tags(
                    new Tag(AUTHORS_TAG, "Authors"),
                    new Tag(BOOKS_TAG, "Books"),
                    new Tag(GENRES_TAG, "Genres")
            )
            .apiInfo(getApiInfo());
  }

  public ApiInfo getApiInfo() {
    return new ApiInfo(
            "BookShop API",
            "SpingBoot Study Bookshop API",
            "1.0",
            "http://www.termofservice.org",
            new Contact("a.surin", "http://tempUrl", "nsurpanin@gmail.com"),
            "MIT",
            "https://mit-license.org",
            new HashSet<>()
    );
  }
}
