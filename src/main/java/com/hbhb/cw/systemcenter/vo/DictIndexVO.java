package com.hbhb.cw.systemcenter.vo;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Copyright (c) 2020 Choice, Inc. All Rights Reserved. Choice Proprietary and Confidential.
 *
 * @author jiyu@myweimai.com
 * @since 2020-11-27
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DictIndexVO {

    private String type;
    private Map<String, String> code;
}
