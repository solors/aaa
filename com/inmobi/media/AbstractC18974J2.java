package com.inmobi.media;

import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsIntent;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.J2 */
/* loaded from: classes6.dex */
public abstract class AbstractC18974J2 {
    /* renamed from: a */
    public static void m60998a(Context context, CustomTabsIntent customTabsIntent, Uri uri, InterfaceC18959I1 interfaceC18959I1, InterfaceC18855A9 redirectionValidator, String api) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customTabsIntent, "customTabsIntent");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        Intrinsics.checkNotNullParameter(api, "api");
        String m60833a = AbstractC19042O2.m60833a(context);
        try {
            try {
                if (m60833a == null) {
                    Intrinsics.checkNotNullExpressionValue("N2", "access$getLOG_TAG$cp(...)");
                    if (interfaceC18959I1 != null) {
                        String uri2 = uri.toString();
                        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
                        interfaceC18959I1.mo60854a(uri2, api);
                    }
                } else {
                    customTabsIntent.intent.setFlags(268435456);
                    customTabsIntent.intent.setPackage(m60833a);
                    customTabsIntent.launchUrl(context, uri);
                }
            } catch (Exception unused) {
                String uri3 = uri.toString();
                Intrinsics.checkNotNullExpressionValue(uri3, "toString(...)");
                AbstractC19197a2.m60499a(context, uri3, redirectionValidator, api);
            }
        } catch (Exception unused2) {
        }
    }
}
