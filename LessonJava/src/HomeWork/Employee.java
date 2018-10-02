package HomeWork;

import java.util.Comparator;

public class Employee {

    private String name;
    private int salaryRate; //оплата в час
    private int workedHours; //отработано часов

    public Employee(String name, int salaryRate, int workedHours) {
        this.name = name;
        this.salaryRate = salaryRate;
        this.workedHours = workedHours;
    }
    public String getName() {
        return this.name;
    }
    public int getSalary() {
        return salaryRate*workedHours;
    }

          static public class makeNameComparator implements Comparator<Employee> {
              @Override
              public int compare(Employee e1, Employee e2) {
                  return e1.getName().compareTo(e2.getName());
              }
          }
          static public class makeSalaryRateComparator implements Comparator<Employee> {
              @Override
              public int compare(Employee e1, Employee e2) {
                  if (e1.getSalary() > e2.getSalary())
                      return 1;
                  else if(e1.getSalary() < e2.getSalary())
                      return -1;
                  else
                      return 0;
              }
    }
}


