package com.smaato.sdk.core.browser;

import android.app.Application;
import android.webkit.CookieSyncManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes7.dex */
public final class CookieSyncManagerHolder {
    @Nullable
    private final CookieSyncManager cookieSyncManager = null;

    public CookieSyncManagerHolder(@NonNull Application application) {
    }

    @Nullable
    public CookieSyncManager getCookieSyncManager() {
        return this.cookieSyncManager;
    }
}
