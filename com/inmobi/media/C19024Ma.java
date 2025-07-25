package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import com.inmobi.commons.core.configs.SignalsConfig;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.C37563v;
import kotlin.collections._Collections;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.Ma */
/* loaded from: classes6.dex */
public final class C19024Ma {

    /* renamed from: d */
    public static String f47521d;

    /* renamed from: e */
    public static boolean f47522e;

    /* renamed from: f */
    public static long f47523f;

    /* renamed from: g */
    public static final List f47524g;

    /* renamed from: h */
    public static final SignalsConfig.SessionConfig f47525h;

    /* renamed from: i */
    public static final AtomicBoolean f47526i;

    /* renamed from: j */
    public static final C19508w5 f47527j;

    /* renamed from: k */
    public static final C19210b1 f47528k;

    /* renamed from: l */
    public static final C19210b1 f47529l;

    /* renamed from: b */
    public static final /* synthetic */ KProperty[] f47519b = {Reflection.m17036h(new PropertyReference1Impl(C19024Ma.class, "sessionCnt", "getSessionCnt()I", 0)), Reflection.m17036h(new PropertyReference1Impl(C19024Ma.class, "userRetention", "getUserRetention()I", 0))};

    /* renamed from: a */
    public static final C19024Ma f47518a = new C19024Ma();

    /* renamed from: c */
    public static final String f47520c = C19024Ma.class.getSimpleName();

    static {
        List m17160s;
        m17160s = C37563v.m17160s(0, 0, 0, 0);
        f47524g = m17160s;
        LinkedHashMap linkedHashMap = C19379n2.f48527a;
        C19508w5 c19508w5 = null;
        f47525h = ((SignalsConfig) AbstractC19423q4.m59930a("signals", "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig", null)).getSessionConfig();
        f47526i = new AtomicBoolean(false);
        Context m61068d = C18954Ha.m61068d();
        if (m61068d != null) {
            ConcurrentHashMap concurrentHashMap = C19508w5.f48819b;
            c19508w5 = AbstractC19494v5.m59823a(m61068d, "session_pref_file");
        }
        f47527j = c19508w5;
        f47528k = new C19210b1((Integer) (-1), (Functions) C18996Ka.f47405a, false, 12);
        f47529l = new C19210b1((Integer) (-1), (Functions) C19010La.f47442a, false, 12);
    }

    /* renamed from: a */
    public static int m60870a() {
        C19508w5 c19508w5 = f47527j;
        if (c19508w5 == null) {
            return 0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Intrinsics.checkNotNullParameter("u-ret", "key");
        return Integer.min((int) ((currentTimeMillis - c19508w5.f48820a.getLong("u-ret", currentTimeMillis)) / 86400000), Integer.MAX_VALUE);
    }

    /* renamed from: c */
    public static void m60866c() {
        if (f47526i.getAndSet(true)) {
            return;
        }
        if (C19037Na.m60852a().isSessionEnabled()) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            f47521d = uuid;
            String TAG = f47520c;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        }
        f47523f = System.currentTimeMillis() - Process.getElapsedCpuTime();
        if (m60869a(5)) {
            C19508w5 c19508w5 = f47527j;
            if (c19508w5 != null) {
                Intrinsics.checkNotNullParameter("cnt", "key");
                int min = Integer.min(c19508w5.f48820a.getInt("cnt", 0) + 1, Integer.MAX_VALUE);
                Intrinsics.checkNotNullParameter("cnt", "key");
                SharedPreferences.Editor edit = c19508w5.f48820a.edit();
                edit.putInt("cnt", min);
                edit.apply();
            }
            f47528k.m60488a();
        }
        if (m60869a(6)) {
            C19508w5 c19508w52 = f47527j;
            if (c19508w52 != null) {
                Intrinsics.checkNotNullParameter("u-ret", "key");
                if (!c19508w52.f48820a.contains("u-ret")) {
                    long currentTimeMillis = System.currentTimeMillis();
                    Intrinsics.checkNotNullParameter("u-ret", "key");
                    SharedPreferences.Editor edit2 = c19508w52.f48820a.edit();
                    edit2.putLong("u-ret", currentTimeMillis);
                    edit2.apply();
                }
            }
            f47529l.m60488a();
        }
    }

    /* renamed from: b */
    public final JSONObject m60867b() {
        List<Number> m17550c1;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (m60869a(0)) {
            linkedHashMap.put("st", Long.valueOf(f47523f));
        }
        if (m60869a(5)) {
            C19210b1 c19210b1 = f47528k;
            KProperty[] kPropertyArr = f47519b;
            if (((Number) c19210b1.getValue(this, kPropertyArr[0])).intValue() != -1) {
                linkedHashMap.put("cnt", Integer.valueOf(((Number) c19210b1.getValue(this, kPropertyArr[0])).intValue()));
            }
        }
        if (m60869a(6)) {
            C19210b1 c19210b12 = f47529l;
            KProperty[] kPropertyArr2 = f47519b;
            if (((Number) c19210b12.getValue(this, kPropertyArr2[1])).intValue() != -1) {
                linkedHashMap.put("u-ret", Integer.valueOf(((Number) c19210b12.getValue(this, kPropertyArr2[1])).intValue()));
            }
        }
        m17550c1 = _Collections.m17550c1(f47524g);
        if (!m60869a(1)) {
            m17550c1.set(0, -1);
        }
        if (!m60869a(2)) {
            m17550c1.set(1, -1);
        }
        if (!m60869a(3)) {
            m17550c1.set(2, -1);
        }
        if (!m60869a(4)) {
            m17550c1.set(3, -1);
        }
        if (!(m17550c1 instanceof Collection) || !m17550c1.isEmpty()) {
            for (Number number : m17550c1) {
                if (number.intValue() != -1) {
                    linkedHashMap.put("dep", m17550c1);
                    break;
                }
            }
        }
        try {
            return new JSONObject(linkedHashMap);
        } catch (Exception unused) {
            return new JSONObject();
        }
    }

    /* renamed from: a */
    public static boolean m60869a(int i) {
        return f47525h.getSigControlList().contains(Integer.valueOf(i));
    }

    /* renamed from: a */
    public static void m60868a(String adtype, Boolean bool) {
        Intrinsics.checkNotNullParameter(adtype, "adtype");
        if (Intrinsics.m17075f(adtype, "banner") && m60869a(1)) {
            List list = f47524g;
            list.set(0, Integer.valueOf(Integer.min(((Number) list.get(0)).intValue() + 1, Integer.MAX_VALUE)));
        }
        if (Intrinsics.m17075f(adtype, "int") && !Intrinsics.m17075f(bool, Boolean.TRUE) && m60869a(2)) {
            List list2 = f47524g;
            list2.set(1, Integer.valueOf(Integer.min(((Number) list2.get(1)).intValue() + 1, Integer.MAX_VALUE)));
        }
        if (Intrinsics.m17075f(adtype, "native") && m60869a(4)) {
            List list3 = f47524g;
            list3.set(3, Integer.valueOf(Integer.min(((Number) list3.get(3)).intValue() + 1, Integer.MAX_VALUE)));
        }
        if (Intrinsics.m17075f(bool, Boolean.TRUE) && m60869a(3)) {
            List list4 = f47524g;
            list4.set(2, Integer.valueOf(Integer.min(((Number) list4.get(2)).intValue() + 1, Integer.MAX_VALUE)));
        }
    }
}
