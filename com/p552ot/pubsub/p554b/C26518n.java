package com.p552ot.pubsub.p554b;

import android.text.TextUtils;
import com.p552ot.pubsub.p555c.C26526f;
import com.p552ot.pubsub.util.C26586j;
import com.p552ot.pubsub.util.C26587k;
import com.p552ot.pubsub.util.C26590l;

/* renamed from: com.ot.pubsub.b.n */
/* loaded from: classes7.dex */
public class C26518n {

    /* renamed from: a */
    private static String f69376a = "ConfigProvider";

    /* renamed from: b */
    private static volatile boolean f69377b = false;

    /* renamed from: c */
    private static volatile boolean f69378c = true;

    /* renamed from: a */
    public static boolean m41385a() {
        try {
            String[] m41323b = C26526f.m41324a().m41323b();
            return (!TextUtils.isEmpty(m41323b[0]) && !TextUtils.isEmpty(m41323b[1])) && !C26590l.m41044c(f69376a);
        } catch (Exception e) {
            C26586j.m41078a(f69376a, "ConfigProvider.available", e);
            return false;
        }
    }

    /* renamed from: b */
    public static synchronized boolean m41382b() {
        boolean z;
        synchronized (C26518n.class) {
            z = f69377b;
        }
        return z;
    }

    /* renamed from: c */
    public static boolean m41381c() {
        return C26587k.m41063a();
    }

    /* renamed from: a */
    public static int m41384a(int i) {
        int i2;
        if (C26586j.f69735b) {
            C26586j.m41080a(f69376a, "debug upload mode, send events immediately");
            return 0;
        }
        try {
            i2 = C26508e.m41412c().get(Integer.valueOf(i + 1)).intValue();
        } catch (Exception unused) {
            i2 = 60000;
        }
        String str = f69376a;
        C26586j.m41080a(str, "getUploadInterval " + i2);
        return i2;
    }

    /* renamed from: a */
    public static synchronized void m41383a(boolean z) {
        synchronized (C26518n.class) {
            f69377b = z;
        }
    }
}
