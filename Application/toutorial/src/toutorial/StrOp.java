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
public class StrOp 
{
    public String value;
    public StrOp(String s)
    {
        this.value=s;
    }
    public char [] strToArray()
    {
        char [] ch = new char[value.length()];
        for(int i=0; i <ch.length;i++)
            ch[i] = value.charAt(i);
        
        return ch;
    }
}
