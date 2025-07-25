package com.yandex.mobile.ads.impl;

import androidx.core.app.NotificationCompat;
import org.jetbrains.annotations.NotNull;
import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class r61 {

    /* renamed from: c */
    public static final r61 f84647c;

    /* renamed from: d */
    public static final r61 f84648d;

    /* renamed from: e */
    private static final /* synthetic */ r61[] f84649e;
    @NotNull

    /* renamed from: b */
    private final String f84650b;

    static {
        r61 r61Var = new r61(0, "AD", "ad");
        f84647c = r61Var;
        r61 r61Var2 = new r61(1, "PROMO", NotificationCompat.CATEGORY_PROMO);
        f84648d = r61Var2;
        r61[] r61VarArr = {r61Var, r61Var2};
        f84649e = r61VarArr;
        C44401b.m3113a(r61VarArr);
    }

    private r61(int i, String str, String str2) {
        this.f84650b = str2;
    }

    public static r61 valueOf(String str) {
        return (r61) Enum.valueOf(r61.class, str);
    }

    public static r61[] values() {
        return (r61[]) f84649e.clone();
    }

    @NotNull
    /* renamed from: a */
    public final String m30136a() {
        return this.f84650b;
    }
}
