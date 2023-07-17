public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullname = lastName + " " + firstName + " " + middleName;
        System.out.print("ФИО сотрудника — " + fullname);
    }

    public static void task2() {
        System.out.println("Задача 2");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullname = lastName + " " + firstName + " " + middleName;
        System.out.print("Данные ФИО сотрудника для заполнения отчета — " + fullname.toUpperCase());
    }

    public static void task3() {
        System.out.println("Задача 3");
        String firstName = "Сёмён";
        String middleName = "Сёмёнович";
        String lastName = "Иванов";
        String fullname = lastName.replace("ё", "е") + " " + firstName.replace("ё", "е")
                + " " + middleName.replace("ё", "е");
        System.out.print("Данные ФИО сотрудника — " + fullname.toUpperCase());
    }
}