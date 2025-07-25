package com.ironsource;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ironsource.pb */
/* loaded from: classes6.dex */
public final class C20630pb {

    /* renamed from: a */
    private String f52389a;

    /* renamed from: b */
    private boolean f52390b;

    /* renamed from: c */
    private String f52391c;

    /* renamed from: d */
    private InterfaceC20204ke f52392d;

    /* renamed from: e */
    private boolean f52393e;

    /* renamed from: f */
    private ArrayList<Pair<String, String>> f52394f;

    /* renamed from: com.ironsource.pb$a */
    /* loaded from: classes6.dex */
    public static class C20631a {

        /* renamed from: a */
        private String f52395a;

        /* renamed from: d */
        private InterfaceC20204ke f52398d;

        /* renamed from: b */
        private boolean f52396b = false;

        /* renamed from: c */
        private String f52397c = "POST";

        /* renamed from: e */
        private boolean f52399e = false;

        /* renamed from: f */
        private ArrayList<Pair<String, String>> f52400f = new ArrayList<>();

        public C20631a(String str) {
            this.f52395a = "";
            if (str != null && !str.isEmpty()) {
                this.f52395a = str;
            }
        }

        /* renamed from: a */
        public C20631a m55845a(Pair<String, String> pair) {
            this.f52400f.add(pair);
            return this;
        }

        /* renamed from: b */
        public C20631a m55840b() {
            this.f52397c = "GET";
            return this;
        }

        /* renamed from: c */
        public C20631a m55837c() {
            this.f52397c = "POST";
            return this;
        }

        /* renamed from: a */
        public C20631a m55844a(InterfaceC20204ke interfaceC20204ke) {
            this.f52398d = interfaceC20204ke;
            return this;
        }

        /* renamed from: b */
        public C20631a m55838b(boolean z) {
            this.f52396b = z;
            return this;
        }

        /* renamed from: a */
        public C20631a m55842a(List<Pair<String, String>> list) {
            this.f52400f.addAll(list);
            return this;
        }

        /* renamed from: a */
        public C20631a m55841a(boolean z) {
            this.f52399e = z;
            return this;
        }

        /* renamed from: a */
        public C20630pb m55846a() {
            return new C20630pb(this);
        }
    }

    C20630pb(C20631a c20631a) {
        this.f52393e = false;
        this.f52389a = c20631a.f52395a;
        this.f52390b = c20631a.f52396b;
        this.f52391c = c20631a.f52397c;
        this.f52392d = c20631a.f52398d;
        this.f52393e = c20631a.f52399e;
        if (c20631a.f52400f != null) {
            this.f52394f = new ArrayList<>(c20631a.f52400f);
        }
    }

    /* renamed from: a */
    public boolean m55852a() {
        return this.f52390b;
    }

    /* renamed from: b */
    public String m55851b() {
        return this.f52389a;
    }

    /* renamed from: c */
    public InterfaceC20204ke m55850c() {
        return this.f52392d;
    }

    /* renamed from: d */
    public ArrayList<Pair<String, String>> m55849d() {
        return new ArrayList<>(this.f52394f);
    }

    /* renamed from: e */
    public String m55848e() {
        return this.f52391c;
    }

    /* renamed from: f */
    public boolean m55847f() {
        return this.f52393e;
    }
}
