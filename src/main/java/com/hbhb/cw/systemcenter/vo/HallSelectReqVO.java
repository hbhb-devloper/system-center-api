package com.hbhb.cw.systemcenter.vo;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HallSelectReqVO implements Serializable {
    private static final long serialVersionUID = -7613178516718076881L;

    @Schema(description = "已选择的营业厅")
    private List<HallReqVO> hallReqVOS;
    @Schema(description = "所属分公司id")
    private Integer unitId;

}
