package org.seckill.exception;

/**
 * 秒杀关闭异常
 * Created by Thpffcj on 2017/7/22.
 */
public class SeckillCloseException extends SeckillException{

    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
