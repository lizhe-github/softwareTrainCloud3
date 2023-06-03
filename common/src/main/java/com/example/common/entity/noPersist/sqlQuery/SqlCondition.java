package com.example.common.entity.noPersist.sqlQuery;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class SqlCondition {
    @JsonIgnore
    public static final String CONDITION_EQUAL="EQUAL";
    @JsonIgnore
    public static final String CONDITION_LIKE="LIKE";
    @JsonIgnore
    public static final String CONDITION_NOT_EQUAL="NOT_EQUAL";
    @JsonIgnore
    public static final String CONDITION_IN="IN";
    @JsonIgnore
    public static final String CONDITION_NOT_IN="NOT_IN";
}
