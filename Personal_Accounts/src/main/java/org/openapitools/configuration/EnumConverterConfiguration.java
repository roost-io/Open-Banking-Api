package org.openapitools.configuration;

import org.openapitools.model.AccountStatus;
import org.openapitools.model.AccountSubTypeCode;
import org.openapitools.model.AccountTypeCode;
import org.openapitools.model.BalanceTypeCode;
import org.openapitools.model.ConsentStatusCode;
import org.openapitools.model.CreditDebitCode;
import org.openapitools.model.ExternalPermissionCode;
import org.openapitools.model.ParamName;
import org.openapitools.model.Status;
import org.openapitools.model.SupportedAlgorithms;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

@Configuration
public class EnumConverterConfiguration {

    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.accountStatusConverter")
    Converter<String, AccountStatus> accountStatusConverter() {
        return new Converter<String, AccountStatus>() {
            @Override
            public AccountStatus convert(String source) {
                return AccountStatus.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.accountSubTypeCodeConverter")
    Converter<String, AccountSubTypeCode> accountSubTypeCodeConverter() {
        return new Converter<String, AccountSubTypeCode>() {
            @Override
            public AccountSubTypeCode convert(String source) {
                return AccountSubTypeCode.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.accountTypeCodeConverter")
    Converter<String, AccountTypeCode> accountTypeCodeConverter() {
        return new Converter<String, AccountTypeCode>() {
            @Override
            public AccountTypeCode convert(String source) {
                return AccountTypeCode.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.balanceTypeCodeConverter")
    Converter<String, BalanceTypeCode> balanceTypeCodeConverter() {
        return new Converter<String, BalanceTypeCode>() {
            @Override
            public BalanceTypeCode convert(String source) {
                return BalanceTypeCode.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.consentStatusCodeConverter")
    Converter<String, ConsentStatusCode> consentStatusCodeConverter() {
        return new Converter<String, ConsentStatusCode>() {
            @Override
            public ConsentStatusCode convert(String source) {
                return ConsentStatusCode.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.creditDebitCodeConverter")
    Converter<String, CreditDebitCode> creditDebitCodeConverter() {
        return new Converter<String, CreditDebitCode>() {
            @Override
            public CreditDebitCode convert(String source) {
                return CreditDebitCode.fromValue(source);
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
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.paramNameConverter")
    Converter<String, ParamName> paramNameConverter() {
        return new Converter<String, ParamName>() {
            @Override
            public ParamName convert(String source) {
                return ParamName.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.statusConverter")
    Converter<String, Status> statusConverter() {
        return new Converter<String, Status>() {
            @Override
            public Status convert(String source) {
                return Status.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.supportedAlgorithmsConverter")
    Converter<String, SupportedAlgorithms> supportedAlgorithmsConverter() {
        return new Converter<String, SupportedAlgorithms>() {
            @Override
            public SupportedAlgorithms convert(String source) {
                return SupportedAlgorithms.fromValue(source);
            }
        };
    }

}
