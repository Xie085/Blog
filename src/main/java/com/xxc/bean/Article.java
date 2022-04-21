package com.xxc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @author xiangcheng
 * @version 2022/4/20 18:21
 * @since JDK8
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Article {
    private Integer id;
    private Integer categoryId;
    private String title;
    private String content;
    private String description;
    private Integer statue;
    private String author;
    private Date createTime;
    private Integer showCount;
}
