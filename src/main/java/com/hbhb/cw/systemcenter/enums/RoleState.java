package com.hbhb.cw.systemcenter.enums;

/**
 * @author xiaokang
 * @since 2020-06-27
 */
public enum RoleState {
    /**
     * 已删除
     */
    DELETED((byte) 0),
    /**
     * 正常
     */
    NORMAL((byte) 1),
    /**
     * 停用
     */
    SUSPENDED((byte) 2),
    ;

    private final Byte value;

    RoleState(Byte value) {
        this.value = value;
    }

    public Byte value() {
        return this.value;
    }
}
