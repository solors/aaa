package com.iab.omid.library.applovin.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.applovin.adsession.C17799a;
import com.iab.omid.library.applovin.internal.C17809c;
import com.iab.omid.library.applovin.internal.C17812e;
import com.iab.omid.library.applovin.utils.C17838h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.iab.omid.library.applovin.walking.a */
/* loaded from: classes6.dex */
public class C17843a {

    /* renamed from: a */
    private final HashMap<View, String> f45002a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C17844a> f45003b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f45004c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f45005d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f45006e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f45007f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f45008g = new HashMap<>();

    /* renamed from: h */
    private final Map<View, Boolean> f45009h = new WeakHashMap();

    /* renamed from: i */
    private boolean f45010i;

    /* renamed from: com.iab.omid.library.applovin.walking.a$a */
    /* loaded from: classes6.dex */
    public static class C17844a {

        /* renamed from: a */
        private final C17812e f45011a;

        /* renamed from: b */
        private final ArrayList<String> f45012b = new ArrayList<>();

        public C17844a(C17812e c17812e, String str) {
            this.f45011a = c17812e;
            m64963a(str);
        }

        /* renamed from: a */
        public C17812e m64964a() {
            return this.f45011a;
        }

        /* renamed from: b */
        public ArrayList<String> m64962b() {
            return this.f45012b;
        }

        /* renamed from: a */
        public void m64963a(String str) {
            this.f45012b.add(str);
        }
    }

    /* renamed from: b */
    private Boolean m64973b(View view) {
        if (view.hasWindowFocus()) {
            this.f45009h.remove(view);
            return Boolean.FALSE;
        } else if (this.f45009h.containsKey(view)) {
            return this.f45009h.get(view);
        } else {
            Map<View, Boolean> map = this.f45009h;
            Boolean bool = Boolean.FALSE;
            map.put(view, bool);
            return bool;
        }
    }

    /* renamed from: a */
    public View m64975a(String str) {
        return this.f45004c.get(str);
    }

    /* renamed from: c */
    public C17844a m64970c(View view) {
        C17844a c17844a = this.f45003b.get(view);
        if (c17844a != null) {
            this.f45003b.remove(view);
        }
        return c17844a;
    }

    /* renamed from: d */
    public String m64968d(View view) {
        if (this.f45002a.size() == 0) {
            return null;
        }
        String str = this.f45002a.get(view);
        if (str != null) {
            this.f45002a.remove(view);
        }
        return str;
    }

    /* renamed from: e */
    public EnumC17854c m64966e(View view) {
        return this.f45005d.contains(view) ? EnumC17854c.PARENT_VIEW : this.f45010i ? EnumC17854c.OBSTRUCTION_VIEW : EnumC17854c.UNDERLYING_VIEW;
    }

    /* renamed from: f */
    public boolean m64965f(View view) {
        if (this.f45009h.containsKey(view)) {
            this.f45009h.put(view, Boolean.TRUE);
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private String m64978a(View view) {
        if (view.isAttachedToWindow()) {
            if (m64973b(view).booleanValue()) {
                return "noWindowFocus";
            }
            HashSet hashSet = new HashSet();
            while (view != null) {
                String m65006a = C17838h.m65006a(view);
                if (m65006a != null) {
                    return m65006a;
                }
                hashSet.add(view);
                ViewParent parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            this.f45005d.addAll(hashSet);
            return null;
        }
        return "notAttached";
    }

    /* renamed from: b */
    public String m64972b(String str) {
        return this.f45008g.get(str);
    }

    /* renamed from: c */
    public HashSet<String> m64971c() {
        return this.f45006e;
    }

    /* renamed from: d */
    public void m64969d() {
        this.f45010i = true;
    }

    /* renamed from: e */
    public void m64967e() {
        C17809c m65139c = C17809c.m65139c();
        if (m65139c != null) {
            for (C17799a c17799a : m65139c.m65143a()) {
                View m65180c = c17799a.m65180c();
                if (c17799a.m65177f()) {
                    String adSessionId = c17799a.getAdSessionId();
                    if (m65180c != null) {
                        String m64978a = m64978a(m65180c);
                        if (m64978a == null) {
                            this.f45006e.add(adSessionId);
                            this.f45002a.put(m65180c, adSessionId);
                            m64977a(c17799a);
                        } else if (m64978a != "noWindowFocus") {
                            this.f45007f.add(adSessionId);
                            this.f45004c.put(adSessionId, m65180c);
                            this.f45008g.put(adSessionId, m64978a);
                        }
                    } else {
                        this.f45007f.add(adSessionId);
                        this.f45008g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m64979a() {
        this.f45002a.clear();
        this.f45003b.clear();
        this.f45004c.clear();
        this.f45005d.clear();
        this.f45006e.clear();
        this.f45007f.clear();
        this.f45008g.clear();
        this.f45010i = false;
    }

    /* renamed from: b */
    public HashSet<String> m64974b() {
        return this.f45007f;
    }

    /* renamed from: a */
    private void m64977a(C17799a c17799a) {
        for (C17812e c17812e : c17799a.m65179d()) {
            m64976a(c17812e, c17799a);
        }
    }

    /* renamed from: a */
    private void m64976a(C17812e c17812e, C17799a c17799a) {
        View view = c17812e.m65124c().get();
        if (view == null) {
            return;
        }
        C17844a c17844a = this.f45003b.get(view);
        if (c17844a != null) {
            c17844a.m64963a(c17799a.getAdSessionId());
        } else {
            this.f45003b.put(view, new C17844a(c17812e, c17799a.getAdSessionId()));
        }
    }
}
