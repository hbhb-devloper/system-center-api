package com.hbhb.cw.systemcenter.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.hbhb.cw.systemcenter.model.SysRole;
import com.hbhb.cw.systemcenter.model.Unit;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yzc
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TreeSelectParentVO implements Serializable {

    private static final long serialVersionUID = 2834364609892806484L;

    private Integer id;

    private String label;

    private Boolean isParent;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<TreeSelectParentVO> children;

    /**
     * 角色集合拷贝
     */
    public TreeSelectParentVO(SysRole sysRole) {
        this.id = sysRole.getId();
        this.label = sysRole.getRoleName();
    }

    /**
     * 单位树形集合递归拷贝
     */
    public TreeSelectParentVO(Unit unit) {
        this.id = unit.getId();
        this.label = unit.getUnitName();
        this.children = unit.getChildren().stream().map(TreeSelectParentVO::new)
                .collect(Collectors.toList());
    }
}
