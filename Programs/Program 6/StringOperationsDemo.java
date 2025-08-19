
public class StringOperationsDemo {
    public static void main(String[] args) {
       
        String str1 = "Hello";
        String str2 = "World";
        String result = str1 + " " + str2;
        System.out.println("Concatenated String: " + result);
        System.out.println("Length of result string: " + result.length());
        System.out.println("Character at index 2: " + result.charAt(2));
        System.out.println("Substring from index 2 to 6: " + result.substring(2, 6));
        System.out.println("Uppercase: " + result.toUpperCase());        
        System.out.println("Lowercase: " + result.toLowerCase());
        System.out.println("Index of 'g': " + result.indexOf('g'));
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println("\nAfter append: " + sb);
        sb.insert(6, "Java ");
        System.out.println("After insert: " + sb);
        sb.replace(6, 10, "Wonderful");
        System.out.println("After replace: " + sb);
        sb.delete(6, 13);
        System.out.println("After delete: " + sb);
        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}
