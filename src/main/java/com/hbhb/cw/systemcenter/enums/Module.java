package com.hbhb.cw.systemcenter.enums;

/**
 * @author wxg
 * @since 2020-09-30
 */
public enum Module {

    /**
     * 预算模块
     */
    MODULE_BUDGET(100),

    /**
     * 客户资金模块
     */
    MODULE_INVOICE(101),

    /**
     * 迁改模块
     */
    MODULE_RELOCATION(102),
    /**
     * 宣传用品模块
     */
    MODULE_PUBLICITY(103);

    private final Integer value;

    public Integer value() {
        return this.value;
    }

    public Integer getValue() {
        return value;
    }

    Module(Integer value) {
        this.value = value;
    }
}
