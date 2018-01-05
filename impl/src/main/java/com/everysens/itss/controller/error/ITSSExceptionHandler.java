package com.everysens.itss.controller.error;

import com.everysens.itss.dto.error.ErrorDto;
import com.everysens.itss.exception.ItssException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Order(value = 1)
@ControllerAdvice
@Slf4j
public class ITSSExceptionHandler {

    @ExceptionHandler(value = ItssException.class)
    public ResponseEntity<ErrorDto> handle(ItssException ex){
        log.error("Caught ITSS error", ex);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getError());
    }

}
