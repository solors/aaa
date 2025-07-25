package com.yandex.mobile.ads.impl;

import android.util.Log;
import androidx.webkit.ProxyConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C37563v;
import kotlin.collections.C37566w;
import kotlin.collections.CollectionsJVM;
import kotlin.collections._Collections;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class e42 {
    @NotNull

    /* renamed from: a */
    private static final List<String> f78451a;

    static {
        List<String> m17163p;
        m17163p = C37563v.m17163p("The integrated version of the Yandex Mobile Ads SDK is outdated.", "Please update com.yandex.android:mobileads to the latest version.");
        f78451a = m17163p;
    }

    /* renamed from: a */
    private static String m34668a(int i, String str) {
        String m16632E;
        m16632E = StringsJVM.m16632E(" ", i - str.length());
        return "* " + str + m16632E + " *";
    }

    /* renamed from: b */
    public static void m34667b() {
        List m17163p;
        List m17569J0;
        List<String> m17569J02;
        Integer valueOf;
        String m16632E;
        int m17154x;
        List m17175e;
        List m17569J03;
        List m17568K0;
        List<String> list = f78451a;
        m17163p = C37563v.m17163p("Learn more about the latest version of the SDK here:", "https://yandex.ru/dev/mobile-ads/doc/android/quick-start/android-ads-component.html");
        m17569J0 = _Collections.m17569J0(list, m17163p);
        m17569J02 = _Collections.m17569J0(m17569J0, m34669a());
        Iterator it = m17569J02.iterator();
        String str = null;
        if (!it.hasNext()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((String) it.next()).length());
            while (it.hasNext()) {
                Integer valueOf2 = Integer.valueOf(((String) it.next()).length());
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            m16632E = StringsJVM.m16632E(ProxyConfig.MATCH_ALL_SCHEMES, intValue + 4);
            m17154x = C37566w.m17154x(m17569J02, 10);
            ArrayList arrayList = new ArrayList(m17154x);
            for (String str2 : m17569J02) {
                arrayList.add(m34668a(intValue, str2));
            }
            m17175e = CollectionsJVM.m17175e(m16632E);
            m17569J03 = _Collections.m17569J0(m17175e, arrayList);
            m17568K0 = _Collections.m17568K0(m17569J03, m16632E);
            str = _Collections.m17521z0(m17568K0, "\n", null, null, 0, null, null, 62, null);
        }
        Log.e("Yandex Mobile Ads", "Yandex Mobile Ads version validation\n" + str + "\n");
    }

    /* renamed from: a */
    private static List m34669a() {
        List m17166m;
        List m17175e;
        if (C30401gl.m33821a() == null) {
            m17166m = C37563v.m17166m();
            return m17166m;
        }
        String m33821a = C30401gl.m33821a();
        m17175e = CollectionsJVM.m17175e("Changelog: " + m33821a);
        return m17175e;
    }
}
