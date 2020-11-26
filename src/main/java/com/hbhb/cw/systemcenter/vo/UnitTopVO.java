package com.hbhb.cw.systemcenter.vo;

import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wangxiaogang
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UnitTopVO implements Serializable {
    private static final long serialVersionUID = 4254909197912507502L;

    @Schema(description = "杭州id")
    private Integer hangzhou;
    @Schema(description = "本部id")
    private Integer benbu;
}
