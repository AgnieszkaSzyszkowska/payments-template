package com.javatutorial.payments.user;

import org.springframework.data.repository.CrudRepository;

interface UserRepository extends CrudRepository<User, Long> {
}
