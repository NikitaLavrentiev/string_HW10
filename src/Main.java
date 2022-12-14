public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {

        System.out.println("\nЗадача_1");
        //Представьте, что вы работаете в небольшой компании. Данные сотрудников хранятся в неструктурированном формате.
// Бухгалтерия попросила написать программу, в которой  можно работать с Ф. И. О. сотрудников.
//Напишите четыре строки:
//С именем firstName — для хранения имени.
//С именем middleName — для хранения отчества.
//С именем lastName — для хранения фамилии.
//С именем fullName — для хранения Ф. И. О. сотрудника в формате "Фамилия Имя Отчество".
//Выведите в консоль фразу: «ФИО сотрудника — …».
//В качестве данных для задачи используйте "Ivanov Ivan Ivanovich".

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);
    }

    public static void task2() {

        System.out.println("\nЗадача_2");
        //Для ежемесячного отчета и ведения документации бухгалтерии нужны Ф. И. О. сотрудников, полностью написанные заглавными буквами (верхним регистром).
        //
        //Напишите программу, которая изменит написание Ф. И. О. сотрудника с "Ivanov Ivan Ivanovich" на полностью заглавные буквы.
        //
        //В качестве строки с исходными данными используйте строку fullName.
        //
        //Результат программы выведите в консоль в формате: "Данные ФИО сотрудника для заполнения отчета — …"

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("Ф.И.О. сотрудника - " + fullName.toUpperCase());
    }

    public static void task3() {

        System.out.println("\nЗадача_3");

        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = firstName + " " + middleName + " " + lastName;
        fullName = fullName.replace('ё', 'е');

        System.out.println("Ф.И.О. сотрудника - " + fullName.toUpperCase());

    }
}