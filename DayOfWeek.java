public enum DayOfWeek {
    MONDAY("Дуйшөмбү куну java сабагын окуйм"),
    TUESDAY("Шейшемби күнү англис тили сабагын окуйм"),
    WEDNESDAY("Шаршемби күнү  математика сабактарын окуйм "),
    THURSDAY("Бейшемби күнү soft skill сабагын окуйм"),
    FRIDAY("Жума күнү python сабагын окуйм"),
    SATURDAY("Ишемби күнү VR design сабагын окуйм"),
    SUNDAY("Жекшемби күнү javascript сабагын окуйм");

    private String lesson;

    DayOfWeek(String lesson) {
        this.lesson = lesson;
    }

    public String getLesson() {
        return lesson;
    }
}
