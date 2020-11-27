package com.hbhb.cw.systemcenter.api;

import com.hbhb.cw.systemcenter.vo.DictVO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 字典接口
 *
 * @author xiaokang
 * @since 2020-09-29
 */
public interface DictApi {

    @GetMapping("")
    List<DictVO> getDict(@RequestParam("type") String type, @RequestParam("code") String code);
}
