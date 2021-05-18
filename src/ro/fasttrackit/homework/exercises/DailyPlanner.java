package ro.fasttrackit.homework.exercises;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//	a) addActivity(day, activity),           - if the activity is null throw a custom UNCHECKED exception: NoActivityException
//	b) remove activity(day, activity)        - if the activity doesn't exist throw the custom UNCHECKED exception: NoActivityException
//	c) getActivities(day): List<String>
//	d) endPlanning(): Map<Day, List<String>> - returns a map from day to the list of activities for that day.
//	   If there's a day without activities throw a custom CHECKED exception : NoActivitiesForDayException

public class DailyPlanner {
	private final List<DaySchedule> activities = new ArrayList<>();

	public DailyPlanner(Collection<DaySchedule> activities) {
		this.activities.addAll(activities);
	}

	public DaySchedule addActivity(Day day, String activity) {
		for (DaySchedule newActivity : activities) {
			if (newActivity.getDay().equals(day)) {
				activities.add(newActivity);
				return newActivity;                     //nu imi dau seama cum pot sa adaug la DaySchedule
			}                                           //o noua activitate
		}
		return null;
	}
}
