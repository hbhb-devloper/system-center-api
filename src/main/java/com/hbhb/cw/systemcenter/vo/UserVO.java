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
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserVO implements Serializable {
    private static final long serialVersionUID = 812218807524598920L;

    private Integer id;
    @Schema(description = "用户姓名")
    private String nickName;
    @Schema(description = "单位id")
    private Integer unitId;
    @Schema(description = "邮箱")
    private String email;
}
