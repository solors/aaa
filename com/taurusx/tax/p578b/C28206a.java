package com.taurusx.tax.p578b;

import android.content.Context;
import com.google.common.primitives.UnsignedBytes;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.api.TaurusXAdsConfiguration;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.p578b.p580d.C28218b;
import com.taurusx.tax.p583c.p589e.C28291a;
import java.util.concurrent.atomic.AtomicBoolean;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.b.a */
/* loaded from: classes7.dex */
public class C28206a {

    /* renamed from: m */
    public static C28206a f73183m;

    /* renamed from: n */
    public static AtomicBoolean f73184n;

    /* renamed from: a */
    public String f73185a;

    /* renamed from: b */
    public Context f73186b;

    /* renamed from: c */
    public TaurusXAdsConfiguration f73187c;

    /* renamed from: d */
    public boolean f73188d;

    /* renamed from: e */
    public int f73189e = -1;

    /* renamed from: f */
    public int f73190f = -1;

    /* renamed from: g */
    public int f73191g = -1;

    /* renamed from: h */
    public int f73192h = -1;

    /* renamed from: i */
    public C28291a f73193i;

    /* renamed from: j */
    public boolean f73194j;

    /* renamed from: k */
    public String f73195k;

    /* renamed from: l */
    public int f73196l;

    static {
        C28162a.f73047a.m23824a(new byte[]{-13, -125, -46, -112, -46, -111, -1, -93, -61, -111, -28, -115, -43, -121}, new byte[]{-89, -30});
        f73184n = new AtomicBoolean(false);
    }

    /* renamed from: e */
    public static C28206a m38470e() {
        if (f73183m == null) {
            synchronized (C28206a.class) {
                if (f73183m == null) {
                    f73183m = new C28206a();
                }
            }
        }
        return f73183m;
    }

    /* renamed from: a */
    public boolean m38474a(long j, long j2) {
        if (j <= 0) {
            j = C28218b.m38416b();
        }
        long currentTimeMillis = System.currentTimeMillis() - j2;
        StringFogImpl stringFogImpl = C28162a.f73047a;
        String m23824a = stringFogImpl.m23824a(new byte[]{43, UnsignedBytes.MAX_POWER_OF_TWO, 42, -109, 42, -110, 39}, new byte[]{95, -31});
        LogUtil.m37901iv(m23824a, stringFogImpl.m23824a(new byte[]{9, 30, 3, 27, 10, 19, 79, 3, 6, 26, 10, 87, 85, 87}, new byte[]{111, 119}) + currentTimeMillis + stringFogImpl.m23824a(new byte[]{-69, -74, -69, -1, -29, -22, -14, -24, -2, -70, -17, -13, -10, -1, -69, -96, -69}, new byte[]{-101, -102}) + j);
        return currentTimeMillis > j;
    }

    /* renamed from: b */
    public String m38473b() {
        return this.f73195k;
    }

    /* renamed from: c */
    public int m38472c() {
        return this.f73190f;
    }

    /* renamed from: d */
    public int m38471d() {
        return this.f73191g;
    }

    /* renamed from: f */
    public int m38469f() {
        return this.f73192h;
    }

    /* renamed from: a */
    public int m38475a() {
        return this.f73189e;
    }
}
