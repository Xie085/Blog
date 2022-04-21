package com.xxc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author xiangcheng
 * @version 2022/4/21 16:02
 * @since JDK8
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ArticleTag {
    private int articleId;
    private int tagId;
}
