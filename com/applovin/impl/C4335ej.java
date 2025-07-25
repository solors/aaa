package com.applovin.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.impl.ej */
/* loaded from: classes2.dex */
final class C4335ej extends AbstractC5855xl {

    /* renamed from: b */
    private long f5938b;

    /* renamed from: c */
    private long[] f5939c;

    /* renamed from: d */
    private long[] f5940d;

    public C4335ej() {
        super(new C4512h7());
        this.f5938b = -9223372036854775807L;
        this.f5939c = new long[0];
        this.f5940d = new long[0];
    }

    /* renamed from: d */
    private static Double m99496d(C4066ah c4066ah) {
        return Double.valueOf(Double.longBitsToDouble(c4066ah.m100766s()));
    }

    /* renamed from: e */
    private static HashMap m99495e(C4066ah c4066ah) {
        int m100801A = c4066ah.m100801A();
        HashMap hashMap = new HashMap(m100801A);
        for (int i = 0; i < m100801A; i++) {
            String m99492h = m99492h(c4066ah);
            Object m99501a = m99501a(c4066ah, m99491i(c4066ah));
            if (m99501a != null) {
                hashMap.put(m99492h, m99501a);
            }
        }
        return hashMap;
    }

    /* renamed from: f */
    private static HashMap m99494f(C4066ah c4066ah) {
        HashMap hashMap = new HashMap();
        while (true) {
            String m99492h = m99492h(c4066ah);
            int m99491i = m99491i(c4066ah);
            if (m99491i == 9) {
                return hashMap;
            }
            Object m99501a = m99501a(c4066ah, m99491i);
            if (m99501a != null) {
                hashMap.put(m99492h, m99501a);
            }
        }
    }

    /* renamed from: g */
    private static ArrayList m99493g(C4066ah c4066ah) {
        int m100801A = c4066ah.m100801A();
        ArrayList arrayList = new ArrayList(m100801A);
        for (int i = 0; i < m100801A; i++) {
            Object m99501a = m99501a(c4066ah, m99491i(c4066ah));
            if (m99501a != null) {
                arrayList.add(m99501a);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    private static String m99492h(C4066ah c4066ah) {
        int m100799C = c4066ah.m100799C();
        int m100785d = c4066ah.m100785d();
        c4066ah.m100778g(m100799C);
        return new String(c4066ah.m100787c(), m100785d, m100799C);
    }

    /* renamed from: i */
    private static int m99491i(C4066ah c4066ah) {
        return c4066ah.m100762w();
    }

    @Override // com.applovin.impl.AbstractC5855xl
    /* renamed from: a */
    protected boolean mo92617a(C4066ah c4066ah) {
        return true;
    }

    /* renamed from: b */
    public long[] m99500b() {
        return this.f5940d;
    }

    /* renamed from: c */
    public long[] m99498c() {
        return this.f5939c;
    }

    /* renamed from: c */
    private static Date m99497c(C4066ah c4066ah) {
        Date date = new Date((long) m99496d(c4066ah).doubleValue());
        c4066ah.m100778g(2);
        return date;
    }

    /* renamed from: a */
    public long m99502a() {
        return this.f5938b;
    }

    @Override // com.applovin.impl.AbstractC5855xl
    /* renamed from: b */
    protected boolean mo92616b(C4066ah c4066ah, long j) {
        if (m99491i(c4066ah) == 2 && "onMetaData".equals(m99492h(c4066ah)) && m99491i(c4066ah) == 8) {
            HashMap m99495e = m99495e(c4066ah);
            Object obj = m99495e.get("duration");
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue > 0.0d) {
                    this.f5938b = (long) (doubleValue * 1000000.0d);
                }
            }
            Object obj2 = m99495e.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.f5939c = new long[size];
                    this.f5940d = new long[size];
                    for (int i = 0; i < size; i++) {
                        Object obj5 = list.get(i);
                        Object obj6 = list2.get(i);
                        if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                            this.f5939c[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                            this.f5940d[i] = ((Double) obj5).longValue();
                        } else {
                            this.f5939c = new long[0];
                            this.f5940d = new long[0];
                            break;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: a */
    private static Object m99501a(C4066ah c4066ah, int i) {
        if (i != 8) {
            if (i != 10) {
                if (i != 11) {
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    return null;
                                }
                                return m99494f(c4066ah);
                            }
                            return m99492h(c4066ah);
                        }
                        return m99499b(c4066ah);
                    }
                    return m99496d(c4066ah);
                }
                return m99497c(c4066ah);
            }
            return m99493g(c4066ah);
        }
        return m99495e(c4066ah);
    }

    /* renamed from: b */
    private static Boolean m99499b(C4066ah c4066ah) {
        return Boolean.valueOf(c4066ah.m100762w() == 1);
    }
}
