package com.amazon.aps.shared.metrics.model;

import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: ApsMetricsDeviceInfo.kt */
@Metadata
/* loaded from: classes2.dex */
public final class ApsMetricsDeviceInfo {
    @Nullable
    private String connectionType;
    @Nullable
    private String deviceType;
    @NotNull

    /* renamed from: os */
    private String f2882os;
    @NotNull
    private String platform;
    @Nullable
    private String platformCategory;
    @Nullable
    private String platformCategoryVersion;
    @Nullable
    private String screenSize;

    public ApsMetricsDeviceInfo() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ ApsMetricsDeviceInfo copy$default(ApsMetricsDeviceInfo apsMetricsDeviceInfo, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apsMetricsDeviceInfo.platformCategory;
        }
        if ((i & 2) != 0) {
            str2 = apsMetricsDeviceInfo.screenSize;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = apsMetricsDeviceInfo.deviceType;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = apsMetricsDeviceInfo.connectionType;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = apsMetricsDeviceInfo.platformCategoryVersion;
        }
        return apsMetricsDeviceInfo.copy(str, str6, str7, str8, str5);
    }

    @Nullable
    public final String component1() {
        return this.platformCategory;
    }

    @Nullable
    public final String component2() {
        return this.screenSize;
    }

    @Nullable
    public final String component3() {
        return this.deviceType;
    }

    @Nullable
    public final String component4() {
        return this.connectionType;
    }

    @Nullable
    public final String component5() {
        return this.platformCategoryVersion;
    }

    @NotNull
    public final ApsMetricsDeviceInfo copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        return new ApsMetricsDeviceInfo(str, str2, str3, str4, str5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApsMetricsDeviceInfo)) {
            return false;
        }
        ApsMetricsDeviceInfo apsMetricsDeviceInfo = (ApsMetricsDeviceInfo) obj;
        if (Intrinsics.m17075f(this.platformCategory, apsMetricsDeviceInfo.platformCategory) && Intrinsics.m17075f(this.screenSize, apsMetricsDeviceInfo.screenSize) && Intrinsics.m17075f(this.deviceType, apsMetricsDeviceInfo.deviceType) && Intrinsics.m17075f(this.connectionType, apsMetricsDeviceInfo.connectionType) && Intrinsics.m17075f(this.platformCategoryVersion, apsMetricsDeviceInfo.platformCategoryVersion)) {
            return true;
        }
        return false;
    }

    @Nullable
    public final String getConnectionType() {
        return this.connectionType;
    }

    @Nullable
    public final String getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    public final String getOs() {
        return this.f2882os;
    }

    @NotNull
    public final String getPlatform() {
        return this.platform;
    }

    @Nullable
    public final String getPlatformCategory() {
        return this.platformCategory;
    }

    @Nullable
    public final String getPlatformCategoryVersion() {
        return this.platformCategoryVersion;
    }

    @Nullable
    public final String getScreenSize() {
        return this.screenSize;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.platformCategory;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.screenSize;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.deviceType;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.connectionType;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str5 = this.platformCategoryVersion;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return i5 + i;
    }

    public final void setConnectionType(@Nullable String str) {
        this.connectionType = str;
    }

    public final void setDeviceType(@Nullable String str) {
        this.deviceType = str;
    }

    public final void setOs(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f2882os = str;
    }

    public final void setPlatform(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.platform = str;
    }

    public final void setPlatformCategory(@Nullable String str) {
        this.platformCategory = str;
    }

    public final void setPlatformCategoryVersion(@Nullable String str) {
        this.platformCategoryVersion = str;
    }

    public final void setScreenSize(@Nullable String str) {
        this.screenSize = str;
    }

    @NotNull
    public final JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("os", getOs());
        jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_PLATFORM, getPlatform());
        jSONObject.put("ov", String.valueOf(Build.VERSION.SDK_INT));
        jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_MANUFACTURER, Build.MANUFACTURER);
        jSONObject.put("md", Build.MODEL);
        String platformCategoryVersion = getPlatformCategoryVersion();
        if (platformCategoryVersion != null) {
            jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_PLATFORMCATEGORYVERSION, platformCategoryVersion);
        }
        String platformCategory = getPlatformCategory();
        if (platformCategory != null) {
            jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_PLATFORMCATEGORY, platformCategory);
        }
        String screenSize = getScreenSize();
        if (screenSize != null) {
            jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_SCREENSIZE, screenSize);
        }
        String deviceType = getDeviceType();
        if (deviceType != null) {
            jSONObject.put("dt", deviceType);
        }
        String connectionType = getConnectionType();
        if (connectionType != null) {
            jSONObject.put("ct", connectionType);
        }
        return jSONObject;
    }

    @NotNull
    public String toString() {
        return "ApsMetricsDeviceInfo(platformCategory=" + ((Object) this.platformCategory) + ", screenSize=" + ((Object) this.screenSize) + ", deviceType=" + ((Object) this.deviceType) + ", connectionType=" + ((Object) this.connectionType) + ", platformCategoryVersion=" + ((Object) this.platformCategoryVersion) + ')';
    }

    public ApsMetricsDeviceInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.platformCategory = str;
        this.screenSize = str2;
        this.deviceType = str3;
        this.connectionType = str4;
        this.platformCategoryVersion = str5;
        this.f2882os = "android";
        this.platform = "app";
    }

    public /* synthetic */ ApsMetricsDeviceInfo(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
