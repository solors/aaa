package com.maticoo.sdk.p405ad.interact;

import android.view.View;
import com.maticoo.sdk.p405ad.AdListener;
import com.maticoo.sdk.p405ad.utils.error.Error;

/* renamed from: com.maticoo.sdk.ad.interact.InteractAdListener */
/* loaded from: classes6.dex */
public abstract class InteractAdListener implements AdListener {
    public void onInteractAdEntranceClick(String str) {
    }

    public void onInteractAdEntranceShowed(String str) {
    }

    public void onInteractAdFullScreenClose(String str) {
    }

    public void onInteractAdFullScreenOpened(String str) {
    }

    public void onInteractAdEntranceShowFailed(String str, Error error) {
    }

    public void onInteractAdFailed(String str, Error error) {
    }

    public void onInteractAdFullScreenOpenFailed(String str, Error error) {
    }

    public void onInteractAdReady(String str, View view) {
    }
}
