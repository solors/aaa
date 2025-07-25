package com.mbridge.msdk.mbsignalcommon.mraid;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.SameBase64Tool;
import com.mbridge.msdk.mbsignalcommon.mraid.CallMraidJS;
import com.mbridge.msdk.mbsignalcommon.windvane.CallMethodContext;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.mbsignalcommon.mraid.c */
/* loaded from: classes6.dex */
public final class MraidUriUtil {

    /* renamed from: a */
    private static volatile ConcurrentHashMap<String, String> f57705a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private static ArrayList<String> f57706b = new ArrayList<>();

    /* renamed from: a */
    public static CallMethodContext m51088a(WindVaneWebView windVaneWebView, String str) {
        Set<String> unmodifiableSet;
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (TextUtils.isEmpty(scheme) || !scheme.contains("mraid")) {
            return null;
        }
        CallMethodContext callMethodContext = new CallMethodContext();
        callMethodContext.f57742d = SameBase64Tool.m51603a("n+ztLkxpVTzBLkxgHN==");
        callMethodContext.f57743e = parse.getHost();
        int i = 0;
        if (f57706b.size() == 0) {
            for (Method method : IMraidSignalCommunication.class.getDeclaredMethods()) {
                f57706b.add(method.getName());
            }
        }
        if (!f57706b.contains(callMethodContext.f57743e) && windVaneWebView != null) {
            String campaignId = windVaneWebView.getCampaignId();
            String str2 = callMethodContext.f57743e;
            if (!TextUtils.isEmpty(campaignId)) {
                if (f57705a.containsKey(campaignId)) {
                    String str3 = f57705a.get(campaignId);
                    if (!TextUtils.isEmpty(str2) && !str3.contains(str2)) {
                        if (str3.length() > 0) {
                            str3 = str3.concat(",");
                        }
                        f57705a.put(campaignId, str3.concat(str2));
                    }
                } else {
                    f57705a.put(campaignId, str2);
                }
            }
            CallMraidJS.C22226a.f57704a.m51097a(windVaneWebView, callMethodContext.f57743e);
            CallMraidJS.C22226a.f57704a.m51096a(windVaneWebView, callMethodContext.f57743e, "Specified command is not implemented");
            return null;
        }
        String encodedQuery = parse.getEncodedQuery();
        if (encodedQuery == null) {
            unmodifiableSet = Collections.emptySet();
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            do {
                int indexOf = encodedQuery.indexOf(38, i);
                if (indexOf == -1) {
                    indexOf = encodedQuery.length();
                }
                int indexOf2 = encodedQuery.indexOf(61, i);
                if (indexOf2 > indexOf || indexOf2 == -1) {
                    indexOf2 = indexOf;
                }
                linkedHashSet.add(Uri.decode(encodedQuery.substring(i, indexOf2)));
                i = indexOf + 1;
            } while (i < encodedQuery.length());
            unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str4 : unmodifiableSet) {
                jSONObject.put(str4, parse.getQueryParameter(str4));
            }
            callMethodContext.f57744f = jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return callMethodContext;
    }

    /* renamed from: b */
    public static void m51086b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f57705a.remove(str);
    }

    /* renamed from: a */
    public static String m51087a(String str) {
        if (f57705a.containsKey(str)) {
            return f57705a.get(str);
        }
        return null;
    }
}
