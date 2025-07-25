package com.five_corp.p372ad.internal.storage;

import android.os.Handler;
import android.os.Looper;
import com.five_corp.p372ad.AbstractC13610e;
import com.five_corp.p372ad.internal.AbstractC13624J;
import com.five_corp.p372ad.internal.C14068s;
import com.five_corp.p372ad.internal.cache.C13741n;
import com.five_corp.p372ad.internal.handler.C13781a;
import com.five_corp.p372ad.internal.logger.C13836a;
import com.five_corp.p372ad.internal.p373ad.C13691u;
import com.five_corp.p372ad.internal.util.C14118f;
import com.five_corp.p372ad.internal.util.C14119g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.five_corp.ad.internal.storage.e */
/* loaded from: classes4.dex */
public final class C14080e {

    /* renamed from: a */
    public final C14087l f26261a;

    /* renamed from: b */
    public final C14093r f26262b;

    /* renamed from: c */
    public final C13781a f26263c;

    /* renamed from: d */
    public final C13836a f26264d;

    /* renamed from: e */
    public final Object f26265e = new Object();

    /* renamed from: f */
    public final HashMap f26266f = new HashMap();

    /* renamed from: g */
    public final HashMap f26267g = new HashMap();

    public C14080e(C14087l c14087l, C14093r c14093r, C13781a c13781a, C13836a c13836a) {
        this.f26261a = c14087l;
        this.f26262b = c14093r;
        this.f26263c = c13781a;
        this.f26264d = c13836a;
    }

    /* renamed from: a */
    public final C13741n m78115a(String str, boolean z, boolean z2) {
        C14078c c14078c = (C14078c) this.f26261a.f26284a;
        C14076a c14076a = new C14076a(c14078c, str, c14078c.f26259b);
        Pattern pattern = C14093r.f26299b;
        C14076a c14076a2 = new C14076a(c14078c, str + ".success", c14078c.f26259b);
        Looper m78376a = this.f26263c.m78376a();
        Handler handler = m78376a != null ? new Handler(m78376a) : null;
        if (z2) {
            handler.post(new RunnableC14079d(c14076a));
        }
        return new C13741n(handler, c14076a, c14076a2, z);
    }

    /* renamed from: b */
    public final C13741n m78112b(C13691u c13691u) {
        Pattern pattern = C14093r.f26299b;
        String m78476a = AbstractC13624J.m78476a(c13691u.f25401a);
        HashMap hashMap = c13691u.f25403c ? this.f26266f : this.f26267g;
        C13741n c13741n = (C13741n) hashMap.get(m78476a);
        if (c13741n == null) {
            int nextInt = this.f26262b.f26300a.nextInt(1073741824);
            String str = c13691u.f25403c ? "res5" : "res6";
            String m78476a2 = AbstractC13624J.m78476a(c13691u.f25401a);
            String format = String.format("%08X", Integer.valueOf(nextInt));
            Matcher matcher = C14093r.f26299b.matcher(c13691u.f25401a);
            String group = !matcher.find() ? "" : matcher.group(1);
            C13741n m78115a = m78115a(str + "=" + m78476a2 + "=" + format + group, false, true);
            hashMap.put(m78476a, m78115a);
            return m78115a;
        }
        return c13741n;
    }

    /* renamed from: b */
    public final C14119g m78111b(String str) {
        int i;
        C14119g c14119g;
        C14118f c14118f;
        C14119g m78122b = ((C14078c) this.f26261a.f26284a).m78122b();
        if (m78122b.f26746a) {
            C14118f m78121b = ((C14078c) this.f26261a.f26284a).m78121b("storage.id");
            if (m78121b.f26746a) {
                if (!((Boolean) m78121b.f26748c).booleanValue()) {
                    c14118f = new C14118f(true, null, Boolean.TRUE);
                } else {
                    C14118f m78119d = ((C14078c) this.f26261a.f26284a).m78119d("storage.id");
                    if (!m78119d.f26746a) {
                        c14118f = new C14118f(false, m78119d.f26747b, null);
                    } else {
                        C14081f c14081f = (C14081f) m78119d.f26748c;
                        c14118f = new C14118f(true, null, Boolean.valueOf(!new String(c14081f.f26268a, 0, c14081f.f26269b).equals(str)));
                    }
                }
                m78121b = c14118f;
            }
            if (!m78121b.f26746a) {
                return new C14119g(false, m78121b.f26747b);
            }
            if (((Boolean) m78121b.f26748c).booleanValue()) {
                C14118f m78125a = ((C14078c) this.f26261a.f26284a).m78125a();
                if (!m78125a.f26746a) {
                    c14119g = new C14119g(false, m78125a.f26747b);
                } else {
                    for (String str2 : (List) m78125a.f26748c) {
                        m78116a(str2);
                    }
                    c14119g = new C14119g(true, null);
                }
                if (!c14119g.f26746a) {
                    return c14119g;
                }
                C14119g m78123a = ((C14078c) this.f26261a.f26284a).m78123a("storage.id", str.getBytes());
                if (!m78123a.f26746a) {
                    return m78123a;
                }
            }
            C14118f m78125a2 = ((C14078c) this.f26261a.f26284a).m78125a();
            if (!m78125a2.f26746a) {
                return new C14119g(false, m78125a2.f26747b);
            }
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for (String str3 : (List) m78125a2.f26748c) {
                Pattern pattern = C14093r.f26299b;
                if (str3.equals("storage.id")) {
                    i = 2;
                } else if (str3.endsWith(".success")) {
                    i = 5;
                } else if (!str3.startsWith("res5") || str3.endsWith(".success") || C14093r.m78106a(str3) == null) {
                    i = (!str3.startsWith("res6") || str3.endsWith(".success") || C14093r.m78106a(str3) == null) ? 1 : 4;
                } else {
                    i = 3;
                }
                int m78552a = AbstractC13610e.m78552a(i);
                if (m78552a == 0) {
                    arrayList4.add(str3);
                } else if (m78552a == 2) {
                    String m78106a = C14093r.m78106a(str3);
                    if (hashSet.contains(m78106a)) {
                        m78116a(str3);
                    } else {
                        arrayList.add(str3);
                        hashSet.add(m78106a);
                    }
                } else if (m78552a == 3) {
                    String m78106a2 = C14093r.m78106a(str3);
                    if (hashSet2.contains(m78106a2)) {
                        m78116a(str3);
                    } else {
                        arrayList2.add(str3);
                        hashSet2.add(m78106a2);
                    }
                } else if (m78552a == 4) {
                    arrayList3.add(str3);
                }
            }
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                Pattern pattern2 = C14093r.f26299b;
                String substring = str4.substring(0, str4.length() - 8);
                if (!arrayList.contains(substring) && !arrayList2.contains(substring)) {
                    m78116a(str4);
                }
            }
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                m78116a((String) it2.next());
            }
            synchronized (this.f26265e) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    String str5 = (String) it3.next();
                    Pattern pattern3 = C14093r.f26299b;
                    this.f26266f.put(C14093r.m78106a(str5), m78115a(str5, arrayList3.contains(str5 + ".success"), false));
                }
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    String str6 = (String) it4.next();
                    Pattern pattern4 = C14093r.f26299b;
                    this.f26267g.put(C14093r.m78106a(str6), m78115a(str6, arrayList3.contains(str6 + ".success"), false));
                }
            }
            return new C14119g(true, null);
        }
        return m78122b;
    }

    /* renamed from: a */
    public final void m78114a(HashSet hashSet) {
        HashSet hashSet2 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Pattern pattern = C14093r.f26299b;
            hashSet2.add(AbstractC13624J.m78476a(((C13691u) it.next()).f25401a));
        }
        synchronized (this.f26265e) {
            Iterator it2 = this.f26267g.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet2.contains(entry.getKey())) {
                    ((C13741n) entry.getValue()).m78414a();
                    it2.remove();
                }
            }
        }
    }

    /* renamed from: a */
    public final void m78116a(String str) {
        C14119g m78124a = ((C14078c) this.f26261a.f26284a).m78124a(str);
        if (m78124a.f26746a) {
            return;
        }
        C13836a c13836a = this.f26264d;
        C14068s c14068s = m78124a.f26747b;
        c13836a.getClass();
        c13836a.m78270a(c14068s.m78136b());
    }

    /* renamed from: a */
    public final C13741n m78117a(C13691u c13691u) {
        C13741n m78112b;
        synchronized (this.f26265e) {
            m78112b = m78112b(c13691u);
        }
        return m78112b;
    }

    /* renamed from: a */
    public final HashMap m78113a(List list) {
        HashMap hashMap;
        synchronized (this.f26265e) {
            hashMap = new HashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C13691u c13691u = (C13691u) it.next();
                hashMap.put(c13691u, m78112b(c13691u));
            }
        }
        return hashMap;
    }
}
