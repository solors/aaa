package com.iab.omid.library.fyber.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.fyber.adsession.C18099a;
import com.iab.omid.library.fyber.internal.C18109c;
import com.iab.omid.library.fyber.internal.C18112e;
import com.iab.omid.library.fyber.utils.C18140h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.iab.omid.library.fyber.walking.a */
/* loaded from: classes6.dex */
public class C18145a {

    /* renamed from: a */
    private final HashMap<View, String> f45635a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C18146a> f45636b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f45637c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f45638d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f45639e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f45640f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f45641g = new HashMap<>();

    /* renamed from: h */
    private final HashSet<String> f45642h = new HashSet<>();

    /* renamed from: i */
    private final Map<View, Boolean> f45643i = new WeakHashMap();

    /* renamed from: j */
    private boolean f45644j;

    /* renamed from: com.iab.omid.library.fyber.walking.a$a */
    /* loaded from: classes6.dex */
    public static class C18146a {

        /* renamed from: a */
        private final C18112e f45645a;

        /* renamed from: b */
        private final ArrayList<String> f45646b = new ArrayList<>();

        public C18146a(C18112e c18112e, String str) {
            this.f45645a = c18112e;
            m63793a(str);
        }

        /* renamed from: a */
        public C18112e m63794a() {
            return this.f45645a;
        }

        /* renamed from: b */
        public ArrayList<String> m63792b() {
            return this.f45646b;
        }

        /* renamed from: a */
        public void m63793a(String str) {
            this.f45646b.add(str);
        }
    }

    /* renamed from: a */
    public View m63805a(String str) {
        return this.f45637c.get(str);
    }

    /* renamed from: b */
    public C18146a m63803b(View view) {
        C18146a c18146a = this.f45636b.get(view);
        if (c18146a != null) {
            this.f45636b.remove(view);
        }
        return c18146a;
    }

    /* renamed from: c */
    public String m63800c(View view) {
        if (this.f45635a.size() == 0) {
            return null;
        }
        String str = this.f45635a.get(view);
        if (str != null) {
            this.f45635a.remove(view);
        }
        return str;
    }

    /* renamed from: d */
    public EnumC18156c m63797d(View view) {
        return this.f45638d.contains(view) ? EnumC18156c.PARENT_VIEW : this.f45644j ? EnumC18156c.OBSTRUCTION_VIEW : EnumC18156c.UNDERLYING_VIEW;
    }

    /* renamed from: e */
    public void m63796e() {
        C18109c m63981c = C18109c.m63981c();
        if (m63981c != null) {
            for (C18099a c18099a : m63981c.m63985a()) {
                View m64022c = c18099a.m64022c();
                if (c18099a.m64019f()) {
                    String adSessionId = c18099a.getAdSessionId();
                    if (m64022c != null) {
                        boolean m63835e = C18140h.m63835e(m64022c);
                        if (m63835e) {
                            this.f45642h.add(adSessionId);
                        }
                        String m63808a = m63808a(m64022c, m63835e);
                        if (m63808a == null) {
                            this.f45639e.add(adSessionId);
                            this.f45635a.put(m64022c, adSessionId);
                            m63807a(c18099a);
                        } else if (m63808a != "noWindowFocus") {
                            this.f45640f.add(adSessionId);
                            this.f45637c.put(adSessionId, m64022c);
                            this.f45641g.put(adSessionId, m63808a);
                        }
                    } else {
                        this.f45640f.add(adSessionId);
                        this.f45641g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private Boolean m63809a(View view) {
        if (view.hasWindowFocus()) {
            this.f45643i.remove(view);
            return Boolean.FALSE;
        } else if (this.f45643i.containsKey(view)) {
            return this.f45643i.get(view);
        } else {
            Map<View, Boolean> map = this.f45643i;
            Boolean bool = Boolean.FALSE;
            map.put(view, bool);
            return bool;
        }
    }

    /* renamed from: b */
    public String m63802b(String str) {
        return this.f45641g.get(str);
    }

    /* renamed from: c */
    public HashSet<String> m63801c() {
        return this.f45639e;
    }

    /* renamed from: d */
    public void m63798d() {
        this.f45644j = true;
    }

    /* renamed from: e */
    public boolean m63795e(View view) {
        if (this.f45643i.containsKey(view)) {
            this.f45643i.put(view, Boolean.TRUE);
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private String m63808a(View view, boolean z) {
        if (view.isAttachedToWindow()) {
            if (!m63809a(view).booleanValue() || z) {
                HashSet hashSet = new HashSet();
                while (view != null) {
                    String m63839a = C18140h.m63839a(view);
                    if (m63839a != null) {
                        return m63839a;
                    }
                    hashSet.add(view);
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                }
                this.f45638d.addAll(hashSet);
                return null;
            }
            return "noWindowFocus";
        }
        return "notAttached";
    }

    /* renamed from: b */
    public HashSet<String> m63804b() {
        return this.f45640f;
    }

    /* renamed from: c */
    public boolean m63799c(String str) {
        return this.f45642h.contains(str);
    }

    /* renamed from: a */
    public void m63810a() {
        this.f45635a.clear();
        this.f45636b.clear();
        this.f45637c.clear();
        this.f45638d.clear();
        this.f45639e.clear();
        this.f45640f.clear();
        this.f45641g.clear();
        this.f45644j = false;
        this.f45642h.clear();
    }

    /* renamed from: a */
    private void m63807a(C18099a c18099a) {
        for (C18112e c18112e : c18099a.m64021d()) {
            m63806a(c18112e, c18099a);
        }
    }

    /* renamed from: a */
    private void m63806a(C18112e c18112e, C18099a c18099a) {
        View view = c18112e.m63966c().get();
        if (view == null) {
            return;
        }
        C18146a c18146a = this.f45636b.get(view);
        if (c18146a != null) {
            c18146a.m63793a(c18099a.getAdSessionId());
        } else {
            this.f45636b.put(view, new C18146a(c18112e, c18099a.getAdSessionId()));
        }
    }
}
