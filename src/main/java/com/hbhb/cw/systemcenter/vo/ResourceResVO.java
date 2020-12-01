package com.hbhb.cw.systemcenter.vo;

import com.hbhb.cw.systemcenter.model.SysResource;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Data;

/**
 * @author xiaokang
 * @since 2020-06-25
 */
@Data
public class ResourceResVO implements Serializable {
    private static final long serialVersionUID = 6090034808531523013L;

    private Integer id;
    private String rsName;
    private String rsType;
    private Integer parentId;
    private Integer orderNum;
    private String icon;
    private String perms;
    private String component;
    private Byte isFrame;
    private Byte visible;
    private Date createTime;
    private List<SysResource> children = new ArrayList<>();
}
