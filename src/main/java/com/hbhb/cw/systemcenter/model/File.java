package com.hbhb.cw.systemcenter.model;

import org.beetl.sql.annotation.entity.AutoID;

import java.io.Serializable;
import java.util.Date;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class File implements Serializable {
    private static final long serialVersionUID = 7602034277516492512L;

    @AutoID
    private Long id;
    @Schema(description = "文件名称")
    private String fileName;
    @Schema(description = "文件地址")
    private String filePath;
    @Schema(description = "文件大小")
    private String fileSize;
    @Schema(description = "上传时间")
    private Date uploadTime;
    @Schema(description = "业务类型")
    private Integer bizType;
}