package com.inmobi.ads;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes6.dex */
public final class WatermarkData {
    private float alpha;
    @NotNull
    private final String watermarkBase64EncodedString;

    public WatermarkData(@NotNull String watermarkBase64EncodedString, float f) {
        Intrinsics.checkNotNullParameter(watermarkBase64EncodedString, "watermarkBase64EncodedString");
        this.watermarkBase64EncodedString = watermarkBase64EncodedString;
        this.alpha = f;
    }

    public static /* synthetic */ WatermarkData copy$default(WatermarkData watermarkData, String str, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = watermarkData.watermarkBase64EncodedString;
        }
        if ((i & 2) != 0) {
            f = watermarkData.alpha;
        }
        return watermarkData.copy(str, f);
    }

    @NotNull
    public final String component1() {
        return this.watermarkBase64EncodedString;
    }

    public final float component2() {
        return this.alpha;
    }

    @NotNull
    public final WatermarkData copy(@NotNull String watermarkBase64EncodedString, float f) {
        Intrinsics.checkNotNullParameter(watermarkBase64EncodedString, "watermarkBase64EncodedString");
        return new WatermarkData(watermarkBase64EncodedString, f);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WatermarkData)) {
            return false;
        }
        WatermarkData watermarkData = (WatermarkData) obj;
        if (Intrinsics.m17075f(this.watermarkBase64EncodedString, watermarkData.watermarkBase64EncodedString) && Float.compare(this.alpha, watermarkData.alpha) == 0) {
            return true;
        }
        return false;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    @NotNull
    public final String getWatermarkBase64EncodedString() {
        return this.watermarkBase64EncodedString;
    }

    public int hashCode() {
        return Float.hashCode(this.alpha) + (this.watermarkBase64EncodedString.hashCode() * 31);
    }

    public final void setAlpha(float f) {
        this.alpha = f;
    }

    @NotNull
    public String toString() {
        return "WatermarkData(watermarkBase64EncodedString=" + this.watermarkBase64EncodedString + ", alpha=" + this.alpha + ')';
    }

    public /* synthetic */ WatermarkData(String str, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? 1.0f : f);
    }
}
