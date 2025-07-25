package com.vungle.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.internal.p623ui.PresenterAdOpenCallback;
import com.vungle.ads.internal.util.ActivityManager;
import com.vungle.ads.internal.util.C29518o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.vungle.ads.internal.util.f */
/* loaded from: classes7.dex */
public final class ExternalRouter {
    @NotNull
    public static final ExternalRouter INSTANCE = new ExternalRouter();
    private static final String TAG = ExternalRouter.class.getSimpleName();

    private ExternalRouter() {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0013 A[Catch: URISyntaxException -> 0x000d, TryCatch #0 {URISyntaxException -> 0x000d, blocks: (B:4:0x0004, B:16:0x001c, B:13:0x0013), top: B:20:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.content.Intent getIntentFromUrl(java.lang.String r5, boolean r6) {
        /*
            r4 = this;
            r0 = 0
            r1 = 0
            if (r5 == 0) goto Lf
            int r2 = r5.length()     // Catch: java.net.URISyntaxException -> Ld
            if (r2 != 0) goto Lb
            goto Lf
        Lb:
            r2 = r0
            goto L10
        Ld:
            r5 = move-exception
            goto L22
        Lf:
            r2 = 1
        L10:
            if (r2 == 0) goto L13
            goto L18
        L13:
            android.content.Intent r5 = android.content.Intent.parseUri(r5, r0)     // Catch: java.net.URISyntaxException -> Ld
            r1 = r5
        L18:
            if (r1 == 0) goto L43
            if (r6 == 0) goto L43
            r5 = 268435456(0x10000000, float:2.5243549E-29)
            r1.setFlags(r5)     // Catch: java.net.URISyntaxException -> Ld
            goto L43
        L22:
            com.vungle.ads.internal.util.o$a r6 = com.vungle.ads.internal.util.C29518o.Companion
            java.lang.String r0 = com.vungle.ads.internal.util.ExternalRouter.TAG
            java.lang.String r2 = "TAG"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "url format is not correct "
            r2.append(r3)
            java.lang.String r5 = r5.getLocalizedMessage()
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r6.m37467e(r0, r5)
        L43:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.util.ExternalRouter.getIntentFromUrl(java.lang.String, boolean):android.content.Intent");
    }

    public static final boolean launch(@Nullable String str, @Nullable String str2, @NotNull Context context, @Nullable ActivityManager.InterfaceC29504b interfaceC29504b, @Nullable PresenterAdOpenCallback presenterAdOpenCallback) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(context, "context");
        boolean z3 = true;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (str2 != null && str2.length() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                return false;
            }
        }
        boolean z4 = !(context instanceof Activity);
        try {
            ExternalRouter externalRouter = INSTANCE;
            ActivityManager.Companion.startWhenForeground(context, externalRouter.getIntentFromUrl(str, z4), externalRouter.getIntentFromUrl(str2, z4), interfaceC29504b, presenterAdOpenCallback);
            return true;
        } catch (Exception e) {
            if (str != null && str.length() != 0) {
                z3 = false;
            }
            if (!z3) {
                AnalyticsClient.INSTANCE.logError$vungle_ads_release(312, "Fail to open " + str, (r13 & 4) != 0 ? null : "", (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            } else {
                AnalyticsClient.INSTANCE.logError$vungle_ads_release(314, "Fail to open " + str2, (r13 & 4) != 0 ? null : "", (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            }
            C29518o.C29519a c29519a = C29518o.Companion;
            String TAG2 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            c29519a.m37467e(TAG2, "Error while opening url" + e.getLocalizedMessage());
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            c29519a.m37468d(TAG2, "Cannot open url " + str2);
            return false;
        }
    }
}
