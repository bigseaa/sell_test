package com.bigsea.sell.exception;

import com.bigsea.sell.enums.ResultEnum;

import javax.xml.transform.Result;

/**
 * 异常
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
