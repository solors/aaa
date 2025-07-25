package com.yandex.mobile.ads.impl;

import androidx.core.app.NotificationCompat;
import com.facebook.share.internal.ShareConstants;
import org.jetbrains.annotations.NotNull;
import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class xm1 {

    /* renamed from: c */
    public static final xm1 f87744c;

    /* renamed from: d */
    public static final xm1 f87745d;

    /* renamed from: e */
    private static final /* synthetic */ xm1[] f87746e;
    @NotNull

    /* renamed from: b */
    private final String f87747b;

    static {
        xm1 xm1Var = new xm1(0, "CONTENT", "content");
        f87744c = xm1Var;
        xm1 xm1Var2 = new xm1(1, "APP_INSTALL", "app");
        f87745d = xm1Var2;
        xm1[] xm1VarArr = {xm1Var, xm1Var2, new xm1(2, ShareConstants.IMAGE_URL, "image"), new xm1(3, "PROMO", NotificationCompat.CATEGORY_PROMO)};
        f87746e = xm1VarArr;
        C44401b.m3113a(xm1VarArr);
    }

    private xm1(int i, String str, String str2) {
        this.f87747b = str2;
    }

    public static xm1 valueOf(String str) {
        return (xm1) Enum.valueOf(xm1.class, str);
    }

    public static xm1[] values() {
        return (xm1[]) f87746e.clone();
    }

    @NotNull
    /* renamed from: a */
    public final String m27455a() {
        return this.f87747b;
    }
}
