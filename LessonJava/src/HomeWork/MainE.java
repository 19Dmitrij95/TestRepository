package HomeWork;

import java.util.*;

public class MainE {

    public static void main(String[] args) {
        int count = 1;
        for(int i = 0; i <= count;) {
            System.out.println("Sorting a collection by name:");
            Comparator<Employee> eComp = new Employee.makeNameComparator();
            TreeSet<Employee> people = new TreeSet<>(eComp);
               people.add(new Employee("Tom", 20000, 8));
               people.add(new Employee("Anna", 10000, 6));
               people.add(new Employee("Nick", 500, 8));
               people.add(new Employee("Mails", 300, 4));
               people.add(new Employee("Arrai", 300, 7));
               people.add(new Employee("Amster", 300, 5));

               for(Employee e : people) {
                   System.out.println(e.getName() + " " + e.getSalary());
               }
            System.out.println("*****To withdraw workers whose name begins on [A]***** ");
               List<String> names = new ArrayList<>();


//               for(Employee e: people)
//                   if(e.getName().startsWith("A"))
//                       names.add(e.getName());
//               for(String n: names)
//                   System.out.println("Name is [A]: " + n);



               System.out.print("****************************************\n");


               i++;
               System.out.println("Sorting collection by salary:");
               if(i == 1) {
                   Comparator<Employee> eComp_1 = new Employee.makeSalaryRateComparator();
                   TreeSet<Employee> people_1 = new TreeSet<>(eComp_1);
                   people_1.add(new Employee("Tom", 20000, 8));
                   people_1.add(new Employee("Anna", 10000, 6));
                   people_1.add(new Employee("Nick", 500, 8));
                   people_1.add(new Employee("Mails", 300, 6));
                   for(Employee e_1 : people_1) {
                       System.out.println(e_1.getName() + " " + e_1.getSalary());
                   }
               }
               break;
        }
    }
}
