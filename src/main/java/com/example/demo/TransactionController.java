package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @PostMapping("/create")
    public Long createTransaction(@RequestBody Transaction transaction) {
        transactionService.saveTransaction(transaction);
        return transaction.getTransactionId();
    }

    @GetMapping("/viewAll")
    public Iterable<Transaction> viewAllTransactions() {
        return transactionService.getTransactionHistory();
    }

}