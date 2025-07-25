package com.applovin.impl;

import android.content.Context;

/* renamed from: com.applovin.impl.gh */
/* loaded from: classes2.dex */
public class C4468gh {

    /* renamed from: a */
    private final String f6408a;

    /* renamed from: b */
    private final String f6409b;

    /* renamed from: c */
    private final boolean f6410c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4468gh(String str, String str2, Context context) {
        this.f6408a = str.replace("android.permission.", "");
        this.f6409b = str2;
        this.f6410c = AbstractC5947z3.m92543a(str, context);
    }

    /* renamed from: a */
    public String m98936a() {
        return this.f6409b;
    }

    /* renamed from: b */
    public String m98935b() {
        return this.f6408a;
    }

    /* renamed from: c */
    public boolean m98934c() {
        return this.f6410c;
    }
}
