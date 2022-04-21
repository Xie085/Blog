package com.xxc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author xiangcheng
 * @version 2022/4/20 18:40
 * @since JDK8
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Tag {
    private Integer id;
    private String tagName;
}
