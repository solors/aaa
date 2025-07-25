package com.mobilefuse.sdk.network.model;

import com.mobilefuse.sdk.video.ClickthroughBehaviour;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MfxBidResponse.kt */
@Metadata
/* loaded from: classes7.dex */
public final class MfxBidResponse {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final String adm;
    @Nullable
    private final Float blockSkipSeconds;
    @Nullable
    private final ClickthroughBehaviour clickBehavior;
    private final double cpm;
    @Nullable
    private final AdmCreativeFormat creativeFormat;
    @NotNull
    private final String crid;
    @Nullable
    private final Float endCardCloseSeconds;
    private final int expires;
    @Nullable
    private final Float forceSkipSeconds;
    @NotNull

    /* renamed from: id */
    private final String f61699id;
    @Nullable
    private final String lossUrl;
    @Nullable
    private final Integer maxEndCards;
    @Nullable
    private final Boolean muted;
    @NotNull
    private final AdmMediaType type;

    /* compiled from: MfxBidResponse.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public MfxBidResponse(@NotNull String id2, double d, @NotNull String crid, @NotNull AdmMediaType type, @NotNull String adm, int i, @Nullable AdmCreativeFormat admCreativeFormat, @Nullable String str, @Nullable Boolean bool, @Nullable ClickthroughBehaviour clickthroughBehaviour, @Nullable Integer num, @Nullable Float f, @Nullable Float f2, @Nullable Float f3) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(crid, "crid");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(adm, "adm");
        this.f61699id = id2;
        this.cpm = d;
        this.crid = crid;
        this.type = type;
        this.adm = adm;
        this.expires = i;
        this.creativeFormat = admCreativeFormat;
        this.lossUrl = str;
        this.muted = bool;
        this.clickBehavior = clickthroughBehaviour;
        this.maxEndCards = num;
        this.endCardCloseSeconds = f;
        this.forceSkipSeconds = f2;
        this.blockSkipSeconds = f3;
    }

    @NotNull
    public final String component1() {
        return this.f61699id;
    }

    @Nullable
    public final ClickthroughBehaviour component10() {
        return this.clickBehavior;
    }

    @Nullable
    public final Integer component11() {
        return this.maxEndCards;
    }

    @Nullable
    public final Float component12() {
        return this.endCardCloseSeconds;
    }

    @Nullable
    public final Float component13() {
        return this.forceSkipSeconds;
    }

    @Nullable
    public final Float component14() {
        return this.blockSkipSeconds;
    }

    public final double component2() {
        return this.cpm;
    }

    @NotNull
    public final String component3() {
        return this.crid;
    }

    @NotNull
    public final AdmMediaType component4() {
        return this.type;
    }

    @NotNull
    public final String component5() {
        return this.adm;
    }

    public final int component6() {
        return this.expires;
    }

    @Nullable
    public final AdmCreativeFormat component7() {
        return this.creativeFormat;
    }

    @Nullable
    public final String component8() {
        return this.lossUrl;
    }

    @Nullable
    public final Boolean component9() {
        return this.muted;
    }

    @NotNull
    public final MfxBidResponse copy(@NotNull String id2, double d, @NotNull String crid, @NotNull AdmMediaType type, @NotNull String adm, int i, @Nullable AdmCreativeFormat admCreativeFormat, @Nullable String str, @Nullable Boolean bool, @Nullable ClickthroughBehaviour clickthroughBehaviour, @Nullable Integer num, @Nullable Float f, @Nullable Float f2, @Nullable Float f3) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(crid, "crid");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(adm, "adm");
        return new MfxBidResponse(id2, d, crid, type, adm, i, admCreativeFormat, str, bool, clickthroughBehaviour, num, f, f2, f3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof MfxBidResponse) {
                MfxBidResponse mfxBidResponse = (MfxBidResponse) obj;
                if (!Intrinsics.m17075f(this.f61699id, mfxBidResponse.f61699id) || Double.compare(this.cpm, mfxBidResponse.cpm) != 0 || !Intrinsics.m17075f(this.crid, mfxBidResponse.crid) || !Intrinsics.m17075f(this.type, mfxBidResponse.type) || !Intrinsics.m17075f(this.adm, mfxBidResponse.adm) || this.expires != mfxBidResponse.expires || !Intrinsics.m17075f(this.creativeFormat, mfxBidResponse.creativeFormat) || !Intrinsics.m17075f(this.lossUrl, mfxBidResponse.lossUrl) || !Intrinsics.m17075f(this.muted, mfxBidResponse.muted) || !Intrinsics.m17075f(this.clickBehavior, mfxBidResponse.clickBehavior) || !Intrinsics.m17075f(this.maxEndCards, mfxBidResponse.maxEndCards) || !Intrinsics.m17075f(this.endCardCloseSeconds, mfxBidResponse.endCardCloseSeconds) || !Intrinsics.m17075f(this.forceSkipSeconds, mfxBidResponse.forceSkipSeconds) || !Intrinsics.m17075f(this.blockSkipSeconds, mfxBidResponse.blockSkipSeconds)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @NotNull
    public final String getAdm() {
        return this.adm;
    }

    @Nullable
    public final Float getBlockSkipSeconds() {
        return this.blockSkipSeconds;
    }

    @Nullable
    public final ClickthroughBehaviour getClickBehavior() {
        return this.clickBehavior;
    }

    public final double getCpm() {
        return this.cpm;
    }

    @Nullable
    public final AdmCreativeFormat getCreativeFormat() {
        return this.creativeFormat;
    }

    @NotNull
    public final String getCrid() {
        return this.crid;
    }

    @Nullable
    public final Float getEndCardCloseSeconds() {
        return this.endCardCloseSeconds;
    }

    public final int getExpires() {
        return this.expires;
    }

    @Nullable
    public final Float getForceSkipSeconds() {
        return this.forceSkipSeconds;
    }

    @NotNull
    public final String getId() {
        return this.f61699id;
    }

    @Nullable
    public final String getLossUrl() {
        return this.lossUrl;
    }

    @Nullable
    public final Integer getMaxEndCards() {
        return this.maxEndCards;
    }

    @Nullable
    public final Boolean getMuted() {
        return this.muted;
    }

    @NotNull
    public final AdmMediaType getType() {
        return this.type;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        String str = this.f61699id;
        int i12 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int hashCode = ((i * 31) + Double.hashCode(this.cpm)) * 31;
        String str2 = this.crid;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i13 = (hashCode + i2) * 31;
        AdmMediaType admMediaType = this.type;
        if (admMediaType != null) {
            i3 = admMediaType.hashCode();
        } else {
            i3 = 0;
        }
        int i14 = (i13 + i3) * 31;
        String str3 = this.adm;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int hashCode2 = (((i14 + i4) * 31) + Integer.hashCode(this.expires)) * 31;
        AdmCreativeFormat admCreativeFormat = this.creativeFormat;
        if (admCreativeFormat != null) {
            i5 = admCreativeFormat.hashCode();
        } else {
            i5 = 0;
        }
        int i15 = (hashCode2 + i5) * 31;
        String str4 = this.lossUrl;
        if (str4 != null) {
            i6 = str4.hashCode();
        } else {
            i6 = 0;
        }
        int i16 = (i15 + i6) * 31;
        Boolean bool = this.muted;
        if (bool != null) {
            i7 = bool.hashCode();
        } else {
            i7 = 0;
        }
        int i17 = (i16 + i7) * 31;
        ClickthroughBehaviour clickthroughBehaviour = this.clickBehavior;
        if (clickthroughBehaviour != null) {
            i8 = clickthroughBehaviour.hashCode();
        } else {
            i8 = 0;
        }
        int i18 = (i17 + i8) * 31;
        Integer num = this.maxEndCards;
        if (num != null) {
            i9 = num.hashCode();
        } else {
            i9 = 0;
        }
        int i19 = (i18 + i9) * 31;
        Float f = this.endCardCloseSeconds;
        if (f != null) {
            i10 = f.hashCode();
        } else {
            i10 = 0;
        }
        int i20 = (i19 + i10) * 31;
        Float f2 = this.forceSkipSeconds;
        if (f2 != null) {
            i11 = f2.hashCode();
        } else {
            i11 = 0;
        }
        int i21 = (i20 + i11) * 31;
        Float f3 = this.blockSkipSeconds;
        if (f3 != null) {
            i12 = f3.hashCode();
        }
        return i21 + i12;
    }

    @NotNull
    public String toString() {
        return "MfxBidResponse(id=" + this.f61699id + ", cpm=" + this.cpm + ", crid=" + this.crid + ", type=" + this.type + ", adm=" + this.adm + ", expires=" + this.expires + ", creativeFormat=" + this.creativeFormat + ", lossUrl=" + this.lossUrl + ", muted=" + this.muted + ", clickBehavior=" + this.clickBehavior + ", maxEndCards=" + this.maxEndCards + ", endCardCloseSeconds=" + this.endCardCloseSeconds + ", forceSkipSeconds=" + this.forceSkipSeconds + ", blockSkipSeconds=" + this.blockSkipSeconds + ")";
    }
}
