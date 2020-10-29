package com.hbhb.cw.systemcenter.enums;

/**
 * @author dxk
 */
public enum DictCode {
    /**
     * 发票-种类-增值税专用发票
     */
    INVOICE_TYPE_PRO("type_pro"),

    /**
     * 发票-种类-增值税通用机打发票
     */
    INVOICE_TYPE_MACHINE("type_machine"),

    /**
     * 发票-种类-增值税普通发票
     */
    INVOICE_TYPE_COMMON("type_common"),

    /**
     * 发票-项目属性-专票1、3、6
     */
    INVOICE_PROJECT_PROPERTIES("project_properties"),

    /**
     * 预算-项目签报-审批状态
     */
    BUDGET_PROJECT_STATUS("project_status"),

    /**
     * 预算-项目签报-增值税率
     */
    BUDGET_PROJECT_VAT_RATES("project_vat_rate"),

    /**
     * 预算-项目签报-项目来源
     */
    BUDGET_PROJECT_ORIGIN("project_origin"),

    /**
     * 流程维护-流程节点属性-
     */
    FLOW_NODE_PROP_ENABLE_COND("enable_cond"),

    /**
     * 迁改-赔补状态
     */
    RELOCATION_PROJECT_COMPENSATION("compensation_sate"),
    ;

    private final String value;

    DictCode(String value) {
        this.value = value;
    }

    public String value() {
        return this.value;
    }
}
