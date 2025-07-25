package androidx.room;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: TypeConverters.kt */
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.CLASS)
@Metadata
/* loaded from: classes2.dex */
public @interface TypeConverters {
    BuiltInTypeConverters builtInTypeConverters() default @BuiltInTypeConverters;

    Class<?>[] value() default {};
}
