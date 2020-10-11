package com.hbhb.cw.systemcenter.vo;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xiaokang
 * @since 2020-09-29
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SysDictResVO implements Serializable {
    private static final long serialVersionUID = -5638062399865717716L;

    private Integer id;
    @ApiModelProperty("字典类型名称")
    private String dictTypeName;
    @ApiModelProperty("字典标签")
    private String dictLabel;
    @ApiModelProperty("字典键值")
    private String dictValue;
    @ApiModelProperty("字典编码")
    private String dictCode;
    @ApiModelProperty("备注")
    private String remark;
    @ApiModelProperty("显示顺序")
    private Integer sortNum;
    @ApiModelProperty("状态（0-停用、1-正常）")
    private Integer state;
}
