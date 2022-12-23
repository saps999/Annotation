import java.lang.annotation.*;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.FIELD)

@Documented


public @interface CustomAnotation {
 /*
    ID -- Default id
    City --- Default city

    Annotation members

    "name = value "
    all primitivies string enums arrays

     */

    int defaultValue();

}
