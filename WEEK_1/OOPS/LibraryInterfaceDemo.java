package WEEK_1.OOPS;
interface LibraryUser{
    void registeraccount();
    void requestbook();
}

class kidusers implements LibraryUser{
    int age;
    String booktype;

    public void registeraccount(){
        if (age<12){
            System.out.println("you have successfully registered under a Kids Account");
        }
        else{
            System.out.println("Sorry Age,must be less than 12 to register as a kid");
        }
    }
    public void requestbook(){
        if(booktype.equalsIgnoreCase("Kids")){
            System.out.println("Book Issued successfully, please return the book \r\n" + //
                                "within 10 days");
        }
        else{
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }
}

class adultuser implements LibraryUser{
    int age;
    String booktype;

    public void registeraccount(){
        if (age>12){
            System.out.println("you have successfully registered under an adult Account");
        }
        else{
            System.out.println("Sorry Age,must be greater than 12 to register as an adult");
        }
    }

    public void requestbook(){
        if(booktype.equalsIgnoreCase("fiction")){
            System.out.println("Book Issued successfully, please return the book \r\n" + //
                                "within 7 days");
        }
        else{
            System.out.println("Oops, you are allowed to take only adult fiction books");
        }
    }

}
public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        System.out.println("kids user test case");
        kidusers kid=new kidusers();
        kid.age=10;
        kid.registeraccount();

        kid.age=18;
        kid.registeraccount();

        kid.booktype="kids";
        kid.requestbook();

        kid.booktype="fiction";
        kid.requestbook();

        System.out.println("adult user test case");
        adultuser adult=new adultuser();
        adult.age=5;
        adult.registeraccount();

        adult.age=23;
        adult.registeraccount();

        adult.booktype="kids";
        adult.requestbook();

        adult.booktype="fiction";
        adult.requestbook();

    }

    
}
