package com.hbhb.cw.systemcenter.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

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

    private List<Integer> checked;
    private List<TreeSelectVO> list;
}
