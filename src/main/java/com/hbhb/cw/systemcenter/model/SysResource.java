package com.hbhb.cw.systemcenter.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Data;

/**
 * @author dxk
 */
@Data
public class SysResource implements Serializable {
    private static final long serialVersionUID = -6628686180184947562L;
    private Integer id;

    private String rsName;

    private String rsType;

    private Integer parentId;

    private Integer orderNum;

    private String path;

    private String perms;

    private String component;

    private Byte isFrame;

    private Byte visible;

    private String icon;

    private String target;

    private String remark;

    private Date createTime;

    private String createBy;

    private Date updateTime;

    private String updateBy;

    private List<SysResource> children = new ArrayList<>();
}