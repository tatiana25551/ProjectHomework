package HwClass17;
/*6Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
        Instance variables are being initialized
        Both Constructors are being executed*/
public class Book {
    String title;
    String author;
    int pages;

    public Book(String booktitle,String bookauthor,int bookpages) {

        title = booktitle;
        author = bookauthor;
        pages = bookpages;

    }
    Book(){
        title="Alice in Wonderland";
        author="Lewis Carol";
        pages=70;
    }
      void printinfo(){
          System.out.println("Book title is "+title+" author "+author+" pages "+pages);
      }
}
