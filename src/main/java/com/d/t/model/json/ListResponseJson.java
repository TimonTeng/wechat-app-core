package com.d.t.model.json;

import java.util.List;

public class ListResponseJson<T> extends BaseResponseJson {

	private List<T> list;

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
}
