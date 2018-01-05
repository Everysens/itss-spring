package com.everysens.itss.exception;

import com.everysens.itss.dto.error.ErrorDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ItssException extends RuntimeException {

    private int code;
    private String message;

    public static ItssException fromError(ErrorDto error){
        return new ItssException(error.getCode(), error.getMessage());
    }

}
