
package com.advice;

import com.daoService.DateInterface;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass implements DateInterface
{
	static Date date = null;
	
	
	public DateClass() 
        {
            date = new Date();
	}

        @Override
	public String getTime() 
        {
            return new SimpleDateFormat("HH:mm:ss").format(date);
	}

        @Override
	public String getDate() 
        {
            return new SimpleDateFormat("dd/MM/yyyy").format(date);
	}
        
        @Override
        public String getDateNdTime() 
        {
            return new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(date);
        }
        
        public static String getPlainDateTimeFormat()
        {
            return new SimpleDateFormat("yyyyMMddHmmss").format(date);
        }
        
    /*
        public static void main(String [] args)
        {
            DateClass dt = new DateClass();
            
            System.out.println(dt.getTime());
            System.out.println(dt.getDate());
            System.out.println(dt.getDateNdTime());
            System.out.println(DateClass.getPlainDateTimeFormat());
        }
    */
        
    @Override
    public String toString() {
        return ""+date;
    }
}
