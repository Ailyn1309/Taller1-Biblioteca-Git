package com.mycompany;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static ArrayList<Customer> customer = new ArrayList<>();
    static ArrayList<Book> book = new ArrayList<>();
    static ArrayList<Loan> loan = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int option;
        do{
            System.out.println("BICLIOTECA MUNICIPAL DE VALLEDUPAR");
            System.out.println("---------------MENU---------------");
            System.out.println("1. REGISTAR CLIENTES");
            System.out.println("2. LISTA DE TODOS LOS CLIENTES");
            System.out.println("3. BUSCAR CLIENTE");
            System.out.println("4. ACTUALIZAR DATOS(CLIENTE)");
            System.out.println("5. ELIMINAR CLIENTE");
            System.out.println("6. REGISTRAR LIBROS");
            System.out.println("7. LISTA DE TODOS LOS LIBROS");
            System.out.println("8. BUSCAR LIBROS");
            System.out.println("9. ACTUALIZAR DATOS(LIBRO)");
            System.out.println("10. ELIMINAR LIBROS");
            System.out.println("11. CREAR PRESTAMO");
            System.out.println("12. DEVOLUCIÓN DE PRESTAMO");
            System.out.println("13. REGISTRO DE TODOS LOS PRESTAMOS");
            System.out.println("0. SALIR");
            System.out.println("Seleccione una alterantiva: ");
            option=sc.nextInt();
            sc.nextLine();
            switch (option){
                case 1: create(sc);
                    break;
                case 2: customerList();
                    break;
                case 3: getCustomer(sc);
                    break;
                case 4: customerUpdate(sc);
                    break;
                case 5: deleteCustomer(sc);
                    break;
                case 6: createBook(sc);
                    break;
                case 7: bookList();
                    break;
                case 8: getBook(sc);
                    break;
                case 9: bookUpdate(sc);
                    break;
                case 10: bookDelete(sc);
                    break;
                case 11: createLoan(sc);
                    break;
                case 12: loanRepayment(sc);
                    break;
                case 13: loanList();
                    break;
                case 0:
                    System.out.println("Hasta pronto!!!");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while(option!=0);
    }

    public static void create( Scanner sc){
        System.out.println("Digite su Documento: ");
        String id=sc.nextLine();
        System.out.println("Digite su nombre: ");
        String name= sc.nextLine();
        System.out.println("Digite su telefeno: ");
        String phoneNumber= sc.nextLine();
        System.out.println("Digite su correo electronico: ");
        String email=sc.nextLine();
        Customer c = new Customer(id,name,phoneNumber,email);
        customer.add(c);
    }
    public static void customerList(){
        for(Customer c : customer){
            System.out.println(c);
        }
    }
    public static Customer getCustomer(Scanner sc){
        System.out.println("Digite su documento: ");
        String id=sc.nextLine();
        for(Customer c: customer){
            if(c.getId().equals(id)){
                System.out.println(c);
                return c;
            }
        }
        System.out.println("Cliente no registrado");
        return null;
    }
    public static void customerUpdate(Scanner sc){
        System.out.println("Digite su Documento: ");
        String id=sc.nextLine();
        System.out.println("Digite su nombre: ");
        String name= sc.nextLine();
        System.out.println("Digite su telefeno: ");
        String phoneNumber= sc.nextLine();
        System.out.println("Digite su correo electronico: ");
        String email=sc.nextLine();
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
    public static boolean deleteCustomer(Scanner sc){
        System.out.println("Digite su Documento: ");
        String id=sc.nextLine();
        return customer.removeIf(c-> c.getId().equals(id));
    }

    public static void createBook(Scanner sc){
        System.out.println("Ingrese el codigo: ");
        String code=sc.nextLine();
        System.out.println("Ingrese el titulo: ");
        String title= sc.nextLine();
        System.out.println("Ingrese el año de publicación: ");
        String yearPub=sc.nextLine();
        System.out.println("Ingrese el autor: ");
        String author= sc.nextLine();
        System.out.println("Ingrese el estado: (Disponible=true o ocupado=false): ");
        boolean available = sc.nextBoolean();
        sc.nextLine();
        Book b = new Book(code,title,yearPub,author,available);
        book.add(b);
    }

    public static void bookList(){
        for(Book b: book){
            System.out.println(b);
        }
    }

   public static Book getBook(Scanner sc){
       System.out.println("Ingrese el codigo: ");
       String code=sc.nextLine();
        for(Book b: book){
            if(b.getCode().equals(code)){
                System.out.println(b);
                return b;
            }
        }
       System.out.println("Libro no registrado");
        return null;
   }

   public static void bookUpdate(Scanner sc) {
       System.out.println("Ingrese el codigo: ");
       String code=sc.nextLine();
       System.out.println("Ingrese el titulo: ");
       String title= sc.nextLine();
       System.out.println("Ingrese el año de publicación: ");
       String yearPub=sc.nextLine();
       System.out.println("Ingrese el autor: ");
       String author= sc.nextLine();
       System.out.println("Ingrese el estado: (Disponible=true o ocupado=false): ");
       boolean available = sc.nextBoolean();
        for(Book b: book){
            if(b.getCode().equals(code)){
                b.setAuthor(author);
                b.setTitle(title);
                b.setYearpub(yearPub);
                b.setAvailable(available);
                return;
            }
        }
       System.out.println("Libro no encontrado");
   }
   public static boolean bookDelete(Scanner sc){
       System.out.println("Ingrese el codigo: ");
       String code=sc.nextLine();
        return book.removeIf(b-> b.getCode().equals(code));
   }
   public static void createLoan(Scanner sc){
       Customer c=getCustomer(sc);
       Book b=getBook(sc);
       System.out.println("Ingrese su id de prestamo: ");
       String loanId= sc.nextLine();
       LocalDate date = LocalDate.now();
       System.out.println("Fecha del prestamo: "+date);
       String status = "Activo";
       System.out.println("Estado: "+status);
       Loan l=new Loan(b,c,date,loanId,status);
       loan.add(l);

   }
   public static void loanRepayment(Scanner sc){
       System.out.println("Ingrese el id del prestamo: ");
       String loanId=sc.nextLine();
        for(Loan l: loan){
            if(l.getLoanId().equals(loanId)){
                l.setStatus("Devuelto");
                l.getBook().setAvailable(true);
                System.out.println("Préstamo devuelto correctamente.");
                return;
            }
        }
       System.out.println("No hay ningún prestamo disponible");
   }
   public static void loanList(){
        for(Loan l: loan){
            System.out.println(l);
        }
   }
   

}