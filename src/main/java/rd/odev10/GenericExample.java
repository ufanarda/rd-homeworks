package rd.odev10;

public class GenericExample <T>{

    private T text;

    public <T> void printText(){
        System.out.println("Method üzerinden yazdırılan text: "+ text);
    }

    public T getText(){
        return text;
    }

    public void setText(T text){
        this.text = text;
    }
}
