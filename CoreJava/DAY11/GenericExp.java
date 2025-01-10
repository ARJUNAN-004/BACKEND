package DAY11;


public class GenericExp <T>{

    private T item;
    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
    public void printItem() {
        System.out.println(item);
    }

    public boolean isTypeOf(Object item) {
        return item instanceof String;
    }

    public static void main(String[] args) {
        GenericExp<String> stringBox = new GenericExp<>();
        stringBox.setItem("Helo");
        System.out.println("Helo world " + stringBox.isTypeOf(stringBox.getItem()));
        System.out.println("Helo Java " + stringBox.isTypeOf(Integer.class));
    }
}




