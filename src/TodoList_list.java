import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TodoList_list {
    ArrayList<HashMap<String, HashMap<String, String>>> todoList = new ArrayList<>();


    // 리스트 안에 arrayList<HashMap>을 넣는다?
    // 실행시마다 초기화 되어있는 hashMap 을 생성해서 사용자별 응답이 담긴 것을 totalList 라는
    // ArrayList 안에 넣고 후반에 출력?
    // 참여자 이름 todoList 를 받아와 HashMap 이름을 사용자이름_todoList 로 만들어서 넣기?


    public void makeTodo(String userName) { // 생성
        HashMap<String, String> makeUserTodo = new HashMap<>();
        makeUserTodo.put("1.주간 보고서 작성", "미정");
        makeUserTodo.put("2.이메일 확인 및 응답", "미정");
        makeUserTodo.put("3.회의 준비", "미정");
        makeUserTodo.put("4.프로젝트 계획서 수정", "미정");
        makeUserTodo.put("5.팀 멤버와의 1대1 면담", "미정");

        HashMap<String, HashMap<String, String>> todo = new HashMap<>();
        todo.put(userName, makeUserTodo);

        todoList.add(todo);
    }

    public void updateTodo(String userName, String userSelectNum) {

        // 값을 수정 -> 값 가져와서 변경 -> 다시 저장

        // 값 가져오기
        HashMap<String, String> updateTodo
                = todoList.get(todoList.size() - 1).get(userName);

        // 변경
        switch (userSelectNum) {
            case "1":
                // 1번 키의 값을 변경
                updateTodo.replace("1.주간 보고서 작성", "완료");
                break;
            case "2":
                updateTodo.replace("2.이메일 확인 및 응답", "완료");
                break;
            case "3":
                updateTodo.replace("3.회의 준비", "완료");
                break;
            case "4":
                updateTodo.replace("4.프로젝트 계획서 수정", "완료");
                break;
            case "5":
                updateTodo.replace("5.팀 멤버와의 1대1 면담", "완료");
                break;
            default:
                System.out.println("해당 번호에 해당하는 작업이 없습니다.");
                break;
        }

        // 수정된 값을 저장
        HashMap<String, HashMap<String, String>> updateMap
                = todoList.get(todoList.size() - 1);

        updateMap.replace(userName, updateTodo);

        todoList.remove(todoList.size() - 1);
        todoList.add(updateMap);
    }

    public ArrayList<HashMap<String, HashMap<String, String>>> output() {
        return todoList;
    }
}

