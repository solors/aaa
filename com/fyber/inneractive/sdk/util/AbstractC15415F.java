package com.fyber.inneractive.sdk.util;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.net.MailTo;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

/* renamed from: com.fyber.inneractive.sdk.util.F */
/* loaded from: classes4.dex */
public abstract class AbstractC15415F extends AbstractC15459m {
    /* renamed from: a */
    public static boolean m76537a(Context context, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("googlechrome://navigate?url=" + str));
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
            return true;
        } catch (Throwable unused) {
            IAlog.m76524f("Failed opening chrome for a special uri.", new Object[0]);
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m76535c(String str) {
        if (!str.startsWith("http%3A%2F%2F") && !str.startsWith("https%3A%2F%2F") && !str.startsWith("%")) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m76534d(String str) {
        if (!str.startsWith("tel:") && !str.startsWith("voicemail:") && !str.startsWith("sms:") && !str.startsWith(MailTo.MAILTO_SCHEME) && !str.startsWith("geo:") && !str.startsWith("google.streetview:")) {
            try {
                new URL(str);
                return false;
            } catch (MalformedURLException unused) {
                IAlog.m76524f("Failed to open Url: %s", str);
            }
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m76533e(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (!AbstractC15469r.m76470a() || IAConfigManager.f27060O.f27093q) {
                if (str.startsWith("http://") || str.startsWith("http%3A%2F%2F")) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m76538a(Context context, Intent intent) {
        if (context != null && intent != null) {
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            try {
                context.startActivity(intent);
                return true;
            } catch (ActivityNotFoundException unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public static HashMap m76536a(Uri uri) {
        HashMap hashMap = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            hashMap.put(str, uri.getQueryParameter(str));
        }
        return hashMap;
    }
}
