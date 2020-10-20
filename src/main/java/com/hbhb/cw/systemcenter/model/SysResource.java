package com.hbhb.cw.systemcenter.model;

import org.beetl.sql.annotation.entity.AutoID;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class SysResource implements Serializable {
    private static final long serialVersionUID = -6628686180184947562L;
    @AutoID
    private Integer id;
    private String name;
    private String perm;
    private String apiPath;
    private String desc;
    private Date createTime;
}