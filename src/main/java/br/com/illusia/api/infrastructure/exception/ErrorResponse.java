// ✦•······················• PACKAGE - START •······················•✦ //
package br.com.illusia.api.infrastructure.exception;
// ✦•······················• PACKAGE - END •······················•✦ //

// ✦•······················• IMPORTS - START •······················•✦ //
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
// ✦•······················• IMPORTS - END •······················•✦ //

/**
 * @author Giovane Neves
 * @since v1
 */
@Data
@RequiredArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorResponse {

    // ✦•······················• ATTRIBUTES - START •······················•✦ //
    private final int status;
    private final String message;
    private String stackTrace;
    private List<ValidationError> validationErrorList;
    // ✦•······················• ATTRIBUTES - END •······················•✦ //

    // ✦•······················• CLASSES - START •······················•✦ //
    @Data
    @RequiredArgsConstructor
    public static class ValidationError{

        private final String field;
        private final String message;

    }
    // ✦•······················• CLASSES - END •······················•✦ //

    // ✦•······················• METHOD - START •······················•✦ //
    public void addValidationError(final String field, final String message) {

        if(Objects.isNull(validationErrorList))
        {
            this.validationErrorList = new ArrayList<>();
        }

        this.validationErrorList.add(new ValidationError(field, message));
    }

    public String toJson()
    {
        return "{\"Status\": "
                .concat(String.valueOf(this.getStatus()))
                .concat(", ")
                .concat("\"message\": \"")
                .concat(this.getMessage())
                .concat("\"}");
    }
    // ✦•······················• METHOD - END •······················•✦ //

}
