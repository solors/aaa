package com.yandex.mobile.ads.impl;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class hi1 {
    @NotNull

    /* renamed from: c */
    public static final C30465a f80076c;

    /* renamed from: d */
    public static final hi1 f80077d;

    /* renamed from: e */
    public static final hi1 f80078e;

    /* renamed from: f */
    public static final hi1 f80079f;

    /* renamed from: g */
    public static final hi1 f80080g;

    /* renamed from: h */
    public static final hi1 f80081h;

    /* renamed from: i */
    public static final hi1 f80082i;

    /* renamed from: j */
    private static final /* synthetic */ hi1[] f80083j;
    @NotNull

    /* renamed from: b */
    private final String f80084b;

    /* renamed from: com.yandex.mobile.ads.impl.hi1$a */
    /* loaded from: classes8.dex */
    public static final class C30465a {
        private C30465a() {
        }

        @NotNull
        /* renamed from: a */
        public static hi1 m33547a(@NotNull String protocol) throws IOException {
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            hi1 hi1Var = hi1.f80077d;
            if (!Intrinsics.m17075f(protocol, hi1Var.f80084b)) {
                hi1Var = hi1.f80078e;
                if (!Intrinsics.m17075f(protocol, hi1Var.f80084b)) {
                    hi1Var = hi1.f80081h;
                    if (!Intrinsics.m17075f(protocol, hi1Var.f80084b)) {
                        hi1Var = hi1.f80080g;
                        if (!Intrinsics.m17075f(protocol, hi1Var.f80084b)) {
                            hi1Var = hi1.f80079f;
                            if (!Intrinsics.m17075f(protocol, hi1Var.f80084b)) {
                                hi1Var = hi1.f80082i;
                                if (!Intrinsics.m17075f(protocol, hi1Var.f80084b)) {
                                    throw new IOException("Unexpected protocol: " + protocol);
                                }
                            }
                        }
                    }
                }
            }
            return hi1Var;
        }

        public /* synthetic */ C30465a(int i) {
            this();
        }
    }

    static {
        hi1 hi1Var = new hi1(0, "HTTP_1_0", "http/1.0");
        f80077d = hi1Var;
        hi1 hi1Var2 = new hi1(1, "HTTP_1_1", "http/1.1");
        f80078e = hi1Var2;
        hi1 hi1Var3 = new hi1(2, "SPDY_3", "spdy/3.1");
        f80079f = hi1Var3;
        hi1 hi1Var4 = new hi1(3, "HTTP_2", "h2");
        f80080g = hi1Var4;
        hi1 hi1Var5 = new hi1(4, "H2_PRIOR_KNOWLEDGE", "h2_prior_knowledge");
        f80081h = hi1Var5;
        hi1 hi1Var6 = new hi1(5, "QUIC", "quic");
        f80082i = hi1Var6;
        hi1[] hi1VarArr = {hi1Var, hi1Var2, hi1Var3, hi1Var4, hi1Var5, hi1Var6};
        f80083j = hi1VarArr;
        C44401b.m3113a(hi1VarArr);
        f80076c = new C30465a(0);
    }

    private hi1(int i, String str, String str2) {
        this.f80084b = str2;
    }

    public static hi1 valueOf(String str) {
        return (hi1) Enum.valueOf(hi1.class, str);
    }

    public static hi1[] values() {
        return (hi1[]) f80083j.clone();
    }

    @Override // java.lang.Enum
    @NotNull
    public final String toString() {
        return this.f80084b;
    }
}
