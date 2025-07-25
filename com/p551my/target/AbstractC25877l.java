package com.p551my.target;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.p551my.target.AbstractC26098t;
import com.p551my.target.C26084s5;
import com.p551my.target.common.MyTargetManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.my.target.l */
/* loaded from: classes7.dex */
public abstract class AbstractC25877l {

    /* renamed from: f */
    public static String f67152f = "ad.mail.ru";

    /* renamed from: g */
    public static String f67153g = "https://";

    /* renamed from: a */
    public final InterfaceC25878a f67154a;

    /* renamed from: b */
    public final C25832j f67155b;

    /* renamed from: c */
    public final C26084s5.C26085a f67156c;

    /* renamed from: d */
    public String f67157d;

    /* renamed from: e */
    public InterfaceC25879b f67158e;

    /* renamed from: com.my.target.l$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC25878a {
        /* renamed from: a */
        AbstractC26098t mo42263a();

        /* renamed from: b */
        AbstractC25993p mo42262b();

        /* renamed from: c */
        boolean mo42261c();

        /* renamed from: d */
        AbstractC25965o mo42260d();
    }

    /* renamed from: com.my.target.l$b */
    /* loaded from: classes7.dex */
    public interface InterfaceC25879b {
        /* renamed from: a */
        void mo18137a(AbstractC26019q abstractC26019q, C25902m c25902m);
    }

    public AbstractC25877l(InterfaceC25878a interfaceC25878a, C25832j c25832j, C26084s5.C26085a c26085a) {
        this.f67154a = interfaceC25878a;
        this.f67155b = c25832j;
        this.f67156c = c26085a;
    }

    /* renamed from: a */
    public static void m43577a(C26084s5 c26084s5, int i, long j) {
        c26084s5.m42912a(i, System.currentTimeMillis() - j);
    }

    /* renamed from: b */
    public final /* synthetic */ void m43569b(final C26084s5 c26084s5, final Context context) {
        mo42268a(c26084s5, context, new InterfaceC25879b() { // from class: com.my.target.oc
            {
                AbstractC25877l.this = this;
            }

            @Override // com.p551my.target.AbstractC25877l.InterfaceC25879b
            /* renamed from: a */
            public final void mo18137a(AbstractC26019q abstractC26019q, C25902m c25902m) {
                AbstractC25877l.this.m43576a(c26084s5, context, abstractC26019q, c25902m);
            }
        });
    }

    /* renamed from: b */
    public static long m43570b(C26084s5 c26084s5, int i, long j) {
        long currentTimeMillis = System.currentTimeMillis();
        c26084s5.m42908b(i, currentTimeMillis - j);
        return currentTimeMillis;
    }

    /* renamed from: a */
    public void mo42268a(final C26084s5 c26084s5, final Context context, final InterfaceC25879b interfaceC25879b) {
        AbstractC25679c5.m44090c(context);
        if (!C26239y1.m42396a(context)) {
            interfaceC25879b.mo18137a(null, C25902m.f67222d);
            return;
        }
        final C25634a8 m44224a = C25634a8.m44224a(context);
        final ArrayList arrayList = new ArrayList();
        String m44211f = m44224a.m44211f();
        if (!TextUtils.isEmpty(m44211f)) {
            Collections.addAll(arrayList, m44211f.split(","));
        }
        arrayList.add(f67152f);
        final AbstractC26098t mo42263a = this.f67154a.mo42263a();
        mo42263a.mo42882a((String) arrayList.get(0), this.f67155b, c26084s5, context, new AbstractC26098t.InterfaceC26100b() { // from class: com.my.target.pc
            @Override // com.p551my.target.AbstractC26098t.InterfaceC26100b
            /* renamed from: a */
            public final void mo42878a(C26073s c26073s, String str) {
                AbstractC25877l.this.m43575a(c26084s5, arrayList, mo42263a, m44224a, context, interfaceC25879b, c26073s, str);
            }
        });
    }

    /* renamed from: a */
    public void m43576a(final AbstractC26019q abstractC26019q, final C25902m c25902m, C26084s5 c26084s5, Context context) {
        c26084s5.m42907b(context);
        if (this.f67158e == null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            AbstractC25671c0.m44121e(new Runnable() { // from class: com.my.target.mc
                {
                    AbstractC25877l.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC25877l.this.m43580a(abstractC26019q, c25902m);
                }
            });
            return;
        }
        this.f67158e.mo18137a(abstractC26019q, c25902m);
        this.f67158e = null;
    }

    /* renamed from: a */
    public AbstractC25877l mo42269a(final C26084s5 c26084s5, Context context) {
        final Context applicationContext = context.getApplicationContext();
        if (!MyTargetManager.isSdkInitialized()) {
            MyTargetManager.initSdk(applicationContext);
        }
        AbstractC25671c0.m44127a(new Runnable() { // from class: com.my.target.nc
            {
                AbstractC25877l.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC25877l.this.m43569b(c26084s5, applicationContext);
            }
        });
        return this;
    }

    /* renamed from: a */
    public AbstractC26019q m43578a(AbstractC26019q abstractC26019q, C25923n c25923n, Context context) {
        AbstractC25993p mo42262b;
        return (abstractC26019q == null || (mo42262b = this.f67154a.mo42262b()) == null) ? abstractC26019q : mo42262b.mo42432a(abstractC26019q, this.f67155b, c25923n, context);
    }

    /* renamed from: a */
    public final /* synthetic */ void m43580a(AbstractC26019q abstractC26019q, C25902m c25902m) {
        InterfaceC25879b interfaceC25879b = this.f67158e;
        if (interfaceC25879b != null) {
            interfaceC25879b.mo18137a(abstractC26019q, c25902m);
            this.f67158e = null;
        }
    }

    /* renamed from: a */
    public final void m43575a(C26073s c26073s, String str, C26084s5 c26084s5, List list, AbstractC26098t abstractC26098t, C25634a8 c25634a8, Context context, InterfaceC25879b interfaceC25879b) {
        long j;
        String str2;
        String join;
        C25634a8 c25634a82;
        InterfaceC25879b interfaceC25879b2;
        Context context2;
        C26084s5 c26084s52;
        if (c26073s == null) {
            interfaceC25879b.mo18137a(null, C25902m.f67233o);
            return;
        }
        C26239y1 m42397a = C26239y1.m42397a();
        c26084s5.m42909b();
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder();
        HashMap hashMap = new HashMap();
        int size = list.size() - 1;
        int i = 0;
        C25674c2 c25674c2 = null;
        while (true) {
            if (i > size) {
                j = currentTimeMillis;
                break;
            }
            String str3 = (String) list.get(i);
            StringBuilder sb3 = new StringBuilder();
            C25674c2 c25674c22 = c25674c2;
            sb3.append(f67153g);
            sb3.append(str3);
            sb3.append("/mobile/");
            j = currentTimeMillis;
            C26128u mo43573a = mo43573a(abstractC26098t.m42883a(sb3.toString(), this.f67155b, c26073s.f67806a), m42397a, hashMap, context);
            C25674c2 c25674c23 = (C25674c2) mo43573a.f67974a;
            c25674c2 = c25674c23 != null ? c25674c23 : c25674c22;
            String str4 = (String) mo43573a.f67975b;
            if (AbstractC25965o.m43307a(str4)) {
                str2 = str4;
                break;
            } else if (i == size) {
                break;
            } else {
                if (sb2.length() != 0) {
                    sb2.append(",");
                }
                sb2.append(str3);
                hashMap.put("X-Failed-Hosts", sb2.toString());
                i++;
                currentTimeMillis = j;
            }
        }
        str2 = null;
        if (str2 == null) {
            m43582a(c25674c2, interfaceC25879b);
            return;
        }
        long m43570b = m43570b(c26084s5, 1, j);
        List arrayList = new ArrayList();
        AbstractC25965o mo42260d = this.f67154a.mo42260d();
        C25923n m43427b = C25923n.m43427b();
        AbstractC26019q mo42557a = mo42260d.mo42557a(str2, c26073s, null, this.f67155b, this.f67156c, c26084s5, arrayList, m43427b, context);
        m43570b(c26084s5, 2, m43570b);
        if (arrayList.isEmpty()) {
            c25634a82 = c25634a8;
            join = null;
        } else {
            join = TextUtils.join(",", arrayList);
            c25634a82 = c25634a8;
        }
        c25634a82.m44210f(join);
        if (this.f67154a.mo42261c()) {
            interfaceC25879b2 = interfaceC25879b;
            context2 = context;
            c26084s52 = c26084s5;
            mo42557a = m43571a(c26073s.m43011D(), mo42557a, mo42260d, m42397a, c26084s5, m43427b, context);
        } else {
            interfaceC25879b2 = interfaceC25879b;
            context2 = context;
            c26084s52 = c26084s5;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        AbstractC26019q m43578a = m43578a(mo42557a, m43427b, context2);
        m43570b(c26084s52, 3, currentTimeMillis2);
        interfaceC25879b2.mo18137a(m43578a, m43427b.m43429a());
    }

    /* renamed from: a */
    public final void m43582a(C25674c2 c25674c2, InterfaceC25879b interfaceC25879b) {
        C25902m c25902m;
        if (c25674c2 == null) {
            c25902m = C25902m.f67221c;
        } else {
            int m44113b = c25674c2.m44113b();
            String str = m44113b + " – " + c25674c2.m44114a();
            if (m44113b == 403) {
                c25902m = C25902m.f67224f;
            } else if (m44113b != 404) {
                if (m44113b != 408) {
                    if (m44113b == 500) {
                        c25902m = C25902m.f67226h;
                    } else if (m44113b != 504) {
                        interfaceC25879b.mo18137a(null, m44113b == 200 ? C25902m.f67228j : C25902m.m43494a(1000, str));
                        return;
                    }
                }
                c25902m = C25902m.f67223e;
            } else {
                c25902m = C25902m.f67225g;
            }
        }
        interfaceC25879b.mo18137a(null, c25902m);
    }

    /* renamed from: a */
    public C26128u m43574a(C26073s c26073s, AbstractC26019q abstractC26019q, AbstractC25965o abstractC25965o, C26239y1 c26239y1, C26084s5 c26084s5, C25923n c25923n, Context context) {
        int i;
        C25674c2 c25674c2;
        Context context2;
        C26073s c26073s2;
        AbstractC26019q abstractC26019q2 = abstractC26019q;
        long currentTimeMillis = System.currentTimeMillis();
        C25674c2 m44185a = c26239y1.m44185a(c26073s.f67807b, null, context);
        m43577a(c26084s5, 1, currentTimeMillis);
        if (m44185a.m44111d()) {
            C25735ea.m43958a(c26073s.m42998a("serviceRequested"), context);
            int mo42296a = abstractC26019q2 != null ? abstractC26019q.mo42296a() : 0;
            String str = (String) m44185a.m44112c();
            if (str != null) {
                long currentTimeMillis2 = System.currentTimeMillis();
                AbstractC26019q mo42557a = abstractC25965o.mo42557a(str, c26073s, abstractC26019q, this.f67155b, this.f67156c, c26084s5, null, c25923n, context);
                m43577a(c26084s5, 2, currentTimeMillis2);
                i = mo42296a;
                c25674c2 = m44185a;
                context2 = context;
                c26073s2 = c26073s;
                abstractC26019q2 = m43571a(c26073s.m43011D(), mo42557a, abstractC25965o, c26239y1, c26084s5, c25923n, context);
            } else {
                i = mo42296a;
                c25674c2 = m44185a;
                context2 = context;
                c26073s2 = c26073s;
            }
            AbstractC26019q abstractC26019q3 = abstractC26019q2;
            if (i == (abstractC26019q3 != null ? abstractC26019q3.mo42296a() : 0)) {
                C25735ea.m43958a(c26073s2.m42998a("serviceAnswerEmpty"), context2);
                C26073s m42946w = c26073s.m42946w();
                if (m42946w != null) {
                    abstractC26019q3 = (AbstractC26019q) m43574a(m42946w, abstractC26019q3, abstractC25965o, c26239y1, c26084s5, c25923n, context).f67975b;
                }
            }
            return new C26128u(c25674c2, abstractC26019q3);
        }
        return new C26128u(m44185a, abstractC26019q2);
    }

    /* renamed from: a */
    public C26128u mo43573a(C26073s c26073s, C26239y1 c26239y1, Map map, Context context) {
        C25674c2 m44184b = c26239y1.m44184b(c26073s.f67807b, c26073s.f67806a, map, context);
        if (m44184b.m44111d()) {
            return new C26128u(m44184b, (String) m44184b.m44112c());
        }
        this.f67157d = m44184b.m44114a();
        return new C26128u(m44184b, null);
    }

    /* renamed from: a */
    public AbstractC26019q m43571a(List list, AbstractC26019q abstractC26019q, AbstractC25965o abstractC25965o, C26239y1 c26239y1, C26084s5 c26084s5, C25923n c25923n, Context context) {
        if (list.size() > 0) {
            Iterator it = list.iterator();
            AbstractC26019q abstractC26019q2 = abstractC26019q;
            while (it.hasNext()) {
                abstractC26019q2 = (AbstractC26019q) m43574a((C26073s) it.next(), abstractC26019q2, abstractC25965o, c26239y1, c26084s5, c25923n, context).f67975b;
            }
            return abstractC26019q2;
        }
        return abstractC26019q;
    }

    /* renamed from: a */
    public final AbstractC25877l m43581a(InterfaceC25879b interfaceC25879b) {
        this.f67158e = interfaceC25879b;
        return this;
    }
}
