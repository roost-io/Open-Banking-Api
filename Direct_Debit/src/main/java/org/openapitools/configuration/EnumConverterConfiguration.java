package org.openapitools.configuration;

import org.openapitools.model.ConsentStatusCode;
import org.openapitools.model.ExternalPermissionCode;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

@Configuration
public class EnumConverterConfiguration {

    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.consentStatusCodeConverter")
    Converter<String, ConsentStatusCode> consentStatusCodeConverter() {
        return new Converter<String, ConsentStatusCode>() {
            @Override
            public ConsentStatusCode convert(String source) {
                return ConsentStatusCode.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.externalPermissionCodeConverter")
    Converter<String, ExternalPermissionCode> externalPermissionCodeConverter() {
        return new Converter<String, ExternalPermissionCode>() {
            @Override
            public ExternalPermissionCode convert(String source) {
                return ExternalPermissionCode.fromValue(source);
            }
        };
    }

}
