package p821oe;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* compiled from: Annotations.kt */
@Target({ElementType.TYPE, ElementType.TYPE_USE})
@Metadata
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: oe.h */
/* loaded from: classes8.dex */
public @interface InterfaceC39163h {
    Class<? extends KSerializer<?>> with() default KSerializer.class;
}
