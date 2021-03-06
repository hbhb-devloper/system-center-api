package com.hbhb.cw.systemcenter.vo;

import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xiaokang
 * @since 2020-08-11
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CheckBoxVO implements Serializable {
    private static final long serialVersionUID = -8543567227916166111L;

    @Schema(description = "多选框的id值")
    private Integer id;
    @Schema(description = "多选框是否为半选择状态")
    private Byte isHalf;
}
