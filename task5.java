import java.util.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class SMS {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        while (true) {
            System.out.println("1.Add 2.View 3.Exit");
            int ch = sc.nextInt();

            if (ch == 1) {
                int id = sc.nextInt();
                String name = sc.next();
                list.add(new Student(id, name));
            } else if (ch == 2) {
                for (Student s : list) {
                    System.out.println(s.id + " " + s.name);
                }
            } else break;
            sc.close();
        }
    }
}
