package com.iab.omid.library.amazon.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.amazon.adsession.C17738a;
import com.iab.omid.library.amazon.internal.C17748c;
import com.iab.omid.library.amazon.internal.C17751e;
import com.iab.omid.library.amazon.utils.C17777h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.iab.omid.library.amazon.walking.a */
/* loaded from: classes6.dex */
public class C17782a {

    /* renamed from: a */
    private final HashMap<View, String> f44873a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C17783a> f44874b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f44875c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f44876d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f44877e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f44878f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f44879g = new HashMap<>();

    /* renamed from: h */
    private final Map<View, Boolean> f44880h = new WeakHashMap();

    /* renamed from: i */
    private boolean f44881i;

    /* renamed from: com.iab.omid.library.amazon.walking.a$a */
    /* loaded from: classes6.dex */
    public static class C17783a {

        /* renamed from: a */
        private final C17751e f44882a;

        /* renamed from: b */
        private final ArrayList<String> f44883b = new ArrayList<>();

        public C17783a(C17751e c17751e, String str) {
            this.f44882a = c17751e;
            m65204a(str);
        }

        /* renamed from: a */
        public C17751e m65205a() {
            return this.f44882a;
        }

        /* renamed from: b */
        public ArrayList<String> m65203b() {
            return this.f44883b;
        }

        /* renamed from: a */
        public void m65204a(String str) {
            this.f44883b.add(str);
        }
    }

    /* renamed from: b */
    private Boolean m65214b(View view) {
        if (view.hasWindowFocus()) {
            this.f44880h.remove(view);
            return Boolean.FALSE;
        } else if (this.f44880h.containsKey(view)) {
            return this.f44880h.get(view);
        } else {
            Map<View, Boolean> map = this.f44880h;
            Boolean bool = Boolean.FALSE;
            map.put(view, bool);
            return bool;
        }
    }

    /* renamed from: a */
    public View m65216a(String str) {
        return this.f44875c.get(str);
    }

    /* renamed from: c */
    public C17783a m65211c(View view) {
        C17783a c17783a = this.f44874b.get(view);
        if (c17783a != null) {
            this.f44874b.remove(view);
        }
        return c17783a;
    }

    /* renamed from: d */
    public String m65209d(View view) {
        if (this.f44873a.size() == 0) {
            return null;
        }
        String str = this.f44873a.get(view);
        if (str != null) {
            this.f44873a.remove(view);
        }
        return str;
    }

    /* renamed from: e */
    public EnumC17793c m65207e(View view) {
        return this.f44876d.contains(view) ? EnumC17793c.PARENT_VIEW : this.f44881i ? EnumC17793c.OBSTRUCTION_VIEW : EnumC17793c.UNDERLYING_VIEW;
    }

    /* renamed from: f */
    public boolean m65206f(View view) {
        if (this.f44880h.containsKey(view)) {
            this.f44880h.put(view, Boolean.TRUE);
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private String m65219a(View view) {
        if (view.isAttachedToWindow()) {
            if (m65214b(view).booleanValue()) {
                return "noWindowFocus";
            }
            HashSet hashSet = new HashSet();
            while (view != null) {
                String m65247a = C17777h.m65247a(view);
                if (m65247a != null) {
                    return m65247a;
                }
                hashSet.add(view);
                ViewParent parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            this.f44876d.addAll(hashSet);
            return null;
        }
        return "notAttached";
    }

    /* renamed from: b */
    public String m65213b(String str) {
        return this.f44879g.get(str);
    }

    /* renamed from: c */
    public HashSet<String> m65212c() {
        return this.f44877e;
    }

    /* renamed from: d */
    public void m65210d() {
        this.f44881i = true;
    }

    /* renamed from: e */
    public void m65208e() {
        C17748c m65380c = C17748c.m65380c();
        if (m65380c != null) {
            for (C17738a c17738a : m65380c.m65384a()) {
                View m65421c = c17738a.m65421c();
                if (c17738a.m65418f()) {
                    String adSessionId = c17738a.getAdSessionId();
                    if (m65421c != null) {
                        String m65219a = m65219a(m65421c);
                        if (m65219a == null) {
                            this.f44877e.add(adSessionId);
                            this.f44873a.put(m65421c, adSessionId);
                            m65218a(c17738a);
                        } else if (m65219a != "noWindowFocus") {
                            this.f44878f.add(adSessionId);
                            this.f44875c.put(adSessionId, m65421c);
                            this.f44879g.put(adSessionId, m65219a);
                        }
                    } else {
                        this.f44878f.add(adSessionId);
                        this.f44879g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m65220a() {
        this.f44873a.clear();
        this.f44874b.clear();
        this.f44875c.clear();
        this.f44876d.clear();
        this.f44877e.clear();
        this.f44878f.clear();
        this.f44879g.clear();
        this.f44881i = false;
    }

    /* renamed from: b */
    public HashSet<String> m65215b() {
        return this.f44878f;
    }

    /* renamed from: a */
    private void m65218a(C17738a c17738a) {
        for (C17751e c17751e : c17738a.m65420d()) {
            m65217a(c17751e, c17738a);
        }
    }

    /* renamed from: a */
    private void m65217a(C17751e c17751e, C17738a c17738a) {
        View view = c17751e.m65365c().get();
        if (view == null) {
            return;
        }
        C17783a c17783a = this.f44874b.get(view);
        if (c17783a != null) {
            c17783a.m65204a(c17738a.getAdSessionId());
        } else {
            this.f44874b.put(view, new C17783a(c17751e, c17738a.getAdSessionId()));
        }
    }
}
