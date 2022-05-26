public class Main {


    public static void main(String[] args) {

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "Ivanov" + "Ivan" + "Ivanovich";
        System.out.println("fullName = " + fullName);

        String fullName1 = "Ivanov Ivan Ivanovich";
        System.out.println("Data full name of the employee to fill out the report" + fullName1.toUpperCase());

        String fullName2 = "Ivanov Ivan Ivanovich";
        System.out.println("Employee full name data for administrative department" + fullName2.replace(" ", ";"));

        String fullName3 = "Иванов Семён Семёнович";
        System.out.println(fullName3.replace('ё','е'));
    }
}










