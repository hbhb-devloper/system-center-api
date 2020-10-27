package com.hbhb.cw.systemcenter.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class SelectInputVO implements Serializable {

    private static final long serialVersionUID = 921109951808175243L;
    private Long id;
    private String label;
    private String input = "";
}
