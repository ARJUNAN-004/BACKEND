package DAY02;

public class Book {
    private String title;
    private String author;
    public Book(){
        this.title="A Way To Success";
        this.author="Nikaman";
    }
    public void Display(){
        System.out.println("Book Title = "+title);
        System.out.println("Book Author = "+author);
    }
    public static void main(String[] args) {
        Book book1=new Book();
        book1.Display();
    }
}
