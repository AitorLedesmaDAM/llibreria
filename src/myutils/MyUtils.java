/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myutils;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Lluis
 * Classe de funcions pròpies utils.
 */
public class MyUtils {
    

/**
 * 
 * @param cadena Strint cadena que es vol invertir
 * @return cadena invertida (null per cadenes nulls).
 */
public static String inverteix (String cadena)
{
    String resultat = "";
    
    for (int i=cadena.length()-1; i>=0; i--){
	
        resultat = resultat + cadena.charAt(i);
    }
    return resultat;
}
/**
 * 
 * @param day int dia del naixement
 * @param month int  mes del naixement
 * @param year int any del naixement
 * @return edat de la persona, per edat>150 retorna -1, per dates impossibles retorna -2
 * 
 */
public static int edat (int day, int month, int year)
{
   Calendar actual = new GregorianCalendar();
   long dataactual = actual.getTimeInMillis();
   long resta = 0;

    if (year < actual.get(Calendar.YEAR)){
        if (year > actual.get(Calendar.YEAR)-150){    
            if (month > 0 && month < 12){
                if(month==4 || month==6 || month==9 || month==11){
                    if (day > 0 && day <= 30){
                        Calendar calendar = new GregorianCalendar(year, month-1, day); 
                        long datanaix = calendar.getTimeInMillis();
                        resta = dataactual - datanaix;
                        
                    }else{
                        System.out.println("-2");
                    }
                }else if (month == 2){
                    if (day > 0 && day <= 28){
                        Calendar calendar = new GregorianCalendar(year, month-1, day); 
                        long datanaix = calendar.getTimeInMillis();
                        resta = dataactual - datanaix;
                    }else{
                        System.out.println("-2");
                    }
                }else{
                    if (day > 0 && day <= 31){
                        Calendar calendar = new GregorianCalendar(year, month-1, day); 
                        long datanaix = calendar.getTimeInMillis();
                        resta = dataactual - datanaix;
                    }else{
                        System.out.println("-2");
                    }
                }
            }
        }else{
            System.out.println("-1");
        }
    }else{
        System.out.println("-1");
    }
    long dies = 3600*24*1000;
    long resultat = resta/dies;
    long anys = resultat/365;
    return (int)anys;
}

/**
 * 
 * @param numero número del que es calcula el factorial
 * @return retorna el factorial d'un número. Si el nombre es negatiu retorna -1.
 */
public static double factorial (double numero) {
 
if (numero==0)
return 1;
else
{
double resultat = numero * factorial(numero-1);
return resultat;
}
}
}
