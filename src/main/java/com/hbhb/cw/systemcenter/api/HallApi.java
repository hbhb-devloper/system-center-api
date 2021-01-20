package com.hbhb.cw.systemcenter.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

public interface HallApi {

    @GetMapping("/selectHallByUnitId")
    Map<Integer,String> selectHallByUnitId(@RequestParam("unitId") Integer unitId);

}