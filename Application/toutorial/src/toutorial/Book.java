/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toutorial;

/**
 *
 * @author gory
 */
public class Book 
{
    public String name;
    public String author;
    public int pubdate;
    public int last_page;
    public int Current_page;
    public boolean is_open;
    
    public Book(String n ,String a,int pdate,int lpage)
    {
        this.name = n;
        this.author = a;
        this.pubdate = pdate;
        this.last_page = lpage;
        this.is_open = false;
    }
    
    public void Openbook()
    {
        if(is_open)
            System.out.println("Opened");
        else
            this.is_open=true;
    }
    public void Closebook()
    {
        if(is_open)
            this.is_open=false;
        else
            System.out.println("Closed");
    }
    public boolean Movetopage(int page)
    {
        if(!is_open)
            return false;
        if((page>last_page) || (page<1))
            return false;
        this.Current_page=page;
        return true;
    }
    public void Printbookinfo()
    {
        System.out.println("Book Name :" + this.name);
        System.out.println("Book Author :" + this.author);
        System.out.println("Book pages :" + this.last_page);
    }
    
}
