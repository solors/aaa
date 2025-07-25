package com.appsflyer.internal;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.appsflyer.internal.AFj1xSDK;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class AFc1aSDK {
    @Nullable
    public static Uri AFKeystoreWrapper(@Nullable Intent intent) {
        if (intent == null) {
            return null;
        }
        AFj1xSDK aFj1xSDK = new AFj1xSDK(intent);
        Intrinsics.checkNotNullParameter("android.intent.extra.REFERRER", "");
        AFj1xSDK.C62724 c62724 = new AFj1xSDK.C62724("android.intent.extra.REFERRER");
        StringBuilder sb2 = new StringBuilder("Error while trying to read ");
        sb2.append("android.intent.extra.REFERRER");
        sb2.append(" extra from intent");
        Uri uri = (Uri) ((Parcelable) aFj1xSDK.AFInAppEventType(c62724, sb2.toString(), null, true));
        if (uri != null) {
            return uri;
        }
        String valueOf = aFj1xSDK.valueOf("android.intent.extra.REFERRER_NAME");
        if (valueOf == null) {
            return null;
        }
        return Uri.parse(valueOf);
    }
}
