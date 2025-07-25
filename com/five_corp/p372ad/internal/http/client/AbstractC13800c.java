package com.five_corp.p372ad.internal.http.client;

import androidx.webkit.ProxyConfig;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.five_corp.ad.internal.http.client.c */
/* loaded from: classes4.dex */
public abstract class AbstractC13800c {

    /* renamed from: a */
    public static final Pattern f25719a = Pattern.compile("bytes (\\d+)-(\\d+)/.*$");

    /* renamed from: b */
    public static final Pattern f25720b = Pattern.compile("bytes .+/(\\d+)");

    /* renamed from: a */
    public static int m78350a(String str, Pattern pattern, int i) {
        if (str == null) {
            return -1;
        }
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1;
        }
        String group = matcher.group(i);
        if (group.equals(ProxyConfig.MATCH_ALL_SCHEMES)) {
            return -1;
        }
        try {
            return Integer.parseInt(group);
        } catch (Exception unused) {
            return -1;
        }
    }
}
