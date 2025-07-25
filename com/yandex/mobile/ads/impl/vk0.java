package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class vk0 {
    @NotNull

    /* renamed from: c */
    public static final C31663a f86775c;
    @NotNull

    /* renamed from: d */
    private static final vk0 f86776d;

    /* renamed from: e */
    private static final /* synthetic */ vk0[] f86777e;
    @NotNull

    /* renamed from: b */
    private final String f86778b;

    /* renamed from: com.yandex.mobile.ads.impl.vk0$a */
    /* loaded from: classes8.dex */
    public static final class C31663a {
        private C31663a() {
        }

        public /* synthetic */ C31663a(int i) {
            this();
        }
    }

    static {
        vk0 vk0Var = new vk0(0, "DESIGN_V1", "design_v1");
        vk0[] vk0VarArr = {vk0Var, new vk0(1, "DESIGN_V2", "instream_design_v2")};
        f86777e = vk0VarArr;
        C44401b.m3113a(vk0VarArr);
        f86775c = new C31663a(0);
        f86776d = vk0Var;
    }

    private vk0(int i, String str, String str2) {
        this.f86778b = str2;
    }

    public static vk0 valueOf(String str) {
        return (vk0) Enum.valueOf(vk0.class, str);
    }

    public static vk0[] values() {
        return (vk0[]) f86777e.clone();
    }

    @NotNull
    /* renamed from: b */
    public final String m28293b() {
        return this.f86778b;
    }
}
