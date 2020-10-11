package com.hbhb.cw.systemcenter.vo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xiaokang
 * @since 2020-07-15
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SysDictVO implements Serializable {
    private static final long serialVersionUID = 4468558253266545161L;
    private String label;
    private String value;
}
