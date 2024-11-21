package com.manning.openbanking.services;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.manning.openbanking.entities.Transaction;

public class TransactionServiceTest {

    TransactionService transactionService = new TransactionService();

    @Test
    public void testGetTransactions(){

        Integer accountNumber = 123456789;

        List<Transaction> transactions = transactionService.findAllByAccountNumber(accountNumber);

        assertTrue(transactions.size() >= 3 && transactions.size() <= 5);
        
    }
}
