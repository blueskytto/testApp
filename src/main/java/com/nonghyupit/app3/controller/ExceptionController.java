package com.nonghyupit.app3.controller;

import com.nonghyupit.app3.support.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class ExceptionController {

/*    // 401
    @ExceptionHandler({AccessDeniedException.class})
    public ResponseEntity handleAccessDeniedException(final AccessDeniedException ex) {
        log.error("error", ex);
        return new ResponseEntity(Result.builder().message(ex.getMessage()).build(), HttpStatus.UNAUTHORIZED);
    }*/

    // 500
    @ExceptionHandler({Exception.class})
    public ResponseEntity<Object> handleAll(final Exception ex) {
        log.error("{}", ex.getClass().getName());
        log.error("Error : {}", ex);
        return new ResponseEntity(Result.builder().message(ex.getMessage()).build(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
