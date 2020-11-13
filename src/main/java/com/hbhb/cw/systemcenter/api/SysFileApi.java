package com.hbhb.cw.systemcenter.api;

import com.hbhb.cw.systemcenter.model.SysFile;
import com.hbhb.cw.systemcenter.vo.FileDetailVO;
import com.hbhb.cw.systemcenter.vo.FileResVO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;

/**
 * @author xiaokang
 * @since 2020-10-28
 */
public interface SysFileApi {
    @PostMapping(value = "/upload-list", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    List<FileDetailVO> uploadFileList(@RequestPart("files") MultipartFile[] files,
                                      @RequestParam("bizType") Integer bizType);

    @PostMapping(value = "/upload", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    FileDetailVO uploadFile(@RequestPart("file") MultipartFile file,
                            @RequestParam("bizType") Integer bizType);

    @GetMapping("/list")
    List<FileResVO> list(@RequestParam("bizType") Integer bizType);

    @DeleteMapping("/delete")
    void deleteFile(@PathVariable("id") Long id);


    @DeleteMapping("/remove")
    void remove(@RequestBody File file);

    /**
     * 批量获取文件信息
     *
     * @param fileIds 文件id列表
     * @return 文件详情列表
     */
    @GetMapping("/file-list")
    List<SysFile> getFileList(@RequestParam("fileIds") List<Integer> fileIds);

    /**
     * 获取模板文件地址
     *
     * @return 模板文件地址
     */
    @GetMapping("/file-template")
    String getFileTemplatePath();

}
