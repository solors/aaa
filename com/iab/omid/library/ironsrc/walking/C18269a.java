package com.iab.omid.library.ironsrc.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.ironsrc.adsession.C18228a;
import com.iab.omid.library.ironsrc.internal.C18238c;
import com.iab.omid.library.ironsrc.internal.C18241e;
import com.iab.omid.library.ironsrc.utils.C18265h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.iab.omid.library.ironsrc.walking.a */
/* loaded from: classes6.dex */
public class C18269a {

    /* renamed from: a */
    private final HashMap<View, String> f45890a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C18270a> f45891b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f45892c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f45893d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f45894e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f45895f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f45896g = new HashMap<>();

    /* renamed from: h */
    private final Map<View, Boolean> f45897h = new WeakHashMap();

    /* renamed from: i */
    private boolean f45898i;

    /* renamed from: com.iab.omid.library.ironsrc.walking.a$a */
    /* loaded from: classes6.dex */
    public static class C18270a {

        /* renamed from: a */
        private final C18241e f45899a;

        /* renamed from: b */
        private final ArrayList<String> f45900b = new ArrayList<>();

        public C18270a(C18241e c18241e, String str) {
            this.f45899a = c18241e;
            m63317a(str);
        }

        /* renamed from: a */
        public C18241e m63318a() {
            return this.f45899a;
        }

        /* renamed from: b */
        public ArrayList<String> m63316b() {
            return this.f45900b;
        }

        /* renamed from: a */
        public void m63317a(String str) {
            this.f45900b.add(str);
        }
    }

    /* renamed from: b */
    private Boolean m63327b(View view) {
        if (view.hasWindowFocus()) {
            this.f45897h.remove(view);
            return Boolean.FALSE;
        } else if (this.f45897h.containsKey(view)) {
            return this.f45897h.get(view);
        } else {
            Map<View, Boolean> map = this.f45897h;
            Boolean bool = Boolean.FALSE;
            map.put(view, bool);
            return bool;
        }
    }

    /* renamed from: a */
    public View m63329a(String str) {
        return this.f45892c.get(str);
    }

    /* renamed from: c */
    public C18270a m63324c(View view) {
        C18270a c18270a = this.f45891b.get(view);
        if (c18270a != null) {
            this.f45891b.remove(view);
        }
        return c18270a;
    }

    /* renamed from: d */
    public String m63322d(View view) {
        if (this.f45890a.size() == 0) {
            return null;
        }
        String str = this.f45890a.get(view);
        if (str != null) {
            this.f45890a.remove(view);
        }
        return str;
    }

    /* renamed from: e */
    public EnumC18280c m63320e(View view) {
        return this.f45893d.contains(view) ? EnumC18280c.PARENT_VIEW : this.f45898i ? EnumC18280c.OBSTRUCTION_VIEW : EnumC18280c.UNDERLYING_VIEW;
    }

    /* renamed from: f */
    public boolean m63319f(View view) {
        if (this.f45897h.containsKey(view)) {
            this.f45897h.put(view, Boolean.TRUE);
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private String m63332a(View view) {
        if (view.isAttachedToWindow()) {
            if (m63327b(view).booleanValue()) {
                return "noWindowFocus";
            }
            HashSet hashSet = new HashSet();
            while (view != null) {
                String m63358a = C18265h.m63358a(view);
                if (m63358a != null) {
                    return m63358a;
                }
                hashSet.add(view);
                ViewParent parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            this.f45893d.addAll(hashSet);
            return null;
        }
        return "notAttached";
    }

    /* renamed from: b */
    public String m63326b(String str) {
        return this.f45896g.get(str);
    }

    /* renamed from: c */
    public HashSet<String> m63325c() {
        return this.f45894e;
    }

    /* renamed from: d */
    public void m63323d() {
        this.f45898i = true;
    }

    /* renamed from: e */
    public void m63321e() {
        C18238c m63484c = C18238c.m63484c();
        if (m63484c != null) {
            for (C18228a c18228a : m63484c.m63488a()) {
                View m63527c = c18228a.m63527c();
                if (c18228a.m63522f()) {
                    String adSessionId = c18228a.getAdSessionId();
                    if (m63527c != null) {
                        String m63332a = m63332a(m63527c);
                        if (m63332a == null) {
                            this.f45894e.add(adSessionId);
                            this.f45890a.put(m63527c, adSessionId);
                            m63331a(c18228a);
                        } else if (m63332a != "noWindowFocus") {
                            this.f45895f.add(adSessionId);
                            this.f45892c.put(adSessionId, m63527c);
                            this.f45896g.put(adSessionId, m63332a);
                        }
                    } else {
                        this.f45895f.add(adSessionId);
                        this.f45896g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m63333a() {
        this.f45890a.clear();
        this.f45891b.clear();
        this.f45892c.clear();
        this.f45893d.clear();
        this.f45894e.clear();
        this.f45895f.clear();
        this.f45896g.clear();
        this.f45898i = false;
    }

    /* renamed from: b */
    public HashSet<String> m63328b() {
        return this.f45895f;
    }

    /* renamed from: a */
    private void m63331a(C18228a c18228a) {
        for (C18241e c18241e : c18228a.m63525d()) {
            m63330a(c18241e, c18228a);
        }
    }

    /* renamed from: a */
    private void m63330a(C18241e c18241e, C18228a c18228a) {
        View view = c18241e.m63469c().get();
        if (view == null) {
            return;
        }
        C18270a c18270a = this.f45891b.get(view);
        if (c18270a != null) {
            c18270a.m63317a(c18228a.getAdSessionId());
        } else {
            this.f45891b.put(view, new C18270a(c18241e, c18228a.getAdSessionId()));
        }
    }
}
