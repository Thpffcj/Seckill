package org.seckill.exception;

/**
 * 秒杀相关业务异常
 * Created by Thpffcj on 2017/7/22.
 */
public class SeckillException extends RuntimeException{

    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
