public class linearSearch {
    public static void main(String[] args) {
        String name = "Ankit";
        char target = 'u';
        boolean result = Search(name, target);
        System.out.println(result);
    }

    static boolean Search(String name, char target) {
        if(name.length() == 0){
            return false;
        }

        for(int i = 0; i < name.length(); i++){
            char character = name.charAt(i);
            if (character == target){
                return true;
            }
        }
        return false;
    }
}
