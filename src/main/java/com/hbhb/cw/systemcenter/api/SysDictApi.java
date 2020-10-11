package com.hbhb.cw.systemcenter.api;

import com.hbhb.cw.systemcenter.model.SysDict;
import com.hbhb.cw.systemcenter.vo.SysDictResVO;
import com.hbhb.cw.systemcenter.vo.SysDictVO;
import com.hbhb.springboot.webflux.view.Page;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * @author xiaokang
 * @since 2020-09-29
 */
public interface SysDictApi {

    @ApiOperation("分页获取字典列表")
    @GetMapping("/list")
    Page<SysDictResVO> getDictList(
            @ApiParam(value = "页码，默认为1") @RequestParam(required = false) Long pageNum,
            @ApiParam(value = "每页数量，默认为10") @RequestParam(required = false) Long pageSize,
            @ApiParam(value = "字典类型名称（模糊查询）") @RequestParam(required = false) String dictTypeName,
            @ApiParam(value = "字典标签（模糊查询）") @RequestParam(required = false) String dictLabel);

    @ApiOperation("获取单条字典详情")
    @GetMapping("/info/{id}")
    SysDict getDictInfo(@ApiParam(value = "id") @PathVariable Integer id);

    @ApiOperation("新增字典")
    @PostMapping("")
    void saveDict(@ApiParam(value = "字典实体") @RequestBody SysDict sysDict);

    @ApiOperation("更新字典")
    @PutMapping("")
    void updateDict(@ApiParam(value = "字典实体") @RequestBody SysDict sysDict);

    @ApiOperation("删除字典")
    @DeleteMapping("/{id}")
    void deleteDict(@ApiParam(value = "id") @PathVariable Integer id);

    @ApiOperation("功能模块字典列表")
    @GetMapping("/module")
    List<SysDictVO> getModuleList();

    @ApiOperation(value = "项目签报-流程状态", notes = "字典")
    @GetMapping("/budget/project-status")
    List<SysDictVO> getProjectStatus();

    @ApiOperation(value = "项目签报-项目来源", notes = "字典")
    @GetMapping("/budget/project-origin")
    List<SysDictVO> getProjectOrigin();

    @ApiOperation(value = "项目签报-增值税率", notes = "字典")
    @GetMapping("/budget/project-vat-rate")
    List<SysDictVO> getProjectVatRate();
}
