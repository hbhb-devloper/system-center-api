package com.hbhb.cw.systemcenter.vo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yzc
 * <p>
 * 部门vo
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TreeSelectWrapVO {

    private Integer checked;
    private List<TreeSelectVO> list;
}
