package com.hbhb.cw.systemcenter.model;

import org.beetl.sql.annotation.entity.AutoID;

import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SysMaintain implements Serializable {
    private static final long serialVersionUID = 8170873788235861933L;

    @AutoID
    private Long id;
    @Schema(description = "管理员")
    private String administrator;
    @Schema(description = "联系方式")
    private String phone;
    @Schema(description = "管理邮箱")
    private String email;
    @Schema(description = "软件名")
    private String softwareName;
    @Schema(description = "软件版本")
    private String version;
    @Schema(description = "开发语言")
    private String devLanguage;
}