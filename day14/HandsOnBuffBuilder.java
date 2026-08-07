package day14;

public class HandsOnBuffBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        StringBuffer buffer = new StringBuffer();
        builder.append(7.8);builder.append("Spring Boot");
        builder.append(true);builder.append(98);
        System.out.println(builder);
        builder.insert(2, "JavaLin");
        System.out.println(builder);
        System.out.println(builder.substring(5, 11));
        builder.setCharAt(4, 'Z');
        System.out.println(builder);
        builder.delete(2, 10);
        System.out.println(builder);
        buffer.append(builder);
        // StringBuffer and StrignBuilder are having same inbuilt methods
        System.out.println(buffer.toString());
    }
}
