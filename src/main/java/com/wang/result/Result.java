package com.wang.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {

    private String msg;     //错误信息
    private Boolean status; //错误状态

}
