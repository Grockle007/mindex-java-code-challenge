package com.mindex.challenge.data;

import java.util.Objects;

public class ReportingStructure {
    private Employee employee;
    private int numberOfReports;

    public ReportingStructure(Employee employee, int numberOfReports) {
        this.employee = employee;
        this.numberOfReports = numberOfReports;
    }

    public Employee getEmployee() {
        return this.employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public int getNumberOfReports() {
        return this.numberOfReports;
    }

    public void setNumberOfReports(int numberOfReports) {
        this.numberOfReports = numberOfReports;
    }

    public ReportingStructure employee(Employee employee) {
        this.employee = employee;
        return this;
    }

    public ReportingStructure numberOfReports(int numberOfReports) {
        this.numberOfReports = numberOfReports;
        return this;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof ReportingStructure)) {
            return false;
        } else {
            ReportingStructure reportingStructure = (ReportingStructure)o;
            return Objects.equals(this.employee, reportingStructure.employee) && this.numberOfReports == reportingStructure.numberOfReports;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.employee, this.numberOfReports});
    }

    public String toString() {
        return "{ employee='" + this.getEmployee() + "', numberOfReports='" + this.getNumberOfReports() + "'}";
    }
}
