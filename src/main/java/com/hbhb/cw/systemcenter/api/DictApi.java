package com.hbhb.cw.systemcenter.api;

import com.hbhb.cw.systemcenter.vo.DictVO;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * 字典接口
 *
 * @author xiaokang
 * @since 2020-09-29
 */
public interface DictApi {

    @GetMapping("/module")
    List<DictVO> getModule();

    @GetMapping("/budget/project-status")
    List<DictVO> getProjectStatus();

    @GetMapping("/budget/project-origin")
    List<DictVO> getProjectOrigin();

    @GetMapping("/budget/project-vat-rate")
    List<DictVO> getProjectVatRate();

    @GetMapping("/relocation/compensation_sate")
    List<DictVO> getCompensationSate();
}
