package com.hbhb.cw.systemcenter.api;

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
    @PostMapping(value = "/upload", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    List<FileDetailVO> uploadFile(@RequestPart("files") MultipartFile[] files,
                                  @RequestParam(value = "bizType", required = false) Integer bizType);

    @GetMapping("/list")
    List<FileResVO> list(@RequestParam(value = "bizType", required = false) Integer bizType);

    @DeleteMapping("/delete")
    void deleteFile(@PathVariable("id") Long id);


    @DeleteMapping("/remove")
    void remove(@RequestBody File file);

}
