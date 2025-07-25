package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: RequiresOptIn.kt */
@Target({ElementType.ANNOTATION_TYPE})
@Metadata
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface RequiresOptIn {

    /* compiled from: RequiresOptIn.kt */
    @Metadata
    /* loaded from: classes.dex */
    public enum Level {
        WARNING,
        ERROR
    }

    Level level() default Level.ERROR;
}
