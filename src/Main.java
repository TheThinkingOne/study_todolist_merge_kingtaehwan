public class Main {
    public static void main(String[] args) {


        // 결과값 받기
        List<Map<String, Map<String, String>>> todoList = todoListList.output();
        System.out.println("참여자별 ToDo list 진행 현황");

        // 결과 출력
        for (Map<String, Map<String, String>> userTodo : todoList) {
            for (Map.Entry<String, Map<String, String>> userEntry : userTodo.entrySet()) {

                System.out.printf("- %s\n", userEntry.getKey());

                for (Map.Entry<String, String> todo : userEntry.getValue().entrySet()) {
                    System.out.printf("%s(%s) ", todo.getKey(), todo.getValue());
                }
            }
        }
        System.out.print("완전 종료");
    }
}