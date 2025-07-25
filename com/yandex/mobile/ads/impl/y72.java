package com.yandex.mobile.ads.impl;

import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class y72 {

    /* renamed from: b */
    public static final y72 f88089b;

    /* renamed from: c */
    public static final y72 f88090c;

    /* renamed from: d */
    public static final y72 f88091d;

    /* renamed from: e */
    public static final y72 f88092e;

    /* renamed from: f */
    public static final y72 f88093f;

    /* renamed from: g */
    public static final y72 f88094g;

    /* renamed from: h */
    public static final y72 f88095h;

    /* renamed from: i */
    public static final y72 f88096i;

    /* renamed from: j */
    public static final y72 f88097j;

    /* renamed from: k */
    public static final y72 f88098k;

    /* renamed from: l */
    private static final /* synthetic */ y72[] f88099l;

    static {
        y72 y72Var = new y72(0, "INITIAL");
        f88089b = y72Var;
        y72 y72Var2 = new y72(1, "PREPARING");
        f88090c = y72Var2;
        y72 y72Var3 = new y72(2, "PREPARED");
        f88091d = y72Var3;
        y72 y72Var4 = new y72(3, "PLAYING");
        f88092e = y72Var4;
        y72 y72Var5 = new y72(4, "STOPPED");
        f88093f = y72Var5;
        y72 y72Var6 = new y72(5, "FINISHED");
        f88094g = y72Var6;
        y72 y72Var7 = new y72(6, "PAUSED");
        f88095h = y72Var7;
        y72 y72Var8 = new y72(7, "BUFFERING");
        f88096i = y72Var8;
        y72 y72Var9 = new y72(8, "PLAYING_ERROR");
        f88097j = y72Var9;
        y72 y72Var10 = new y72(9, "PREPARING_ERROR");
        f88098k = y72Var10;
        y72[] y72VarArr = {y72Var, y72Var2, y72Var3, y72Var4, y72Var5, y72Var6, y72Var7, y72Var8, y72Var9, y72Var10};
        f88099l = y72VarArr;
        C44401b.m3113a(y72VarArr);
    }

    private y72(int i, String str) {
    }

    public static y72 valueOf(String str) {
        return (y72) Enum.valueOf(y72.class, str);
    }

    public static y72[] values() {
        return (y72[]) f88099l.clone();
    }
}
