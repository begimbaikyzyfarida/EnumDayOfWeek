public class Main {
    public static void main(String[] args) {
        DayOfWeek[] days = {
                DayOfWeek.MONDAY,
                DayOfWeek.TUESDAY,
                DayOfWeek.THURSDAY,
                DayOfWeek.WEDNESDAY,
                DayOfWeek.FRIDAY,
                DayOfWeek.SATURDAY,
                DayOfWeek.SUNDAY
        };
        for (DayOfWeek day : days) {
            String lesson = day.getLesson();
            System.out.println(lesson);
        }
    }
}
