package com.yandex.mobile.ads.impl;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.C37559r0;
import kotlin.collections.C37563v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class f30 {
    @NotNull

    /* renamed from: h */
    private static final Object f78893h = new Object();
    @Nullable

    /* renamed from: a */
    private String f78894a;
    @NotNull

    /* renamed from: b */
    private List<? extends zi1> f78895b;
    @NotNull

    /* renamed from: c */
    private Map<String, String> f78896c;
    @Nullable

    /* renamed from: d */
    private String f78897d;
    @Nullable

    /* renamed from: e */
    private String f78898e;

    /* renamed from: f */
    private boolean f78899f;
    @Nullable

    /* renamed from: g */
    private String f78900g;

    public f30() {
        List<? extends zi1> m17166m;
        Map<String, String> m17284j;
        m17166m = C37563v.m17166m();
        this.f78895b = m17166m;
        m17284j = C37559r0.m17284j();
        this.f78896c = m17284j;
    }

    @Nullable
    /* renamed from: a */
    public final String m34379a() {
        return this.f78898e;
    }

    @Nullable
    /* renamed from: b */
    public final String m34377b() {
        return this.f78894a;
    }

    /* renamed from: c */
    public final boolean m34375c() {
        return this.f78899f;
    }

    @NotNull
    /* renamed from: d */
    public final Map<String, String> m34373d() {
        return this.f78896c;
    }

    @Nullable
    /* renamed from: e */
    public final String m34371e() {
        return this.f78897d;
    }

    @NotNull
    /* renamed from: f */
    public final List<zi1> m34370f() {
        return this.f78895b;
    }

    @Nullable
    /* renamed from: g */
    public final String m34369g() {
        String str;
        synchronized (f78893h) {
            str = this.f78900g;
        }
        return str;
    }

    /* renamed from: h */
    public final void m34368h() {
        this.f78899f = true;
    }

    /* renamed from: a */
    public final void m34378a(@Nullable String str) {
        this.f78898e = str;
    }

    /* renamed from: b */
    public final void m34376b(@Nullable String str) {
        this.f78894a = str;
    }

    /* renamed from: c */
    public final void m34374c(@Nullable String str) {
        this.f78897d = str;
    }

    /* renamed from: d */
    public final void m34372d(@Nullable String str) {
        synchronized (f78893h) {
            if (str != null) {
                if (str.length() != 0) {
                    this.f78900g = str;
                }
            }
            Unit unit = Unit.f99208a;
        }
    }
}
