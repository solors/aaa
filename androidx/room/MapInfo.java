package androidx.room;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: MapInfo.kt */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
@Metadata
/* loaded from: classes2.dex */
public @interface MapInfo {
    String keyColumn() default "";

    String keyTable() default "";

    String valueColumn() default "";

    String valueTable() default "";
}
