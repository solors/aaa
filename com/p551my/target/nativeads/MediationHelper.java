package com.p551my.target.nativeads;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p551my.target.nativeads.views.MediaAdView;
import java.util.List;

/* renamed from: com.my.target.nativeads.MediationHelper */
/* loaded from: classes7.dex */
public final class MediationHelper {
    private MediationHelper() {
    }

    public static void registerView(@NonNull NativeAd nativeAd, @NonNull View view, @Nullable List<View> list, @Nullable MediaAdView mediaAdView) {
        nativeAd.registerView(view, list, mediaAdView);
    }
}
