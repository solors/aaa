package androidx.room;

import androidx.annotation.RequiresApi;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: Upsert.kt */
@Target({ElementType.METHOD})
@Metadata
@RequiresApi(16)
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes2.dex */
public @interface Upsert {
    Class<?> entity() default Object.class;
}
