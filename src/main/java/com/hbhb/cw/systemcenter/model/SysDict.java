package com.hbhb.cw.systemcenter.model;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author dxk
 * @since 2020-09-29
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SysDict implements Serializable {
	private static final long serialVersionUID = 5853187740251669853L;

	private Integer id;
	@ApiModelProperty("字典类型id")
	private Integer dictTypeId;
	@ApiModelProperty("字典标签")
	private String dictLabel;
	@ApiModelProperty("字典键值")
	private String dictValue;
	@ApiModelProperty("字典编码")
	private String dictCode;
	@ApiModelProperty("显示顺序")
	private Integer sortNum;
	@ApiModelProperty("状态（0-停用、1-正常）")
	private Integer state;
	@ApiModelProperty("备注")
	private String remark;
	@ApiModelProperty("创建时间")
	private Date createTime;
	@ApiModelProperty("创建人")
	private String createBy;
}
