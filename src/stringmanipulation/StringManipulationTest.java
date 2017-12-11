package stringmanipulation;

public class StringManipulationTest{
    public static void main(String[] args) {
        String st   = "Java is nothing but so hard";
        String st1  = "education";
        String st2  = "learn";
        String  st3 = "Mid term exam soon";
        String st4  = " ";

        char [] charArray = st1.toCharArray();
        char [] helloArray= {'H','e','l','l','o','.'};
        String  helloString = new String (helloArray);
        System.out.println(helloString);
        System.out.println(st.charAt(2));
        System.out.println(st2.equalsIgnoreCase(st1));
        System.out.println(st1.length());
        System.out.println(st.replace("nothing","easy"));
        System.out.println(st1.equals(st2));
        System.out.println(st.substring(8));
        System.out.println(st.substring(8,11));
        System.out.println(st1.toLowerCase());
        System.out.println(st1.toUpperCase());
        System.out.println(st3.trim());
        System.out.println(st.contains(st1));
        System.out.println(st.contains(st2));
        System.out.println(charArray.length);
        System.out.println(charArray[4]);
        System.out.println(st.compareTo(st1));
        System.out.println(st1.isEmpty());
        System.out.println(st4.isEmpty());
        System.out.println(st1.valueOf(st));
        System.out.println(st.endsWith("learn"));
        System.out.println(st.startsWith("java"));

    }

}
