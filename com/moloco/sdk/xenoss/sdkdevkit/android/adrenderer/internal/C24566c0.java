package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsIntent;
import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0 */
/* loaded from: classes7.dex */
public final class C24566c0 {
    /* renamed from: b */
    public static final boolean m46133b(Context context, String str) {
        try {
            CustomTabsIntent build = new CustomTabsIntent.Builder().setUrlBarHidingEnabled(true).build();
            Intrinsics.checkNotNullExpressionValue(build, "Builder()\n            .s…rue)\n            .build()");
            build.intent.addFlags(268435456);
            build.launchUrl(context, Uri.parse(str));
            return true;
        } catch (Exception e) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "Xenoss", "tryStartCustomTabs exception", e, false, 8, null);
            return false;
        }
    }
}
