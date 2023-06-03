package com.example.common.entity.noPersist.sqlQuery;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class SqlRelation {
    @JsonIgnore
    public static final String RELATION_AND="AND";
    @JsonIgnore
    public static final String RELATION_OR="OR";
}
