package com.everysens.itss.exception;

import com.everysens.itss.dto.error.ErrorDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

public class ItssException extends RuntimeException {

    @Getter
    private ErrorDto error;

    public ItssException(ErrorDto error){
        super(String.format("Failed to process ITSS request with error : %s", error));
        this.error = error;
    }

}
