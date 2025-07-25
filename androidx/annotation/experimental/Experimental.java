package androidx.annotation.experimental;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: Experimental.kt */
@Target({ElementType.ANNOTATION_TYPE})
@Metadata
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface Experimental {

    /* compiled from: Experimental.kt */
    @Metadata
    /* loaded from: classes.dex */
    public enum Level {
        WARNING,
        ERROR
    }

    Level level() default Level.ERROR;
}
