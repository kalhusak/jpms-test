module com.plhk.jpms.domain {
    exports com.plhk.jpms.domain;
    exports com.plhk.jpms.domain.user to com.plhk.jpms.repository.user,com.plhk.jpms.server;
    exports com.plhk.jpms.domain.employee to com.plhk.jpms.repository.employee,com.plhk.jpms.server;
}