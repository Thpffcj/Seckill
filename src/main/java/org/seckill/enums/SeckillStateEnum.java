package org.seckill.enums;

/**
 * 使用枚举表述常量数据字段
 * Created by Thpffcj on 2017/7/22.
 */
public enum SeckillStateEnum {
    SUCCESS(1, "秒杀成功"),
    END(0, "秒杀结束"),
    REPEAT_KILL(-1, "重复秒杀"),
    INNER_ERROR(-2, "系统异常"),
    DATE_REWRITE(-3, "数据篡改");

    private int state;

    private String stateinfo;

    SeckillStateEnum(int state, String stateinfo) {
        this.state = state;
        this.stateinfo = stateinfo;
    }

    public int getState() {
        return state;
    }

    public String getStateinfo() {
        return stateinfo;
    }

    public static SeckillStateEnum stateOf(int index){
        for ( SeckillStateEnum state: values()) {
            if(state.getState() == index){
                return state;
            }
        }
        return null;
    }
}
