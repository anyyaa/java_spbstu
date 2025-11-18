public class VarExample {
    public static void main(String[] args) {
        var name = "Anna";          // String
        var isStudent = true;       // boolean
        
        System.out.println(name + ", student:" + isStudent);
        
        var list = new ArrayList<String>();  // ArrayList<String>
        list.add("Java");
        list.add("Programming");
        
        for (var item : list) {     // String
            System.out.println(item);
        }
    }
}
