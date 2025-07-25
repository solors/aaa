package com.taurusx.tax.p597g.p599b;

import android.text.TextUtils;
import com.taurusx.tax.p578b.C28207b;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.taurusx.tax.g.b.d */
/* loaded from: classes7.dex */
public class C28397d {

    /* renamed from: d */
    public static final Pattern f73781d = Pattern.compile("[R,r]ange:[ ]?bytes=(\\d*)-");

    /* renamed from: e */
    public static final Pattern f73782e = Pattern.compile("GET /(.*) HTTP");

    /* renamed from: a */
    public final String f73783a;

    /* renamed from: b */
    public final long f73784b;

    /* renamed from: c */
    public final boolean f73785c;

    public C28397d(String str) {
        boolean z;
        C28207b.m38455a(str);
        long m38140a = m38140a(str);
        this.f73784b = Math.max(0L, m38140a);
        if (m38140a >= 0) {
            z = true;
        } else {
            z = false;
        }
        this.f73785c = z;
        this.f73783a = m38139b(str);
    }

    /* renamed from: a */
    public static C28397d m38141a(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (!TextUtils.isEmpty(readLine)) {
                sb2.append(readLine);
                sb2.append('\n');
            } else {
                return new C28397d(sb2.toString());
            }
        }
    }

    /* renamed from: b */
    public final String m38139b(String str) {
        Matcher matcher = f73782e.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        throw new IllegalArgumentException("Invalid request `" + str + "`: url not found!");
    }

    public String toString() {
        return "GetRequest{rangeOffset=" + this.f73784b + ", partial=" + this.f73785c + ", uri='" + this.f73783a + "'}";
    }

    /* renamed from: a */
    public final long m38140a(String str) {
        Matcher matcher = f73781d.matcher(str);
        if (matcher.find()) {
            return Long.parseLong(matcher.group(1));
        }
        return -1L;
    }
}
