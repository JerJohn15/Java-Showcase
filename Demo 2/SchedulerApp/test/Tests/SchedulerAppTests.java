
package Tests;


/**
 * This class contains the tests for Scheduler App. 
 * @author Jeremiah
 */


import biweekly.ICalendar;
import biweekly.component.VEvent;
import biweekly.property.DateStart;
import biweekly.property.Summary;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SchedulerAppTests {
    String title = "Workout: Chest Day";
    String description = "Benchpress - 3 sets 10 reps \n "
            + "Dips - 3 sets 10 reps \n" + "Pushups - 2 sets 20 reps \n";
    String file = "workout_chest";
    Date dateVal = new Date(2016,11,28);

    /*
    @details - Checks for data in each input field.
    1. Has a "Title".
    2. Has an event description.
    3. Has saved a file. 
    */
    
    public void showData() {
        
        ICalendar ical = new ICalendar();
        VEvent event = new VEvent();
        
          Summary summary = event.setSummary(title);
          summary.setLanguage("en-us");
          
        DateStart startDate = new DateStart(dateVal, false);
        event.setDateStart(startDate);
        
        
    }
    
    
    public void setTitle(){
        
        
        
    }
    
    
}
