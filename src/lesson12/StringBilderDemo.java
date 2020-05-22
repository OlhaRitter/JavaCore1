package lesson12;

public class StringBilderDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = createSomeString(3,56);
        StringBuilder stringBuilder1 = createSomeString(30,2);
        System.out.println(stringBuilder);

        modifySomeString(stringBuilder,"=","ровно");
        modifySomeString(stringBuilder1, "+","плюс");
        System.out.println(stringBuilder);
    }
    private static StringBuilder createSomeString(int a, int b){
        StringBuilder result = new StringBuilder();
        result.append(a).append(" + ").append(b).append(" = ").append(a+b).append("\n");
        result.append(a).append(" * ").append(b).append(" = ").append(a*b).append("\n");
        return result;
    }
    private static void modifySomeString (StringBuilder stringBuilder,String oldString, String newString){
       int pos;
        while ( (pos =stringBuilder.indexOf(oldString))!=-1) {
            //stringBuilder.deleteCharAt(pos);
            //stringBuilder.insert(pos,"равно");

            stringBuilder.replace(pos,pos+1,newString);
        }
       // return stringBuilder;
    }
}
