package com.mobilefuse.sdk.identity;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.mobilefuse.sdk.identity.EidSdkData */
/* loaded from: classes7.dex */
public final class EidDataModel {
    @Nullable
    private final String mfxPayload;
    private final long mfxRefreshTimestamp;
    @NotNull
    private final Map<String, String> sdkEids;
    @Nullable
    private final String userPayload;

    public EidDataModel() {
        this(0L, null, null, null, 15, null);
    }

    public static /* synthetic */ EidDataModel copy$default(EidDataModel eidDataModel, long j, Map map, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = eidDataModel.mfxRefreshTimestamp;
        }
        long j2 = j;
        Map<String, String> map2 = map;
        if ((i & 2) != 0) {
            map2 = eidDataModel.sdkEids;
        }
        Map map3 = map2;
        if ((i & 4) != 0) {
            str = eidDataModel.mfxPayload;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = eidDataModel.userPayload;
        }
        return eidDataModel.copy(j2, map3, str3, str2);
    }

    public final long component1() {
        return this.mfxRefreshTimestamp;
    }

    @NotNull
    public final Map<String, String> component2() {
        return this.sdkEids;
    }

    @Nullable
    public final String component3() {
        return this.mfxPayload;
    }

    @Nullable
    public final String component4() {
        return this.userPayload;
    }

    @NotNull
    public final EidDataModel copy(long j, @NotNull Map<String, String> sdkEids, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(sdkEids, "sdkEids");
        return new EidDataModel(j, sdkEids, str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof EidDataModel) {
                EidDataModel eidDataModel = (EidDataModel) obj;
                if (this.mfxRefreshTimestamp != eidDataModel.mfxRefreshTimestamp || !Intrinsics.m17075f(this.sdkEids, eidDataModel.sdkEids) || !Intrinsics.m17075f(this.mfxPayload, eidDataModel.mfxPayload) || !Intrinsics.m17075f(this.userPayload, eidDataModel.userPayload)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Nullable
    public final String getMfxPayload() {
        return this.mfxPayload;
    }

    public final long getMfxRefreshTimestamp() {
        return this.mfxRefreshTimestamp;
    }

    @NotNull
    public final Map<String, String> getSdkEids() {
        return this.sdkEids;
    }

    @Nullable
    public final String getUserPayload() {
        return this.userPayload;
    }

    public int hashCode() {
        int i;
        int i2;
        int hashCode = Long.hashCode(this.mfxRefreshTimestamp) * 31;
        Map<String, String> map = this.sdkEids;
        int i3 = 0;
        if (map != null) {
            i = map.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        String str = this.mfxPayload;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str2 = this.userPayload;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return i5 + i3;
    }

    @NotNull
    public String toString() {
        return "EidSdkData(mfxRefreshTimestamp=" + this.mfxRefreshTimestamp + ", sdkEids=" + this.sdkEids + ", mfxPayload=" + this.mfxPayload + ", userPayload=" + this.userPayload + ")";
    }

    public EidDataModel(long j, @NotNull Map<String, String> sdkEids, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(sdkEids, "sdkEids");
        this.mfxRefreshTimestamp = j;
        this.sdkEids = sdkEids;
        this.mfxPayload = str;
        this.userPayload = str2;
    }

    public /* synthetic */ EidDataModel(long j, Map map, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1L : j, (i & 2) != 0 ? C37559r0.m17284j() : map, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }
}
