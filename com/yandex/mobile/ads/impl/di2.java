package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes8.dex */
public final class di2 {

    /* renamed from: a */
    private final HashMap<View, String> f78150a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C30169a> f78151b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f78152c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f78153d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f78154e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f78155f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f78156g = new HashMap<>();

    /* renamed from: h */
    private final WeakHashMap f78157h = new WeakHashMap();

    /* renamed from: i */
    private boolean f78158i;

    /* renamed from: com.yandex.mobile.ads.impl.di2$a */
    /* loaded from: classes8.dex */
    public static class C30169a {

        /* renamed from: a */
        private final pi2 f78159a;

        /* renamed from: b */
        private final ArrayList<String> f78160b = new ArrayList<>();

        public C30169a(pi2 pi2Var, String str) {
            this.f78159a = pi2Var;
            m34900a(str);
        }

        /* renamed from: a */
        public final pi2 m34901a() {
            return this.f78159a;
        }

        /* renamed from: b */
        public final ArrayList<String> m34899b() {
            return this.f78160b;
        }

        /* renamed from: a */
        public final void m34900a(String str) {
            this.f78160b.add(str);
        }
    }

    /* renamed from: a */
    public final String m34911a(View view) {
        if (this.f78150a.size() == 0) {
            return null;
        }
        String str = this.f78150a.get(view);
        if (str != null) {
            this.f78150a.remove(view);
        }
        return str;
    }

    /* renamed from: b */
    public final View m34907b(String str) {
        return this.f78152c.get(str);
    }

    /* renamed from: c */
    public final int m34905c(View view) {
        if (this.f78153d.contains(view)) {
            return 1;
        }
        return this.f78158i ? 2 : 3;
    }

    /* renamed from: d */
    public final void m34904d() {
        this.f78150a.clear();
        this.f78151b.clear();
        this.f78152c.clear();
        this.f78153d.clear();
        this.f78154e.clear();
        this.f78155f.clear();
        this.f78156g.clear();
        this.f78158i = false;
    }

    /* renamed from: e */
    public final void m34902e() {
        this.f78158i = true;
    }

    /* renamed from: a */
    public final String m34910a(String str) {
        return this.f78156g.get(str);
    }

    /* renamed from: b */
    public final C30169a m34908b(View view) {
        C30169a c30169a = this.f78151b.get(view);
        if (c30169a != null) {
            this.f78151b.remove(view);
        }
        return c30169a;
    }

    /* renamed from: c */
    public final void m34906c() {
        Boolean bool;
        String str;
        yh2 m26905a = yh2.m26905a();
        if (m26905a != null) {
            for (xh2 xh2Var : m26905a.m26901c()) {
                View m27485f = xh2Var.m27485f();
                if (xh2Var.m27484g()) {
                    String m27482i = xh2Var.m27482i();
                    if (m27485f != null) {
                        if (m27485f.isAttachedToWindow()) {
                            if (m27485f.hasWindowFocus()) {
                                this.f78157h.remove(m27485f);
                                bool = Boolean.FALSE;
                            } else if (this.f78157h.containsKey(m27485f)) {
                                bool = (Boolean) this.f78157h.get(m27485f);
                            } else {
                                WeakHashMap weakHashMap = this.f78157h;
                                Boolean bool2 = Boolean.FALSE;
                                weakHashMap.put(m27485f, bool2);
                                bool = bool2;
                            }
                            if (!bool.booleanValue()) {
                                HashSet hashSet = new HashSet();
                                View view = m27485f;
                                while (true) {
                                    if (view == null) {
                                        this.f78153d.addAll(hashSet);
                                        str = null;
                                        break;
                                    }
                                    String m35224c = cj2.m35224c(view);
                                    if (m35224c != null) {
                                        str = m35224c;
                                        break;
                                    }
                                    hashSet.add(view);
                                    ViewParent parent = view.getParent();
                                    view = parent instanceof View ? (View) parent : null;
                                }
                            } else {
                                str = "noWindowFocus";
                            }
                        } else {
                            str = "notAttached";
                        }
                        if (str == null) {
                            this.f78154e.add(m27482i);
                            this.f78150a.put(m27485f, m27482i);
                            Iterator it = xh2Var.m27488c().iterator();
                            while (it.hasNext()) {
                                pi2 pi2Var = (pi2) it.next();
                                View view2 = pi2Var.m30650a().get();
                                if (view2 != null) {
                                    C30169a c30169a = this.f78151b.get(view2);
                                    if (c30169a != null) {
                                        c30169a.m34900a(xh2Var.m27482i());
                                    } else {
                                        this.f78151b.put(view2, new C30169a(pi2Var, xh2Var.m27482i()));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.f78155f.add(m27482i);
                            this.f78152c.put(m27482i, m27485f);
                            this.f78156g.put(m27482i, str);
                        }
                    } else {
                        this.f78155f.add(m27482i);
                        this.f78156g.put(m27482i, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final boolean m34903d(View view) {
        if (this.f78157h.containsKey(view)) {
            this.f78157h.put(view, Boolean.TRUE);
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final HashSet<String> m34912a() {
        return this.f78154e;
    }

    /* renamed from: b */
    public final HashSet<String> m34909b() {
        return this.f78155f;
    }
}
