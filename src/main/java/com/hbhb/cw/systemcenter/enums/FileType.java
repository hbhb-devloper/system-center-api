package com.hbhb.cw.systemcenter.enums;

public enum FileType {
    /**
     * 系统文件
     */
    SYSTEM_FILE(10),
    /**
     * 预算项目签报类型文件
     */
    BUDGET_PROJECT_FILE(20),
    /**
     * 客户资金-发票类附件
     */
    FUND_INVOICE_FILE(30),

    ;

    private final Integer value;

    FileType(Integer value) {
        this.value = value;
    }

    public Integer value() {
        return this.value;
    }

}
