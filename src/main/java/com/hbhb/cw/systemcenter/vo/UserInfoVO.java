package com.hbhb.cw.systemcenter.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * @author xiaokang
 * @since 2020-06-22
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoVO implements Serializable {
    private static final long serialVersionUID = 5582188498727424329L;

    private UserBasicsVO userInfo;
    private List<RouterVO> navRouters;
    private List<RouterVO> sideRouters;
    private Set<String> permissions;
}
