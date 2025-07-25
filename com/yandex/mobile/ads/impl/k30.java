package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class k30 {
    @NotNull

    /* renamed from: c */
    public static final C30697a f81252c;

    /* renamed from: d */
    public static final k30 f81253d;

    /* renamed from: e */
    public static final k30 f81254e;

    /* renamed from: f */
    public static final k30 f81255f;

    /* renamed from: g */
    public static final k30 f81256g;

    /* renamed from: h */
    public static final k30 f81257h;

    /* renamed from: i */
    public static final k30 f81258i;

    /* renamed from: j */
    private static final /* synthetic */ k30[] f81259j;

    /* renamed from: b */
    private final int f81260b;

    /* renamed from: com.yandex.mobile.ads.impl.k30$a */
    /* loaded from: classes8.dex */
    public static final class C30697a {
        private C30697a() {
        }

        @Nullable
        /* renamed from: a */
        public static k30 m32675a(int i) {
            k30[] values;
            for (k30 k30Var : k30.values()) {
                if (k30Var.m32676a() == i) {
                    return k30Var;
                }
            }
            return null;
        }

        public /* synthetic */ C30697a(int i) {
            this();
        }
    }

    static {
        k30 k30Var = new k30(0, 0, "NO_ERROR");
        f81253d = k30Var;
        k30 k30Var2 = new k30(1, 1, "PROTOCOL_ERROR");
        f81254e = k30Var2;
        k30 k30Var3 = new k30(2, 2, "INTERNAL_ERROR");
        f81255f = k30Var3;
        k30 k30Var4 = new k30(3, 3, "FLOW_CONTROL_ERROR");
        f81256g = k30Var4;
        k30 k30Var5 = new k30(4, 4, "SETTINGS_TIMEOUT");
        k30 k30Var6 = new k30(5, 5, "STREAM_CLOSED");
        k30 k30Var7 = new k30(6, 6, "FRAME_SIZE_ERROR");
        k30 k30Var8 = new k30(7, 7, "REFUSED_STREAM");
        f81257h = k30Var8;
        k30 k30Var9 = new k30(8, 8, "CANCEL");
        f81258i = k30Var9;
        k30[] k30VarArr = {k30Var, k30Var2, k30Var3, k30Var4, k30Var5, k30Var6, k30Var7, k30Var8, k30Var9, new k30(9, 9, "COMPRESSION_ERROR"), new k30(10, 10, "CONNECT_ERROR"), new k30(11, 11, "ENHANCE_YOUR_CALM"), new k30(12, 12, "INADEQUATE_SECURITY"), new k30(13, 13, "HTTP_1_1_REQUIRED")};
        f81259j = k30VarArr;
        C44401b.m3113a(k30VarArr);
        f81252c = new C30697a(0);
    }

    private k30(int i, int i2, String str) {
        this.f81260b = i2;
    }

    public static k30 valueOf(String str) {
        return (k30) Enum.valueOf(k30.class, str);
    }

    public static k30[] values() {
        return (k30[]) f81259j.clone();
    }

    /* renamed from: a */
    public final int m32676a() {
        return this.f81260b;
    }
}
