package com.hbhb.cw.systemcenter.enums;

/**
 * @author dxk
 */
public enum DictCode {
    /**
     *
     */
    INVOICE_TYPE_PRO("type_pro", "发票-种类-增值税专用发票"),
    INVOICE_TYPE_MACHINE("type_machine", "发票-种类-增值税通用机打发票"),
    INVOICE_TYPE_COMMON("type_common", "发票-种类-增值税普通发票"),
    INVOICE_PROJECT_PROPERTIES("project_properties", "发票-项目属性-专票1、3、6"),
    INVOICE_TAX_TYPE("tax_type", "渠道发票增值税率"),
    TAXPAYER_CREDENTIALS("taxpayer_credentials", "渠道发票-渠道纳税人资质库-纳税人资质"),


    BUDGET_PROJECT_STATUS("project_status", "预算-项目签报-审批状态"),
    BUDGET_PROJECT_VAT_RATES("project_vat_rate", "预算-项目签报-增值税率"),
    BUDGET_PROJECT_ORIGIN("project_origin", "预算-项目签报-项目来源"),
    BUDGET_TYPE("budget_type", "预算执行-日常性费用项目类型"),

    FLOW_NODE_PROP_ENABLE_COND("enable_cond", "流程维护-流程节点属性"),

    RELOCATION_PROJECT_COMPENSATION("compensation_sate", "迁改-赔补状态"),
    RELOCATION_INVOICE_TYPE("invoice_type", "迁改-收款发票类型"),

    FUND_BUSINESS_TYPE("business_type", "客户资金-办理业务类型"),
    FUND_FUND_FLOWS("fund_flows", "客户资金-资金流向"),
    FUND_AMOUNT_TYPE("amount_type", "客户资金-款项类型"),
    FUND_INVOICE_CONTENT("invoice_content", "客户资金-发票预开-开票内容"),
    FUND_INVOICE_BUSINESS("invoice_business", "客户资金-发票预开-办理业务"),
    FUND_INVOICE_STATUS("invoice_status", "客户资金-发票预开-流程状态"),

    PUBLICITY_APPLICATION_DETAIL_STATE("application_detail_state", "宣传用品-申领详情-审核状态"),
    PUBLICITY_GOODS_TYPE("goods_type", "宣传用品-物料类型"),

    MODULE("module", "系统模块"),

    REPORT_PERIOD("report_period","报表周期"),
    REPORT_APPROVER_STATE("report_approver_state","报表流程状态"),
    REPORT_THE_DAYS("report_the_days","旬详细"),
    REPORT_SEASON("report_season","季详细"),
    REPORT_HALF_YEAR("report_half_year","半年详细"),
    ;

    private final String value;
    private final String desc;

    DictCode(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public String value() {
        return this.value;
    }

    public String desc() {
        return this.desc;
    }
}
