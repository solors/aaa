package com.bykv.p135vk.openvk.preload.p155a.p156a;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.bykv.vk.openvk.preload.a.a.a */
/* loaded from: classes3.dex */
public @interface JsonAdapter {
    /* renamed from: a */
    Class<?> m91669a();

    /* renamed from: b */
    boolean m91668b() default true;
}
