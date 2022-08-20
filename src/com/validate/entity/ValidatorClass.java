
package com.validate.entity;

import java.util.Scanner;
import org.apache.commons.validator.routines.EmailValidator;


public class ValidatorClass 
{
    public static Scanner input = new Scanner(System.in);

    public ValidatorClass() {
    
    }
    
    @SuppressWarnings("UnusedAssignment")
    public static boolean validateEMail(String email)
    {
        boolean result = false;
        try
        {
           result = EmailValidator.getInstance().isValid(email);
        } 
        catch (VerifyError ex) 
        {
           result = false;
           ex.printStackTrace();
        }
        return result;
    }
 
    @SuppressWarnings("UnusedAssignment")
    public static boolean validateNumber(String number)
    {
        boolean result = false;
        try
        {
            //result = IntegerValidator.getInstance().isValid(number);
            
            if (!(number.matches("^(?:0|[0-9]*)+$")))
            {
                return  result;
            }
            else
            {
                result = true;
                return  result;
            }
            
        } 
        catch (VerifyError ex) 
        {
            result = false;
            ex.printStackTrace();
        }
        return result;
    }
    
    @SuppressWarnings("UnusedAssignment")
    public static boolean validateMobileNumber(String mobileNumber)
    {
        boolean result = false;
        try
        {
            if (!(mobileNumber.matches("^$|[0-9]{10,10}")))
            {
                return  result;
            }
            else
            {
                result = true;
                return  result;
            }
            
        } 
        catch (VerifyError ex) 
        {
            result = false;
            ex.printStackTrace();
        }
        return result;
    }
    
    @SuppressWarnings("UnusedAssignment")
    public static boolean validateAadhaarNumber(String mobileNumber)
    {
        boolean result = false;
        try
        {
            if (!(mobileNumber.matches("^$|[0-9]{12,12}")))
            {
                return  result;
            }
            else
            {
                result = true;
                return  result;
            }
            
        } 
        catch (VerifyError ex) 
        {
            result = false;
            ex.printStackTrace();
        }
        return result;
    }
    
    @SuppressWarnings("UnusedAssignment")
    public static boolean validateUsername(String username)
    {
        boolean result = false;
        try
        {
           //username = input.nextLine();
            if (!(username.matches("^([a-zA-Z0-9-_]{8,20})$")))
            {
                return  result;
            }
            else
            {
                result = true;
                return  result;
            }
        } 
        catch (VerifyError ex) 
        {
           result = false;
           ex.printStackTrace();
        }
        return result;
    }
    
    @SuppressWarnings("UnusedAssignment")
    public static boolean validateString(String string)
    {
        boolean result = false;
        try
        {
           //username = input.nextLine();
            if (!(string.matches("^[a-zA-Z0-9_-]+[\\. ]")))
            {
                return  result;
            }
            else
            {
                result = true;
                return  result;
            }
        } 
        catch (VerifyError ex) 
        {
           result = false;
           ex.printStackTrace();
        }
        return result;
    }
    
    @SuppressWarnings("UnusedAssignment")
    public static boolean validateName(String name)
    {
        boolean result = false;
        try
        {
           //username = input.nextLine();
            if (!(name.matches("^(?:0|[a-zA-Z ]*)$")))
            {
                return  result;
            }
            else
            {
                result = true;
                return  result;
            }
        } 
        catch (VerifyError ex) 
        {
           result = false;
           ex.printStackTrace();
        }
        return result;
    }
    
    @SuppressWarnings("UnusedAssignment")
    public static boolean validateFractions(String fractionalValue)
    {
        boolean result = false;
        try
        {
            if (!(fractionalValue.matches("^[0-9]\\d*(\\.\\d+)?$")))
            {System.out.println("First");
                return  result;
            }
            else
            {
                result = true;
                return  result;
            }
        } 
        catch (VerifyError ex) 
        {
           result = false;
           ex.printStackTrace();
        }
        return result;
    }
    
    /*
    public static void main(String[] args)
    {
        boolean mail, num, un, str, nm, frctn;
        
        mail = ValidatorClass.validateEMail("ganesh.sonawane06@hotmail.com");
        num = ValidatorClass.validateNumber("9874563210");
        un = ValidatorClass.validateUsername("ganeshsonawane06");
        str = ValidatorClass.validateString("asdsaf dsfsd 554");
        nm = ValidatorClass.validateName("Ganesh Sonawane");
        frctn = ValidatorClass.validateFractions("9874563434210");
        
        System.out.println("Validation result:\n"+"Email: "+mail+"\tganesh.sonawane06@hotmail.com"
                            +"\nNumber: "+num+"\t9874563210"
                            +"\nUser name: "+un+"\tganeshsonawane06"
                            +"\nString: "+str+"\tasdsaf dsfsd 554"
                            +"\nName: "+nm+"\tGanesh Sonawane"
                            +"\nFraction: "+frctn+"\t9874563434210");
    }*/
}
