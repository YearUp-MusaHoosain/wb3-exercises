package com.pluralsight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {

        // 09/05/2021
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate = now.format(fmt1);
        System.out.println(formattedDate);

        // 2021-09-05
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate2 = now.format(fmt2);
        System.out.println(formattedDate2);

        //September 5, 2021
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        String formattedDate3 = now.format(fmt3);
        System.out.println(formattedDate3);

        //Sunday, Sep 5, 2021 10:02 AM
//        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy hh:mm a");

        //Sunday, Sep 5, 2021 10:02
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy HH:mm");
        String formattedDate4 = now.format(fmt4);
        System.out.println(formattedDate4);

    }
}

//09/05/2021
//        2021-09-05
//September 5, 2021
//Sunday, Sep 5, 2021 10:02