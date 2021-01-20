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
    RELOCATION_CONTRACT_FILE(50),
    /**
     * 宣传管理-印刷品附件
     */
    PUBLICITY_PRINT_FILE(60),
    /**
     * 宣传管理-画面设计
     */
    PUBLICITY_PICTURE_FILE(61),
    /**
     * 宣传管理-物料制作
     */
    PUBLICITY_MATERIALS_FILE(62),
    /**
     * 报表管理
     */
    REPORT_FILE(70),;

    private final Integer value;

    FileType(Integer value) {
        this.value = value;
    }

    public Integer value() {
        return this.value;
    }

}
