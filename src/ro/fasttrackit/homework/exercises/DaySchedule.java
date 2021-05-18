package ro.fasttrackit.homework.exercises;

import java.util.List;
import java.util.Objects;

public class DaySchedule {
	private final Day day;
	private final List<String> activities;

	public DaySchedule(Day day, List<String> activities) {
		this.day = day;
		this.activities = activities;
	}

	public Day getDay() {
		return day;
	}

	public List<String> getActivities() {
		return activities;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		DaySchedule that = (DaySchedule) o;
		return day == that.day && Objects.equals(activities, that.activities);
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, activities);
	}

	@Override
	public String toString() {
		return "DaySchedule{" +
				"day=" + day +
				", activities=" + activities +
				'}';
	}
}
