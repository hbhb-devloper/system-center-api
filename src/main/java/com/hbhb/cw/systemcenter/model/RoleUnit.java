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
public class RoleUnit implements Serializable {
    private static final long serialVersionUID = -9171901556482510350L;

    private Integer roleId;
    private Integer unitId;
    private Byte isHalf;
}