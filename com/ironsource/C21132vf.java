package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.vf */
/* loaded from: classes6.dex */
public class C21132vf implements InterfaceC21011td {

    /* renamed from: a */
    private static Map<String, Object> f54197a = new HashMap();

    /* renamed from: com.ironsource.vf$b */
    /* loaded from: classes6.dex */
    public static class C21134b {

        /* renamed from: a */
        String f54198a;

        /* renamed from: b */
        String f54199b;

        /* renamed from: c */
        String f54200c;

        /* renamed from: d */
        Context f54201d;

        /* renamed from: e */
        String f54202e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public C21134b m54456a(Context context) {
            this.f54201d = context;
            return this;
        }

        /* renamed from: b */
        C21134b m54454b(String str) {
            this.f54200c = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public C21134b m54453c(String str) {
            this.f54198a = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public C21134b m54452d(String str) {
            this.f54202e = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public C21134b m54455a(String str) {
            this.f54199b = str;
            return this;
        }

        /* renamed from: a */
        public C21132vf m54457a() {
            return new C21132vf(this);
        }
    }

    private C21132vf(C21134b c21134b) {
        m54460a(c21134b);
        m54461a(c21134b.f54201d);
    }

    /* renamed from: b */
    public static void m54458b(String str) {
        f54197a.put(C20517nb.f52180f, SDKUtils.encodeString(str));
    }

    @Override // com.ironsource.InterfaceC21011td
    /* renamed from: a */
    public Map<String, Object> mo54462a() {
        return f54197a;
    }

    /* renamed from: a */
    private void m54461a(Context context) {
        f54197a.put(C20517nb.f52179e, C20793s8.m55379b(context));
        f54197a.put(C20517nb.f52180f, C20793s8.m55376d(context));
    }

    /* renamed from: a */
    private void m54460a(C21134b c21134b) {
        Context context = c21134b.f54201d;
        C20256la m57510b = C20256la.m57510b(context);
        f54197a.put(C20517nb.f52184j, SDKUtils.encodeString(m57510b.m57507e()));
        f54197a.put(C20517nb.f52185k, SDKUtils.encodeString(m57510b.m57506f()));
        f54197a.put(C20517nb.f52186l, Integer.valueOf(m57510b.m57513a()));
        f54197a.put(C20517nb.f52187m, SDKUtils.encodeString(m57510b.m57508d()));
        f54197a.put(C20517nb.f52188n, SDKUtils.encodeString(m57510b.m57509c()));
        f54197a.put("bundleid", SDKUtils.encodeString(context.getPackageName()));
        f54197a.put(C20517nb.f52181g, SDKUtils.encodeString(c21134b.f54199b));
        f54197a.put("sessionid", SDKUtils.encodeString(c21134b.f54198a));
        f54197a.put(C20517nb.f52176b, SDKUtils.encodeString(SDKUtils.getSDKVersion()));
        f54197a.put(C20517nb.f52189o, C20517nb.f52194t);
        f54197a.put("origin", "n");
        if (TextUtils.isEmpty(c21134b.f54202e)) {
            return;
        }
        f54197a.put(C20517nb.f52183i, SDKUtils.encodeString(c21134b.f54202e));
    }

    /* renamed from: a */
    public static void m54459a(String str) {
        f54197a.put(C20517nb.f52179e, SDKUtils.encodeString(str));
    }
}
