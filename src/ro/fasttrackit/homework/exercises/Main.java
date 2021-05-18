package ro.fasttrackit.homework.exercises;

//1) create an enum for the days of the week
//2) create an object that represents a Day Schedule. It will have the day (the enum) and a list of activities (Strings)
//3) create an object DailyPlanner that has a list of DaySchedule objects
//4) add functionality to the DailyPlanner:
//	a) addActivity(day, activity),           - if the activity is null throw a custom UNCHECKED exception: NoActivityException
//	b) remove activity(day, activity)        - if the activity doesn't exist throw the custom UNCHECKED exception: NoActivityException
//	c) getActivities(day): List<String>
//	d) endPlanning(): Map<Day, List<String>> - returns a map from day to the list of activities for that day.
//	   If there's a day without activities throw a custom CHECKED exception : NoActivitiesForDayException

import java.util.List;

public class Main {
	public static void main(String[] args) {
		DailyPlanner dailyPlanner = new DailyPlanner(List.of(
				new DaySchedule(Day.MONDAY, List.of("eat", "work", "sleep")),
				new DaySchedule(Day.TUESDAY, List.of("eat", "work", "sleep")),
				new DaySchedule(Day.WEDNESDAY, List.of("eat", "work", "sleep")),
				new DaySchedule(Day.THURSDAY, List.of("eat", "work", "sleep")),
				new DaySchedule(Day.FRIDAY, List.of("eat", "work", "sleep")),
				new DaySchedule(Day.SATURDAY, List.of("eat", "relax", "sleep")),
				new DaySchedule(Day.SUNDAY, List.of("eat", "relax", "sleep"))
				));

		System.out.println(dailyPlanner.addActivity(Day.MONDAY,"workout"));
	}
}
