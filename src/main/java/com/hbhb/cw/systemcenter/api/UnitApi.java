package com.hbhb.cw.systemcenter.api;

import com.hbhb.cw.systemcenter.model.Unit;
import com.hbhb.cw.systemcenter.vo.SelectInputVO;
import com.hbhb.cw.systemcenter.vo.TreeSelectVO;
import com.hbhb.cw.systemcenter.vo.TreeSelectWrapVO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface UnitApi {

    @GetMapping("")
    List<Unit> getAllUnitList();

    @GetMapping("/list")
    List<TreeSelectVO> getUnitList(@RequestParam("unitName") String unitName);

    @GetMapping("/role/{roleId}")
    List<Integer> getRoleResourceTreeSelect(@PathVariable Integer roleId);

    @GetMapping("/tree-select")
    TreeSelectWrapVO getUnitTreeSelect();

    @GetMapping("/{unitId}")
    Unit getUnitInfo(@PathVariable Integer unitId);

    @PostMapping("")
    void addUnit(@RequestBody Unit unit);

    @PutMapping("")
    void updateUnit(@RequestBody Unit unit);

    @DeleteMapping("/{unitId}")
    void deleteUnit(@PathVariable Integer unitId);

    @GetMapping("/short-name/list")
    List<SelectInputVO> getShortName();
}
