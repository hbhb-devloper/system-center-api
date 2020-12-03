package com.hbhb.cw.systemcenter.api;

import com.hbhb.cw.systemcenter.model.Unit;
import com.hbhb.cw.systemcenter.vo.UnitTopVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

public interface UnitApi {

    @GetMapping("/top")
    UnitTopVO getTopUnit();

    @GetMapping("/map/unit-name")
    Map<Integer, String> getUnitMapByName();

    @GetMapping("/map/unit-id")
    Map<String, Integer> getUnitMapById();

    @GetMapping("/map/abbr")
    Map<String, Integer> getUnitMapByAbbr();

    @GetMapping("/{unitId}")
    Unit getUnitInfo(@PathVariable("unitId") Integer unitId);

    @GetMapping("/{unitId}/sub")
    List<Integer> getSubUnit(@PathVariable("unitId") Integer unitId);
}
