package com.mycompany;

import java.time.LocalDate;

public class Loan {
    private String loanId;
    private Customer customer;
    private Book book;
    private LocalDate date;
    private String status;

    public Loan(Book book, Customer customer, LocalDate date, String loanId, String status) {
        this.book = book;
        this.customer = customer;
        this.date = date;
        this.loanId = loanId;
        this.status = status;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "book=" + book +
                ", loanId='" + loanId + '\'' +
                ", customer=" + customer +
                ", date=" + date +
                ", status='" + status + '\'' +
                '}';
    }
}
