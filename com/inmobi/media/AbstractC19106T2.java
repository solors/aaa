package com.inmobi.media;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.pm.ResolveInfo;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.T2 */
/* loaded from: classes6.dex */
public abstract class AbstractC19106T2 {
    /* renamed from: a */
    public static int m60676a(Context context, String url, InterfaceC18855A9 redirectionValidator, String api, InterfaceC18850A4 interfaceC18850A4) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        Intrinsics.checkNotNullParameter(api, "api");
        if (interfaceC18850A4 != null) {
            ((C18864B4) interfaceC18850A4).m61254c("DeeplinkHandler", "In appLinkOrDeepLinkHandled");
        }
        if (url.length() == 0) {
            if (interfaceC18850A4 != null) {
                ((C18864B4) interfaceC18850A4).m61254c("DeeplinkHandler", "AppLink url is Empty or null");
                return 2;
            }
            return 2;
        }
        Intrinsics.checkNotNullParameter(url, "url");
        ArrayList arrayList = new ArrayList();
        if (url.length() != 0 && context != null) {
            List<ResolveInfo> queryIntentActivityOptions = context.getPackageManager().queryIntentActivityOptions(null, null, AbstractC19197a2.m60495b(url), 0);
            Intrinsics.checkNotNullExpressionValue(queryIntentActivityOptions, "queryIntentActivityOptions(...)");
            for (ResolveInfo resolveInfo : queryIntentActivityOptions) {
                if (resolveInfo.activityInfo.exported) {
                    Intrinsics.m17074g(resolveInfo);
                    arrayList.add(resolveInfo);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            if (interfaceC18850A4 != null) {
                ((C18864B4) interfaceC18850A4).m61254c("DeeplinkHandler", "Resolve Info " + ((ResolveInfo) arrayList.get(0)).activityInfo.name);
            }
            try {
                return AbstractC19197a2.m60500a(context, url, (ResolveInfo) arrayList.get(0), redirectionValidator, api);
            } catch (ActivityNotFoundException unused) {
                if (interfaceC18850A4 == null) {
                    return 6;
                }
                ((C18864B4) interfaceC18850A4).m61255b("DeeplinkHandler", "ActivityNotFoundException for url: ".concat(url));
                return 6;
            } catch (SecurityException unused2) {
                if (interfaceC18850A4 != null) {
                    ((C18864B4) interfaceC18850A4).m61255b("DeeplinkHandler", "SecurityException for url: ".concat(url));
                }
                return 12;
            }
        }
        if (interfaceC18850A4 != null) {
            ((C18864B4) interfaceC18850A4).m61254c("DeeplinkHandler", " Resolve Info Empty");
        }
        try {
            try {
                try {
                    return AbstractC19197a2.m60499a(context, url, redirectionValidator, api);
                } catch (URISyntaxException unused3) {
                    return 5;
                }
            } catch (ActivityNotFoundException unused4) {
                return 6;
            }
        } catch (ActivityNotFoundException unused5) {
            AbstractC19197a2.m60500a(context, url, null, redirectionValidator, api);
            return 0;
        }
    }
}
