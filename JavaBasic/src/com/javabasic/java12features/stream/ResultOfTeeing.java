package com.javabasic.java12features.stream;

import java.util.List;

public class ResultOfTeeing {

	private Long count;
	private List<Integer> filtered;

	ResultOfTeeing(Long count, List<Integer> filtered) {
		this.count = count;
		this.filtered = filtered;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public List<Integer> getFiltered() {
		return filtered;
	}

	public void setFiltered(List<Integer> filtered) {
		this.filtered = filtered;
	}

	@Override
	public String toString() {
		return "ResultOfTeeing [count=" + count + ", filtered=" + filtered + "]";
	}

}
