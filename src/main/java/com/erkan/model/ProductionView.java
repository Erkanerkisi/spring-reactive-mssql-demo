package com.erkan.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Builder
@Table("dbo.xxer_item")
public class ProductionView {
    private Long id;
    private String name;
}
