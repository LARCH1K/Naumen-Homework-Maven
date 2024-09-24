package naumen.edu;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {

    private final ArrayList<Employee> employees = (ArrayList<Employee>) Stream.of(
            new Employee("Иванов Иван Иванович", 25, "IT", 100000.0),
            new Employee("Петров Петр Петрович", 30, "HR", 50000.0),
            new Employee("Сидоров Сидор Сидорович", 40, "IT", 150000.0),
            new Employee("Кузнецов Кузнец Кузнецович", 35, "HR", 80000.0),
            new Employee("Васильев Василий Васильевич", 28, "IT", 120000.0),
            new Employee("Смирнов Смирн Смирнович", 32, "HR", 70000.0)
    ).collect(Collectors.toList());

    public void isThereEmployeeWithSalaryMoreThan100000(){
        System.out.println(employees);
        if(employees.stream().anyMatch(employee -> employee.getSalary() > 100000.0)) {
            System.out.println("Есть сотрудник с зарплатой больше 100000");
        }else {
            System.out.println("Нет сотрудников с зарплатой больше 100000");
        }
    }
}
