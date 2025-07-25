package com.yandex.mobile.ads.impl;

import com.facebook.internal.AnalyticsEvents;
import org.jetbrains.annotations.NotNull;
import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.yandex.mobile.ads.impl.h6 */
/* loaded from: classes8.dex */
public final class EnumC30444h6 {

    /* renamed from: c */
    public static final EnumC30444h6 f79960c;

    /* renamed from: d */
    private static final /* synthetic */ EnumC30444h6[] f79961d;
    @NotNull

    /* renamed from: b */
    private final String f79962b;

    static {
        EnumC30444h6 enumC30444h6 = new EnumC30444h6(0, "AUTOMATIC", AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_AUTOMATIC);
        EnumC30444h6 enumC30444h62 = new EnumC30444h6(1, "MANUAL", "manual");
        f79960c = enumC30444h62;
        EnumC30444h6[] enumC30444h6Arr = {enumC30444h6, enumC30444h62};
        f79961d = enumC30444h6Arr;
        C44401b.m3113a(enumC30444h6Arr);
    }

    private EnumC30444h6(int i, String str, String str2) {
        this.f79962b = str2;
    }

    public static EnumC30444h6 valueOf(String str) {
        return (EnumC30444h6) Enum.valueOf(EnumC30444h6.class, str);
    }

    public static EnumC30444h6[] values() {
        return (EnumC30444h6[]) f79961d.clone();
    }

    @NotNull
    /* renamed from: a */
    public final String m33611a() {
        return this.f79962b;
    }
}
