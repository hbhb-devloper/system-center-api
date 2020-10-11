package com.hbhb.cw.systemcenter.vo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xiaokang
 * @since 2020-10-09
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginVO implements Serializable {
    private static final long serialVersionUID = 4611145497712654748L;

    private Integer id;
    private String userName;
    private String pwd;
    private Byte state;
    private String clientId;
}
