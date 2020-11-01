package com.hbhb.cw.systemcenter.enums;

public enum AllName {
    FLOW_NAME("流程"),

    TITLE("{title}"),

    APPROVE("{approve}"),

    CAUSE("{cause}"),

    XLSX(".xlsx"),

    XLS(".xls"),
    ;

    public String getValue() {
        return value;
    }

    private final String value;

    AllName(String value) {
        this.value = value;
    }

    public String value() {
        return this.value;
    }
}
