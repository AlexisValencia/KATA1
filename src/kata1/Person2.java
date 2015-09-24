/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class Person2 {
    private final String name;
    private final String surname;
    private final Date birth;
    private static long MILISECOND_PER_YEAR = (long) (1000*60*60*365.25*24);

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBirth() {
        return birth;
    }

    public Person2(String name, String surname, Date birth) {
        this.name = name;
        this.surname = surname;
        this.birth = birth;
    }
    
    
    public String getFullName(){
     return name+" "+surname;
    }
    
    public int getAge(){
        Date today = new Date();
        return (int) (mimetodo((today.getTime()-birth.getTime())));
      
        
    }
    private long mimetodo (long millis){
        
        return millis/MILISECOND_PER_YEAR;
    }

}
