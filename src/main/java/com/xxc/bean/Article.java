package com.xxc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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
    private List<Tag> tagList;
    private String time;
    private String categoryName;

    public String getTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(createTime);
    }
}
