package com.hbhb.cw.systemcenter.api;

import com.hbhb.cw.systemcenter.model.File;
import com.hbhb.cw.systemcenter.vo.FileVO;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author xiaokang
 * @since 2020-10-28
 */
public interface FileApi {

    @PostMapping(value = "/upload", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    FileVO uploadFile(@RequestPart("file") MultipartFile file,
                      @RequestParam("bizType") Integer bizType);

    @PostMapping(value = "/upload/batch", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    List<FileVO> uploadFileBatch(@RequestPart("files") MultipartFile[] files,
                                 @RequestParam("bizType") Integer bizType);

    @GetMapping("/info")
    File getFile(@RequestParam("fileId") Integer fileId);

    @GetMapping("/info/batch")
    List<File> getFileInfo(@RequestParam("fileIds") List<Integer> fileIds);

    @GetMapping("/template-path")
    String getFileTemplatePath();
}
