public class OverrideExample {
//    void method1(){
//
//    }
//}
//class Main extends OverrideExample{
//    @Override
//    void method1(){
//        System.out.println();
//    }
@CustomAnotation( defaultValue = 230)

int someInstanceVariable;


    public OverrideExample() {
    }

    @Deprecated
    static void  someOldMethodWeWillRemoveInFuture(){
        System.out.println("I will be deleted");
    }

    void someMethodToOverride(){
        System.out.println("I want to see anjaali");
    }


    public static void main(String[] args) {

        System.out.println("some value");

        OverrideExample.someOldMethodWeWillRemoveInFuture();

    }


}
