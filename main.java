import java.util.Scanner;
public class main{

        public void add(){
        System.out.println("Enter how many tast you want to enter");
        Scanner sc = new Scanner(System.in);
        int task = sc.nextInt();
        sc.nextLine();

        String[] s = new String[task];
        String[] time = new String[task];
        String[] date = new String[task];

        for(int i = 0; i <= task; i++){
            System.out.print((i+1) + " Enter task: ");
            s[i] = sc.nextLine();

            System.out.print((i+1) + " Enter time: ");
            time[i] = sc.nextLine();

            System.out.print((i+1) + " Enter date: ");
            date[i] = sc.nextLine();
        }
    
    }

    public static void main(String[] args) {
        main ch = new main();
        ch.add();
    }
}
