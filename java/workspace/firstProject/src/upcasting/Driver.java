package upcasting;

public class Driver {
            public static void main(String [] args)
            {
            	 Parent p=new Parent();
            	 System.out.println(p.p);
            	 p.pm();
            	 Child c=new Child();
            	 System.out.println(c.c);
            	 c.cm();
            	 Parent p1=c;
            	 System.out.println(p1.p);
            	 p1.pm();
            	 //System.out.println(p1.p);//Not possible even after upcasting
            	 //p1.cm();//In p1 only parent members are available even after upcasting
            }}
