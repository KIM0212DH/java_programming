package practice.week5.q1;

import java.util.Scanner;

class Day {
    private String work;

    public void set(String work) {
        this.work = work;
    }

    public String get() {
        return work;
    }

    public void show() {
        if (work == null)
            System.out.println("없습니다.");
        else
            System.out.println(work + "입니다.");
    }
}

public class MonthSchedule {
    private int nDays;
    private Day[] days;
    private Scanner scanner;

    public MonthSchedule(int nDays) {
        this.nDays = nDays;
        this.days = new Day[nDays + 1];
        for (int i = 0; i < nDays + 1; i++)
            this.days[i] = new Day();
        this.scanner = new Scanner(System.in);
    }

    private void input() {
        System.out.print("날짜(1~" + this.nDays + ")?");
        int input_day = this.scanner.nextInt();
        System.out.print("할일(빈칸없이 입력)?");
        String hal_il = this.scanner.next();
        if (input_day <= 0 || input_day > this.nDays) {
            System.out.println("날짜 잘못 입력하였습니다.!");
            return ;
        }
        days[input_day].set(hal_il);
    }
    private void view() {
        System.out.print("날짜(1~" + this.nDays + ")?");
        int input_day = this.scanner.nextInt();
        System.out.print(input_day + "일의 할 일은 ");
        days[input_day].show();
    }
    private void finish() {
        scanner.close();
        System.out.println("프로그램을 종료합니다.");
    }
    public void run() {
        System.out.println("이번달 스케쥴 관리 프로그램.");
        System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
        int menu = this.scanner.nextInt();
        while (true) {
            if (menu == 1)
                input();
            else if (menu == 2)
                view();
            else if (menu == 3) {
                finish();
                break ;
            }
            else
                System.out.println("잘못입력하였습니다.");

            System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
            menu = this.scanner.nextInt();
        }


    }

    public static void main(String[] args) {
        MonthSchedule april = new MonthSchedule(30);
        april.run();
    }
}
