public class Main {

    public static void main(String[] args) {
        AnnotateTest annotateTest = new AnnotateTest();
        System.out.println(annotateTest.toString());
        System.out.println(annotateTest.hashCode());
        System.out.println(annotateTest.equals(""));
    }
}
