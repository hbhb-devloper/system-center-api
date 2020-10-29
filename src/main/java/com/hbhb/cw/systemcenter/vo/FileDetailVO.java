package com.hbhb.cw.systemcenter.vo;

import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FileDetailVO implements Serializable {
    private static final long serialVersionUID = 4058087556231244561L;

    private Long id;
    @Schema(description = "文件名称")
    private String fileName;
    @Schema(description = "文件大小")
    private String fileSize;
}
