package com.iab.omid.library.vungle.walking;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.vungle.adsession.C18737a;
import com.iab.omid.library.vungle.internal.C18747c;
import com.iab.omid.library.vungle.internal.C18750e;
import com.iab.omid.library.vungle.utils.C18778h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.iab.omid.library.vungle.walking.a */
/* loaded from: classes6.dex */
public class C18783a {

    /* renamed from: a */
    private final HashMap<View, String> f46955a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C18784a> f46956b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f46957c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f46958d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f46959e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f46960f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f46961g = new HashMap<>();

    /* renamed from: h */
    private final HashSet<String> f46962h = new HashSet<>();

    /* renamed from: i */
    private final Map<View, Boolean> f46963i = new WeakHashMap();

    /* renamed from: j */
    private boolean f46964j;

    /* renamed from: com.iab.omid.library.vungle.walking.a$a */
    /* loaded from: classes6.dex */
    public static class C18784a {

        /* renamed from: a */
        private final C18750e f46965a;

        /* renamed from: b */
        private final ArrayList<String> f46966b = new ArrayList<>();

        public C18784a(C18750e c18750e, String str) {
            this.f46965a = c18750e;
            m61330a(str);
        }

        /* renamed from: a */
        public C18750e m61331a() {
            return this.f46965a;
        }

        /* renamed from: b */
        public ArrayList<String> m61329b() {
            return this.f46966b;
        }

        /* renamed from: a */
        public void m61330a(String str) {
            this.f46966b.add(str);
        }
    }

    /* renamed from: a */
    public View m61342a(String str) {
        return this.f46957c.get(str);
    }

    /* renamed from: b */
    public C18784a m61340b(View view) {
        C18784a c18784a = this.f46956b.get(view);
        if (c18784a != null) {
            this.f46956b.remove(view);
        }
        return c18784a;
    }

    /* renamed from: c */
    public String m61337c(View view) {
        if (this.f46955a.size() == 0) {
            return null;
        }
        String str = this.f46955a.get(view);
        if (str != null) {
            this.f46955a.remove(view);
        }
        return str;
    }

    /* renamed from: d */
    public EnumC18794c m61334d(View view) {
        return this.f46958d.contains(view) ? EnumC18794c.PARENT_VIEW : this.f46964j ? EnumC18794c.OBSTRUCTION_VIEW : EnumC18794c.UNDERLYING_VIEW;
    }

    /* renamed from: e */
    public void m61333e() {
        C18747c m61518c = C18747c.m61518c();
        if (m61518c != null) {
            for (C18737a c18737a : m61518c.m61522a()) {
                View m61559c = c18737a.m61559c();
                if (c18737a.m61556f()) {
                    String adSessionId = c18737a.getAdSessionId();
                    if (m61559c != null) {
                        boolean m61372e = C18778h.m61372e(m61559c);
                        if (m61372e) {
                            this.f46962h.add(adSessionId);
                        }
                        String m61345a = m61345a(m61559c, m61372e);
                        if (m61345a == null) {
                            this.f46959e.add(adSessionId);
                            this.f46955a.put(m61559c, adSessionId);
                            m61344a(c18737a);
                        } else if (m61345a != "noWindowFocus") {
                            this.f46960f.add(adSessionId);
                            this.f46957c.put(adSessionId, m61559c);
                            this.f46961g.put(adSessionId, m61345a);
                        }
                    } else {
                        this.f46960f.add(adSessionId);
                        this.f46961g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private Boolean m61346a(View view) {
        if (view.hasWindowFocus()) {
            this.f46963i.remove(view);
            return Boolean.FALSE;
        } else if (this.f46963i.containsKey(view)) {
            return this.f46963i.get(view);
        } else {
            Map<View, Boolean> map = this.f46963i;
            Boolean bool = Boolean.FALSE;
            map.put(view, bool);
            return bool;
        }
    }

    /* renamed from: b */
    public String m61339b(String str) {
        return this.f46961g.get(str);
    }

    /* renamed from: c */
    public HashSet<String> m61338c() {
        return this.f46959e;
    }

    /* renamed from: d */
    public void m61335d() {
        this.f46964j = true;
    }

    /* renamed from: e */
    public boolean m61332e(View view) {
        if (this.f46963i.containsKey(view)) {
            this.f46963i.put(view, Boolean.TRUE);
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private String m61345a(View view, boolean z) {
        if (view.isAttachedToWindow()) {
            if (!m61346a(view).booleanValue() || z) {
                HashSet hashSet = new HashSet();
                while (view != null) {
                    String m61376a = C18778h.m61376a(view);
                    if (m61376a != null) {
                        return m61376a;
                    }
                    hashSet.add(view);
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                }
                this.f46958d.addAll(hashSet);
                return null;
            }
            return "noWindowFocus";
        }
        return "notAttached";
    }

    /* renamed from: b */
    public HashSet<String> m61341b() {
        return this.f46960f;
    }

    @VisibleForTesting
    /* renamed from: c */
    public boolean m61336c(String str) {
        return this.f46962h.contains(str);
    }

    /* renamed from: a */
    public void m61347a() {
        this.f46955a.clear();
        this.f46956b.clear();
        this.f46957c.clear();
        this.f46958d.clear();
        this.f46959e.clear();
        this.f46960f.clear();
        this.f46961g.clear();
        this.f46964j = false;
        this.f46962h.clear();
    }

    /* renamed from: a */
    private void m61344a(C18737a c18737a) {
        for (C18750e c18750e : c18737a.m61558d()) {
            m61343a(c18750e, c18737a);
        }
    }

    /* renamed from: a */
    private void m61343a(C18750e c18750e, C18737a c18737a) {
        View view = c18750e.m61503c().get();
        if (view == null) {
            return;
        }
        C18784a c18784a = this.f46956b.get(view);
        if (c18784a != null) {
            c18784a.m61330a(c18737a.getAdSessionId());
        } else {
            this.f46956b.put(view, new C18784a(c18750e, c18737a.getAdSessionId()));
        }
    }
}
