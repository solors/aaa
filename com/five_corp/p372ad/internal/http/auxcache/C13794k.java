package com.five_corp.p372ad.internal.http.auxcache;

import com.five_corp.p372ad.internal.http.C13783a;
import com.five_corp.p372ad.internal.logger.C13836a;
import com.five_corp.p372ad.internal.storage.C14080e;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.five_corp.ad.internal.http.auxcache.k */
/* loaded from: classes4.dex */
public final class C13794k {

    /* renamed from: a */
    public final C13783a f25697a;

    /* renamed from: b */
    public final String f25698b;

    /* renamed from: c */
    public final C13836a f25699c;

    /* renamed from: d */
    public final C14080e f25700d;

    /* renamed from: e */
    public final ArrayDeque f25701e;

    /* renamed from: f */
    public ArrayList f25702f;

    /* renamed from: g */
    public final ArrayList f25703g;

    /* renamed from: h */
    public HashMap f25704h;

    /* renamed from: i */
    public int f25705i;

    /* renamed from: j */
    public boolean f25706j;

    public C13794k(String str, C13783a c13783a, C14080e c14080e, ArrayList arrayList, C13836a c13836a) {
        this.f25697a = c13783a;
        this.f25700d = c14080e;
        this.f25699c = c13836a;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f25701e = arrayDeque;
        arrayDeque.addAll(arrayList);
        this.f25702f = new ArrayList();
        this.f25703g = new ArrayList();
        this.f25704h = null;
        this.f25705i = 0;
        this.f25706j = false;
        this.f25698b = str;
    }
}
