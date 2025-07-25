package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class lz0 {
    @NotNull

    /* renamed from: c */
    public static final C30816a f81975c;

    /* renamed from: d */
    public static final lz0 f81976d;

    /* renamed from: e */
    private static final /* synthetic */ lz0[] f81977e;
    @NotNull

    /* renamed from: b */
    private final String f81978b;

    /* renamed from: com.yandex.mobile.ads.impl.lz0$a */
    /* loaded from: classes8.dex */
    public static final class C30816a {
        private C30816a() {
        }

        @NotNull
        /* renamed from: a */
        public static lz0 m32186a(@Nullable String str) {
            lz0[] values;
            for (lz0 lz0Var : lz0.values()) {
                if (Intrinsics.m17075f(lz0Var.m32187a(), str)) {
                    return lz0Var;
                }
            }
            return lz0.f81976d;
        }

        public /* synthetic */ C30816a(int i) {
            this();
        }
    }

    static {
        lz0 lz0Var = new lz0(0, "AD_VIDEO_COMPLETE", "advideocomplete");
        lz0 lz0Var2 = new lz0(1, "IMPRESSION_TRACKING_START", "impressionTrackingStart");
        lz0 lz0Var3 = new lz0(2, "IMPRESSION_TRACKING_SUCCESS", "impressionTrackingSuccess");
        lz0 lz0Var4 = new lz0(3, "CLOSE", "close");
        lz0 lz0Var5 = new lz0(4, "OPEN", "open");
        lz0 lz0Var6 = new lz0(5, "REWARDED_AD_COMPLETE", "rewardedAdComplete");
        lz0 lz0Var7 = new lz0(6, "USE_CUSTOM_CLOSE", "usecustomclose");
        lz0 lz0Var8 = new lz0(7, "UNSPECIFIED", "");
        f81976d = lz0Var8;
        lz0[] lz0VarArr = {lz0Var, lz0Var2, lz0Var3, lz0Var4, lz0Var5, lz0Var6, lz0Var7, lz0Var8};
        f81977e = lz0VarArr;
        C44401b.m3113a(lz0VarArr);
        f81975c = new C30816a(0);
    }

    private lz0(int i, String str, String str2) {
        this.f81978b = str2;
    }

    public static lz0 valueOf(String str) {
        return (lz0) Enum.valueOf(lz0.class, str);
    }

    public static lz0[] values() {
        return (lz0[]) f81977e.clone();
    }

    @NotNull
    /* renamed from: a */
    public final String m32187a() {
        return this.f81978b;
    }
}
