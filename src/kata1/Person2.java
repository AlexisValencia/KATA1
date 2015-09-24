/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author usuario
 */
public class Person2 {
    private final String name;
    private final String surname;
    private final Calendar birthday;
    private static long MILISECOND_PER_YEAR = (long) (1000*60*60*365.25*24);

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Calendar getBirthday() {
        return  birthday;
    }

    public Person2(String name, String surname, Calendar birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }
    
    
    public String getFullName(){
     return name+" "+surname;
    }
    
    public int getAge(){
        Calendar today;
        today = GregorianCalendar.getInstance();
        return (int) (mimetodo((today.getTimeInMillis()- birthday.getTimeInMillis())));
      
        
    }
    private long mimetodo (long millis){
        
        return millis/MILISECOND_PER_YEAR;
    }

}
