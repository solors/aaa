package com.inmobi.media;

import android.net.Uri;
import com.amazon.aps.ads.util.adview.ApsAdWebViewSupportClient;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.B5 */
/* loaded from: classes6.dex */
public abstract class AbstractC18865B5 {
    /* renamed from: a */
    public static String m61251a(String url, String str) {
        String str2;
        if (url != null && url.length() != 0) {
            try {
                Uri parse = Uri.parse(url);
                String scheme = parse.getScheme();
                if (scheme != null && scheme.length() != 0) {
                    if (Intrinsics.m17075f(parse.getScheme(), "inmobinativebrowser")) {
                        return "inmobinativebrowser";
                    }
                    if (Intrinsics.m17075f(parse.getScheme(), "inmobideeplink")) {
                        return "inmobideeplink";
                    }
                    Intrinsics.checkNotNullParameter(url, "url");
                    if (url.length() != 0) {
                        Uri parse2 = Uri.parse(url);
                        if (!Intrinsics.m17075f(ApsAdWebViewSupportClient.MARKET_SCHEME, parse2.getScheme())) {
                            if (!Intrinsics.m17075f("play.google.com", parse2.getHost())) {
                                if (Intrinsics.m17075f("market.android.com", parse2.getHost())) {
                                }
                            }
                        }
                        return ApsAdWebViewSupportClient.MARKET_SCHEME;
                    }
                    Intrinsics.m17074g(parse);
                    if (AbstractC19197a2.m60497a(parse)) {
                        if (str == null) {
                            str2 = "DEFAULT";
                        } else {
                            return str;
                        }
                    } else {
                        str2 = SDKConstants.PARAM_TOURNAMENTS_DEEPLINK;
                    }
                    return str2;
                }
                return "invalid";
            } catch (Exception unused) {
            }
        }
        return "invalid";
    }
}
