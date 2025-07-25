package com.bykv.p135vk.openvk.preload.p155a.p161c;

import com.bykv.p135vk.openvk.preload.falconx.p166a.WebResourceUtils;
import com.bykv.p135vk.openvk.preload.p155a.p157b.C$Gson$Types;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: com.bykv.vk.openvk.preload.a.c.a */
/* loaded from: classes3.dex */
public class TypeToken<T> {

    /* renamed from: a */
    private Class<? super T> f13807a;

    /* renamed from: b */
    private Type f13808b;

    /* renamed from: c */
    private int f13809c;

    /* JADX INFO: Access modifiers changed from: protected */
    public TypeToken() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            Type m91660a = C$Gson$Types.m91660a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
            this.f13808b = m91660a;
            this.f13807a = (Class<? super T>) C$Gson$Types.m91654b(m91660a);
            this.f13809c = this.f13808b.hashCode();
            return;
        }
        throw new RuntimeException("Missing type parameter.");
    }

    /* renamed from: a */
    public final Class<? super T> m91569a() {
        return this.f13807a;
    }

    /* renamed from: b */
    public final Type m91566b() {
        return this.f13808b;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof TypeToken) && C$Gson$Types.m91655a(this.f13808b, ((TypeToken) obj).f13808b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13809c;
    }

    public final String toString() {
        return C$Gson$Types.m91651c(this.f13808b);
    }

    /* renamed from: a */
    public static TypeToken<?> m91567a(Type type) {
        return new TypeToken<>(type);
    }

    /* renamed from: a */
    public static <T> TypeToken<T> m91568a(Class<T> cls) {
        return new TypeToken<>(cls);
    }

    private TypeToken(Type type) {
        Type m91660a = C$Gson$Types.m91660a((Type) WebResourceUtils.m91432a(type));
        this.f13808b = m91660a;
        this.f13807a = (Class<? super T>) C$Gson$Types.m91654b(m91660a);
        this.f13809c = this.f13808b.hashCode();
    }
}
