package com.xxc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 封装统一的结果集给前端
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Result {

	// 操作结果
	private String resultCode;
	
	// 错误信息
	private String errorInfo;
	
	// 附属对象
	private Object object;

	public Result(String resultCode, String errorInfo) {
		this.resultCode = resultCode;
		this.errorInfo = errorInfo;
	}
}
