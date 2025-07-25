package androidx.room;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: Index.kt */
@Target({})
@Metadata
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes2.dex */
public @interface Index {

    /* compiled from: Index.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public enum Order {
        ASC,
        DESC
    }

    String name() default "";

    Order[] orders() default {};

    boolean unique() default false;

    String[] value();
}
