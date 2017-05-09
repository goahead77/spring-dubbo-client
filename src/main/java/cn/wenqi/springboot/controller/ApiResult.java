package cn.wenqi.springboot.controller;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author wenqi
 */
@Data
@AllArgsConstructor
public class ApiResult {

    private int code;

    private String msg;

    private Object data;

    public enum ApiCode{

        SUCCESS(200),
        FAIL(500);

        private int code;

        ApiCode(int code){
            this.code=code;
        }
        public int getCode() {
            return code;
        }
    }
}
