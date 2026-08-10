package day1;

public class StringToMultiply {
    public static String perform(String str1,String str2){
        if(str1.equals("0") || str2.equals("0"))
            return "0";
        int size1 = str1.length(), size2 = str2.length();
        int[] pos = new int[size1+size2];
        for(int s1=size1-1;s1>=0;s1--){
            for(int s2=size2-1;s2>=0;s2--){
                int mul = (str1.charAt(s1)-'0')*(str2.charAt(s2)-'0');
                int sum = mul + pos[s1+s2+1];
                pos[s1+s2+1] = sum%10;
                pos[s1+s2] += sum/10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<pos.length;i++){
            if(!(sb.length()==0 && pos[i]==0))
                sb.append(pos[i]);
        }
        return sb.length()==0?"0":sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(perform("123","456"));
        System.out.println(perform("0","456"));
        System.out.println(perform("123","0"));
        System.out.println(perform("999","999"));
        System.out.println(perform("123456789","987654321"));
    }
}
