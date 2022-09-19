package com.nonghyupit.app3.controller;

import com.nonghyupit.app3.service.ServerInfoService;
import com.nonghyupit.app3.support.Result;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class InfoController {

    private final ServerInfoService serverInfoService;

    @GetMapping("/")
    public ResponseEntity<?> serverInfo() {

        List<Result> results = serverInfoService.getAnotherServerInfo();

        return new ResponseEntity<>(results, HttpStatus.OK);
    }
}
