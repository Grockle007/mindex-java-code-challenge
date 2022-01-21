//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.mindex.challenge.data;

import java.time.Instant;
import java.util.Objects;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class Compensation {
    @DBRef(
            lazy = true
    )
    private Employee employee;
    private String salary;
    private Instant effectiveDate;

    public Compensation() {
    }

    public Employee getEmployee() {
        return this.employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getSalary() {
        return this.salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Instant getEffectiveDate() {
        return this.effectiveDate;
    }

    public void setEffectiveDate(Instant effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Compensation employee(Employee employee) {
        this.employee = employee;
        return this;
    }

    public Compensation salary(String salary) {
        this.salary = salary;
        return this;
    }

    public Compensation effectiveDate(Instant effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Compensation)) {
            return false;
        } else {
            Compensation compensation = (Compensation)o;
            return Objects.equals(this.employee, compensation.employee) && Objects.equals(this.salary, compensation.salary) && Objects.equals(this.effectiveDate, compensation.effectiveDate);
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.employee, this.salary, this.effectiveDate});
    }

    public String toString() {
        return "{ employee='" + this.getEmployee() + "', salary='" + this.getSalary() + "', effectiveDate='" + this.getEffectiveDate() + "'}";
    }
}
