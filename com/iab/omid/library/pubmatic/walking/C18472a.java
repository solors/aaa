package com.iab.omid.library.pubmatic.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.pubmatic.adsession.C18426a;
import com.iab.omid.library.pubmatic.internal.C18436c;
import com.iab.omid.library.pubmatic.internal.C18439e;
import com.iab.omid.library.pubmatic.utils.C18467h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.iab.omid.library.pubmatic.walking.a */
/* loaded from: classes6.dex */
public class C18472a {

    /* renamed from: a */
    private final HashMap<View, String> f46294a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C18473a> f46295b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f46296c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f46297d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f46298e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f46299f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f46300g = new HashMap<>();

    /* renamed from: h */
    private final HashSet<String> f46301h = new HashSet<>();

    /* renamed from: i */
    private final Map<View, Boolean> f46302i = new WeakHashMap();

    /* renamed from: j */
    private boolean f46303j;

    /* renamed from: com.iab.omid.library.pubmatic.walking.a$a */
    /* loaded from: classes6.dex */
    public static class C18473a {

        /* renamed from: a */
        private final C18439e f46304a;

        /* renamed from: b */
        private final ArrayList<String> f46305b = new ArrayList<>();

        public C18473a(C18439e c18439e, String str) {
            this.f46304a = c18439e;
            m62558a(str);
        }

        /* renamed from: a */
        public C18439e m62559a() {
            return this.f46304a;
        }

        /* renamed from: b */
        public ArrayList<String> m62557b() {
            return this.f46305b;
        }

        /* renamed from: a */
        public void m62558a(String str) {
            this.f46305b.add(str);
        }
    }

    /* renamed from: a */
    public View m62570a(String str) {
        return this.f46296c.get(str);
    }

    /* renamed from: b */
    public C18473a m62568b(View view) {
        C18473a c18473a = this.f46295b.get(view);
        if (c18473a != null) {
            this.f46295b.remove(view);
        }
        return c18473a;
    }

    /* renamed from: c */
    public String m62565c(View view) {
        if (this.f46294a.size() == 0) {
            return null;
        }
        String str = this.f46294a.get(view);
        if (str != null) {
            this.f46294a.remove(view);
        }
        return str;
    }

    /* renamed from: d */
    public EnumC18483c m62562d(View view) {
        return this.f46297d.contains(view) ? EnumC18483c.PARENT_VIEW : this.f46303j ? EnumC18483c.OBSTRUCTION_VIEW : EnumC18483c.UNDERLYING_VIEW;
    }

    /* renamed from: e */
    public void m62561e() {
        C18436c m62746c = C18436c.m62746c();
        if (m62746c != null) {
            for (C18426a c18426a : m62746c.m62750a()) {
                View m62787c = c18426a.m62787c();
                if (c18426a.m62784f()) {
                    String adSessionId = c18426a.getAdSessionId();
                    if (m62787c != null) {
                        boolean m62600e = C18467h.m62600e(m62787c);
                        if (m62600e) {
                            this.f46301h.add(adSessionId);
                        }
                        String m62573a = m62573a(m62787c, m62600e);
                        if (m62573a == null) {
                            this.f46298e.add(adSessionId);
                            this.f46294a.put(m62787c, adSessionId);
                            m62572a(c18426a);
                        } else if (m62573a != "noWindowFocus") {
                            this.f46299f.add(adSessionId);
                            this.f46296c.put(adSessionId, m62787c);
                            this.f46300g.put(adSessionId, m62573a);
                        }
                    } else {
                        this.f46299f.add(adSessionId);
                        this.f46300g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private Boolean m62574a(View view) {
        if (view.hasWindowFocus()) {
            this.f46302i.remove(view);
            return Boolean.FALSE;
        } else if (this.f46302i.containsKey(view)) {
            return this.f46302i.get(view);
        } else {
            Map<View, Boolean> map = this.f46302i;
            Boolean bool = Boolean.FALSE;
            map.put(view, bool);
            return bool;
        }
    }

    /* renamed from: b */
    public String m62567b(String str) {
        return this.f46300g.get(str);
    }

    /* renamed from: c */
    public HashSet<String> m62566c() {
        return this.f46298e;
    }

    /* renamed from: d */
    public void m62563d() {
        this.f46303j = true;
    }

    /* renamed from: e */
    public boolean m62560e(View view) {
        if (this.f46302i.containsKey(view)) {
            this.f46302i.put(view, Boolean.TRUE);
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private String m62573a(View view, boolean z) {
        if (view.isAttachedToWindow()) {
            if (!m62574a(view).booleanValue() || z) {
                HashSet hashSet = new HashSet();
                while (view != null) {
                    String m62604a = C18467h.m62604a(view);
                    if (m62604a != null) {
                        return m62604a;
                    }
                    hashSet.add(view);
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                }
                this.f46297d.addAll(hashSet);
                return null;
            }
            return "noWindowFocus";
        }
        return "notAttached";
    }

    /* renamed from: b */
    public HashSet<String> m62569b() {
        return this.f46299f;
    }

    /* renamed from: c */
    public boolean m62564c(String str) {
        return this.f46301h.contains(str);
    }

    /* renamed from: a */
    public void m62575a() {
        this.f46294a.clear();
        this.f46295b.clear();
        this.f46296c.clear();
        this.f46297d.clear();
        this.f46298e.clear();
        this.f46299f.clear();
        this.f46300g.clear();
        this.f46303j = false;
        this.f46301h.clear();
    }

    /* renamed from: a */
    private void m62572a(C18426a c18426a) {
        for (C18439e c18439e : c18426a.m62786d()) {
            m62571a(c18439e, c18426a);
        }
    }

    /* renamed from: a */
    private void m62571a(C18439e c18439e, C18426a c18426a) {
        View view = c18439e.m62731c().get();
        if (view == null) {
            return;
        }
        C18473a c18473a = this.f46295b.get(view);
        if (c18473a != null) {
            c18473a.m62558a(c18426a.getAdSessionId());
        } else {
            this.f46295b.put(view, new C18473a(c18439e, c18426a.getAdSessionId()));
        }
    }
}
