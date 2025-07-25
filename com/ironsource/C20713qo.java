package com.ironsource;

import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: com.ironsource.qo */
/* loaded from: classes6.dex */
public class C20713qo {

    /* renamed from: a */
    private final ArrayList<String> f52619a = new ArrayList<>();

    /* renamed from: b */
    private final ArrayList<String> f52620b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<String> f52621c = new ArrayList<>();

    /* renamed from: d */
    private final ArrayList<String> f52622d = new ArrayList<>();

    /* renamed from: a */
    public ArrayList<String> m55597a() {
        return this.f52621c;
    }

    /* renamed from: b */
    public ArrayList<String> m55595b() {
        return this.f52620b;
    }

    /* renamed from: c */
    public ArrayList<String> m55593c() {
        return this.f52622d;
    }

    /* renamed from: d */
    public ArrayList<String> m55591d() {
        return this.f52619a;
    }

    /* renamed from: a */
    public void m55596a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f52621c.add(str);
    }

    /* renamed from: b */
    public void m55594b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f52620b.add(str);
    }

    /* renamed from: c */
    public void m55592c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f52622d.add(str);
    }

    /* renamed from: d */
    public void m55590d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f52619a.add(str);
    }
}
