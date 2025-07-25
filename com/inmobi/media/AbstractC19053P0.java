package com.inmobi.media;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.amazon.aps.ads.util.adview.ApsAdWebViewSupportClient;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.P0 */
/* loaded from: classes6.dex */
public abstract class AbstractC19053P0 {
    /* renamed from: a */
    public static boolean m60820a(Context context, String url, InterfaceC18855A9 redirectionValidator, String api, InterfaceC18850A4 interfaceC18850A4) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        Intrinsics.checkNotNullParameter(api, "api");
        if (interfaceC18850A4 != null) {
            ((C18864B4) interfaceC18850A4).m61254c("AppstoreLinkHandler", "In appStoreLinkHandled");
        }
        Intrinsics.checkNotNullParameter(url, "url");
        if (url.length() != 0) {
            Uri parse = Uri.parse(url);
            if (Intrinsics.m17075f(ApsAdWebViewSupportClient.MARKET_SCHEME, parse.getScheme()) || Intrinsics.m17075f("play.google.com", parse.getHost()) || Intrinsics.m17075f("market.android.com", parse.getHost())) {
                Uri parse2 = Uri.parse(url);
                if (context != null) {
                    try {
                        context.getPackageManager().getPackageInfo("com.android.vending", 0);
                        if (!redirectionValidator.mo59912d()) {
                            redirectionValidator.mo59913a("EX_" + api);
                            return false;
                        }
                        try {
                            Intent intent = new Intent("android.intent.action.VIEW", parse2);
                            intent.setPackage("com.android.vending");
                            intent.addFlags(268435456);
                            context.startActivity(intent);
                            if (interfaceC18850A4 != null) {
                                ((C18864B4) interfaceC18850A4).m61254c("AppstoreLinkHandler", "Playstore link handled successfully");
                            }
                            return true;
                        } catch (ActivityNotFoundException e) {
                            if (interfaceC18850A4 == null) {
                                return false;
                            }
                            ((C18864B4) interfaceC18850A4).m61254c("AppstoreLinkHandler", "Error message in processing appStoreLinkHandling: " + e.getMessage());
                            return false;
                        }
                    } catch (PackageManager.NameNotFoundException e2) {
                        e2.printStackTrace();
                    }
                }
                int m60676a = AbstractC19106T2.m60676a(context, url, redirectionValidator, api, interfaceC18850A4);
                if (m60676a != 0 && m60676a != 1) {
                    return false;
                }
                if (interfaceC18850A4 != null) {
                    ((C18864B4) interfaceC18850A4).m61254c("AppstoreLinkHandler", "Playstore link handled successfully");
                }
                return true;
            }
        }
        return false;
    }
}
