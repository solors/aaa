package com.maticoo.sdk.core;

import android.view.View;

/* loaded from: classes6.dex */
public interface BaseAdView {
    View getAdView();

    boolean isReady();

    void loadPage();

    void onDestroy();
}
