package com.hbhb.cw.systemcenter.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SysUserRole implements Serializable {
    private static final long serialVersionUID = 6792213831154999282L;

    private Integer userId;
    private Integer roleId;
}