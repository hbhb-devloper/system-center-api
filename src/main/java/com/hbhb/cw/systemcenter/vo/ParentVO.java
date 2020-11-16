package com.hbhb.cw.systemcenter.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author wangxiaogang
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParentVO implements Serializable {
    private static final long serialVersionUID = 4254909197912507502L;

    @Schema(description = "杭州")
    private Integer hangzhou;
    @Schema(description = "本部")
    private Integer benbu;
}
