package com.hbhb.cw.systemcenter.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SysUserUintHall implements Serializable {

    private static final long serialVersionUID = 5767344039315276786L;

    /**
     * 主键ID
     */
    private Integer id;
    /**
     * 用户ID
     */
    private Integer userId;
    /**
     * 菜单ID
     */
    private Integer uintId;
    /**
     * 营业厅ID
     */
    private Integer hallId;

}
