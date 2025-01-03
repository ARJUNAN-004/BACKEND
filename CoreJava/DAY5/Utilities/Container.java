//Use a package utilities containing a generic class Container<T> to store any object.

package DAY05.Utilities;

public class Container <T>{
    private T val;
    public Container(T val){
        this.val=val;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }
}
