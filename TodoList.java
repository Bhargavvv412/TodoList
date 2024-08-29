//using array
import java.util.Scanner;

public class TodoList {
    private String[] s;
    private String[] date;
    private String[] time;
    private static int taskCount;

    public void add(int task) {
        this.taskCount = task;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < task; i++) {
            System.out.print((i + 1) + " Enter task: ");
            this.s[i] = sc.nextLine();

            System.out.print((i + 1) + " Enter time: ");
            this.time[i] = sc.nextLine();

            System.out.print((i + 1) + " Enter date: ");
            this.date[i] = sc.nextLine();
        }

    }

    public void print(int task){
        for(int i = 0; i < task; i++){
            System.out.println((i + 1) + ". " + s[i] + "\n" + (i+1) + ". " + date[i] + "\n"+(i+1)+ ". " + s[i] + "\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;
        TodoList ch = new TodoList();
        do {
            System.out.println("1.Add in todo list \n2.Remove in todo list \n3.print list \n4.Exit");
            System.out.print("Enter your choice: ");
            temp = sc.nextInt();
            switch (temp) {
                case 1:
                    System.out.println("Enter how many tast you want to enter");
                    taskCount = sc.nextInt();
                    ch.add(taskCount);
                    break;
                case 2:
                    break;
                case 3:
                    ch.print(taskCount);
                    break;
            }

        } while (temp != 4);
    }
}
