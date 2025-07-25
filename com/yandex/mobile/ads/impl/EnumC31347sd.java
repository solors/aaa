package com.yandex.mobile.ads.impl;

import com.google.firebase.analytics.FirebaseAnalytics;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.jetbrains.annotations.NotNull;
import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.yandex.mobile.ads.impl.sd */
/* loaded from: classes8.dex */
public final class EnumC31347sd {

    /* renamed from: c */
    public static final EnumC31347sd f85177c;

    /* renamed from: d */
    public static final EnumC31347sd f85178d;

    /* renamed from: e */
    public static final EnumC31347sd f85179e;

    /* renamed from: f */
    public static final EnumC31347sd f85180f;

    /* renamed from: g */
    public static final EnumC31347sd f85181g;

    /* renamed from: h */
    public static final EnumC31347sd f85182h;

    /* renamed from: i */
    private static final /* synthetic */ EnumC31347sd[] f85183i;
    @NotNull

    /* renamed from: b */
    private final String f85184b;

    static {
        EnumC31347sd enumC31347sd = new EnumC31347sd(0, "AD_REQUEST", Reporting.Key.AD_REQUEST);
        f85177c = enumC31347sd;
        EnumC31347sd enumC31347sd2 = new EnumC31347sd(1, "AD_ATTEMPT", "ad_attempt");
        f85178d = enumC31347sd2;
        EnumC31347sd enumC31347sd3 = new EnumC31347sd(2, "AD_FILLED_REQUEST", "ad_filled_request");
        f85179e = enumC31347sd3;
        EnumC31347sd enumC31347sd4 = new EnumC31347sd(3, "AD_IMPRESSION", FirebaseAnalytics.Event.AD_IMPRESSION);
        f85180f = enumC31347sd4;
        EnumC31347sd enumC31347sd5 = new EnumC31347sd(4, "AD_CLICK", "ad_click");
        f85181g = enumC31347sd5;
        EnumC31347sd enumC31347sd6 = new EnumC31347sd(5, "AD_REWARD", "ad_reward");
        f85182h = enumC31347sd6;
        EnumC31347sd[] enumC31347sdArr = {enumC31347sd, enumC31347sd2, enumC31347sd3, enumC31347sd4, enumC31347sd5, enumC31347sd6};
        f85183i = enumC31347sdArr;
        C44401b.m3113a(enumC31347sdArr);
    }

    private EnumC31347sd(int i, String str, String str2) {
        this.f85184b = str2;
    }

    public static EnumC31347sd valueOf(String str) {
        return (EnumC31347sd) Enum.valueOf(EnumC31347sd.class, str);
    }

    public static EnumC31347sd[] values() {
        return (EnumC31347sd[]) f85183i.clone();
    }

    @NotNull
    /* renamed from: a */
    public final String m29644a() {
        return this.f85184b;
    }
}
