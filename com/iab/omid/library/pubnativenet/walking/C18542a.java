package com.iab.omid.library.pubnativenet.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.pubnativenet.adsession.C18496a;
import com.iab.omid.library.pubnativenet.internal.C18506c;
import com.iab.omid.library.pubnativenet.internal.C18509e;
import com.iab.omid.library.pubnativenet.utils.C18537h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.iab.omid.library.pubnativenet.walking.a */
/* loaded from: classes6.dex */
public class C18542a {

    /* renamed from: a */
    private final HashMap<View, String> f46429a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C18543a> f46430b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f46431c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f46432d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f46433e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f46434f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f46435g = new HashMap<>();

    /* renamed from: h */
    private final HashSet<String> f46436h = new HashSet<>();

    /* renamed from: i */
    private final Map<View, Boolean> f46437i = new WeakHashMap();

    /* renamed from: j */
    private boolean f46438j;

    /* renamed from: com.iab.omid.library.pubnativenet.walking.a$a */
    /* loaded from: classes6.dex */
    public static class C18543a {

        /* renamed from: a */
        private final C18509e f46439a;

        /* renamed from: b */
        private final ArrayList<String> f46440b = new ArrayList<>();

        public C18543a(C18509e c18509e, String str) {
            this.f46439a = c18509e;
            m62305a(str);
        }

        /* renamed from: a */
        public C18509e m62306a() {
            return this.f46439a;
        }

        /* renamed from: b */
        public ArrayList<String> m62304b() {
            return this.f46440b;
        }

        /* renamed from: a */
        public void m62305a(String str) {
            this.f46440b.add(str);
        }
    }

    /* renamed from: a */
    public View m62317a(String str) {
        return this.f46431c.get(str);
    }

    /* renamed from: b */
    public C18543a m62315b(View view) {
        C18543a c18543a = this.f46430b.get(view);
        if (c18543a != null) {
            this.f46430b.remove(view);
        }
        return c18543a;
    }

    /* renamed from: c */
    public String m62312c(View view) {
        if (this.f46429a.size() == 0) {
            return null;
        }
        String str = this.f46429a.get(view);
        if (str != null) {
            this.f46429a.remove(view);
        }
        return str;
    }

    /* renamed from: d */
    public EnumC18553c m62309d(View view) {
        return this.f46432d.contains(view) ? EnumC18553c.PARENT_VIEW : this.f46438j ? EnumC18553c.OBSTRUCTION_VIEW : EnumC18553c.UNDERLYING_VIEW;
    }

    /* renamed from: e */
    public void m62308e() {
        C18506c m62493c = C18506c.m62493c();
        if (m62493c != null) {
            for (C18496a c18496a : m62493c.m62497a()) {
                View m62534c = c18496a.m62534c();
                if (c18496a.m62531f()) {
                    String adSessionId = c18496a.getAdSessionId();
                    if (m62534c != null) {
                        boolean m62347e = C18537h.m62347e(m62534c);
                        if (m62347e) {
                            this.f46436h.add(adSessionId);
                        }
                        String m62320a = m62320a(m62534c, m62347e);
                        if (m62320a == null) {
                            this.f46433e.add(adSessionId);
                            this.f46429a.put(m62534c, adSessionId);
                            m62319a(c18496a);
                        } else if (m62320a != "noWindowFocus") {
                            this.f46434f.add(adSessionId);
                            this.f46431c.put(adSessionId, m62534c);
                            this.f46435g.put(adSessionId, m62320a);
                        }
                    } else {
                        this.f46434f.add(adSessionId);
                        this.f46435g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private Boolean m62321a(View view) {
        if (view.hasWindowFocus()) {
            this.f46437i.remove(view);
            return Boolean.FALSE;
        } else if (this.f46437i.containsKey(view)) {
            return this.f46437i.get(view);
        } else {
            Map<View, Boolean> map = this.f46437i;
            Boolean bool = Boolean.FALSE;
            map.put(view, bool);
            return bool;
        }
    }

    /* renamed from: b */
    public String m62314b(String str) {
        return this.f46435g.get(str);
    }

    /* renamed from: c */
    public HashSet<String> m62313c() {
        return this.f46433e;
    }

    /* renamed from: d */
    public void m62310d() {
        this.f46438j = true;
    }

    /* renamed from: e */
    public boolean m62307e(View view) {
        if (this.f46437i.containsKey(view)) {
            this.f46437i.put(view, Boolean.TRUE);
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private String m62320a(View view, boolean z) {
        if (view.isAttachedToWindow()) {
            if (!m62321a(view).booleanValue() || z) {
                HashSet hashSet = new HashSet();
                while (view != null) {
                    String m62351a = C18537h.m62351a(view);
                    if (m62351a != null) {
                        return m62351a;
                    }
                    hashSet.add(view);
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                }
                this.f46432d.addAll(hashSet);
                return null;
            }
            return "noWindowFocus";
        }
        return "notAttached";
    }

    /* renamed from: b */
    public HashSet<String> m62316b() {
        return this.f46434f;
    }

    /* renamed from: c */
    public boolean m62311c(String str) {
        return this.f46436h.contains(str);
    }

    /* renamed from: a */
    public void m62322a() {
        this.f46429a.clear();
        this.f46430b.clear();
        this.f46431c.clear();
        this.f46432d.clear();
        this.f46433e.clear();
        this.f46434f.clear();
        this.f46435g.clear();
        this.f46438j = false;
        this.f46436h.clear();
    }

    /* renamed from: a */
    private void m62319a(C18496a c18496a) {
        for (C18509e c18509e : c18496a.m62533d()) {
            m62318a(c18509e, c18496a);
        }
    }

    /* renamed from: a */
    private void m62318a(C18509e c18509e, C18496a c18496a) {
        View view = c18509e.m62478c().get();
        if (view == null) {
            return;
        }
        C18543a c18543a = this.f46430b.get(view);
        if (c18543a != null) {
            c18543a.m62305a(c18496a.getAdSessionId());
        } else {
            this.f46430b.put(view, new C18543a(c18509e, c18496a.getAdSessionId()));
        }
    }
}
