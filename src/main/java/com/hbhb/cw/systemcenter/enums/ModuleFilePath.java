package com.hbhb.cw.systemcenter.enums;


/**
 * 附件上传路径
 *
 * @author wangxiaogang
 */

public enum ModuleFilePath {

    /**
     * 预算模块
     */
    BUDGET("/budget"),
    /**
     * 客户资金
     */
    FUND("/fund"),
    /**
     * 迁改
     */
    RELOCATION("/relocation"),
    /**
     * 宣传用品
     */
    PUBLICITY("/publicity"),
    /**
     * 报表
     */
    REPORT("/report"),
    /**
     * 用户照片
     */
    IMAGE("/image");

    private final String value;

    public String value() {
        return this.value;
    }

    public String getValue() {
        return value;
    }

    ModuleFilePath(String value) {
        this.value = value;
    }
}
