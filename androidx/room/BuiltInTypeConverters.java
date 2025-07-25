package androidx.room;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: BuiltInTypeConverters.kt */
@Target({})
@Metadata
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes2.dex */
public @interface BuiltInTypeConverters {

    /* compiled from: BuiltInTypeConverters.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public enum State {
        ENABLED,
        DISABLED,
        INHERITED
    }

    State enums() default State.INHERITED;

    State uuid() default State.INHERITED;
}
