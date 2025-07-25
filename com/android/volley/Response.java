package com.android.volley;

import androidx.annotation.Nullable;
import com.android.volley.Cache;

/* renamed from: com.android.volley.p */
/* loaded from: classes2.dex */
public class Response<T> {
    @Nullable

    /* renamed from: a */
    public final T f3495a;
    @Nullable

    /* renamed from: b */
    public final Cache.C3744a f3496b;
    @Nullable

    /* renamed from: c */
    public final VolleyError f3497c;

    /* renamed from: d */
    public boolean f3498d;

    /* compiled from: Response.java */
    /* renamed from: com.android.volley.p$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC3755a {
        void onErrorResponse(VolleyError volleyError);
    }

    /* compiled from: Response.java */
    /* renamed from: com.android.volley.p$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC3756b<T> {
        void onResponse(T t);
    }

    private Response(@Nullable T t, @Nullable Cache.C3744a c3744a) {
        this.f3498d = false;
        this.f3495a = t;
        this.f3496b = c3744a;
        this.f3497c = null;
    }

    /* renamed from: a */
    public static <T> Response<T> m102284a(VolleyError volleyError) {
        return new Response<>(volleyError);
    }

    /* renamed from: c */
    public static <T> Response<T> m102282c(@Nullable T t, @Nullable Cache.C3744a c3744a) {
        return new Response<>(t, c3744a);
    }

    /* renamed from: b */
    public boolean m102283b() {
        if (this.f3497c == null) {
            return true;
        }
        return false;
    }

    private Response(VolleyError volleyError) {
        this.f3498d = false;
        this.f3495a = null;
        this.f3496b = null;
        this.f3497c = volleyError;
    }
}
