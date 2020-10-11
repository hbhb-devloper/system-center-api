package com.hbhb.cw.systemcenter.enums;

/**
 * @author dxk
 */

public enum DictType {

    /**
     * 发票
     */
    INVOICE("invoice"),

    /**
     * 预算
     */
    BUDGET("budget"),

    /**
     * 流程
     */
    FLOW("flow"),

    /**
     * 功能模块
     */
    MODULE("module"),
    ;


    private final String value;

    DictType(String value) {
        this.value = value;
    }

    public String value() {
        return this.value;
    }

}
