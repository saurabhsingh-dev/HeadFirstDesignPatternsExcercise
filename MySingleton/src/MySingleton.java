public class MySingleton {
    //private static MySingleton onlyInstance = null;
    private MySingleton(){}

    /*
    //lazy Instantiation
    public static MySingleton getInstance() {
        if (onlyInstance == null) {
            onlyInstance = new MySingleton();
        }
        return onlyInstance;
    }
    */

    /*
    // thread safe Lazy instantiation
    public static synchronized MySingleton getInstance(){
        if(onlyInstance == null){
            onlyInstance = new MySingleton();
        }
        return onlyInstance;
    }
     */

    /*
    // Eagerly instantiation
    private static MySingleton onlyInstance = new MySingleton();
    public static MySingleton getInstance(){
        return onlyInstance;
    }
     */

    //Double-checked locking
    private volatile static MySingleton onlyInstance = null;
    public static MySingleton getInstance(){
        if(onlyInstance == null){
            synchronized (MySingleton.class){
                if(onlyInstance == null){
                    onlyInstance = new MySingleton();
                }
            }
        }
        return onlyInstance;
    }
}
