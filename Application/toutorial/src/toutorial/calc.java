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
public class calc 
{
    /*public int sum(int one,int two)
    {
        return one + two;
    }
    public int min(int one,int two)
    {
        return one - two;
    }
    public int mul(int one,int two)
    {
        return one * two;
    }
    public int div(int one,int two)
    {
        return one / two;
    }
    public void dec(int value)
    {
        for(int i = value;i>=1;i--)
        {
            System.out.println(i);
        }
    }*/
    
    public int [] mulArray(int [] a,int [] b)
    {
        if(a.length != b.length)
            return null;
        int[] result = new int[b.length];
        for(int i=0 ; i<a.length ; i++)
            result[i] = a[i] * b[i];
        return result;
    }

}
