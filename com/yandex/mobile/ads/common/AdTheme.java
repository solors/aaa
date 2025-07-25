package com.yandex.mobile.ads.common;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import td.C44401b;
import td.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata
/* loaded from: classes8.dex */
public final class AdTheme {
    public static final AdTheme DARK;
    public static final AdTheme LIGHT;

    /* renamed from: c */
    private static final /* synthetic */ AdTheme[] f76560c;

    /* renamed from: d */
    private static final /* synthetic */ EnumEntries f76561d;
    @NotNull

    /* renamed from: b */
    private final String f76562b;

    static {
        AdTheme adTheme = new AdTheme(0, "LIGHT", "light");
        LIGHT = adTheme;
        AdTheme adTheme2 = new AdTheme(1, "DARK", "dark");
        DARK = adTheme2;
        AdTheme[] adThemeArr = {adTheme, adTheme2};
        f76560c = adThemeArr;
        f76561d = C44401b.m3113a(adThemeArr);
    }

    private AdTheme(int i, String str, String str2) {
        this.f76562b = str2;
    }

    @NotNull
    public static EnumEntries<AdTheme> getEntries() {
        return f76561d;
    }

    public static AdTheme valueOf(String str) {
        return (AdTheme) Enum.valueOf(AdTheme.class, str);
    }

    public static AdTheme[] values() {
        return (AdTheme[]) f76560c.clone();
    }

    @NotNull
    public final String getValue() {
        return this.f76562b;
    }
}
