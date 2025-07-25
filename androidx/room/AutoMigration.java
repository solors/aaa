package androidx.room;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: AutoMigration.kt */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
@Metadata
/* loaded from: classes2.dex */
public @interface AutoMigration {
    int from();

    Class<?> spec() default Object.class;

    /* renamed from: to */
    int m104111to();
}
