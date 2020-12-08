package com.hbhb.cw.systemcenter.enums;

/**
 * Copyright (c) 2020 Choice, Inc. All Rights Reserved. Choice Proprietary and Confidential.
 *
 * @author jiyu@myweimai.com
 * @since 2020-12-07
 */
public enum UnitEnum {

    /**
     * 杭州id
     */
    HANGZHOU(11),

    /**
     * 本部id
     */
    BENBU(429),
    ;

    private final Integer value;

    UnitEnum(Integer value) {
        this.value = value;
    }

    public Integer value() {
        return this.value;
    }

    public static boolean isHangzhou(Integer unitId) {
        if (unitId == null) {
            return false;
        }
        return unitId.equals(UnitEnum.HANGZHOU.value());
    }

    public static boolean isBenbu(Integer unitId) {
        if (unitId == null) {
            return false;
        }
        return unitId.equals(UnitEnum.BENBU.value());
    }
}
