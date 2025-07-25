package com.unity3d.ads.adplayer;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidShowOptions.kt */
@Metadata
/* loaded from: classes7.dex */
public final class AndroidShowOptions implements ShowOptions {
    @NotNull
    private final WeakReference<Activity> activity;
    private final boolean isScarAd;
    @Nullable
    private final String placementId;
    @Nullable
    private final String scarAdString;
    @Nullable
    private final String scarAdUnitId;
    @Nullable
    private final String scarQueryId;
    @Nullable
    private final Map<String, Object> unityAdsShowOptions;

    public AndroidShowOptions(@NotNull WeakReference<Activity> activity, @Nullable Map<String, ? extends Object> map, @Nullable String str, boolean z, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
        this.unityAdsShowOptions = map;
        this.placementId = str;
        this.isScarAd = z;
        this.scarQueryId = str2;
        this.scarAdString = str3;
        this.scarAdUnitId = str4;
    }

    public static /* synthetic */ AndroidShowOptions copy$default(AndroidShowOptions androidShowOptions, WeakReference weakReference, Map map, String str, boolean z, String str2, String str3, String str4, int i, Object obj) {
        WeakReference<Activity> weakReference2 = weakReference;
        if ((i & 1) != 0) {
            weakReference2 = androidShowOptions.activity;
        }
        Map<String, Object> map2 = map;
        if ((i & 2) != 0) {
            map2 = androidShowOptions.unityAdsShowOptions;
        }
        Map map3 = map2;
        if ((i & 4) != 0) {
            str = androidShowOptions.placementId;
        }
        String str5 = str;
        if ((i & 8) != 0) {
            z = androidShowOptions.isScarAd;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str2 = androidShowOptions.scarQueryId;
        }
        String str6 = str2;
        if ((i & 32) != 0) {
            str3 = androidShowOptions.scarAdString;
        }
        String str7 = str3;
        if ((i & 64) != 0) {
            str4 = androidShowOptions.scarAdUnitId;
        }
        return androidShowOptions.copy(weakReference2, map3, str5, z2, str6, str7, str4);
    }

    @NotNull
    public final WeakReference<Activity> component1() {
        return this.activity;
    }

    @Nullable
    public final Map<String, Object> component2() {
        return this.unityAdsShowOptions;
    }

    @Nullable
    public final String component3() {
        return this.placementId;
    }

    public final boolean component4() {
        return this.isScarAd;
    }

    @Nullable
    public final String component5() {
        return this.scarQueryId;
    }

    @Nullable
    public final String component6() {
        return this.scarAdString;
    }

    @Nullable
    public final String component7() {
        return this.scarAdUnitId;
    }

    @NotNull
    public final AndroidShowOptions copy(@NotNull WeakReference<Activity> activity, @Nullable Map<String, ? extends Object> map, @Nullable String str, boolean z, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return new AndroidShowOptions(activity, map, str, z, str2, str3, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidShowOptions)) {
            return false;
        }
        AndroidShowOptions androidShowOptions = (AndroidShowOptions) obj;
        if (Intrinsics.m17075f(this.activity, androidShowOptions.activity) && Intrinsics.m17075f(this.unityAdsShowOptions, androidShowOptions.unityAdsShowOptions) && Intrinsics.m17075f(this.placementId, androidShowOptions.placementId) && this.isScarAd == androidShowOptions.isScarAd && Intrinsics.m17075f(this.scarQueryId, androidShowOptions.scarQueryId) && Intrinsics.m17075f(this.scarAdString, androidShowOptions.scarAdString) && Intrinsics.m17075f(this.scarAdUnitId, androidShowOptions.scarAdUnitId)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final WeakReference<Activity> getActivity() {
        return this.activity;
    }

    @Nullable
    public final String getPlacementId() {
        return this.placementId;
    }

    @Nullable
    public final String getScarAdString() {
        return this.scarAdString;
    }

    @Nullable
    public final String getScarAdUnitId() {
        return this.scarAdUnitId;
    }

    @Nullable
    public final String getScarQueryId() {
        return this.scarQueryId;
    }

    @Nullable
    public final Map<String, Object> getUnityAdsShowOptions() {
        return this.unityAdsShowOptions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = this.activity.hashCode() * 31;
        Map<String, Object> map = this.unityAdsShowOptions;
        int i = 0;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        int i2 = (hashCode5 + hashCode) * 31;
        String str = this.placementId;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        boolean z = this.isScarAd;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        String str2 = this.scarQueryId;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i6 = (i5 + hashCode3) * 31;
        String str3 = this.scarAdString;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i7 = (i6 + hashCode4) * 31;
        String str4 = this.scarAdUnitId;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i7 + i;
    }

    public final boolean isScarAd() {
        return this.isScarAd;
    }

    @NotNull
    public String toString() {
        return "AndroidShowOptions(activity=" + this.activity + ", unityAdsShowOptions=" + this.unityAdsShowOptions + ", placementId=" + this.placementId + ", isScarAd=" + this.isScarAd + ", scarQueryId=" + this.scarQueryId + ", scarAdString=" + this.scarAdString + ", scarAdUnitId=" + this.scarAdUnitId + ')';
    }

    public /* synthetic */ AndroidShowOptions(WeakReference weakReference, Map map, String str, boolean z, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(weakReference, map, (i & 4) != 0 ? null : str, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4);
    }
}
