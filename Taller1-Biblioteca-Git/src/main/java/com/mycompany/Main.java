package com.mycompany;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static ArrayList<Customer> customer = new ArrayList<>();
    static ArrayList<Book> book = new ArrayList<>();
    static ArrayList<Loan> loan = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // Aquí irá el menú (Fase 8)
    }
    public void create(Customer c){
        customer.add(c);
    }
    public void customerList(){
        for(Customer c : customer){
            System.out.println(c);
        }
    }
    public Customer getCustomer(String id){
        for(Customer c: customer){
            if(c.getId().equals(id)){
                return c;
            }
        }
        return null;
    }
    public void customerUpdate(String id, String name, String phoneNumber, String email){
        for(Customer c: customer){
            if(c.getId().equals(id)){
                c.setName(name);
                c.setPhoneNumber(phoneNumber);
                c.setEmail(email);
                return;
            }
        }
        System.out.println("Cliente no encontrado");

    }
    public boolean deleteCustomer(String id){
        return customer.removeIf(c-> c.getId().equals(id));
    }

    public void createBook(Book b){
        book.add(b);
    }

    public void bookList(){
        for(Book b: book){
            System.out.println(b);
        }
    }

   public Book getBook(String code){
        for(Book b: book){
            if(b.getCode()==code){
                return b;
            }
        }
       System.out.println("Libro no registrado");
        return null;
   }

   public void bookUpdate(String code, String title, String yearPub, String author, boolean available) {
        for(Book b: book){
            if(b.getCode()==code){
                b.setAuthor(author);
                b.setTitle(title);
                b.setYearpub(yearPub);
                b.setAvailable(available);
                return;
            }
        }
       System.out.println("Libro no encontrado");
   }
   public boolean bookDelete(String code){
        return book.removeIf(b-> b.getCode().equals(code));
   }
   public void createLoan(Loan l){
        loan.add(l);
   }
   public void loanRepayment(String loanId){
        for(Loan l: loan){
            if(l.getLoanId()==loanId){
                l.setStatus("Devuelto");
                return;
            }
        }
       System.out.println("No hay ningún prestamo disponible");
   }
   public void loanList(){
        for(Loan l: loan){
            System.out.println(l);
        }
   }
   

}