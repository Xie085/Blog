package com.xxc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author xiangcheng
 * @version 2022/4/20 18:42
 * @since JDK8
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    private Integer id;
    private String categoryName;
    private String iconClass;
    private String aliasName;
    private Integer sort;
}
