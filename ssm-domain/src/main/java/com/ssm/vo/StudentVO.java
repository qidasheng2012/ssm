package com.ssm.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author qp
 * @date 2019/5/1
 */
@Data
public class StudentVO implements Serializable {

    /**编号 */
    private Integer stuId;

    /**学号 */
    private Integer stuNumber;

    /**姓名 */
    private String stuName;

    /**年龄 */
    private Integer stuAge;

    /**性别 */
    private String stuGender;

}