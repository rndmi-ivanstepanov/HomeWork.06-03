public class task {
    public static void main(String[] args) {
        task2(task1());

    }

    public static String task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println(fullName + "\n");
        return fullName;
    }

    public static void task2(String s) {
        System.out.println(s.toUpperCase() + "\n");
        String fullName = "Иванов Семён Семёнович";
        System.out.println(fullName.replace("ё", "е"));
    }
}