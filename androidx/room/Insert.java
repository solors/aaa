package androidx.room;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: Insert.kt */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
@Metadata
/* loaded from: classes2.dex */
public @interface Insert {
    Class<?> entity() default Object.class;

    @OnConflictStrategy
    int onConflict() default 3;
}
