package com.facebook.bolts;

import android.content.Intent;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AppLinks.kt */
@Metadata
/* loaded from: classes2.dex */
public final class AppLinks {
    @NotNull
    public static final AppLinks INSTANCE = new AppLinks();
    @NotNull
    public static final String KEY_NAME_APPLINK_DATA = "al_applink_data";
    @NotNull
    public static final String KEY_NAME_EXTRAS = "extras";

    private AppLinks() {
    }

    @Nullable
    public static final Bundle getAppLinkData(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return intent.getBundleExtra("al_applink_data");
    }

    @Nullable
    public static final Bundle getAppLinkExtras(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Bundle appLinkData = getAppLinkData(intent);
        if (appLinkData == null) {
            return null;
        }
        return appLinkData.getBundle("extras");
    }
}
