package rd.odev11;

public class Singleton {

    private static Singleton instance = null;

    public String msg;

    private Singleton(){

        msg = "Bu bir Singleton tasarım örneğidir";
    }

    public static synchronized Singleton getInstance()
    {
        if (instance == null)
            instance = new Singleton();

        return instance;
    }

}
