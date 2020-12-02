package com.hbhb.cw.systemcenter.model;

import org.beetl.sql.annotation.entity.AutoID;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRole implements Serializable {
    private static final long serialVersionUID = 6792213831154999282L;

    @AutoID
    private Integer id;
    private Integer userId;
    private Integer roleId;
}