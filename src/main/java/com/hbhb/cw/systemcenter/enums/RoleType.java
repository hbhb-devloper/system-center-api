package com.hbhb.cw.systemcenter.enums;

/**
 * @author xiaokang
 * @since 2020-06-27
 */
public enum RoleType {
    /**
     * 关联资源
     */
    RELATE_RESOURCE("RS"),
    /**
     * 关联单位
     */
    RELATE_UNIT("UN"),
    ;

    private final String value;

    RoleType(String value) {
        this.value = value;
    }

    public String value() {
        return this.value;
    }
}
