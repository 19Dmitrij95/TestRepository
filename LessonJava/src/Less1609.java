
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Random;
//import java.util.stream.IntStream;
//import java.util.stream.Stream;
//
//public class Less1609 {
//
//    class User {
//        private String name;
//        private int age;
//
//        public User(String name, int age) {
//            this.name = name;
//            this.age = age;
//        }
//        public int getAge() {
//            return age;
//        }
//        @Override
//        public String toString() {
//            return new StringBuffer(name).append(": ").append(age).toString();
//        }
//    }
//    public static void main(String[] args) {
//        Random r = new Random();
//        List<String> names = new ArrayList<>();
//        for(int i = 0; i!=10; ++i) {
//            names.add("Anna" + i);
//
//        }
//        List<Integer> ages = new ArrayList<>();
//        for(int i=0; i != 10; ++i) {
//            ages.add(r.nextInt(60));
//        }
//
//        Stream<User> usersStream =
//                IntStream.range(0,names.size())
//                .mapToObj(i->new User(names.get(i),ages.get(i)));
//
//        usersStream.filter(x->x.getAge()<21).forEach(x-> System.out.println(x));
////        Stream<User> userStream = users.stream();
////        userStream.filter(x->x.getAge() < 21).forEach(x-> System.out.println(x));
//    }
//}
