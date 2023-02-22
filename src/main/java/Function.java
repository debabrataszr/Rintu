public class Function {
    public static void main(String[] args) {
     String[] arr= {"Debabrata","Priyadarshi","Sahoo"};
        display(arr);
    }
static void display(String[] abc) {
        for(int i=0;i<abc.length;i++) {
            String stra = abc[i];
             for(int j=0;j<stra.length();j++) {
                 System.out.println(stra.charAt(j));
             }
        }
}

}

