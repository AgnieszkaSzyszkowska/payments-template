package com.javatutorial.payments.transaction;

import org.springframework.data.repository.CrudRepository;

interface TransactionRepository extends CrudRepository<Transaction, Long> {
}
