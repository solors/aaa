package com.fyber.inneractive.sdk.web;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.AbstractC15471s;
import com.google.common.net.HttpHeaders;
import io.appmetrica.analytics.BuildConfig;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.fyber.inneractive.sdk.web.d0 */
/* loaded from: classes4.dex */
public final class C15520d0 {

    /* renamed from: g */
    public static final Pattern f30738g = Pattern.compile("max-age=(\\d+)");

    /* renamed from: h */
    public static final SimpleDateFormat f30739h = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.ENGLISH);

    /* renamed from: a */
    public final byte[] f30740a;

    /* renamed from: b */
    public final Map f30741b;

    /* renamed from: c */
    public final String f30742c;

    /* renamed from: d */
    public final String f30743d;

    /* renamed from: e */
    public final int f30744e;

    /* renamed from: f */
    public final String f30745f;

    public C15520d0(byte[] bArr, HashMap hashMap, String str, String str2, int i, String str3) {
        this.f30740a = bArr;
        this.f30741b = hashMap;
        this.f30742c = str;
        this.f30743d = str2;
        this.f30744e = i;
        this.f30745f = str3;
    }

    /* renamed from: a */
    public final boolean m76404a() {
        boolean z;
        String str;
        int i;
        if (TextUtils.isEmpty(this.f30745f)) {
            return false;
        }
        loop0: while (true) {
            z = true;
            for (String str2 : this.f30741b.keySet()) {
                if (!z) {
                    break loop0;
                } else if (str2 != null && str2.equalsIgnoreCase("Cache-Control")) {
                    String str3 = (String) this.f30741b.get(str2);
                    if (str3 != null) {
                        Pattern pattern = f30738g;
                        Locale locale = Locale.ENGLISH;
                        Matcher matcher = pattern.matcher(str3.toLowerCase(locale));
                        if (matcher.find() && matcher.groupCount() == 1) {
                            i = AbstractC15471s.m76461a(matcher.group(1), 0);
                        } else {
                            i = 0;
                        }
                        if ((str3.toLowerCase(locale).contains(BuildConfig.SDK_BUILD_FLAVOR) || str3.toLowerCase(locale).contains("private") || i > TimeUnit.SECONDS.convert(1L, TimeUnit.HOURS)) && !str3.toLowerCase(locale).contains("no-") && !str3.toLowerCase(locale).contains("must-")) {
                            break;
                        }
                        z = false;
                    } else {
                        continue;
                    }
                } else {
                    if (str2 == null || !str2.equalsIgnoreCase(HttpHeaders.VARY)) {
                        if (str2 != null && str2.equalsIgnoreCase(HttpHeaders.PRAGMA)) {
                            String str4 = (String) this.f30741b.get(str2);
                            if (str4 != null) {
                                z = !str4.equalsIgnoreCase("no-cache");
                            }
                        } else if (str2 != null && str2.equalsIgnoreCase("Expires") && (str = (String) this.f30741b.get(str2)) != null) {
                            try {
                                Date parse = f30739h.parse(str);
                                if (parse != null && parse.getTime() + TimeUnit.MILLISECONDS.convert(1L, TimeUnit.HOURS) > System.currentTimeMillis()) {
                                    break;
                                }
                            } catch (ParseException unused) {
                                continue;
                            }
                        }
                    }
                    z = false;
                }
            }
        }
        return z;
    }
}
