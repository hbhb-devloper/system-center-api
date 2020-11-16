package com.hbhb.cw.systemcenter.api;

import com.hbhb.cw.systemcenter.model.Unit;
import com.hbhb.cw.systemcenter.vo.ParentVO;
import com.hbhb.cw.systemcenter.vo.SelectInputVO;
import com.hbhb.cw.systemcenter.vo.TreeSelectVO;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/short-name/list")
    List<SelectInputVO> getShortName();

    @GetMapping("/parent-unit")
    ParentVO getParentUnit();
}
