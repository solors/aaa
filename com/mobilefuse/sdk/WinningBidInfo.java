package com.mobilefuse.sdk;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WinningBidInfo.kt */
@Metadata
/* loaded from: classes7.dex */
public final class WinningBidInfo {
    @NotNull
    public static final String CURRENCY_USD = "USD";
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final String DEFAULT_CURRENCY = "USD";
    private final float cpmPrice;
    @NotNull
    private final String creativeId;
    @NotNull
    private final String currency;

    /* compiled from: WinningBidInfo.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public WinningBidInfo(float f, @NotNull String str) {
        this(f, str, null, 4, null);
    }

    public static /* synthetic */ WinningBidInfo copy$default(WinningBidInfo winningBidInfo, float f, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = winningBidInfo.cpmPrice;
        }
        if ((i & 2) != 0) {
            str = winningBidInfo.creativeId;
        }
        if ((i & 4) != 0) {
            str2 = winningBidInfo.currency;
        }
        return winningBidInfo.copy(f, str, str2);
    }

    public final float component1() {
        return this.cpmPrice;
    }

    @NotNull
    public final String component2() {
        return this.creativeId;
    }

    @NotNull
    public final String component3() {
        return this.currency;
    }

    @NotNull
    public final WinningBidInfo copy(float f, @NotNull String creativeId, @NotNull String currency) {
        Intrinsics.checkNotNullParameter(creativeId, "creativeId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new WinningBidInfo(f, creativeId, currency);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof WinningBidInfo) {
                WinningBidInfo winningBidInfo = (WinningBidInfo) obj;
                if (Float.compare(this.cpmPrice, winningBidInfo.cpmPrice) != 0 || !Intrinsics.m17075f(this.creativeId, winningBidInfo.creativeId) || !Intrinsics.m17075f(this.currency, winningBidInfo.currency)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final float getCpmPrice() {
        return this.cpmPrice;
    }

    @NotNull
    public final String getCreativeId() {
        return this.creativeId;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    public int hashCode() {
        int i;
        int hashCode = Float.hashCode(this.cpmPrice) * 31;
        String str = this.creativeId;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        String str2 = this.currency;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    @NotNull
    public String toString() {
        return "WinningBidInfo(cpmPrice=" + this.cpmPrice + ", creativeId=" + this.creativeId + ", currency=" + this.currency + ")";
    }

    public WinningBidInfo(float f, @NotNull String creativeId, @NotNull String currency) {
        Intrinsics.checkNotNullParameter(creativeId, "creativeId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.cpmPrice = f;
        this.creativeId = creativeId;
        this.currency = currency;
    }

    public /* synthetic */ WinningBidInfo(float f, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, str, (i & 4) != 0 ? "USD" : str2);
    }
}
