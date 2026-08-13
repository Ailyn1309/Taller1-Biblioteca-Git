package com.mycompany;

import com.mycompany.Customer;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static ArrayList<Customer> customer = new ArrayList<>();
    static ArrayList<Book> book = new ArrayList<>();
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
    public Customer updateCustomer(String id, String name, String phoneNumber, String email){
        for(Customer c: customer){
            if(c.getId().equals(id)){
                c.setName(name);
                c.setPhoneNumber(phoneNumber);
                c.setEmail(email);
                return c;
            }
        }
        System.out.println("Cliente no encontrado");
        return null;
    }
    public boolean deleteCustomer(String id){
        return customer.removeIf(c-> c.getId().equals(id));
    }

    public void createBook(Book b){
        book.add(b);
    }

    

}