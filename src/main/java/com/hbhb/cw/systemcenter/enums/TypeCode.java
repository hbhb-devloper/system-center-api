package com.hbhb.cw.systemcenter.enums;

/**
 * @author dxk
 */

public enum TypeCode {

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

    /**
     * 迁改
     */
    RELOCATION("relocation"),

    /**
     * 宣传用品
     */
    PUBLICITY("publicity")
    ;


    private final String value;

    TypeCode(String value) {
        this.value = value;
    }

    public String value() {
        return this.value;
    }

}
