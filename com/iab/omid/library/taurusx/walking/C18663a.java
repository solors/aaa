package com.iab.omid.library.taurusx.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.taurusx.adsession.C18621a;
import com.iab.omid.library.taurusx.internal.C18631c;
import com.iab.omid.library.taurusx.internal.C18634e;
import com.iab.omid.library.taurusx.utils.C18659h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.iab.omid.library.taurusx.walking.a */
/* loaded from: classes6.dex */
public class C18663a {

    /* renamed from: a */
    private final HashMap<View, String> f46693a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C18664a> f46694b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f46695c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f46696d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f46697e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f46698f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f46699g = new HashMap<>();

    /* renamed from: h */
    private final Map<View, Boolean> f46700h = new WeakHashMap();

    /* renamed from: i */
    private boolean f46701i;

    /* renamed from: com.iab.omid.library.taurusx.walking.a$a */
    /* loaded from: classes6.dex */
    public static class C18664a {

        /* renamed from: a */
        private final C18634e f46702a;

        /* renamed from: b */
        private final ArrayList<String> f46703b = new ArrayList<>();

        public C18664a(C18634e c18634e, String str) {
            this.f46702a = c18634e;
            m61817a(str);
        }

        /* renamed from: a */
        public C18634e m61818a() {
            return this.f46702a;
        }

        /* renamed from: b */
        public ArrayList<String> m61816b() {
            return this.f46703b;
        }

        /* renamed from: a */
        public void m61817a(String str) {
            this.f46703b.add(str);
        }
    }

    /* renamed from: b */
    private Boolean m61827b(View view) {
        if (view.hasWindowFocus()) {
            this.f46700h.remove(view);
            return Boolean.FALSE;
        } else if (this.f46700h.containsKey(view)) {
            return this.f46700h.get(view);
        } else {
            Map<View, Boolean> map = this.f46700h;
            Boolean bool = Boolean.FALSE;
            map.put(view, bool);
            return bool;
        }
    }

    /* renamed from: a */
    public View m61829a(String str) {
        return this.f46695c.get(str);
    }

    /* renamed from: c */
    public C18664a m61824c(View view) {
        C18664a c18664a = this.f46694b.get(view);
        if (c18664a != null) {
            this.f46694b.remove(view);
        }
        return c18664a;
    }

    /* renamed from: d */
    public String m61822d(View view) {
        if (this.f46693a.size() == 0) {
            return null;
        }
        String str = this.f46693a.get(view);
        if (str != null) {
            this.f46693a.remove(view);
        }
        return str;
    }

    /* renamed from: e */
    public EnumC18674c m61820e(View view) {
        return this.f46696d.contains(view) ? EnumC18674c.PARENT_VIEW : this.f46701i ? EnumC18674c.OBSTRUCTION_VIEW : EnumC18674c.UNDERLYING_VIEW;
    }

    /* renamed from: f */
    public boolean m61819f(View view) {
        if (this.f46700h.containsKey(view)) {
            this.f46700h.put(view, Boolean.TRUE);
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private String m61832a(View view) {
        if (view.isAttachedToWindow()) {
            if (m61827b(view).booleanValue()) {
                return "noWindowFocus";
            }
            HashSet hashSet = new HashSet();
            while (view != null) {
                String m61858a = C18659h.m61858a(view);
                if (m61858a != null) {
                    return m61858a;
                }
                hashSet.add(view);
                ViewParent parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            this.f46696d.addAll(hashSet);
            return null;
        }
        return "notAttached";
    }

    /* renamed from: b */
    public String m61826b(String str) {
        return this.f46699g.get(str);
    }

    /* renamed from: c */
    public HashSet<String> m61825c() {
        return this.f46697e;
    }

    /* renamed from: d */
    public void m61823d() {
        this.f46701i = true;
    }

    /* renamed from: e */
    public void m61821e() {
        C18631c m61984c = C18631c.m61984c();
        if (m61984c != null) {
            for (C18621a c18621a : m61984c.m61988a()) {
                View m62027c = c18621a.m62027c();
                if (c18621a.m62022f()) {
                    String adSessionId = c18621a.getAdSessionId();
                    if (m62027c != null) {
                        String m61832a = m61832a(m62027c);
                        if (m61832a == null) {
                            this.f46697e.add(adSessionId);
                            this.f46693a.put(m62027c, adSessionId);
                            m61831a(c18621a);
                        } else if (m61832a != "noWindowFocus") {
                            this.f46698f.add(adSessionId);
                            this.f46695c.put(adSessionId, m62027c);
                            this.f46699g.put(adSessionId, m61832a);
                        }
                    } else {
                        this.f46698f.add(adSessionId);
                        this.f46699g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m61833a() {
        this.f46693a.clear();
        this.f46694b.clear();
        this.f46695c.clear();
        this.f46696d.clear();
        this.f46697e.clear();
        this.f46698f.clear();
        this.f46699g.clear();
        this.f46701i = false;
    }

    /* renamed from: b */
    public HashSet<String> m61828b() {
        return this.f46698f;
    }

    /* renamed from: a */
    private void m61831a(C18621a c18621a) {
        for (C18634e c18634e : c18621a.m62025d()) {
            m61830a(c18634e, c18621a);
        }
    }

    /* renamed from: a */
    private void m61830a(C18634e c18634e, C18621a c18621a) {
        View view = c18634e.m61969c().get();
        if (view == null) {
            return;
        }
        C18664a c18664a = this.f46694b.get(view);
        if (c18664a != null) {
            c18664a.m61817a(c18621a.getAdSessionId());
        } else {
            this.f46694b.put(view, new C18664a(c18634e, c18621a.getAdSessionId()));
        }
    }
}
