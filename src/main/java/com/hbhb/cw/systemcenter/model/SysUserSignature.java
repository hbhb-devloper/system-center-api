package com.hbhb.cw.systemcenter.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author wangxiaogang
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SysUserSignature implements Serializable {
    private static final long serialVersionUID = 4176801332802242224L;
    /**
     * id
     */
    private Integer id;
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 签名图片路径
     */
    private String imagePath;
}
