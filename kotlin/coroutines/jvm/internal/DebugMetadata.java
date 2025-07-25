package kotlin.coroutines.jvm.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* JADX WARN: Method from annotation default annotation not found: i */
/* JADX WARN: Method from annotation default annotation not found: n */
/* JADX WARN: Method from annotation default annotation not found: s */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Metadata
/* renamed from: kotlin.coroutines.jvm.internal.f */
/* loaded from: classes7.dex */
public @interface DebugMetadata {
    /* renamed from: c */
    String m17095c() default "";

    /* renamed from: f */
    String m17094f() default "";

    /* renamed from: l */
    int[] m17093l() default {};

    /* renamed from: m */
    String m17092m() default "";

    /* renamed from: v */
    int m17091v() default 1;
}
