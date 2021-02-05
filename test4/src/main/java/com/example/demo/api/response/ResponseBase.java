package com.example.demo.api.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class ResponseBase<T> {

	private final T responseBase = null;

	public T getResponseBase() {
		return responseBase;
	}
}
