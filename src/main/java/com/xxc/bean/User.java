package com.xxc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author xiangcheng
 * @version 2022/4/18 12:57
 * @since JDK8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private Integer id;
    private String userName;
    private String password;
}
