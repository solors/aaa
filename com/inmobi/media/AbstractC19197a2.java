package com.inmobi.media;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.amazon.aps.ads.util.adview.ApsAdWebViewSupportClient;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;

/* renamed from: com.inmobi.media.a2 */
/* loaded from: classes6.dex */
public abstract class AbstractC19197a2 {

    /* renamed from: a */
    public static final /* synthetic */ int f48063a = 0;

    /* renamed from: a */
    public static boolean m60501a(Context context, String str) {
        if (str != null) {
            if (context != null) {
                try {
                    if (new Intent("android.intent.action.VIEW", Uri.parse(str)).resolveActivity(context.getPackageManager()) != null) {
                        return true;
                    }
                } catch (Exception unused) {
                }
            } else {
                Uri parse = Uri.parse(str);
                Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
                return m60497a(parse);
            }
        }
        return false;
    }

    /* renamed from: b */
    public static Intent m60495b(String url) {
        boolean m16614z;
        Intrinsics.checkNotNullParameter(url, "url");
        Uri parse = Uri.parse(url);
        m16614z = StringsJVM.m16614z(parse.getScheme(), SDKConstants.PARAM_INTENT, false, 2, null);
        if (m16614z) {
            Intent parseUri = Intent.parseUri(url, 1);
            Intrinsics.m17074g(parseUri);
            return parseUri;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(parse);
        return intent;
    }

    /* renamed from: a */
    public static int m60500a(Context context, String url, ResolveInfo resolveInfo, InterfaceC18855A9 redirectionValidator, String api) {
        ActivityInfo activityInfo;
        ActivityInfo activityInfo2;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        Intrinsics.checkNotNullParameter(api, "api");
        if (context == null) {
            return 7;
        }
        if (!redirectionValidator.mo59912d()) {
            redirectionValidator.mo59913a("EX_" + api);
            return 8;
        }
        Intent m60495b = m60495b(url);
        String str = null;
        if ((resolveInfo != null ? resolveInfo.activityInfo : null) != null) {
            if (((resolveInfo == null || (activityInfo2 = resolveInfo.activityInfo) == null) ? null : activityInfo2.packageName) != null) {
                if (resolveInfo != null && (activityInfo = resolveInfo.activityInfo) != null) {
                    str = activityInfo.name;
                }
                if (str != null) {
                    ActivityInfo activityInfo3 = resolveInfo.activityInfo;
                    m60495b.setClassName(activityInfo3.packageName, activityInfo3.name);
                }
            }
        }
        m60495b.setFlags(268435456);
        context.startActivity(m60495b);
        return 0;
    }

    /* renamed from: a */
    public static int m60499a(Context context, String url, InterfaceC18855A9 redirectionValidator, String api) {
        String str;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        Intrinsics.checkNotNullParameter(api, "api");
        if (context == null) {
            return 7;
        }
        if (!redirectionValidator.mo59912d()) {
            redirectionValidator.mo59913a("EX_" + api);
            return 8;
        }
        try {
            Intent parseUri = Intent.parseUri(url, 0);
            parseUri.setFlags(268435456);
            context.startActivity(parseUri);
            return 0;
        } catch (ActivityNotFoundException e) {
            Uri parse = Uri.parse(url);
            try {
                str = Intent.parseUri(url, 1).getStringExtra("browser_fallback_url");
            } catch (URISyntaxException unused) {
                Intrinsics.checkNotNullExpressionValue("a2", "TAG");
                str = null;
            }
            if (Intrinsics.m17075f(SDKConstants.PARAM_INTENT, parse.getScheme()) && AbstractC19225c2.m60400a(str)) {
                Intrinsics.m17074g(str);
                return m60499a(context, str, redirectionValidator, api);
            }
            throw e;
        }
    }

    /* renamed from: a */
    public static String m60498a(Context context, String url, String str, C18992K6 redirectionValidator) {
        Intent parseUri;
        String str2;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        Intrinsics.checkNotNullParameter("NATIVE", "api");
        if (context == null) {
            return null;
        }
        redirectionValidator.getClass();
        try {
            parseUri = Intent.parseUri(url, 0);
        } catch (Exception unused) {
            Intrinsics.checkNotNullExpressionValue("a2", "TAG");
        }
        if (parseUri.resolveActivity(context.getPackageManager()) != null) {
            parseUri.setFlags(268435456);
            context.startActivity(parseUri);
            return url;
        }
        Intrinsics.checkNotNullExpressionValue("a2", "TAG");
        if (AbstractC19225c2.m60400a(str)) {
            Intrinsics.m17074g(str);
            return m60498a(context, str, (String) null, redirectionValidator);
        }
        Uri parse = Uri.parse(url);
        try {
            str2 = Intent.parseUri(url, 1).getStringExtra("browser_fallback_url");
        } catch (URISyntaxException unused2) {
            Intrinsics.checkNotNullExpressionValue("a2", "TAG");
            str2 = null;
        }
        if (Intrinsics.m17075f(SDKConstants.PARAM_INTENT, parse.getScheme()) && AbstractC19225c2.m60400a(str2)) {
            String decode = URLDecoder.decode(str2, "UTF-8");
            Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
            return m60498a(context, decode, (String) null, redirectionValidator);
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m60497a(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return Intrinsics.m17075f("http", uri.getScheme()) || Intrinsics.m17075f("https", uri.getScheme());
    }

    /* renamed from: a */
    public static boolean m60496a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Uri parse = Uri.parse(url);
        Intrinsics.m17074g(parse);
        return (!m60497a(parse) || Intrinsics.m17075f("play.google.com", parse.getHost()) || Intrinsics.m17075f("market.android.com", parse.getHost()) || Intrinsics.m17075f(ApsAdWebViewSupportClient.MARKET_SCHEME, parse.getScheme())) ? false : true;
    }
}
