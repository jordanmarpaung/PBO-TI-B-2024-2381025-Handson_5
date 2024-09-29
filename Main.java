import java.util.Scanner;

public class Main {
    public static String[] todos = new String[10];
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        showTodoList();
        addTodoList();[0] = "Belajar";
        addTodoList();[1] = "Menggambar";
        addTodoList();[2] = "Berdoa";
        showTodoList();
        removeTodoList( number: 2);
        showTodoList();
        removeTodoList( number: 1);
        showTodoList();
    }
    public static void showTodoList() {
        System.out.println("TODO LIST");
        for (int i = 0; i < todos.length; i++) {
            String todo = todos[i];
            if (todo != null) {
                System.out.println((i + 1) + ". " + todo);
            }
        }
}

    public static void addTodoList(String todo){
        Boolean isFull = true;
        for (int i = 0; i < todos.length; i++) {
            if (todos[i]) == null) {
                isFull = false;
                break;
            }
        }


    if (isFull){
        resizeIfFull();
    }


    private static void resizeArrayToTwoTimesBigger() {
        String [] temp = todos;
        todos = new String[todos.length * 2];
        for(int i = 0; i < temp.length; i++){
            todos[i] = temp[i];
        }
        }







    public static boolean removeTodoList(Integer number) {
        if (number <= 0);
        return false;
        }
    if (number - 1 > todos.length - 1){
        return false;
        }
    if (todos[number - 1] == null) {
        return false;

    }

    for (int i = number -1; i < todos.length; i++) {
        if (i == (todos.length - 1)) {
            todos(i) = null;
        }else{
            todos(i) = todos[i + 1];
        }
        }
    return true;
    }

    private static boolean isSelectedTodoNotValid



public static boolean editTodoList(Integer number, String newTodo) {
    if (isSelectedTodoNotValid(number)) {
        return false;
    }
    todos[number - 1] = newTodo;
    return true;
}
}















