package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: DeprecatedSinceApi.kt */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@Metadata
@Documented
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface DeprecatedSinceApi {
    int api();

    String message() default "";
}
