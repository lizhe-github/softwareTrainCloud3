package com.example.common.entity.noPersist.sqlQuery;

import lombok.Data;


@Data
public class QueryCondition {

	private String property;

	private Object value;

	//TODO property和value的关系  目前只支持 EQUAL LIKE NOT_EQUAL IN NOT_IN    而且给出的每一个条件必须是AND连接
	private String condition;



}
