module com.plhk.jpms.repository.user {
    requires com.plhk.jpms.domain;
    requires com.plhk.jpms.repository.core;

    provides com.plhk.jpms.repository.core.Repository with com.plhk.jpms.repository.user.UserRepository;

    exports com.plhk.jpms.repository.user;
}