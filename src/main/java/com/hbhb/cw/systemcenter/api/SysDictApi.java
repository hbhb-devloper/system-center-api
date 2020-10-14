package com.hbhb.cw.systemcenter.api;

import com.hbhb.cw.systemcenter.model.SysDict;
import com.hbhb.cw.systemcenter.vo.SysDictResVO;
import com.hbhb.cw.systemcenter.vo.SysDictVO;
import com.hbhb.springboot.web.view.Page;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;


/**
 * @author xiaokang
 * @since 2020-09-29
 */
public interface SysDictApi {

    @Operation(summary = "分页获取字典列表")
    @GetMapping("/list")
    Page<SysDictResVO> getDictList(
            @Parameter(description = "页码，默认为1") @RequestParam(required = false) Long pageNum,
            @Parameter(description = "每页数量，默认为10") @RequestParam(required = false) Long pageSize,
            @Parameter(description = "字典类型名称（模糊查询）") @RequestParam(required = false) String dictTypeName,
            @Parameter(description = "字典标签（模糊查询）") @RequestParam(required = false) String dictLabel);

    @Operation(summary = "获取单条字典详情")
    @GetMapping("/info/{id}")
    SysDict getDictInfo(@Parameter(description = "id") @PathVariable Integer id);

    @Operation(summary = "新增字典")
    @PostMapping("")
    void saveDict(@Parameter(description = "字典实体") @RequestBody SysDict sysDict);

    @Operation(summary = "更新字典")
    @PutMapping("")
    void updateDict(@Parameter(description = "字典实体") @RequestBody SysDict sysDict);

    @Operation(summary = "删除字典")
    @DeleteMapping("/{id}")
    void deleteDict(@Parameter(description = "id") @PathVariable Integer id);

    @Operation(summary = "功能模块字典列表")
    @GetMapping("/module")
    List<SysDictVO> getModuleList();

    @Operation(summary = "项目签报-流程状态")
    @GetMapping("/budget/project-status")
    List<SysDictVO> getProjectStatus();

    @Operation(summary = "项目签报-项目来源")
    @GetMapping("/budget/project-origin")
    List<SysDictVO> getProjectOrigin();

    @Operation(summary = "项目签报-增值税率")
    @GetMapping("/budget/project-vat-rate")
    List<SysDictVO> getProjectVatRate();
}
