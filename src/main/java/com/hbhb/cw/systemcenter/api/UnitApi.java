package com.hbhb.cw.systemcenter.api;

import com.hbhb.cw.systemcenter.model.Unit;
import com.hbhb.cw.systemcenter.vo.TreeSelectVO;
import com.hbhb.cw.systemcenter.vo.UnitTopVO;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface UnitApi {

    @GetMapping("")
    List<Unit> getAllUnitList();

    @GetMapping("/list")
    List<TreeSelectVO> getUnitList(@RequestParam("unitName") String unitName);

    @GetMapping("/role/{roleId}")
    List<Integer> getRoleResourceTreeSelect(@PathVariable("roleId") Integer roleId);

    @GetMapping("/{unitId}")
    Unit getUnitInfo(@PathVariable("unitId") Integer unitId);

    @PostMapping("")
    void addUnit(@RequestBody Unit unit);

    @PutMapping("")
    void updateUnit(@RequestBody Unit unit);

    @DeleteMapping("/{unitId}")
    void deleteUnit(@PathVariable("unitId") Integer unitId);

    @GetMapping("/top")
    UnitTopVO getTopUnit();
}
