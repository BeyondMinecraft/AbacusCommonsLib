package net.minecraft.src;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 *
 * @author Gregory
 */
@Documented
@Retention(value=RetentionPolicy.CLASS)
@Target(value=ElementType.FIELD)
public @interface MLProp {
  public String info() default "";
}
