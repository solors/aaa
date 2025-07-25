package com.bykv.p135vk.openvk.preload.p155a.p157b.p160b;

import com.bykv.p135vk.openvk.preload.p155a.p157b.JavaVersion;
import java.lang.reflect.AccessibleObject;

/* renamed from: com.bykv.vk.openvk.preload.a.b.b.b */
/* loaded from: classes3.dex */
public abstract class ReflectionAccessor {

    /* renamed from: a */
    private static final ReflectionAccessor f13758a;

    static {
        ReflectionAccessor unsafeReflectionAccessor;
        if (JavaVersion.m91588a() < 9) {
            unsafeReflectionAccessor = new PreJava9ReflectionAccessor();
        } else {
            unsafeReflectionAccessor = new UnsafeReflectionAccessor();
        }
        f13758a = unsafeReflectionAccessor;
    }

    /* renamed from: a */
    public static ReflectionAccessor m91605a() {
        return f13758a;
    }

    /* renamed from: a */
    public abstract void mo91604a(AccessibleObject accessibleObject);
}
