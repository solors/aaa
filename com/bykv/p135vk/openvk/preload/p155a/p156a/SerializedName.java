package com.bykv.p135vk.openvk.preload.p155a.p156a;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.bykv.vk.openvk.preload.a.a.b */
/* loaded from: classes3.dex */
public @interface SerializedName {
    /* renamed from: a */
    String m91667a();

    /* renamed from: b */
    String[] m91666b() default {};
}
