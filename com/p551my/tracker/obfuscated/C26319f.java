package com.p551my.tracker.obfuscated;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.my.tracker.obfuscated.f */
/* loaded from: classes7.dex */
public final class C26319f {

    /* renamed from: b */
    private List<PackageInfo> f68571b;

    /* renamed from: c */
    private String f68572c;

    /* renamed from: a */
    private List<C26320a> f68570a = Collections.EMPTY_LIST;

    /* renamed from: d */
    private boolean f68573d = false;

    /* renamed from: com.my.tracker.obfuscated.f$a */
    /* loaded from: classes7.dex */
    public static final class C26320a {

        /* renamed from: a */
        public final String f68574a;

        /* renamed from: b */
        public final long f68575b;

        C26320a(String str, long j) {
            this.f68574a = str;
            this.f68575b = j;
        }
    }

    /* renamed from: a */
    private static String m42081a(List<C26320a> list) {
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        for (C26320a c26320a : list) {
            if (z) {
                sb2.append(",");
            } else {
                z = true;
            }
            sb2.append(c26320a.f68574a);
        }
        return sb2.toString();
    }

    /* renamed from: b */
    private static List<C26320a> m42079b(List<PackageInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (PackageInfo packageInfo : list) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if ((applicationInfo.flags & 1) == 0) {
                arrayList.add(new C26320a(applicationInfo.packageName, C26461y0.m41538b(packageInfo.firstInstallTime)));
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public void m42078c(List<PackageInfo> list) {
        this.f68571b = list;
    }

    /* renamed from: a */
    public void m42083a(Context context) {
        String str;
        this.f68573d = false;
        List<PackageInfo> list = this.f68571b;
        if (list == null || list.isEmpty()) {
            return;
        }
        List<C26320a> m42079b = m42079b(this.f68571b);
        this.f68570a = m42079b;
        String m42081a = m42081a(m42079b);
        if (TextUtils.isEmpty(m42081a)) {
            return;
        }
        String m41747f = C26400r0.m41763a(context).m41747f();
        String m41919a = C26372n.m41919a(m42081a);
        this.f68572c = m41919a;
        if (m41747f.equals(m41919a)) {
            str = "Apps hash did not changed";
        } else {
            this.f68573d = true;
            str = "Apps hash changed";
        }
        C26468z0.m41528a(str);
    }

    /* renamed from: b */
    public void m42080b(Context context) {
        if (this.f68573d) {
            C26400r0.m41763a(context).m41742h(this.f68572c);
            this.f68573d = false;
        }
    }

    /* renamed from: a */
    public void m42082a(C26405s0 c26405s0, Context context) {
        if (!this.f68573d || this.f68570a.isEmpty()) {
            return;
        }
        c26405s0.m41704a(this.f68570a);
    }
}
