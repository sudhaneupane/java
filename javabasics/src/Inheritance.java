 class Inheritance {
    double salary=50000;

 static  class Programmer extends  Inheritance{
        double bonus=20000;
    }

    public static void main(String[] args) {
        Programmer p=new Programmer();
        System.out.println("The salary is: "+p.salary);
        System.out.println("The bonus is:"+p.bonus);
    }
}
