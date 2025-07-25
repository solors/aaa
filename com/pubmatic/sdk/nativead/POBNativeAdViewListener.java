package com.pubmatic.sdk.nativead;

import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public interface POBNativeAdViewListener {
    void onAssetClicked(@NonNull View view, int i);

    void onNonAssetClicked(@NonNull View view, @NonNull String str);

    void onRecordClick(@NonNull View view);

    void onRecordImpression(@NonNull View view);
}
