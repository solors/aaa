package com.applovin.mediation.adapter;

import android.app.Activity;
import androidx.annotation.Nullable;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;

/* loaded from: classes2.dex */
public interface MaxAdapter {

    /* loaded from: classes2.dex */
    public enum InitializationStatus {
        NOT_INITIALIZED(-4),
        DOES_NOT_APPLY(-3),
        INITIALIZING(-2),
        INITIALIZED_UNKNOWN(-1),
        INITIALIZED_FAILURE(0),
        INITIALIZED_SUCCESS(1);
        
        private final int code;

        InitializationStatus(int i) {
            this.code = i;
        }

        public int getCode() {
            return this.code;
        }
    }

    /* loaded from: classes2.dex */
    public interface OnCompletionListener {
        void onCompletion(InitializationStatus initializationStatus, String str);
    }

    String getAdapterVersion();

    String getSdkVersion();

    void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, OnCompletionListener onCompletionListener);

    boolean isBeta();

    void onDestroy();

    @Nullable
    Boolean shouldCollectSignalsOnUiThread();

    @Nullable
    Boolean shouldInitializeOnUiThread();

    @Nullable
    Boolean shouldLoadAdsOnUiThread(MaxAdFormat maxAdFormat);

    @Nullable
    Boolean shouldShowAdsOnUiThread(MaxAdFormat maxAdFormat);
}
