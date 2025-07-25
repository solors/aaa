package sg.bigo.ads.core.landing;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.aps.ads.util.adview.ApsAdWebViewSupportClient;
import com.amazon.device.ads.DtbConstants;
import com.ironsource.C21114v8;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import sg.bigo.ads.api.AdActivity;
import sg.bigo.ads.api.core.C43558e;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.common.utils.C43818c;
import sg.bigo.ads.common.utils.C43836q;
import sg.bigo.ads.core.p958c.C44136b;

/* renamed from: sg.bigo.ads.core.landing.a */
/* loaded from: classes10.dex */
public final class C44230a {
    /* renamed from: a */
    private static Intent m3577a(@NonNull Uri uri) {
        return new Intent("android.intent.action.VIEW", uri).addFlags(268435456);
    }

    /* renamed from: b */
    public static void m3572b(Context context, String str) {
        Intent m5497a = AdActivity.m5497a(context, WebViewActivityImpl.class);
        m5497a.putExtra("url", str);
        context.startActivity(m5497a);
    }

    /* renamed from: a */
    public static String m3573a(String str, Map<String, String> map, String str2) {
        StringBuilder sb2;
        String host = Uri.parse(str2).getHost();
        if (C43836q.m4837a((CharSequence) str) || map.isEmpty() || C43836q.m4837a((CharSequence) host)) {
            return str2;
        }
        try {
            Set<String> queryParameterNames = Uri.parse(str2).getQueryParameterNames();
            if (str.equals("all") || str.contains(host)) {
                StringBuilder sb3 = new StringBuilder();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (!queryParameterNames.contains(entry.getKey())) {
                        sb3.append(entry.getValue());
                        sb3.append(C21114v8.C21123i.f54135c);
                    }
                }
                String sb4 = sb3.toString();
                if (TextUtils.isEmpty(sb4)) {
                    return str2;
                }
                String substring = sb4.substring(0, sb4.length() - 1);
                if (str2.contains("?")) {
                    sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append(C21114v8.C21123i.f54135c);
                    sb2.append(substring);
                } else {
                    sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append("?");
                    sb2.append(substring);
                }
                str2 = sb2.toString();
                return str2;
            }
            return str2;
        } catch (Throwable th) {
            C43782a.m5009a(0, "LinkUtils", "appendPixel error =" + th.getMessage());
            return str2;
        }
    }

    /* renamed from: a */
    public static boolean m3580a(Context context, String str) {
        try {
            context.startActivity(context.getPackageManager().getLaunchIntentForPackage(str));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m3579a(Context context, String str, String str2, @NonNull List<String> list) {
        String str3;
        try {
            Intent m3577a = m3577a(Uri.parse(str));
            if (!TextUtils.isEmpty(str2)) {
                m3577a.setPackage(str2);
            }
            context.startActivity(m3577a);
            return true;
        } catch (Exception e) {
            if (e instanceof ActivityNotFoundException) {
                str3 = "Unable to open target URL by browser due to ActivityNotFoundException.";
            } else {
                StringBuilder sb2 = new StringBuilder();
                if (TextUtils.isEmpty(str2)) {
                    str2 = "unknown";
                }
                sb2.append(str2);
                sb2.append(": ");
                sb2.append(e.getMessage());
                list.add(sb2.toString());
                str3 = "Unable to open target URL by system browser.";
            }
            C43782a.m5009a(2, "LinkUtils", str3);
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m3578a(Context context, String str, @Nullable JSONArray jSONArray) {
        int i;
        if (!str.startsWith("http://") && !str.startsWith(DtbConstants.HTTPS)) {
            str = "http://".concat(str);
        }
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null && jSONArray.length() > 0) {
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                String optString = jSONArray.optString(i2);
                if (!TextUtils.isEmpty(optString) && m3579a(context, str, optString, arrayList)) {
                    C44136b.m3900a("1", arrayList, optString, 1);
                    return true;
                }
            }
        }
        if (C43818c.m4931b(context, "com.android.chrome") == 1 && m3579a(context, str, "com.android.chrome", arrayList)) {
            i = 2;
        } else if (!m3579a(context, str, (String) null, arrayList)) {
            C44136b.m3900a("0", arrayList, "", 0);
            return false;
        } else {
            i = 3;
        }
        C44136b.m3900a("1", arrayList, "", i);
        return true;
    }

    /* renamed from: a */
    public static boolean m3576a(Uri uri, Context context, @NonNull C43558e c43558e) {
        int i;
        Intent m3577a = m3577a(uri);
        m3577a.setPackage("com.android.vending");
        try {
            context.startActivity(m3577a);
            c43558e.f114078b = 1;
            return true;
        } catch (ActivityNotFoundException unused) {
            i = 2;
            c43558e.f114078b = i;
            try {
                context.startActivity(m3577a(uri));
                return true;
            } catch (Exception e) {
                C43782a.m5009a(0, "LinkUtils", e.toString());
                return false;
            }
        } catch (Exception e2) {
            C43782a.m5009a(0, "LinkUtils", e2.toString());
            i = 4;
            c43558e.f114078b = i;
            context.startActivity(m3577a(uri));
            return true;
        }
    }

    /* renamed from: a */
    public static boolean m3575a(Uri uri, Context context, @NonNull C43558e c43558e, @Nullable String str) {
        if (uri == null || uri.getScheme() == null || uri.getScheme().startsWith("http")) {
            return false;
        }
        c43558e.f114081e = uri.toString();
        if (uri.getScheme().startsWith(ApsAdWebViewSupportClient.MARKET_SCHEME)) {
            Intent m3577a = m3577a(uri);
            m3577a.setPackage("com.android.vending");
            try {
                context.startActivity(m3577a);
                c43558e.f114078b = 1;
                return true;
            } catch (ActivityNotFoundException unused) {
                c43558e.f114078b = 2;
            } catch (Exception e) {
                C43782a.m5009a(0, "LinkUtils", e.toString());
                c43558e.f114078b = 4;
            }
        }
        c43558e.f114082f = str;
        try {
            context.startActivity(m3577a(uri));
            c43558e.f114079c = 1;
            return true;
        } catch (ActivityNotFoundException unused2) {
            c43558e.f114078b = 2;
            return false;
        } catch (Exception e2) {
            C43782a.m5009a(0, "LinkUtils", e2.toString());
            c43558e.f114079c = 4;
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m3574a(String str) {
        return str.startsWith("market://") || str.startsWith("http://play.google.com") || str.startsWith("https://play.google.com");
    }
}
