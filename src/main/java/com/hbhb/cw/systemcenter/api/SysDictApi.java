package com.hbhb.cw.systemcenter.api;

import com.hbhb.cw.systemcenter.model.SysDict;
import com.hbhb.cw.systemcenter.vo.SysDictResVO;
import com.hbhb.cw.systemcenter.vo.SysDictVO;

import org.beetl.sql.core.page.PageResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author xiaokang
 * @since 2020-09-29
 */
public interface SysDictApi {

    @GetMapping("/list")
    PageResult<SysDictResVO> getDictList(@RequestParam(value = "pageNum", required = false) Long pageNum,
                                         @RequestParam(required = false) Integer pageSize,
                                         @RequestParam(required = false) String dictTypeName,
                                         @RequestParam(required = false) String dictLabel);

    @GetMapping("/info/{id}")
    SysDict getDictInfo(@PathVariable Integer id);

    @PostMapping("")
    void saveDict(@RequestBody SysDict sysDict);

    @PutMapping("")
    void updateDict(@RequestBody SysDict sysDict);

    @DeleteMapping("/{id}")
    void deleteDict(@PathVariable Integer id);

    @GetMapping("/module")
    List<SysDictVO> getModuleList();

    @GetMapping("/budget/project-status")
    List<SysDictVO> getProjectStatus();

    @GetMapping("/budget/project-origin")
    List<SysDictVO> getProjectOrigin();

    @GetMapping("/budget/project-vat-rate")
    List<SysDictVO> getProjectVatRate();
}
