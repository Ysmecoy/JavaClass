package projectCalendar;

import java.util.Scanner;
002
 
003
   public class PrintCalendar {
004
 
005
     /* Main method */
006
 
007
     public static void main(String[] args) {
008
     Scanner scan = new Scanner (System.in);
009
 
010
     //Prompt the user to enter year
011
     System.out.print("Enter full year (e.g., 2001): ");
012
     int year = scan.nextInt();
013
 
014
     // Prompt the user to enter month
015
     System.out.print("Enter month in number between 1 and 12: ");
016
     int month = scan.nextInt();
017
 
018
     // Print calendar for the month of the year
019
      if (month < 1 || month > 12 || year < 1980)
020
       System.out.println("Wrong input!");
021
       else
022
           printMonth(year, month);
023
 
024
   }
025
    /** Print the calendar for a month in a year */
026
 
027
     static void printMonth(int year, int month) {
028
 
029
     //Print the headings of the calendar
030
      printMonthTitle(year, month);
031
 
032
     //Print the body of the calendar
033
      printMonthBody(year, month);
034
    }
035
 
036
    /** Print the month title, e.g., May, 1999 */
037
 
038
    static void printMonthTitle(int year, int month) {
039
 
040
    System.out.println("         " + getMonthName(month) + " " + year);
041
    System.out.println("–––––––––––––––––––––––––––––");
042
    System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
043
 
044
    }
045
 
046
    /** Get the English name for the month */
047
    static String getMonthName(int month) {
048
      String monthName = null;
049
      switch (month) {
050
        case 1: monthName = "January"; break;
051
        case 2: monthName = "February"; break;
052
        case 3: monthName = "March"; break;
053
        case 4: monthName = "April"; break;
054
        case 5: monthName = "May"; break;
055
        case 6: monthName = "June"; break;
056
        case 7: monthName = "July"; break;
057
        case 8: monthName = "August"; break;
058
        case 9: monthName = "September"; break;
059
        case 10: monthName = "October"; break;
060
        case 11: monthName = "November"; break;
061
        case 12: monthName = "December";
062
      }
063
      return monthName;
064
    }
065
 
066
    /* Print month body */
067
    static void printMonthBody(int year, int month) {
068
 
069
      // Get start day of the week for the first date in the month
070
      int startDay = getStartDay(year, month);
071
 
072
      // Get number of days in the month
073
      int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);
074
 
075
      // Pad space before the first day of the month
076
      int i = 0;
077
      for (i = 0; i < startDay; i++)
078
        System.out.print("    ");
079
      for (i = 1; i <= numberOfDaysInMonth; i++) {
080
        if (i < 10)
081
          System.out.print("   " + i);
082
        else
083
          System.out.print("  " + i);
084
        if ((i + startDay) % 7 == 0)
085
          System.out.println();
086
      }
087
      System.out.println();
088
    }
089
 
090
    /* Get the start day of the first day in a month */
091
 
092
   static int getStartDay(int year, int month) {
093
 
094
      //Get total number of days since 1/1/1800
095
      int startDay1800 = 3;
096
      int totalNumberOfDays = getTotalNumberOfDays(year, month);
097
 
098
      //Return the start day
099
      return (totalNumberOfDays + startDay1800) % 7;
100
    }
101
 
102
    /* Get the total number of days since January 1, 1800 */
103
 
104
    static int getTotalNumberOfDays(int year, int month) {
105
     int total = 0;
106
 
107
     //Get the total days from 1800 to year - 1
108
     for (int i = 1800; i < year; i++)
109
     if (isLeapYear(i))
110
        total = total + 366;
111
      else
112
        total = total + 365;
113
 
114
      //Add days from January to the month prior to the calendar month
115
      for (int i = 1; i < month; i++)
116
        total = total + getNumberOfDaysInMonth(year, i);
117
 
118
      return total;
119
    }
120
 
121
    /* Get the number of days in a month */
122
 
123
    static int getNumberOfDaysInMonth(int year, int month) {
124
      if (month == 1 || month == 3 || month == 5 || month == 7 ||
125
        month == 8 || month == 10 || month == 12)
126
        return 31;
127
 
128
      if (month == 4 || month == 6 || month == 9 || month == 11)
129
        return 30;
130
 
131
      if (month == 2) return isLeapYear(year) ? 29 : 28;
132
 
133
      return 0; // If month is incorrect
134
    }
135
 
136
    /** Determine if it is a leap year */
137
    static boolean isLeapYear(int year) {
138
      return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
139
    }
140
}
