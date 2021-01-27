package com.hbhb.cw.systemcenter.api;

import com.hbhb.api.core.bean.SelectVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

public interface HallApi {

    @GetMapping("/selectHallByUnitId")
    Map<Integer,String> selectHallByUnitId(@RequestParam("unitId") Integer unitId);


    @GetMapping("/selectHallByUserId")
    List<SelectVO> selectHallByUserId(@RequestParam("userId") Integer userId);

}
