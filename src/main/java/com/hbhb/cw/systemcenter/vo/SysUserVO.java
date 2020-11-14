package com.hbhb.cw.systemcenter.vo;

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
public class SysUserVO implements Serializable {
    private static final long serialVersionUID = 812218807524598920L;
    private Integer id;
    @Schema(description = "用户姓名")
    private String nickName;
    @Schema(description = "用户单位id")
    private Integer unitId;
    @Schema(description = "用户邮箱")
    private String email;

}
