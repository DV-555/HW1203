package Ex_2;

        /*Задача2
        Создать класс Employee , содержащий следующие поля и методы:
        поле имя,
        поле зарплата,
        поле количество рабочих часов в день,
        конструктор
        метод addSalary(), добавляющий 10 евро к зарплате если зарплата сотрудника меньше 500
        метод addForWork(), добавляющий 5 евро к зарплате сотрудника если количество рабочих часов в день больше 6.
        Создать несколько экземпляров класса с различными параметрами и вывести на экран результат работы методов*/
public class Main {
    public static void main(String[] args) {
        Employee John = new Employee("John", 5000, 7);
        Employee Jack = new Employee("Jack", 450, 7);
        Employee Jim = new Employee("Jim", 3000, 7);

        System.out.println(John.name+" "+(John.addSalary()+John.addForWork()));
        System.out.println(Jack.name+" "+(Jack.addSalary()+Jack.addForWork()));
        System.out.println(Jim.name+" "+(Jim.addSalary()+Jim.addForWork()));

    }       //John 5005.0
            //Jack 465.0
            //Jim 3005.0

}
