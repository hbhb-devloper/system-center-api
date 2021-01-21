package com.hbhb.cw.systemcenter.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author wangxiaogang
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserBasicsVO implements Serializable {
    private static final long serialVersionUID = -3061895542244537567L;
    private Integer id;
    @Schema(description = "单位id")
    @JsonIgnore
    private Integer unitId;
    @Schema(description = "默认归属单位id")
    @JsonIgnore
    private Integer defaultUnitId;
    @Schema(description = "单位名称")
    private String unitName;
    @Schema(description = "登录账户")
    private String userName;
    @Schema(description = "用户昵称")
    private String nickName;
}
