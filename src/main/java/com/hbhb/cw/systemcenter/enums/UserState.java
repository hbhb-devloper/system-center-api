package com.hbhb.cw.systemcenter.enums;

/**
 * @author dxk
 */

public enum UserState {
    /**
     * 停用
     */
    DISABLE((byte) 0),
    /**
     * 启用
     */
    ENABLE((byte) 1),
    ;

    private final Byte value;

    UserState(Byte value) {
        this.value = value;
    }

    public Byte value() {
        return this.value;
    }

}
