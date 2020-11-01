package com.hbhb.cw.systemcenter.vo;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.hbhb.cw.systemcenter.model.SysRole;
import com.hbhb.cw.systemcenter.model.Unit;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Treeselect树结构实体类
 *
 * @author xiaokang
 */
@Data
@NoArgsConstructor
public class TreeSelectVO implements Serializable {
    private static final long serialVersionUID = -7878012176856441332L;

    private Integer id;

    private String label;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<TreeSelectVO> children;

    /**
     * 角色集合拷贝
     */
    public TreeSelectVO(SysRole role) {
        this.id = role.getId();
        this.label = role.getRoleName();
    }

    /**
     * 单位树形集合递归拷贝
     */
    public TreeSelectVO(Unit unit) {
        this.id = unit.getId();
        this.label = unit.getUnitName();
        this.children = unit.getChildren().stream().map(TreeSelectVO::new).collect(Collectors.toList());
    }
}