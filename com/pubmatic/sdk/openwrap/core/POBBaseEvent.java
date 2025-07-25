package com.pubmatic.sdk.openwrap.core;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.base.POBBidsProvider;
import java.util.Locale;

@MainThread
/* loaded from: classes7.dex */
public abstract class POBBaseEvent {
    public abstract void destroy();

    /* JADX INFO: Access modifiers changed from: protected */
    @NonNull
    public POBError prepareErrorFromResponse(@Nullable POBBidsProvider pOBBidsProvider) {
        String str;
        if (pOBBidsProvider != null && pOBBidsProvider.getNbrCode() != null) {
            str = String.format(Locale.getDefault(), "No ads available, reason(NBR): %s", pOBBidsProvider.getNbrCode());
        } else {
            str = "No ads available";
        }
        return new POBError(1002, str);
    }

    public abstract void requestAd(@Nullable POBBid pOBBid);
}
