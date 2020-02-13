package com.imooc.enums;

/**
 * 商品评价等级枚举
 */

public enum CommentLevel {
    GOOD(0, "好评"),
    NORMAL(1, "中评"),
    BAD(2, "差评");

    public final Integer type;
    public final String value;

    CommentLevel(Integer type, String value) {
        this.type = type;
        this.value = value;
    }
}
