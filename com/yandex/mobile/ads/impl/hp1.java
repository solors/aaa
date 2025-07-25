package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
final class hp1 extends fz1 {

    /* renamed from: b */
    private long f80153b;

    /* renamed from: c */
    private long[] f80154c;

    /* renamed from: d */
    private long[] f80155d;

    public hp1() {
        super(new j20());
        this.f80153b = -9223372036854775807L;
        this.f80154c = new long[0];
        this.f80155d = new long[0];
    }

    /* renamed from: a */
    public final long m33486a() {
        return this.f80153b;
    }

    /* renamed from: b */
    public final long[] m33482b() {
        return this.f80155d;
    }

    /* renamed from: c */
    public final long[] m33481c() {
        return this.f80154c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean m33484a(long j, cc1 cc1Var) {
        if (cc1Var.m35270t() != 2) {
            return false;
        }
        int m35264z = cc1Var.m35264z();
        int m35289d = cc1Var.m35289d();
        cc1Var.m35284f(m35264z);
        if ("onMetaData".equals(new String(cc1Var.m35291c(), m35289d, m35264z)) && cc1Var.m35299a() != 0 && cc1Var.m35270t() == 8) {
            HashMap<String, Object> m33483a = m33483a(cc1Var);
            Object obj = m33483a.get("duration");
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue > 0.0d) {
                    this.f80153b = (long) (doubleValue * 1000000.0d);
                }
            }
            Object obj2 = m33483a.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.f80154c = new long[size];
                    this.f80155d = new long[size];
                    for (int i = 0; i < size; i++) {
                        Object obj5 = list.get(i);
                        Object obj6 = list2.get(i);
                        if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                            this.f80154c[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                            this.f80155d[i] = ((Double) obj5).longValue();
                        } else {
                            this.f80154c = new long[0];
                            this.f80155d = new long[0];
                            break;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Nullable
    /* renamed from: a */
    private static Serializable m33485a(int i, cc1 cc1Var) {
        if (i == 8) {
            return m33483a(cc1Var);
        }
        if (i == 10) {
            int m35266x = cc1Var.m35266x();
            ArrayList arrayList = new ArrayList(m35266x);
            for (int i2 = 0; i2 < m35266x; i2++) {
                Serializable m33485a = m33485a(cc1Var.m35270t(), cc1Var);
                if (m33485a != null) {
                    arrayList.add(m33485a);
                }
            }
            return arrayList;
        } else if (i == 11) {
            Date date = new Date((long) Double.longBitsToDouble(cc1Var.m35274p()));
            cc1Var.m35284f(2);
            return date;
        } else if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(cc1Var.m35274p()));
        } else {
            if (i == 1) {
                return Boolean.valueOf(cc1Var.m35270t() == 1);
            } else if (i == 2) {
                int m35264z = cc1Var.m35264z();
                int m35289d = cc1Var.m35289d();
                cc1Var.m35284f(m35264z);
                return new String(cc1Var.m35291c(), m35289d, m35264z);
            } else if (i != 3) {
                return null;
            } else {
                HashMap hashMap = new HashMap();
                while (true) {
                    int m35264z2 = cc1Var.m35264z();
                    int m35289d2 = cc1Var.m35289d();
                    cc1Var.m35284f(m35264z2);
                    String str = new String(cc1Var.m35291c(), m35289d2, m35264z2);
                    int m35270t = cc1Var.m35270t();
                    if (m35270t == 9) {
                        return hashMap;
                    }
                    Serializable m33485a2 = m33485a(m35270t, cc1Var);
                    if (m33485a2 != null) {
                        hashMap.put(str, m33485a2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static HashMap<String, Object> m33483a(cc1 cc1Var) {
        int m35266x = cc1Var.m35266x();
        HashMap<String, Object> hashMap = new HashMap<>(m35266x);
        for (int i = 0; i < m35266x; i++) {
            int m35264z = cc1Var.m35264z();
            int m35289d = cc1Var.m35289d();
            cc1Var.m35284f(m35264z);
            String str = new String(cc1Var.m35291c(), m35289d, m35264z);
            Serializable m33485a = m33485a(cc1Var.m35270t(), cc1Var);
            if (m33485a != null) {
                hashMap.put(str, m33485a);
            }
        }
        return hashMap;
    }
}
