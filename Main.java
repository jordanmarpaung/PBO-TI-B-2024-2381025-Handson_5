import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static String[] todos = new String[10];
    public static Scanner scanner = new Scanner( System.in);

    public static void main(String[] args) {
        addTodoList("Belajar");
        addTodoList("Menggambar");
        addTodoList("Menulis");
        addTodoList("Menyetir");
        System.out.println("After Edit");
        editTodoList(2, "Menari");
        showTodoList();
    }
    public static void showTodoList(){
        System.out.println("Todo List");
        for (int i = 0; i < todos.length; i++) {
            String todo = todos[i];
            if (todo != null) {
                System.out.println((i + 1) + ". " + todo);
            }
        }
    }

    public static void addTodoList(String todo){

        resizeIfFull();


        //add todo to array that has null element
        for (int i = 0; i < todos.length; i++){
            if (todos[i] == null){
                todos[i] = todo;
                break;
            }
        }

    }

    private static void resizeIfFull() {
        Boolean isFUll = true;
        for (int i = 0; i < todos.length; i++){
            if (todos[i] == null){
                isFUll = false;
                break;
            }

        }

        if (isFUll){
            resizeArrayToTwoTimesBigger();
        }
    }
    private static void resizeArrayToTwoTimesBigger() {
        String[] temp = todos;
        todos = new String[todos.length * 2];
        for (int i = 0; i < temp.length; i++){
            todos[i] = temp[i];
        }
    }

    public static boolean removeTodoList(Integer number){
        if (isSelectedTodoNotValid(number)) return false;

        for (int i = number- 1; i < todos.length; i++){
            if (i == (todos.length - 1)) {
                todos[i] = null;
            }else {
                todos[i] = todos[i + 1];
            }
        }
        return true;
    }

    private static boolean isSelectedTodoNotValid(Integer number) {
        if (number <= 0){
            return true;
        }
        if (number - 1 > todos.length -1){
            return true;
        }
        if (todos[number -1] == null){
            return true;
        }
        return false;
    }
    public static boolean editTodoList(Integer number, String newTodo){
        if (isSelectedTodoNotValid(number)){
            return false;
        }
        todos[number - 1] = newTodo;
        return true;
    }
}
public static String input(String info) {
    System.out.println(info +":");
    String data = scanner.nextline();
    return data;
}

public static void showMainMenu() {
    boolean isRunning = true;
    while (isRunning) {
        showTodoList();
        System.out.println("1, Tambah");
        System.out.println("2. Hapus");
        System.out.println("3. Edit");
        System.out.println("4. Keluar");
        String selectedMenu = input("Pilih");

        switch(selectedMenu) {
            case "1" :
                showMenuAddTodoList();
                break;
            case "2" :
                showMenuRemoveTodoList();
                break;
            case "3" :
                showMenuEditTodoList();
                break;
            case "4" :
                isRunning = false;
                break;
            default:
                System.out.println("Pilih menu dengan benar");
        }
    }

}

public static void showMenuAddTodoList() {
    System.out.println("MENAMBAH TODO LIST");
    String todo = input("Todo (x jika batal)");
    if (todo.equals("x")) {
    } else{
        addTodoList(todo);
    }
}
public static void showMenuRemoveTodoList() {
    System.out.println("MENGHAPUS TODO LIST");
    String number = input("Nomor yang dihapus (x jika batal)");
    if (number.equals("x")) {
    } else {
        boolean success = RemoveTodoList(number: Integer.parseInt(s: number));
        if (!success) {
            System.out.println("gagal menghapus todo list : " + number);
        }
    }
}
public static void showMenuEditTodoList() {
    System.out.println("MENGEDIT TODO LIST");
    String  selectedTodo = input("Masukkan Nomor Todo (x jika bata)");
    if (selectedTodo.equals("x")) {
        return;
    }
    String newTodo = input("Masukkan todo yang baru(x jika batal)");
    if (newTodo.equals("x")){
        return;
    }
    boolean isEditingTodoSuccess = editTodoList( number: Integer.parseInt(selectedTodo), newTodo);
    if (isEditingTodoSuccess) {
        System.out.println("Berhasil mengedit todo");
    }else{
        System.out.println(gagal mengedit todo);
    }

        )
    )
