package com.javatutorial.payments.transaction;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@AllArgsConstructor
public class TransactionController {

    private final TransactionRepository transactionRepository;

    @PostMapping("/transaction")
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody Transaction addTransaction(@RequestBody final Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    @GetMapping("/transaction/{transactionId}")
    public @ResponseBody Transaction getTransaction(@PathVariable final Long transactionId) {
        final Optional<Transaction> transaction = transactionRepository.findById(transactionId);
        if (transaction.isPresent()) {
            return transaction.get();
        } else throw new IllegalArgumentException("No transaction available with id: " + transactionId);
    }
}
