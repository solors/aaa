package com.appsflyer.internal;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class AFi1qSDK implements AFi1rSDK {
    @Nullable
    private String AFInAppEventType;

    private static String values(Activity activity) {
        Intent intent;
        String str;
        if (activity != null) {
            intent = activity.getIntent();
        } else {
            intent = null;
        }
        Uri AFKeystoreWrapper = AFc1aSDK.AFKeystoreWrapper(intent);
        if (AFKeystoreWrapper != null) {
            str = AFKeystoreWrapper.toString();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        if (AFKeystoreWrapper(str)) {
            return null;
        }
        return str;
    }

    @Override // com.appsflyer.internal.AFi1rSDK
    public final void AFInAppEventType(@NotNull Activity activity) {
        boolean z;
        Intrinsics.checkNotNullParameter(activity, "");
        String str = this.AFInAppEventType;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.AFInAppEventType = values(activity);
        }
    }

    @Override // com.appsflyer.internal.AFi1rSDK
    @Nullable
    public final String AFKeystoreWrapper(@Nullable Activity activity) {
        String str = this.AFInAppEventType;
        this.AFInAppEventType = null;
        return !(str == null || str.length() == 0) ? str : values(activity);
    }

    @Override // com.appsflyer.internal.AFi1rSDK
    @NotNull
    public final String valueOf(@Nullable Activity activity) {
        Uri uri;
        String str = null;
        if (activity != null && activity.getIntent() != null) {
            uri = activity.getReferrer();
        } else {
            uri = null;
        }
        if (uri != null) {
            str = uri.toString();
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    private static boolean AFKeystoreWrapper(String str) {
        boolean m16624M;
        m16624M = StringsJVM.m16624M(str, "android-app://", false, 2, null);
        return m16624M;
    }
}
