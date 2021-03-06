package com.hbhb.cw.systemcenter.api;

import com.hbhb.cw.systemcenter.model.Unit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

public interface UnitApi {

    @GetMapping("/all/id")
    List<Integer> getAllUnitId();

    @GetMapping("/map/unit-id")
    Map<Integer, String> getUnitMapById();

    @GetMapping("/map/unit-name")
    Map<String, Integer> getUnitMapByUnitName();

    @GetMapping("/map/short-name")
    Map<String, Integer> getUnitMapByShortName();

    @GetMapping("/map/abbr")
    Map<String, Integer> getUnitMapByAbbr();

    @GetMapping("/{unitId}")
    Unit getUnitInfo(@PathVariable("unitId") Integer unitId);

    @GetMapping("/{unitId}/sub")
    List<Integer> getSubUnit(@PathVariable("unitId") Integer unitId);
}
