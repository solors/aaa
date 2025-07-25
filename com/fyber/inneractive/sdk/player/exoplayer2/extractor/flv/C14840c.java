package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import com.fyber.inneractive.sdk.player.exoplayer2.C15017r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C15121n;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.c */
/* loaded from: classes4.dex */
public final class C14840c extends AbstractC14842e {

    /* renamed from: b */
    public long f28330b;

    public C14840c() {
        super(null);
        this.f28330b = -9223372036854775807L;
    }

    /* renamed from: a */
    public final void m77510a(C15121n c15121n, long j) {
        if (c15121n.m77192j() == 2) {
            int m77187o = c15121n.m77187o();
            int i = c15121n.f29805b;
            c15121n.m77197e(i + m77187o);
            if ("onMetaData".equals(new String(c15121n.f29804a, i, m77187o)) && c15121n.m77192j() == 8) {
                HashMap m77511a = m77511a(c15121n);
                if (m77511a.containsKey("duration")) {
                    double doubleValue = ((Double) m77511a.get("duration")).doubleValue();
                    if (doubleValue > 0.0d) {
                        this.f28330b = (long) (doubleValue * 1000000.0d);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        throw new C15017r();
    }

    /* renamed from: a */
    public static Serializable m77512a(int i, C15121n c15121n) {
        if (i == 8) {
            return m77511a(c15121n);
        }
        if (i == 10) {
            int m77189m = c15121n.m77189m();
            ArrayList arrayList = new ArrayList(m77189m);
            for (int i2 = 0; i2 < m77189m; i2++) {
                arrayList.add(m77512a(c15121n.m77192j(), c15121n));
            }
            return arrayList;
        } else if (i == 11) {
            Date date = new Date((long) Double.longBitsToDouble(c15121n.m77195g()));
            c15121n.m77197e(c15121n.f29805b + 2);
            return date;
        } else if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(c15121n.m77195g()));
        } else {
            if (i == 1) {
                return Boolean.valueOf(c15121n.m77192j() == 1);
            } else if (i == 2) {
                int m77187o = c15121n.m77187o();
                int i3 = c15121n.f29805b;
                c15121n.m77197e(i3 + m77187o);
                return new String(c15121n.f29804a, i3, m77187o);
            } else if (i != 3) {
                return null;
            } else {
                HashMap hashMap = new HashMap();
                while (true) {
                    int m77187o2 = c15121n.m77187o();
                    int i4 = c15121n.f29805b;
                    c15121n.m77197e(i4 + m77187o2);
                    String str = new String(c15121n.f29804a, i4, m77187o2);
                    int m77192j = c15121n.m77192j();
                    if (m77192j == 9) {
                        return hashMap;
                    }
                    hashMap.put(str, m77512a(m77192j, c15121n));
                }
            }
        }
    }

    /* renamed from: a */
    public static HashMap m77511a(C15121n c15121n) {
        int m77189m = c15121n.m77189m();
        HashMap hashMap = new HashMap(m77189m);
        for (int i = 0; i < m77189m; i++) {
            int m77187o = c15121n.m77187o();
            int i2 = c15121n.f29805b;
            c15121n.m77197e(i2 + m77187o);
            hashMap.put(new String(c15121n.f29804a, i2, m77187o), m77512a(c15121n.m77192j(), c15121n));
        }
        return hashMap;
    }
}
