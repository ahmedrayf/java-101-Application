/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toutorial;

/**
 *
 * @author 
 */
public class Toutorial {
    /*public int speed()
    {
    int a;
    int b;
    int c;
    a=10;
    b=20;
    c=a+b;       
    return c;
    }
    public int model;
    public float price;
    public short max_speed;
    public void move()
    {
     System.out.print("welcome to java");
     //any code
    }
    public void stop()
    {
    int y = speed();
    }
    public int sum(int a , int b )
    {
    return a + b ;
    }
    
    public void speed(int s) 
    {
    System.out.print("speed :" + s );
    }
    public void any()
    {
    speed(250);
    int z = sum(10,20);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      /**
       * StrOp str = new StrOp("www.google.com"); 
       char [] c = str.strToArray();
       System.out.println(c);
       *
       
       calc c = new calc();
       int [] one = {2,3,4};
       int [] two = {5,55,15};
       int [] r =c.mulArray(one, two);
       if(r != null)
        for(int i=0;i<r.length;i++)
            System.out.println(r[i]);
       else 
           System.out.println("R is null");
           */
        
        Book java_book =new Book("Java", "Ahmed Rayf" , 2017 , 500);
        java_book.Openbook();
        if(java_book.Movetopage(40))
            System.out.println("we");
        java_book.Printbookinfo();
        java_book.Closebook();
        System.out.println(java_book.last_page);
    }
}
