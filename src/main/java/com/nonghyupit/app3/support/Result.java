package com.nonghyupit.app3.support;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@ToString
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result {
    private String hostName;
    private String timeStamp;
    private String message;
}
