package DAY02;
class Books{
    private String title;
    private String author;

    public Books(String title,String author){
        this.title=title;
        this.author=author;
    }
    public void Display(){
        System.out.println("---Available Books---");
        System.out.println("Title = "+title);
        System.out.println("Author = "+author);
    }
    public String toString(){
        return "\nTitle = "+title+"\nAuthor = "+author;
    }
}
class Member{
    private String name;
    private int id;
    public Member(String name,int id){
        this.name=name;
        this.id=id;
    }
    public void MemDetails(){
        System.out.println("----Member Details----");
        System.out.println("Member Name = "+name);
        System.out.println("Member id = "+id);
    }
}
class Librarian{
    private String name;
    public Librarian(String name){
        this.name=name;
    }
    public void addBook(Books books){
        System.out.println("New Book added --> "+books);
    }
    public void removeBook(Books books){
        System.out.println("Book removed --> "+books);
    }
}
public class Library {
    public static void main(String[] args) {
        Books books1=new Books("All Blue","Sanji");
        Books books2=new Books("Way of Lost","Zoro");
        books1.Display();
        books2.Display();

        Member mem1=new Member("Usopp",1);
        Member mem2=new Member("Chopper",2);
        mem1.MemDetails();
        mem2.MemDetails();

        Librarian libb=new Librarian("Luffy");
        libb.addBook(books1);
        libb.addBook(books2);
        libb.removeBook(books1);
    }
}