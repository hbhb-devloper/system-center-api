package com.hbhb.cw.systemcenter.api;

import com.hbhb.cw.systemcenter.model.SysFile;
import com.hbhb.cw.systemcenter.vo.FileVO;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

/**
 * @author xiaokang
 * @since 2020-10-28
 */
public interface FileApi {

    @PostMapping(value = "/upload", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    FileVO upload(@RequestPart("file") MultipartFile file,
                  @RequestParam(value = "bizType", required = false) Integer bizType);

    @PostMapping(value = "/upload/batch", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    List<FileVO> uploadBatch(@RequestPart("files") MultipartFile[] files,
                             @RequestParam("bizType") Integer bizType);

    @GetMapping("/download")
    void download(HttpServletResponse response,
                  @RequestParam("filePath") String filePath,
                  @RequestParam(value = "deleteFile", required = false) Boolean deleteFile);

    @PostMapping("/fill-template")
    void fillTemplate(@RequestBody Object data,
                      @RequestParam("templateName") String templateName,
                      @RequestParam("filePath") String filePath);

    @GetMapping("/info")
    SysFile getFileInfo(@RequestParam("fileId") Integer fileId);

    @GetMapping("/info/batch")
    List<SysFile> getFileInfoBatch(@RequestParam("fileIds") List<Integer> fileIds);

    @GetMapping("/domain")
    String getDomain();

    @GetMapping("/path")
    String getPath();

    @GetMapping("/path/template")
    String getTemplatePath();

    @DeleteMapping("/{fileId}")
    void deleteFile(@PathVariable("fileId") Long fileId);
}
