package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class o02 {
    @NotNull

    /* renamed from: c */
    public static final C31011a f83253c;

    /* renamed from: d */
    public static final o02 f83254d;

    /* renamed from: e */
    public static final o02 f83255e;

    /* renamed from: f */
    public static final o02 f83256f;

    /* renamed from: g */
    public static final o02 f83257g;

    /* renamed from: h */
    public static final o02 f83258h;

    /* renamed from: i */
    private static final /* synthetic */ o02[] f83259i;
    @NotNull

    /* renamed from: b */
    private final String f83260b;

    /* renamed from: com.yandex.mobile.ads.impl.o02$a */
    /* loaded from: classes8.dex */
    public static final class C31011a {
        private C31011a() {
        }

        @NotNull
        /* renamed from: a */
        public static o02 m31196a(@NotNull String javaName) {
            Intrinsics.checkNotNullParameter(javaName, "javaName");
            int hashCode = javaName.hashCode();
            if (hashCode != 79201641) {
                if (hashCode != 79923350) {
                    switch (hashCode) {
                        case -503070503:
                            if (javaName.equals("TLSv1.1")) {
                                return o02.f83256f;
                            }
                            break;
                        case -503070502:
                            if (javaName.equals("TLSv1.2")) {
                                return o02.f83255e;
                            }
                            break;
                        case -503070501:
                            if (javaName.equals("TLSv1.3")) {
                                return o02.f83254d;
                            }
                            break;
                    }
                } else if (javaName.equals("TLSv1")) {
                    return o02.f83257g;
                }
            } else if (javaName.equals("SSLv3")) {
                return o02.f83258h;
            }
            throw new IllegalArgumentException("Unexpected TLS version: " + javaName);
        }

        public /* synthetic */ C31011a(int i) {
            this();
        }
    }

    static {
        o02 o02Var = new o02(0, "TLS_1_3", "TLSv1.3");
        f83254d = o02Var;
        o02 o02Var2 = new o02(1, "TLS_1_2", "TLSv1.2");
        f83255e = o02Var2;
        o02 o02Var3 = new o02(2, "TLS_1_1", "TLSv1.1");
        f83256f = o02Var3;
        o02 o02Var4 = new o02(3, "TLS_1_0", "TLSv1");
        f83257g = o02Var4;
        o02 o02Var5 = new o02(4, "SSL_3_0", "SSLv3");
        f83258h = o02Var5;
        o02[] o02VarArr = {o02Var, o02Var2, o02Var3, o02Var4, o02Var5};
        f83259i = o02VarArr;
        C44401b.m3113a(o02VarArr);
        f83253c = new C31011a(0);
    }

    private o02(int i, String str, String str2) {
        this.f83260b = str2;
    }

    public static o02 valueOf(String str) {
        return (o02) Enum.valueOf(o02.class, str);
    }

    public static o02[] values() {
        return (o02[]) f83259i.clone();
    }

    @NotNull
    /* renamed from: a */
    public final String m31197a() {
        return this.f83260b;
    }
}
