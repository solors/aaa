package com.applovin.sdk;

import com.ironsource.mediationsdk.C20410l;
import java.util.Locale;

/* loaded from: classes2.dex */
public class AppLovinAdSize {
    public static final int SPAN = -1;

    /* renamed from: a */
    private final String f12876a;

    /* renamed from: b */
    private final int f12877b;

    /* renamed from: c */
    private final int f12878c;
    public static final AppLovinAdSize BANNER = new AppLovinAdSize(-1, 50, C20410l.f51629a);
    public static final AppLovinAdSize LEADER = new AppLovinAdSize(-1, 90, "LEADER");
    public static final AppLovinAdSize MREC = new AppLovinAdSize(300, 250, "MREC");
    public static final AppLovinAdSize INTERSTITIAL = new AppLovinAdSize(-1, -1, "INTER");
    public static final AppLovinAdSize NATIVE = new AppLovinAdSize(-1, -1, "NATIVE");

    private AppLovinAdSize(int i, int i2, String str) {
        this.f12877b = i;
        this.f12878c = i2;
        this.f12876a = str;
    }

    public static AppLovinAdSize fromString(String str) {
        if (C20410l.f51629a.equalsIgnoreCase(str)) {
            return BANNER;
        }
        if ("MREC".equalsIgnoreCase(str)) {
            return MREC;
        }
        if ("LEADER".equalsIgnoreCase(str)) {
            return LEADER;
        }
        if (!"INTERSTITIAL".equalsIgnoreCase(str) && !"INTER".equalsIgnoreCase(str)) {
            if ("NATIVE".equalsIgnoreCase(str)) {
                return NATIVE;
            }
            throw new IllegalArgumentException("Unknown Ad Size: " + str);
        }
        return INTERSTITIAL;
    }

    public int getHeight() {
        return this.f12878c;
    }

    public String getLabel() {
        return this.f12876a.toUpperCase(Locale.ENGLISH);
    }

    public int getWidth() {
        return this.f12877b;
    }

    public String toString() {
        return getLabel();
    }
}
