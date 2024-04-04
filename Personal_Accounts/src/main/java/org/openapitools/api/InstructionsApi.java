/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.4.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.DirectDebitInstructionRequest;
import org.openapitools.model.DirectDebitInstructionResponse;
import org.openapitools.model.ErrorInfo;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-04T10:32:56.573489+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
@Validated
@Tag(name = "Fulfilment endpoints", description = "the Fulfilment endpoints API")
public interface InstructionsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /instructions
     *
     * @param authorization Standard HTTP header that allows credentials to be provided to the authorisation/resource server. Based on the OAuth 2.0/OIDC framework, this consists of basic or bearer authentication schemes. (required)
     * @param xIdempotencyKey Every request will be processed only once per x-idempotency-key.  The Idempotency Key will be valid for 24 hours.  (required)
     * @param xFapiCustomerIpAddress The PSU&#39;s IP address if the PSU is currently logged in with the TPP. (optional)
     * @param xFapiAuthDate The time when the PSU last logged in with the TPP. All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below: Sun, 10 Sep 2017 19:43:31 UTC pattern: &#39;^(Mon|Tue|Wed|Thu|Fri|Sat|Sun), \\d{2} (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) \\d{4} \\d{2}:\\d{2}:\\d{2} (GMT|UTC)$&#39; (optional)
     * @param xFapiInteractionId An RFC4122 UID used as a correlation id. (optional)
     * @param directDebitInstructionRequest  (optional)
     * @return Created (status code 201)
     *         or Bad Request (status code 400)
     *         or Authorisation failure (status code 401)
     *         or Authentication failure (status code 403)
     *         or Not Found (status code 404)
     *         or Method Not Allowed (status code 405)
     *         or Not Acceptable (status code 406)
     *         or Media Not Supported (status code 415)
     *         or Internal Server Error (status code 500)
     */
    @Operation(
        operationId = "directDebitInstructions",
        tags = { "Fulfilment endpoints" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Created", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = DirectDebitInstructionResponse.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad Request", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorInfo.class))
            }),
            @ApiResponse(responseCode = "401", description = "Authorisation failure", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorInfo.class))
            }),
            @ApiResponse(responseCode = "403", description = "Authentication failure", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorInfo.class))
            }),
            @ApiResponse(responseCode = "404", description = "Not Found", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorInfo.class))
            }),
            @ApiResponse(responseCode = "405", description = "Method Not Allowed", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorInfo.class))
            }),
            @ApiResponse(responseCode = "406", description = "Not Acceptable", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorInfo.class))
            }),
            @ApiResponse(responseCode = "415", description = "Media Not Supported", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorInfo.class))
            }),
            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorInfo.class))
            })
        },
        security = {
            @SecurityRequirement(name = "bearerAuthSession")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/instructions",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<DirectDebitInstructionResponse> directDebitInstructions(
        @NotNull @Parameter(name = "Authorization", description = "Standard HTTP header that allows credentials to be provided to the authorisation/resource server. Based on the OAuth 2.0/OIDC framework, this consists of basic or bearer authentication schemes.", required = true, in = ParameterIn.HEADER) @RequestHeader(value = "Authorization", required = true) String authorization,
        @NotNull @Pattern(regexp = "^(?!\\s)(.*)(\\S)$") @Size(max = 40) @Parameter(name = "x-idempotency-key", description = "Every request will be processed only once per x-idempotency-key.  The Idempotency Key will be valid for 24 hours. ", required = true, in = ParameterIn.HEADER) @RequestHeader(value = "x-idempotency-key", required = true) String xIdempotencyKey,
        @Parameter(name = "x-fapi-customer-ip-address", description = "The PSU's IP address if the PSU is currently logged in with the TPP.", in = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-customer-ip-address", required = false) String xFapiCustomerIpAddress,
        @Parameter(name = "x-fapi-auth-date", description = "The time when the PSU last logged in with the TPP. All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below: Sun, 10 Sep 2017 19:43:31 UTC pattern: '^(Mon|Tue|Wed|Thu|Fri|Sat|Sun), \\d{2} (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) \\d{4} \\d{2}:\\d{2}:\\d{2} (GMT|UTC)$'", in = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-auth-date", required = false) String xFapiAuthDate,
        @Parameter(name = "x-fapi-interaction-id", description = "An RFC4122 UID used as a correlation id.", in = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-interaction-id", required = false) String xFapiInteractionId,
        @Parameter(name = "DirectDebitInstructionRequest", description = "") @Valid @RequestBody(required = false) DirectDebitInstructionRequest directDebitInstructionRequest
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"paymentInformationStatus\" : \"ACSC\", \"processResult\" : { \"rejectReasonList\" : [ { \"rejectReasonInfomation\" : \"rejectReasonInfomation\", \"rejectReasonCode\" : \"rejectReasonCode\" }, { \"rejectReasonInfomation\" : \"rejectReasonInfomation\", \"rejectReasonCode\" : \"rejectReasonCode\" } ], \"responseCode\" : \"00\" }, \"transactionIdentification\" : \"transactionIdentification\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : \"id\", \"errors\" : [ { \"extendedDetails\" : { \"path\" : \"path\" }, \"code\" : \"code\", \"causes\" : \"causes\" }, { \"extendedDetails\" : { \"path\" : \"path\" }, \"code\" : \"code\", \"causes\" : \"causes\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : \"id\", \"errors\" : [ { \"extendedDetails\" : { \"path\" : \"path\" }, \"code\" : \"code\", \"causes\" : \"causes\" }, { \"extendedDetails\" : { \"path\" : \"path\" }, \"code\" : \"code\", \"causes\" : \"causes\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : \"id\", \"errors\" : [ { \"extendedDetails\" : { \"path\" : \"path\" }, \"code\" : \"code\", \"causes\" : \"causes\" }, { \"extendedDetails\" : { \"path\" : \"path\" }, \"code\" : \"code\", \"causes\" : \"causes\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : \"id\", \"errors\" : [ { \"extendedDetails\" : { \"path\" : \"path\" }, \"code\" : \"code\", \"causes\" : \"causes\" }, { \"extendedDetails\" : { \"path\" : \"path\" }, \"code\" : \"code\", \"causes\" : \"causes\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : \"id\", \"errors\" : [ { \"extendedDetails\" : { \"path\" : \"path\" }, \"code\" : \"code\", \"causes\" : \"causes\" }, { \"extendedDetails\" : { \"path\" : \"path\" }, \"code\" : \"code\", \"causes\" : \"causes\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : \"id\", \"errors\" : [ { \"extendedDetails\" : { \"path\" : \"path\" }, \"code\" : \"code\", \"causes\" : \"causes\" }, { \"extendedDetails\" : { \"path\" : \"path\" }, \"code\" : \"code\", \"causes\" : \"causes\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : \"id\", \"errors\" : [ { \"extendedDetails\" : { \"path\" : \"path\" }, \"code\" : \"code\", \"causes\" : \"causes\" }, { \"extendedDetails\" : { \"path\" : \"path\" }, \"code\" : \"code\", \"causes\" : \"causes\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : \"id\", \"errors\" : [ { \"extendedDetails\" : { \"path\" : \"path\" }, \"code\" : \"code\", \"causes\" : \"causes\" }, { \"extendedDetails\" : { \"path\" : \"path\" }, \"code\" : \"code\", \"causes\" : \"causes\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
