class test
{
    int x;
    static int y;
    void show()
    {
        System.out.println(x + ","+ y);
    }
}
class testdrive
{
    public static void main(String[] args) {
        test ob1 = new test();
        test ob2 = new test();
        ob1.x=20;
        ob1.y=30;

        ob2.x=40;
        ob2.y=50;
        test.y=60;
        ob1.show();
        ob2.show();

    }
}