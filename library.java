package Java_projects;
class Library1 {
    String[] books;
    int noOfBook;

 Library1(){
     this.books=new String[100];
     this.noOfBook=0;

 }
 void addBook(String boo){
     this.books[noOfBook] = boo;
     noOfBook++;
     System.out.println(boo+ " has been added");
 }
 void showBook(){
     System.out.println("show avail book");
     for ( String book: this.books  ) {
         if(book==null){continue;}
         System.out.println(" * "+book);
     }
 }
 void isse(String book){
   //  for (String b: this.books  ) {
         for (int i=0;i<this.books.length;i++)
       if (this.books[i].equals(book)){

           System.out.println("the book has been issued");
          this.books =null;
          return;

     }
     System.out.println("this book is not exits");
 }
 void retBook(String book){
     addBook(book);
     System.out.println("book return");
    }
}

public class library {
    public static void main(String[] args) {
     Library1 cl=new Library1();
     //cl.addook("think and grow reach");
        cl.addBook("hii" + "jjjj");
        cl.showBook();
        cl.showBook();

        cl.addBook("kkk" + "iii");
cl.retBook("shine");
        cl.addBook("shine");
        cl.isse("shine");
       // cl.showBook();

       // cl.showBook();
       // cl.retBook("shine;
       // cl.addBook("hiiiii");
        // cl.retBook("shine");
    }
}
