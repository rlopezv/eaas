package com.github.rlopezv.eaas.api;

import java.util.Optional;

import com.github.rlopezv.eaas.model.ApplicationSettings;
import com.github.rlopezv.eaas.model.ApplicationVersion;
import com.github.rlopezv.eaas.model.RuntimeError;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.NativeWebRequest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "info", description = "the API info API")
interface ApplicationApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /api//settings : Get returns API Service settings
     *
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "Returns API Service settings", tags={ "info", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  ApplicationSettings.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @GetMapping(
        value = "/settings",
        produces = { "application/json" }
    )
    default ResponseEntity<ApplicationSettings> _settingsServiceGet() {
        return settingsServiceGet();
    }

    // Override this method
    default  ResponseEntity<ApplicationSettings> settingsServiceGet() {
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
     * GET /api/version : Version returns version information of the API server
     *
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "Version returns version information of the API server", operationId = "versionServiceVersion",  tags={ "VersionService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  ApplicationVersion.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @GetMapping(
        value = "/version",
        produces = { "application/json" }
    )
    default ResponseEntity<ApplicationVersion> _versionServiceVersion() {
        return versionServiceVersion();
    }

    // Override this method
    default  ResponseEntity<ApplicationVersion> versionServiceVersion() {
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

    // @Operation(summary = "Get user by user name", tags = { "user" })
	// @ApiResponses(value = {
	// 		@ApiResponse(responseCode = "200", description = "successful operation", content = { @Content(mediaType = "application/json", schema = @Schema(implementation = User.class)), @Content(mediaType = "application/xml", schema = @Schema(implementation = User.class)) }),
	// 		@ApiResponse(responseCode = "400", description = "Invalid username supplied", content = @Content),
	// 		@ApiResponse(responseCode = "404", description = "User not found", content = @Content) })

	// @GetMapping(value = "/user/{username}")
	// default ResponseEntity<User> getUserByName(
	// 		@Parameter(description = "The name that needs to be fetched. Use user1 for testing. ", required = true) @PathVariable("username") String username) {
	// 	return getDelegate().getUserByName(username);
	// }
    
}
