package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class w71 {

    /* renamed from: c */
    public static final w71 f87136c;

    /* renamed from: d */
    private static final /* synthetic */ w71[] f87137d;
    @NotNull

    /* renamed from: b */
    private final String f87138b = "first_video_preloading_strategy";

    static {
        w71 w71Var = new w71();
        f87136c = w71Var;
        w71[] w71VarArr = {w71Var};
        f87137d = w71VarArr;
        C44401b.m3113a(w71VarArr);
    }

    private w71() {
    }

    public static w71 valueOf(String str) {
        return (w71) Enum.valueOf(w71.class, str);
    }

    public static w71[] values() {
        return (w71[]) f87137d.clone();
    }

    @NotNull
    /* renamed from: a */
    public final String m28017a() {
        return this.f87138b;
    }
}
