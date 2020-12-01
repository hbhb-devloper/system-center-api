package com.hbhb.cw.systemcenter.api;

import com.hbhb.cw.systemcenter.model.Unit;
import com.hbhb.cw.systemcenter.vo.UnitTopVO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface UnitApi {

    @GetMapping("/top")
    UnitTopVO getTopUnit();

    @GetMapping("/all")
    List<Unit> getAllUnit();

    @GetMapping("/{unitId}")
    Unit getUnitInfo(@PathVariable("unitId") Integer unitId);

    @GetMapping("/sub/{unitId}")
    List<Integer> getSubUnitId(@PathVariable("unitId") Integer unitId);
}
