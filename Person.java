/** Java 1 HW5
 * @author Elizaveta Elyashova
 * @version 30.08.2018
 */
public class Person {
    private String name;
    private String work;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person(String name, String work, String email, String phone, int salary, int age) {
        this.name = name;
        this.work = work;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Информация о сотруднике:");
        System.out.println("ФИО: " + name);
        System.out.println("Должность: " + work);
        System.out.println("E-mail: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }

    public int getAge() {
        return age;
    }

}

class Main {
    public static void main(String[] args) {
        Person[] person_list = new Person[5];
        person_list[0] = new Person
                ("Иванов Иван Иванович", "Стажер", "ivanov@mail.ru", "88121234567", 30000, 26);
        person_list[1] = new Person
                ("Петров Алексей Семенович", "Начальник отдела", "petrov@mail.ru", "88121290567", 70000, 43);
        person_list[2] = new Person
                ("Васильев Владимир Анатольевич", "Главный тенхнолог", "vasiliev@mail.ru", "88124534567", 48000, 32);
        person_list[3] = new Person
                ("Корнилова Мария Антоновна", "Секретарь", "kornilova@mail.ru", "88121298767", 30000, 29);
        person_list[4] = new Person
                ("Сидоров Тимофей Васильевич", "Сторож", "sidorov@mail.ru", "88121396567", 30000, 51);

        for (int i = 0; i<5; i++) {
            if (person_list[i].getAge() > 40) person_list[i].printInfo();
        }
    }
}

