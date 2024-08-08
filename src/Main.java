import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 초기 세팅
        Scanner sc = new Scanner(System.in);
        String tasks[] = {
                "주간 보고서 작성",
                "이메일 확인 및 응답",
                "회의 준비",
                "프로젝트 계획서 수정",
                "팀 멤버와의 1:1 면담"
        };

        // 프로그램 시작
        while (true) {
            // 사용자 입력
            System.out.print("Input Your Name: ");
            String username = sc.nextLine();
            // 번호 입력
            System.out.println("진행 기호 : c - 계속 입력, q - 다음 참여자로 넘기기, x - 모든 입력 종료");
            System.out.println("1. 주간 보고서 작성, 2. 이메일 확인 및 응답, 3. 회의 준비, 4. 프로젝트 계획서 수정, 5.팀 멤버와의 1:1 면담");
            int titleNum = sc.nextInt();
            System.out.println("Title 번호: " + titleNum);


            // 데이터 저장
//            save(username, input);

            // 종료 여부 입력
            while (true) {

                String input = sc.nextLine();
                System.out.println("종료 여부: " + input);

                if (input.equalsIgnoreCase("x")) {
                    return;
                } else if (input.equalsIgnoreCase("q")) {
                    break;
                } else if (input.equalsIgnoreCase("c")) {
                    continue;
                }
            }
        }
    }
}