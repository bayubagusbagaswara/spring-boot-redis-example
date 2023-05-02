package com.springbootredis.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
// No @Entity concept here
public class Employee implements Serializable {

    private static final long serialVersionUID = -6536313623986629700L;

    private Integer employeeId;
    private String employeeName;
    private Double employeeSalary;
}
