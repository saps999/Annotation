public class Main extends OverrideExample{

    @Override
    void someMethodToOverride(){
        System.out.println("I want to meet Saptarshi");
    }

    public static void main(String[] args) {

        /*

        annotation provided by Java:::
        java.lang.annotation ---> @Functionalinterface
        java.lang ---> @Override

        and annotation provided by external libraries:::
        org.junit ---> @Test
         */


        /*
        Meta Annotation == Meta annotation provides addition information about annotation.

        Meta annotation provide additional info for --> Annotation -- Provide meta data to program

        4 important meta annotation:

       1) @Retention( Meta annotation): How long the annotated annotation should be retained.
                      Three possible values "SOURCE, CLASS, RUNTIME"
       2) @Target( Meta annotation): This will tell the target element we can apply annotation to..
                    The posibilities are FIELD, METHOD, CLASS, TYPE, PARAMETERS...
       3) @Documented( Meta annotation): will be used by the JAVA doc tools to generate documentation
       4) @Inherited( Meta annotation): inheritance in annotation subclasses.


         */


        System.out.println("Hello world!");


    }
}