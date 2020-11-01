package com.hbhb.cw.systemcenter.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Treeselect树结构实体类
 *
 * @author xiaokang
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SelectVO implements Serializable {
    private static final long serialVersionUID = 1004230475567244162L;
    private Long id;
    private String label;
}
