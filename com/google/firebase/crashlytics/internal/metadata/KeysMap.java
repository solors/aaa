package com.google.firebase.crashlytics.internal.metadata;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
class KeysMap {

    /* renamed from: a */
    private final Map<String, String> f42444a = new HashMap();

    /* renamed from: b */
    private final int f42445b;

    /* renamed from: c */
    private final int f42446c;

    public KeysMap(int i, int i2) {
        this.f42445b = i;
        this.f42446c = i2;
    }

    /* renamed from: a */
    private String m67046a(String str) {
        if (str != null) {
            return sanitizeString(str, this.f42446c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public static String sanitizeString(String str, int i) {
        if (str != null) {
            String trim = str.trim();
            if (trim.length() > i) {
                return trim.substring(0, i);
            }
            return trim;
        }
        return str;
    }

    @NonNull
    public synchronized Map<String, String> getKeys() {
        return Collections.unmodifiableMap(new HashMap(this.f42444a));
    }

    public synchronized boolean setKey(String str, String str2) {
        String m67046a = m67046a(str);
        if (this.f42444a.size() >= this.f42445b && !this.f42444a.containsKey(m67046a)) {
            Logger logger = Logger.getLogger();
            logger.m67208w("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f42445b);
            return false;
        }
        String sanitizeString = sanitizeString(str2, this.f42446c);
        if (CommonUtils.nullSafeEquals(this.f42444a.get(m67046a), sanitizeString)) {
            return false;
        }
        Map<String, String> map = this.f42444a;
        if (str2 == null) {
            sanitizeString = "";
        }
        map.put(m67046a, sanitizeString);
        return true;
    }

    public synchronized void setKeys(Map<String, String> map) {
        String sanitizeString;
        int i = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String m67046a = m67046a(entry.getKey());
            if (this.f42444a.size() >= this.f42445b && !this.f42444a.containsKey(m67046a)) {
                i++;
            }
            String value = entry.getValue();
            Map<String, String> map2 = this.f42444a;
            if (value == null) {
                sanitizeString = "";
            } else {
                sanitizeString = sanitizeString(value, this.f42446c);
            }
            map2.put(m67046a, sanitizeString);
        }
        if (i > 0) {
            Logger logger = Logger.getLogger();
            logger.m67208w("Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.f42445b);
        }
    }
}
