package com.iab.omid.library.bytedance2.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.bytedance2.adsession.C17981a;
import com.iab.omid.library.bytedance2.internal.C17991c;
import com.iab.omid.library.bytedance2.internal.C17994e;
import com.iab.omid.library.bytedance2.utils.C18020h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.iab.omid.library.bytedance2.walking.a */
/* loaded from: classes6.dex */
public class C18025a {

    /* renamed from: a */
    private final HashMap<View, String> f45387a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C18026a> f45388b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f45389c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f45390d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f45391e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f45392f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f45393g = new HashMap<>();

    /* renamed from: h */
    private final Map<View, Boolean> f45394h = new WeakHashMap();

    /* renamed from: i */
    private boolean f45395i;

    /* renamed from: com.iab.omid.library.bytedance2.walking.a$a */
    /* loaded from: classes6.dex */
    public static class C18026a {

        /* renamed from: a */
        private final C17994e f45396a;

        /* renamed from: b */
        private final ArrayList<String> f45397b = new ArrayList<>();

        public C18026a(C17994e c17994e, String str) {
            this.f45396a = c17994e;
            m64255a(str);
        }

        /* renamed from: a */
        public C17994e m64256a() {
            return this.f45396a;
        }

        /* renamed from: b */
        public ArrayList<String> m64254b() {
            return this.f45397b;
        }

        /* renamed from: a */
        public void m64255a(String str) {
            this.f45397b.add(str);
        }
    }

    /* renamed from: b */
    private Boolean m64265b(View view) {
        if (view.hasWindowFocus()) {
            this.f45394h.remove(view);
            return Boolean.FALSE;
        } else if (this.f45394h.containsKey(view)) {
            return this.f45394h.get(view);
        } else {
            Map<View, Boolean> map = this.f45394h;
            Boolean bool = Boolean.FALSE;
            map.put(view, bool);
            return bool;
        }
    }

    /* renamed from: a */
    public View m64267a(String str) {
        return this.f45389c.get(str);
    }

    /* renamed from: c */
    public C18026a m64262c(View view) {
        C18026a c18026a = this.f45388b.get(view);
        if (c18026a != null) {
            this.f45388b.remove(view);
        }
        return c18026a;
    }

    /* renamed from: d */
    public String m64260d(View view) {
        if (this.f45387a.size() == 0) {
            return null;
        }
        String str = this.f45387a.get(view);
        if (str != null) {
            this.f45387a.remove(view);
        }
        return str;
    }

    /* renamed from: e */
    public EnumC18036c m64258e(View view) {
        return this.f45390d.contains(view) ? EnumC18036c.PARENT_VIEW : this.f45395i ? EnumC18036c.OBSTRUCTION_VIEW : EnumC18036c.UNDERLYING_VIEW;
    }

    /* renamed from: f */
    public boolean m64257f(View view) {
        if (this.f45394h.containsKey(view)) {
            this.f45394h.put(view, Boolean.TRUE);
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private String m64270a(View view) {
        if (view.isAttachedToWindow()) {
            if (m64265b(view).booleanValue()) {
                return "noWindowFocus";
            }
            HashSet hashSet = new HashSet();
            while (view != null) {
                String m64298a = C18020h.m64298a(view);
                if (m64298a != null) {
                    return m64298a;
                }
                hashSet.add(view);
                ViewParent parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            this.f45390d.addAll(hashSet);
            return null;
        }
        return "notAttached";
    }

    /* renamed from: b */
    public String m64264b(String str) {
        return this.f45393g.get(str);
    }

    /* renamed from: c */
    public HashSet<String> m64263c() {
        return this.f45391e;
    }

    /* renamed from: d */
    public void m64261d() {
        this.f45395i = true;
    }

    /* renamed from: e */
    public void m64259e() {
        C17991c m64431c = C17991c.m64431c();
        if (m64431c != null) {
            for (C17981a c17981a : m64431c.m64435a()) {
                View m64472c = c17981a.m64472c();
                if (c17981a.m64469f()) {
                    String adSessionId = c17981a.getAdSessionId();
                    if (m64472c != null) {
                        String m64270a = m64270a(m64472c);
                        if (m64270a == null) {
                            this.f45391e.add(adSessionId);
                            this.f45387a.put(m64472c, adSessionId);
                            m64269a(c17981a);
                        } else if (m64270a != "noWindowFocus") {
                            this.f45392f.add(adSessionId);
                            this.f45389c.put(adSessionId, m64472c);
                            this.f45393g.put(adSessionId, m64270a);
                        }
                    } else {
                        this.f45392f.add(adSessionId);
                        this.f45393g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m64271a() {
        this.f45387a.clear();
        this.f45388b.clear();
        this.f45389c.clear();
        this.f45390d.clear();
        this.f45391e.clear();
        this.f45392f.clear();
        this.f45393g.clear();
        this.f45395i = false;
    }

    /* renamed from: b */
    public HashSet<String> m64266b() {
        return this.f45392f;
    }

    /* renamed from: a */
    private void m64269a(C17981a c17981a) {
        for (C17994e c17994e : c17981a.m64471d()) {
            m64268a(c17994e, c17981a);
        }
    }

    /* renamed from: a */
    private void m64268a(C17994e c17994e, C17981a c17981a) {
        View view = c17994e.m64416c().get();
        if (view == null) {
            return;
        }
        C18026a c18026a = this.f45388b.get(view);
        if (c18026a != null) {
            c18026a.m64255a(c17981a.getAdSessionId());
        } else {
            this.f45388b.put(view, new C18026a(c17994e, c17981a.getAdSessionId()));
        }
    }
}
