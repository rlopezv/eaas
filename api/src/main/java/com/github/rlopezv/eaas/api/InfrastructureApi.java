package com.github.rlopezv.eaas.api;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.github.rlopezv.eaas.model.RuntimeError;
import com.github.rlopezv.eaas.model.infrastructure.Provider;
import com.github.rlopezv.eaas.model.infrastructure.ProviderList;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.NativeWebRequest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Validated
@Tag(name = "infrastructure", description = "Infrastructure Service API")
public interface InfrastructureApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /api/providers : Create creates a provider
     *
     * @param body  (required)
     * @param upsert  (optional)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "Create creates a provider", operationId = "providerServiceCreate", tags={ "infrastructure", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  Provider.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @PostMapping(
        value = "/api/providers",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Provider> _providerServiceCreate(@Parameter(example = "" ,required=true )  @Valid @RequestBody Provider body,@Parameter(example = "") @Valid @RequestParam(value = "upsert", required = false) Boolean upsert) {
        return providerServiceCreate(body, upsert);
    }

    // Override this method
    default  ResponseEntity<Provider> providerServiceCreate(Provider body, Boolean upsert) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf(""))) {
                    String exampleString = "";
                    ApiUtil.setExampleResponse(request, "", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /api/providers/{server} : Delete deletes a provider
     *
     * @param server  (required)
     * @param name  (optional)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "Delete deletes a provider", operationId = "providerServiceDelete",  tags={ "infrastructure", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  Object.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @DeleteMapping(
        value = "/api/providers/{server}",
        produces = { "application/json" }
    )
    default ResponseEntity<Object> _providerServiceDelete(@Parameter(example = "",required=true) @PathVariable("server") String server,@Parameter(example = "") @Valid @RequestParam(value = "name", required = false) String name) {
        return providerServiceDelete(server, name);
    }

    // Override this method
    default  ResponseEntity<Object> providerServiceDelete(String server, String name) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/providers/{server} : Get returns a provider by server address
     *
     * @param server  (required)
     * @param name  (optional)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "Get returns a provider by server address", operationId = "providerServiceGet",  tags={ "infrastructure", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  Provider.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @GetMapping(
        value = "/api/providers/{server}",
        produces = { "application/json" }
    )
    default ResponseEntity<Provider> _providerServiceGet(@Parameter(example = "",required=true) @PathVariable("server") String server,@Parameter(example = "") @Valid @RequestParam(value = "name", required = false) String name) {
        return providerServiceGet(server, name);
    }

    // Override this method
    default  ResponseEntity<Provider> providerServiceGet(String server, String name) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf(""))) {
                    String exampleString = "";
                    ApiUtil.setExampleResponse(request, "", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /api/providers/{server}/invalidate-cache : InvalidateCache invalidates provider cache
     *
     * @param server  (required)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    // @Operation(summary = "InvalidateCache invalidates provider cache", operationId = "providerServiceInvalidateCache", tags={ "infrastructure", })
    // @ApiResponses(value = { 
    //     @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  Provider.class))}),
    //     @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    // @PostMapping(
    //     value = "/api/providers/{server}/invalidate-cache",
    //     produces = { "application/json" }
    // )
    // default ResponseEntity<Provider> _providerServiceInvalidateCache(@Parameter(example = "",required=true) @PathVariable("server") String server) {
    //     return providerServiceInvalidateCache(server);
    // }

    // // Override this method
    // default  ResponseEntity<Provider> providerServiceInvalidateCache(String server) {
    //     getRequest().ifPresent(request -> {
    //         for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
    //             if (mediaType.isCompatibleWith(MediaType.valueOf(""))) {
    //                 String exampleString = "";
    //                 ApiUtil.setExampleResponse(request, "", exampleString);
    //                 break;
    //             }
    //         }
    //     });
    //     return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    // }


    /**
     * GET /api/providers : List returns list of providers
     *
     * @param server  (optional)
     * @param name  (optional)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "List returns list of providers", operationId = "providerServiceList",  tags={ "infrastructure" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  ProviderList.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @GetMapping(
        value = "/api/providers",
        produces = { "application/json" }
    )
    default ResponseEntity<ProviderList> _providerServiceList(@Parameter(example = "") @Valid @RequestParam(value = "server", required = false) String server,@Parameter(example = "") @Valid @RequestParam(value = "name", required = false) String name) {
        return providerServiceList(server, name);
    }

    // Override this method
    default  ResponseEntity<ProviderList> providerServiceList(String server, String name) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf(""))) {
                    String exampleString = "";
                    ApiUtil.setExampleResponse(request, "", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /api/providers/{server}/rotate-auth : RotateAuth rotates the bearer token used for a provider
     *
     * @param server  (required)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "RotateAuth rotates the bearer token used for a provider", operationId = "providerServiceRotateAuth",  tags={ "ProviderService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  Object.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @PostMapping(
        value = "/api/providers/{provider}/rotate-auth",
        produces = { "application/json" }
    )
    default ResponseEntity<Object> _providerServiceRotateAuth(@Parameter(example = "",required=true) @PathVariable("provider") String provider) {
        return providerServiceRotateAuth(provider);
    }

    // Override this method
    default  ResponseEntity<Object> providerServiceRotateAuth(String provider) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /api/providers/{provider.server} : Update updates a provider
     *
     * @param providerServer Server is the API server URL of the Kubernetes provider (required)
     * @param body  (required)
     * @param updatedFields  (optional)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "Update updates a provider", operationId = "providerServiceUpdate", tags={ "ProviderService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  Provider.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @PutMapping(
        value = "/api/providers/{provider.server}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Provider> _providerServiceUpdate(@Parameter(example = "Server is the API server URL of the Kubernetes provider",required=true) @PathVariable("provider.server") String providerServer,@Parameter(example = "" ,required=true )  @Valid @RequestBody Provider body,@Parameter(example = "") @Valid @RequestParam(value = "updatedFields", required = false) List<String> updatedFields) {
        return providerServiceUpdate(providerServer, body, updatedFields);
    }

    // Override this method
    default  ResponseEntity<Provider> providerServiceUpdate(String providerServer, Provider body, List<String> updatedFields) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf(""))) {
                    String exampleString = "";
                    ApiUtil.setExampleResponse(request, "", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }
    
}
