import java.util.ArrayList;
import java.util.HashMap;

public class TodoList_list {
    public static void main(String[] args) {
        ArrayList<HashMap<Integer,String>> totalList = new ArrayList<>();
        HashMap<Integer,String> todoList = new HashMap<>();
    }

    // 리스트 안에 arrayList<HashMap>을 넣는다?
    // 실행시마다 초기화 되어있는 hashMap 을 생성해서 사용자별 응답이 담긴 것을 totalList 라는
    // ArrayList 안에 넣고 후반에 출력?
    // 참여자 이름 todoList 를 받아와 HashMap 이름을 사용자이름_todoList 로 만들어서 넣기?

    public HashMap<String, String> makeTodo(String userName) { // 생성
        HashMap<String,String> makeUserTodo = new HashMap<>();
        makeUserTodo.put("1.주간 보고서 작성","미정");
        makeUserTodo.put("2.이메일 확인 및 응답","미정");
        makeUserTodo.put("3.회의 준비","미정");
        makeUserTodo.put("4.프로젝트 계획서 수정","미정");
        makeUserTodo.put("5.팀 멤버와의 1대1 면담","미정");

        return makeUserTodo;
    }

}

