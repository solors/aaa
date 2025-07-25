package com.applovin.mediation.nativeAds.adPlacer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.C5434n;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes2.dex */
public class MaxAdPlacerSettings {
    public static final int MIN_REPEATING_INTERVAL = 2;

    /* renamed from: a */
    private final String f12794a;

    /* renamed from: b */
    private String f12795b;

    /* renamed from: c */
    private final Set f12796c = new TreeSet();

    /* renamed from: d */
    private int f12797d = 0;

    /* renamed from: e */
    private int f12798e = 256;

    /* renamed from: f */
    private int f12799f = 4;

    public MaxAdPlacerSettings(String str) {
        this.f12794a = str;
    }

    public void addFixedPosition(int i) {
        this.f12796c.add(Integer.valueOf(i));
    }

    public String getAdUnitId() {
        return this.f12794a;
    }

    public Set<Integer> getFixedPositions() {
        return this.f12796c;
    }

    public int getMaxAdCount() {
        return this.f12798e;
    }

    public int getMaxPreloadedAdCount() {
        return this.f12799f;
    }

    @Nullable
    public String getPlacement() {
        return this.f12795b;
    }

    public int getRepeatingInterval() {
        return this.f12797d;
    }

    public boolean hasValidPositioning() {
        if (this.f12796c.isEmpty() && !isRepeatingEnabled()) {
            return false;
        }
        return true;
    }

    public boolean isRepeatingEnabled() {
        if (this.f12797d >= 2) {
            return true;
        }
        return false;
    }

    public void resetFixedPositions() {
        this.f12796c.clear();
    }

    public void setMaxAdCount(int i) {
        this.f12798e = i;
    }

    public void setMaxPreloadedAdCount(int i) {
        this.f12799f = i;
    }

    public void setPlacement(@Nullable String str) {
        this.f12795b = str;
    }

    public void setRepeatingInterval(int i) {
        if (i >= 2) {
            this.f12797d = i;
            C5434n.m94899g("MaxAdPlacerSettings", "Repeating interval set to " + i);
            return;
        }
        this.f12797d = 0;
        C5434n.m94896j("MaxAdPlacerSettings", "Repeating interval has been disabled, since it has been set to " + i + ", which is less than minimum value of 2");
    }

    @NonNull
    public String toString() {
        return "MaxAdPlacerSettings{adUnitId='" + this.f12794a + "', fixedPositions=" + this.f12796c + ", repeatingInterval=" + this.f12797d + ", maxAdCount=" + this.f12798e + ", maxPreloadedAdCount=" + this.f12799f + '}';
    }
}
