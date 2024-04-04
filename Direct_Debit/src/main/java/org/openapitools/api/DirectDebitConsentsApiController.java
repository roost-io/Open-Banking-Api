package org.openapitools.api;

import org.openapitools.model.ApiGatewayErrorResponse;
import org.openapitools.model.DirectDebitConsentRequestData;
import org.openapitools.model.DirectDebitConsentsResponse;
import org.openapitools.model.ErrorInfo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-04T10:34:18.316995+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
@Controller
@RequestMapping("${openapi.realTimeDirectDebitAPISpecificationForHKCMB.base-path:/https://sandbox.ob.business.hsbc.com.hk/mock/open-banking/v1.0/direct-debit}")
public class DirectDebitConsentsApiController implements DirectDebitConsentsApi {

    private final NativeWebRequest request;

    @Autowired
    public DirectDebitConsentsApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
