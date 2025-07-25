package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: IntDef.kt */
@Target({ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.SOURCE)
@Metadata
/* loaded from: classes.dex */
public @interface IntDef {
    boolean flag() default false;

    boolean open() default false;

    int[] value() default {};
}
