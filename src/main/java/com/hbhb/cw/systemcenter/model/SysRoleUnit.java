package com.hbhb.cw.systemcenter.model;

import org.beetl.sql.annotation.entity.AutoID;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SysRoleUnit implements Serializable {
    private static final long serialVersionUID = -9171901556482510350L;

    @AutoID
    private Integer id;
    private Integer roleId;
    private Integer unitId;
    private Byte isHalf;
}