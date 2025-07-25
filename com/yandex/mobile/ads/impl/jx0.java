package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class jx0 {
    @NotNull

    /* renamed from: c */
    public static final C30679a f81177c;

    /* renamed from: d */
    public static final jx0 f81178d;

    /* renamed from: e */
    public static final jx0 f81179e;

    /* renamed from: f */
    public static final jx0 f81180f;

    /* renamed from: g */
    public static final jx0 f81181g;

    /* renamed from: h */
    public static final jx0 f81182h;

    /* renamed from: i */
    public static final jx0 f81183i;

    /* renamed from: j */
    public static final jx0 f81184j;

    /* renamed from: k */
    public static final jx0 f81185k;

    /* renamed from: l */
    private static final /* synthetic */ jx0[] f81186l;
    @NotNull

    /* renamed from: b */
    private final String f81187b;

    /* renamed from: com.yandex.mobile.ads.impl.jx0$a */
    /* loaded from: classes8.dex */
    public static final class C30679a {
        private C30679a() {
        }

        public /* synthetic */ C30679a(int i) {
            this();
        }
    }

    static {
        jx0 jx0Var = new jx0(0, "GET", "GET");
        f81178d = jx0Var;
        jx0 jx0Var2 = new jx0(1, "POST", "POST");
        f81179e = jx0Var2;
        jx0 jx0Var3 = new jx0(2, "PUT", "PUT");
        f81180f = jx0Var3;
        jx0 jx0Var4 = new jx0(3, "DELETE", "DELETE");
        f81181g = jx0Var4;
        jx0 jx0Var5 = new jx0(4, "HEAD", "HEAD");
        f81182h = jx0Var5;
        jx0 jx0Var6 = new jx0(5, "OPTIONS", "OPTIONS");
        f81183i = jx0Var6;
        jx0 jx0Var7 = new jx0(6, "TRACE", "TRACE");
        f81184j = jx0Var7;
        jx0 jx0Var8 = new jx0(7, "PATCH", "PATCH");
        f81185k = jx0Var8;
        jx0[] jx0VarArr = {jx0Var, jx0Var2, jx0Var3, jx0Var4, jx0Var5, jx0Var6, jx0Var7, jx0Var8};
        f81186l = jx0VarArr;
        C44401b.m3113a(jx0VarArr);
        f81177c = new C30679a(0);
    }

    private jx0(int i, String str, String str2) {
        this.f81187b = str2;
    }

    public static jx0 valueOf(String str) {
        return (jx0) Enum.valueOf(jx0.class, str);
    }

    public static jx0[] values() {
        return (jx0[]) f81186l.clone();
    }

    @NotNull
    /* renamed from: a */
    public final String m32713a() {
        return this.f81187b;
    }
}
