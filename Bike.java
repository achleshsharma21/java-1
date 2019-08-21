class Bike1{
    int a,b;
    Bike1(int a,int b)
    {
    this.a=a;
    this.b=b;
    }
    public void sum()
    {
    System.out.println(a+b);
    }
    }
    class Bike
    {
    public static void main(String args[]){
    Bike1 b=new Bike1(10,20);
    b.sum();
    }
    }