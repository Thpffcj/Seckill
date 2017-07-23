package org.seckill.dto;

/**
 * Created by Thpffcj on 2017/7/23.
 */
//所有的ajax请求返回类型,封装json结果
public class SeckillResult<T> {

    private boolean success;

    private T data;

    private String erroor;

    public SeckillResult(boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    public SeckillResult(boolean success, String erroor) {
        this.success = success;
        this.erroor = erroor;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getErroor() {
        return erroor;
    }

    public void setErroor(String erroor) {
        this.erroor = erroor;
    }
}
