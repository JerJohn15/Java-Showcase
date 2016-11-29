/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import biweekly.Biweekly;
import biweekly.ICalendar;
import biweekly.component.VEvent;
import biweekly.property.DateStart;
import biweekly.property.Summary;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Jeremiah
 */
public class TestApp {

    public static void main(String[] args) throws IOException, ParseException {
        String title = "Workout: Chest Day";
        String description = "Benchpress - 3 sets 10 reps \n "
                + "Dips - 3 sets 10 reps \n" + "Pushups - 2 sets 20 reps \n";
        String fileName = "workoutchest.ics";

        //set libraries 
        ICalendar ical = new ICalendar();
        VEvent event = new VEvent();
        //create summary
        Summary summary = event.setSummary(title);
        summary.setLanguage("en-us");
        //create date 
        SimpleDateFormat sdf = new SimpleDateFormat("M-dd-yyyy");
        String dateStr = "12-01-2016";

        Date dateVal = sdf.parse(dateStr);

        // DateStart startDate = new DateStart(dateVal, false);
        event.setDateStart(dateVal);

        ical.addEvent(event);

        File file = new File(fileName);
        Biweekly.write(ical).go(file);
    }

}
