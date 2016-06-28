class HelloWorld
{
    //native数据
    public native void displayHelloWorld();
    static {
        System.loadLibrary("hello");
    }

    public static void main(String[] args) {
        new HelloWorld().displayHelloWorld();
    }
}
