package com.pubmatic.sdk.openwrap.banner;

import android.view.View;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.base.POBBidsProvider;
import com.pubmatic.sdk.openwrap.core.POBAdEventListener;

@MainThread
/* loaded from: classes7.dex */
public interface POBBannerEventListener extends POBAdEventListener {
    @Override // com.pubmatic.sdk.openwrap.core.POBAdEventListener
    @Nullable
    /* synthetic */ POBBidsProvider getBidsProvider();

    @Override // com.pubmatic.sdk.openwrap.core.POBAdEventListener
    /* synthetic */ void onAdClick();

    @Override // com.pubmatic.sdk.openwrap.core.POBAdEventListener
    /* synthetic */ void onAdClosed();

    void onAdExecutionComplete();

    @Override // com.pubmatic.sdk.openwrap.core.POBAdEventListener
    /* synthetic */ void onAdImpression();

    @Override // com.pubmatic.sdk.openwrap.core.POBAdEventListener
    /* synthetic */ void onAdLeftApplication();

    @Override // com.pubmatic.sdk.openwrap.core.POBAdEventListener
    /* synthetic */ void onAdOpened();

    void onAdServerWin(@NonNull View view);

    void onFailed(@NonNull POBError pOBError);

    void onOpenWrapPartnerWin(@Nullable String str);
}
