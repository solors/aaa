package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: IntRange.kt */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@Metadata
@Documented
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface IntRange {
    long from() default Long.MIN_VALUE;

    /* renamed from: to */
    long m105510to() default Long.MAX_VALUE;
}
