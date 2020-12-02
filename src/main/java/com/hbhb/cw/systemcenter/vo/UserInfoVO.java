package com.hbhb.cw.systemcenter.vo;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    private UserInfo userInfo;
    private List<RouterVO> navRouters;
    private List<RouterVO> sideRouters;
    private Set<String> permissions;
}
