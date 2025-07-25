package com.smaato.sdk.core.util;

import android.net.UrlQuerySanitizer;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.collections.Maps;
import com.smaato.sdk.core.util.p574fi.Function;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class TextUtils {
    private TextUtils() {
    }

    /* renamed from: a */
    public static /* synthetic */ String m39353a(UrlQuerySanitizer.ParameterValuePair parameterValuePair) {
        return parameterValuePair.mValue;
    }

    /* renamed from: b */
    public static /* synthetic */ String m39352b(UrlQuerySanitizer.ParameterValuePair parameterValuePair) {
        return parameterValuePair.mParameter;
    }

    @NonNull
    public static Map<String, String> convertJsonStringToMap(@Nullable String str) {
        if (isEmpty(str)) {
            return Collections.emptyMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            java.util.Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            return hashMap;
        } catch (JSONException unused) {
            return Collections.emptyMap();
        }
    }

    public static boolean isEmpty(@Nullable CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            return false;
        }
        return true;
    }

    @NonNull
    public static Map<String, String> parseQuery(@Nullable String str) {
        if (isEmpty(str)) {
            return Collections.emptyMap();
        }
        UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer();
        urlQuerySanitizer.setAllowUnregisteredParamaters(true);
        urlQuerySanitizer.parseQuery(str);
        return Maps.toMap(urlQuerySanitizer.getParameterList(), new Function() { // from class: com.smaato.sdk.core.util.i
            @Override // com.smaato.sdk.core.util.p574fi.Function
            public final Object apply(Object obj) {
                return TextUtils.m39352b((UrlQuerySanitizer.ParameterValuePair) obj);
            }
        }, new Function() { // from class: com.smaato.sdk.core.util.j
            @Override // com.smaato.sdk.core.util.p574fi.Function
            public final Object apply(Object obj) {
                return TextUtils.m39353a((UrlQuerySanitizer.ParameterValuePair) obj);
            }
        });
    }

    @NonNull
    public static TreeMap<String, String> parseQueryToCaseInsensitiveMap(@Nullable String str) {
        TreeMap<String, String> treeMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        treeMap.putAll(parseQuery(str));
        return treeMap;
    }
}
