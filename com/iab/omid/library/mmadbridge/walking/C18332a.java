package com.iab.omid.library.mmadbridge.walking;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.mmadbridge.adsession.C18286a;
import com.iab.omid.library.mmadbridge.internal.C18296c;
import com.iab.omid.library.mmadbridge.internal.C18299e;
import com.iab.omid.library.mmadbridge.utils.C18327h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.iab.omid.library.mmadbridge.walking.a */
/* loaded from: classes6.dex */
public class C18332a {

    /* renamed from: a */
    private final HashMap<View, String> f46024a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C18333a> f46025b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f46026c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f46027d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f46028e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f46029f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f46030g = new HashMap<>();

    /* renamed from: h */
    private final HashSet<String> f46031h = new HashSet<>();

    /* renamed from: i */
    private final Map<View, Boolean> f46032i = new WeakHashMap();

    /* renamed from: j */
    private boolean f46033j;

    /* renamed from: com.iab.omid.library.mmadbridge.walking.a$a */
    /* loaded from: classes6.dex */
    public static class C18333a {

        /* renamed from: a */
        private final C18299e f46034a;

        /* renamed from: b */
        private final ArrayList<String> f46035b = new ArrayList<>();

        public C18333a(C18299e c18299e, String str) {
            this.f46034a = c18299e;
            m63064a(str);
        }

        /* renamed from: a */
        public C18299e m63065a() {
            return this.f46034a;
        }

        /* renamed from: b */
        public ArrayList<String> m63063b() {
            return this.f46035b;
        }

        /* renamed from: a */
        public void m63064a(String str) {
            this.f46035b.add(str);
        }
    }

    /* renamed from: a */
    public View m63076a(String str) {
        return this.f46026c.get(str);
    }

    /* renamed from: b */
    public C18333a m63074b(View view) {
        C18333a c18333a = this.f46025b.get(view);
        if (c18333a != null) {
            this.f46025b.remove(view);
        }
        return c18333a;
    }

    /* renamed from: c */
    public String m63071c(View view) {
        if (this.f46024a.size() == 0) {
            return null;
        }
        String str = this.f46024a.get(view);
        if (str != null) {
            this.f46024a.remove(view);
        }
        return str;
    }

    /* renamed from: d */
    public EnumC18343c m63068d(View view) {
        return this.f46027d.contains(view) ? EnumC18343c.PARENT_VIEW : this.f46033j ? EnumC18343c.OBSTRUCTION_VIEW : EnumC18343c.UNDERLYING_VIEW;
    }

    /* renamed from: e */
    public void m63067e() {
        C18296c m63252c = C18296c.m63252c();
        if (m63252c != null) {
            for (C18286a c18286a : m63252c.m63256a()) {
                View m63293c = c18286a.m63293c();
                if (c18286a.m63290f()) {
                    String adSessionId = c18286a.getAdSessionId();
                    if (m63293c != null) {
                        boolean m63106e = C18327h.m63106e(m63293c);
                        if (m63106e) {
                            this.f46031h.add(adSessionId);
                        }
                        String m63079a = m63079a(m63293c, m63106e);
                        if (m63079a == null) {
                            this.f46028e.add(adSessionId);
                            this.f46024a.put(m63293c, adSessionId);
                            m63078a(c18286a);
                        } else if (m63079a != "noWindowFocus") {
                            this.f46029f.add(adSessionId);
                            this.f46026c.put(adSessionId, m63293c);
                            this.f46030g.put(adSessionId, m63079a);
                        }
                    } else {
                        this.f46029f.add(adSessionId);
                        this.f46030g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private Boolean m63080a(View view) {
        if (view.hasWindowFocus()) {
            this.f46032i.remove(view);
            return Boolean.FALSE;
        } else if (this.f46032i.containsKey(view)) {
            return this.f46032i.get(view);
        } else {
            Map<View, Boolean> map = this.f46032i;
            Boolean bool = Boolean.FALSE;
            map.put(view, bool);
            return bool;
        }
    }

    /* renamed from: b */
    public String m63073b(String str) {
        return this.f46030g.get(str);
    }

    /* renamed from: c */
    public HashSet<String> m63072c() {
        return this.f46028e;
    }

    /* renamed from: d */
    public void m63069d() {
        this.f46033j = true;
    }

    /* renamed from: e */
    public boolean m63066e(View view) {
        if (this.f46032i.containsKey(view)) {
            this.f46032i.put(view, Boolean.TRUE);
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private String m63079a(View view, boolean z) {
        if (view.isAttachedToWindow()) {
            if (!m63080a(view).booleanValue() || z) {
                HashSet hashSet = new HashSet();
                while (view != null) {
                    String m63110a = C18327h.m63110a(view);
                    if (m63110a != null) {
                        return m63110a;
                    }
                    hashSet.add(view);
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                }
                this.f46027d.addAll(hashSet);
                return null;
            }
            return "noWindowFocus";
        }
        return "notAttached";
    }

    /* renamed from: b */
    public HashSet<String> m63075b() {
        return this.f46029f;
    }

    @VisibleForTesting
    /* renamed from: c */
    public boolean m63070c(String str) {
        return this.f46031h.contains(str);
    }

    /* renamed from: a */
    public void m63081a() {
        this.f46024a.clear();
        this.f46025b.clear();
        this.f46026c.clear();
        this.f46027d.clear();
        this.f46028e.clear();
        this.f46029f.clear();
        this.f46030g.clear();
        this.f46033j = false;
        this.f46031h.clear();
    }

    /* renamed from: a */
    private void m63078a(C18286a c18286a) {
        for (C18299e c18299e : c18286a.m63292d()) {
            m63077a(c18299e, c18286a);
        }
    }

    /* renamed from: a */
    private void m63077a(C18299e c18299e, C18286a c18286a) {
        View view = c18299e.m63237c().get();
        if (view == null) {
            return;
        }
        C18333a c18333a = this.f46025b.get(view);
        if (c18333a != null) {
            c18333a.m63064a(c18286a.getAdSessionId());
        } else {
            this.f46025b.put(view, new C18333a(c18299e, c18286a.getAdSessionId()));
        }
    }
}
