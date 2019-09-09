module com.plhk.jpms.repository.employee {
    requires com.plhk.jpms.domain;
    requires com.plhk.jpms.repository.core;

    provides com.plhk.jpms.repository.core.Repository with com.plhk.jpms.repository.employee.EmployeeRepository;

    exports com.plhk.jpms.repository.employee;
}