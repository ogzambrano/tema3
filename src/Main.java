public class Main {
    public static void main(String[] args) {
        String[] nombres = {"Jesus", "Maria", "Jose", "Cesar"};
        String union="";
        for(String nombre : nombres){
            union = union.concat(" "+nombre);
        }
        System.out.println(union);
    }
}