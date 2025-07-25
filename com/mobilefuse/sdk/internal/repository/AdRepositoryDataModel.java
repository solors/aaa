package com.mobilefuse.sdk.internal.repository;

import com.mobilefuse.sdk.config.ObservableConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.mobilefuse.sdk.internal.repository.AdLoadingConfig */
/* loaded from: classes7.dex */
public final class AdRepositoryDataModel {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static int configUid = 1;
    private final int adHeight;
    private final int adInstanceId;
    @NotNull
    private final String adType;
    private final int adWidth;
    private final boolean isTestMode;
    @NotNull
    private final ObservableConfig observable;
    @NotNull
    private final String placementId;
    private final int uid;

    /* compiled from: AdRepositoryDataModel.kt */
    @Metadata
    /* renamed from: com.mobilefuse.sdk.internal.repository.AdLoadingConfig$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int nextConfigUid() {
            int i = AdRepositoryDataModel.configUid;
            AdRepositoryDataModel.configUid = i + 1;
            return i;
        }
    }

    public AdRepositoryDataModel(int i, @NotNull ObservableConfig observable, int i2, int i3, boolean z, @NotNull String adType, @NotNull String placementId, int i4) {
        Intrinsics.checkNotNullParameter(observable, "observable");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        this.uid = i;
        this.observable = observable;
        this.adWidth = i2;
        this.adHeight = i3;
        this.isTestMode = z;
        this.adType = adType;
        this.placementId = placementId;
        this.adInstanceId = i4;
    }

    public static /* synthetic */ AdRepositoryDataModel copy$default(AdRepositoryDataModel adRepositoryDataModel, int i, ObservableConfig observableConfig, int i2, int i3, boolean z, String str, String str2, int i4, int i5, Object obj) {
        int i6;
        ObservableConfig observableConfig2;
        int i7;
        int i8;
        boolean z2;
        String str3;
        String str4;
        int i9;
        if ((i5 & 1) != 0) {
            i6 = adRepositoryDataModel.uid;
        } else {
            i6 = i;
        }
        if ((i5 & 2) != 0) {
            observableConfig2 = adRepositoryDataModel.observable;
        } else {
            observableConfig2 = observableConfig;
        }
        if ((i5 & 4) != 0) {
            i7 = adRepositoryDataModel.adWidth;
        } else {
            i7 = i2;
        }
        if ((i5 & 8) != 0) {
            i8 = adRepositoryDataModel.adHeight;
        } else {
            i8 = i3;
        }
        if ((i5 & 16) != 0) {
            z2 = adRepositoryDataModel.isTestMode;
        } else {
            z2 = z;
        }
        if ((i5 & 32) != 0) {
            str3 = adRepositoryDataModel.adType;
        } else {
            str3 = str;
        }
        if ((i5 & 64) != 0) {
            str4 = adRepositoryDataModel.placementId;
        } else {
            str4 = str2;
        }
        if ((i5 & 128) != 0) {
            i9 = adRepositoryDataModel.adInstanceId;
        } else {
            i9 = i4;
        }
        return adRepositoryDataModel.copy(i6, observableConfig2, i7, i8, z2, str3, str4, i9);
    }

    public final int component1() {
        return this.uid;
    }

    @NotNull
    public final ObservableConfig component2() {
        return this.observable;
    }

    public final int component3() {
        return this.adWidth;
    }

    public final int component4() {
        return this.adHeight;
    }

    public final boolean component5() {
        return this.isTestMode;
    }

    @NotNull
    public final String component6() {
        return this.adType;
    }

    @NotNull
    public final String component7() {
        return this.placementId;
    }

    public final int component8() {
        return this.adInstanceId;
    }

    @NotNull
    public final AdRepositoryDataModel copy(int i, @NotNull ObservableConfig observable, int i2, int i3, boolean z, @NotNull String adType, @NotNull String placementId, int i4) {
        Intrinsics.checkNotNullParameter(observable, "observable");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        return new AdRepositoryDataModel(i, observable, i2, i3, z, adType, placementId, i4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof AdRepositoryDataModel) {
                AdRepositoryDataModel adRepositoryDataModel = (AdRepositoryDataModel) obj;
                if (this.uid != adRepositoryDataModel.uid || !Intrinsics.m17075f(this.observable, adRepositoryDataModel.observable) || this.adWidth != adRepositoryDataModel.adWidth || this.adHeight != adRepositoryDataModel.adHeight || this.isTestMode != adRepositoryDataModel.isTestMode || !Intrinsics.m17075f(this.adType, adRepositoryDataModel.adType) || !Intrinsics.m17075f(this.placementId, adRepositoryDataModel.placementId) || this.adInstanceId != adRepositoryDataModel.adInstanceId) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int getAdHeight() {
        return this.adHeight;
    }

    public final int getAdInstanceId() {
        return this.adInstanceId;
    }

    @NotNull
    public final String getAdType() {
        return this.adType;
    }

    public final int getAdWidth() {
        return this.adWidth;
    }

    @NotNull
    public final ObservableConfig getObservable() {
        return this.observable;
    }

    @NotNull
    public final String getPlacementId() {
        return this.placementId;
    }

    public final int getUid() {
        return this.uid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i;
        int i2;
        int hashCode = Integer.hashCode(this.uid) * 31;
        ObservableConfig observableConfig = this.observable;
        int i3 = 0;
        if (observableConfig != null) {
            i = observableConfig.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = (((((hashCode + i) * 31) + Integer.hashCode(this.adWidth)) * 31) + Integer.hashCode(this.adHeight)) * 31;
        boolean z = this.isTestMode;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        int i5 = (hashCode2 + i4) * 31;
        String str = this.adType;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        String str2 = this.placementId;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return ((i6 + i3) * 31) + Integer.hashCode(this.adInstanceId);
    }

    public final boolean isTestMode() {
        return this.isTestMode;
    }

    @NotNull
    public String toString() {
        return "AdLoadingConfig(uid=" + this.uid + ", observable=" + this.observable + ", adWidth=" + this.adWidth + ", adHeight=" + this.adHeight + ", isTestMode=" + this.isTestMode + ", adType=" + this.adType + ", placementId=" + this.placementId + ", adInstanceId=" + this.adInstanceId + ")";
    }

    public /* synthetic */ AdRepositoryDataModel(int i, ObservableConfig observableConfig, int i2, int i3, boolean z, String str, String str2, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? Companion.nextConfigUid() : i, observableConfig, (i5 & 4) != 0 ? 1 : i2, (i5 & 8) != 0 ? 1 : i3, z, str, str2, i4);
    }
}
