package com.smaato.sdk.core.browser;

import android.content.Intent;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes7.dex */
public interface BrowserView {
    void closeBrowser();

    void hideProgressIndicator();

    void launchExternalBrowser(@NonNull Intent intent);

    void redirectToExternalApp(@NonNull Intent intent);

    void setPageNavigationBackEnabled(boolean z);

    void setPageNavigationForwardEnabled(boolean z);

    void showConnectionSecure(boolean z);

    void showHostname(@Nullable String str);

    void showProgressIndicator();

    void updateProgressIndicator(@IntRange(from = 0, m105510to = 100) int i);
}
