package com.hbhb.cw.systemcenter.model;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author dxk
 */
@Data
public class Unit implements Serializable {
    private static final long serialVersionUID = 7210208777877844759L;

    private Integer id;


    private String unitName;


    private Integer parentId;


    private String unitHeader;


    private String unitGrade;

    private String unitFunc;


    private String officePhone;


    private String fax;


    private String address;


    private String zipCode;


    private String email;


    private String abbr;


    private String shortName;

    private Date createTime;

    private Date updateTime;


    private Integer sortNum;

    private List<Unit> children = new ArrayList<>();
}