import listaencadeada.ChainedList;

public class App {

    public static void main(String[] args) {
        ChainedList<String> chainedList = new ChainedList<>();

        chainedList.add("matheus");
        chainedList.add("anything");
        chainedList.add("coisa");

        System.out.println(chainedList);
    }
}
