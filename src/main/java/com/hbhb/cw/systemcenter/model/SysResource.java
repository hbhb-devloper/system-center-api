package com.hbhb.cw.systemcenter.model;

import org.beetl.sql.annotation.entity.AutoID;
import org.beetl.sql.fetch.annotation.Fetch;
import org.beetl.sql.fetch.annotation.FetchSql;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
@Fetch
public class SysResource implements Serializable {
    private static final long serialVersionUID = -6628686180184947562L;
    @AutoID
    private Integer id;
    private String name;
    private String perm;
    private String apiPath;
    private String desc;
    private Date createTime;
    /**
     * todo 优化
     */
    @FetchSql("select role_id from sys_role_resource where resource_id = #{id}")
    private List<String> roleIds;
}