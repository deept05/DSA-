public class occurence_string {
    public static int first = -1;
    public static int last = -1;
    public static void Occurence_String(String str, int idx, char element){
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char currChar = str.charAt(idx);
        if(currChar == element){
            if(first == -1){
                first = idx;
            }
            else
            {
                last = idx;
            }
        }
        Occurence_String(str, idx+1, element);

    }
    public static void main(String args[]){
        String str = "abaacdaefaah";
        Occurence_String(str, 0, 'a');
    }
    
}
