package com.iab.omid.library.mobilefuse.walking;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.mobilefuse.adsession.C18356a;
import com.iab.omid.library.mobilefuse.internal.C18366c;
import com.iab.omid.library.mobilefuse.internal.C18369e;
import com.iab.omid.library.mobilefuse.utils.C18397h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.iab.omid.library.mobilefuse.walking.a */
/* loaded from: classes6.dex */
public class C18402a {

    /* renamed from: a */
    private final HashMap<View, String> f46159a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C18403a> f46160b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f46161c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f46162d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f46163e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f46164f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f46165g = new HashMap<>();

    /* renamed from: h */
    private final HashSet<String> f46166h = new HashSet<>();

    /* renamed from: i */
    private final Map<View, Boolean> f46167i = new WeakHashMap();

    /* renamed from: j */
    private boolean f46168j;

    /* renamed from: com.iab.omid.library.mobilefuse.walking.a$a */
    /* loaded from: classes6.dex */
    public static class C18403a {

        /* renamed from: a */
        private final C18369e f46169a;

        /* renamed from: b */
        private final ArrayList<String> f46170b = new ArrayList<>();

        public C18403a(C18369e c18369e, String str) {
            this.f46169a = c18369e;
            m62811a(str);
        }

        /* renamed from: a */
        public C18369e m62812a() {
            return this.f46169a;
        }

        /* renamed from: b */
        public ArrayList<String> m62810b() {
            return this.f46170b;
        }

        /* renamed from: a */
        public void m62811a(String str) {
            this.f46170b.add(str);
        }
    }

    /* renamed from: a */
    public View m62823a(String str) {
        return this.f46161c.get(str);
    }

    /* renamed from: b */
    public C18403a m62821b(View view) {
        C18403a c18403a = this.f46160b.get(view);
        if (c18403a != null) {
            this.f46160b.remove(view);
        }
        return c18403a;
    }

    /* renamed from: c */
    public String m62818c(View view) {
        if (this.f46159a.size() == 0) {
            return null;
        }
        String str = this.f46159a.get(view);
        if (str != null) {
            this.f46159a.remove(view);
        }
        return str;
    }

    /* renamed from: d */
    public EnumC18413c m62815d(View view) {
        return this.f46162d.contains(view) ? EnumC18413c.PARENT_VIEW : this.f46168j ? EnumC18413c.OBSTRUCTION_VIEW : EnumC18413c.UNDERLYING_VIEW;
    }

    /* renamed from: e */
    public void m62814e() {
        C18366c m62999c = C18366c.m62999c();
        if (m62999c != null) {
            for (C18356a c18356a : m62999c.m63003a()) {
                View m63040c = c18356a.m63040c();
                if (c18356a.m63037f()) {
                    String adSessionId = c18356a.getAdSessionId();
                    if (m63040c != null) {
                        boolean m62853e = C18397h.m62853e(m63040c);
                        if (m62853e) {
                            this.f46166h.add(adSessionId);
                        }
                        String m62826a = m62826a(m63040c, m62853e);
                        if (m62826a == null) {
                            this.f46163e.add(adSessionId);
                            this.f46159a.put(m63040c, adSessionId);
                            m62825a(c18356a);
                        } else if (m62826a != "noWindowFocus") {
                            this.f46164f.add(adSessionId);
                            this.f46161c.put(adSessionId, m63040c);
                            this.f46165g.put(adSessionId, m62826a);
                        }
                    } else {
                        this.f46164f.add(adSessionId);
                        this.f46165g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private Boolean m62827a(View view) {
        if (view.hasWindowFocus()) {
            this.f46167i.remove(view);
            return Boolean.FALSE;
        } else if (this.f46167i.containsKey(view)) {
            return this.f46167i.get(view);
        } else {
            Map<View, Boolean> map = this.f46167i;
            Boolean bool = Boolean.FALSE;
            map.put(view, bool);
            return bool;
        }
    }

    /* renamed from: b */
    public String m62820b(String str) {
        return this.f46165g.get(str);
    }

    /* renamed from: c */
    public HashSet<String> m62819c() {
        return this.f46163e;
    }

    /* renamed from: d */
    public void m62816d() {
        this.f46168j = true;
    }

    /* renamed from: e */
    public boolean m62813e(View view) {
        if (this.f46167i.containsKey(view)) {
            this.f46167i.put(view, Boolean.TRUE);
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private String m62826a(View view, boolean z) {
        if (view.isAttachedToWindow()) {
            if (!m62827a(view).booleanValue() || z) {
                HashSet hashSet = new HashSet();
                while (view != null) {
                    String m62857a = C18397h.m62857a(view);
                    if (m62857a != null) {
                        return m62857a;
                    }
                    hashSet.add(view);
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                }
                this.f46162d.addAll(hashSet);
                return null;
            }
            return "noWindowFocus";
        }
        return "notAttached";
    }

    /* renamed from: b */
    public HashSet<String> m62822b() {
        return this.f46164f;
    }

    @VisibleForTesting
    /* renamed from: c */
    public boolean m62817c(String str) {
        return this.f46166h.contains(str);
    }

    /* renamed from: a */
    public void m62828a() {
        this.f46159a.clear();
        this.f46160b.clear();
        this.f46161c.clear();
        this.f46162d.clear();
        this.f46163e.clear();
        this.f46164f.clear();
        this.f46165g.clear();
        this.f46168j = false;
        this.f46166h.clear();
    }

    /* renamed from: a */
    private void m62825a(C18356a c18356a) {
        for (C18369e c18369e : c18356a.m63039d()) {
            m62824a(c18369e, c18356a);
        }
    }

    /* renamed from: a */
    private void m62824a(C18369e c18369e, C18356a c18356a) {
        View view = c18369e.m62984c().get();
        if (view == null) {
            return;
        }
        C18403a c18403a = this.f46160b.get(view);
        if (c18403a != null) {
            c18403a.m62811a(c18356a.getAdSessionId());
        } else {
            this.f46160b.put(view, new C18403a(c18369e, c18356a.getAdSessionId()));
        }
    }
}
