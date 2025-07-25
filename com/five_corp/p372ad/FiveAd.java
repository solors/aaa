package com.five_corp.p372ad;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.List;

/* renamed from: com.five_corp.ad.FiveAd */
/* loaded from: classes4.dex */
public abstract class FiveAd {

    @Deprecated
    /* renamed from: com.five_corp.ad.FiveAd$MediaUserAttribute */
    /* loaded from: classes4.dex */
    public static class MediaUserAttribute {
        public MediaUserAttribute(String str, String str2) {
        }
    }

    public static String getSdkSemanticVersion() {
        return BuildConfig.SEMVER;
    }

    @Deprecated
    public static int getSdkVersion() {
        return BuildConfig.SEMVER_PATCH;
    }

    public static FiveAd getSingleton() {
        return C14163j.m78039a();
    }

    public static void initialize(@NonNull Context context, @NonNull FiveAdConfig fiveAdConfig) {
        if (context != null) {
            if (fiveAdConfig != null) {
                C14163j.initialize(context, fiveAdConfig);
                return;
            }
            throw new IllegalArgumentException("FiveAdConfig must be a non-null value.");
        }
        throw new IllegalArgumentException("Context must be a non-null value.");
    }

    public static boolean isInitialized() {
        return C14163j.isInitialized();
    }

    @Deprecated
    public abstract void enableSound(boolean z);

    @Deprecated
    public int getVersion() {
        return BuildConfig.SEMVER_PATCH;
    }

    public abstract boolean isSoundEnabled();

    @Deprecated
    public abstract void setMediaUserAttributes(List<MediaUserAttribute> list);
}
