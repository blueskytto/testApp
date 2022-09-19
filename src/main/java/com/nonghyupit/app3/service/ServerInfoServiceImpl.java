package com.nonghyupit.app3.service;

import com.nonghyupit.app3.support.Result;
import com.nonghyupit.app3.support.Utils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ServerInfoServiceImpl implements ServerInfoService {

    @Override
    public List<Result> getAnotherServerInfo() {

        List<Result> results = new ArrayList<>();

        // 현재 서버 정보 추가
        Result result = Result.builder()
                .hostName(Utils.getHostName())
                .timeStamp(Utils.getTimeStamp())
                .build();

        results.add(result);

        log.debug("Results : {}", results);

        return results;
    }
}
