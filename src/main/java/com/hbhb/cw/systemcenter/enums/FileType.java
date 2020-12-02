package com.hbhb.cw.systemcenter.enums;

public enum FileType {
    /**
     * 系统文件
     */
    SYSTEM_FILE(10),
    /**
     * 预算执行-签报类附件
     */
    BUDGET_PROJECT_FILE(20),
    /**
     * 客户资金-发票类附件
     */
    FUND_INVOICE_FILE(30),
    /**
     * 迁改-预警类附件
     */
    RELOCATION_WARN_FILE(40),
    /**
     * 迁改-合同类附件
     */
    RELOCATION_CONTRACT_FILE(50);

    private final Integer value;

    FileType(Integer value) {
        this.value = value;
    }

    public Integer value() {
        return this.value;
    }

}
