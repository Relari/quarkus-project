package com.pe.relari.repository;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import com.pe.relari.model.Employee;
import com.pe.relari.model.GenderCatalog;
import com.pe.relari.model.PositionCatalog;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class EmployeeRepository {

    public static List<Employee> employees() {
        return List.of(
                new Employee(1, "Daniel", 19, GenderCatalog.M, PositionCatalog.DEVELOPER, 1809, true),
                new Employee(2, "Maria", 33, GenderCatalog.F, PositionCatalog.ARCHITECT, 2403, true),
                new Employee(3, "Juan", 20, GenderCatalog.M, PositionCatalog.SCRUM_MASTER, 3452, false),
                new Employee(4, "Esther", 18, GenderCatalog.F, PositionCatalog.DEVELOPER, 3168, false),
                new Employee(5, "Luis", 30, GenderCatalog.M, PositionCatalog.ARCHITECT, 2921, true),
                new Employee(6, "Stephany", 25, GenderCatalog.F, PositionCatalog.MANAGER, 3773, false),
                new Employee(7, "Lucho", 28, GenderCatalog.M, PositionCatalog.MANAGER, 3078, false),
                new Employee(8, "Talia", 22, GenderCatalog.F, PositionCatalog.ARCHITECT, 2510, true),
                new Employee(9, "Alexander", 31, GenderCatalog.M, PositionCatalog.MANAGER, 3860, true),
                new Employee(10, "Lucero", 25, GenderCatalog.F, PositionCatalog.TEAM_LEAD, 3948, false)
        );
    }

}
