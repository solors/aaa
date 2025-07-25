package com.five_corp.p372ad.internal.bgtask;

import android.os.Handler;
import android.os.HandlerThread;
import com.five_corp.p372ad.internal.util.C14116d;
import java.util.Iterator;

/* renamed from: com.five_corp.ad.internal.bgtask.e */
/* loaded from: classes4.dex */
public final class C13718e {

    /* renamed from: a */
    public final C13714a f25476a;

    /* renamed from: b */
    public final C14116d f25477b;

    /* renamed from: c */
    public final HandlerThread f25478c;

    /* renamed from: d */
    public final Handler f25479d;

    /* renamed from: e */
    public Long f25480e;

    public C13718e(int i, C13714a c13714a, C14116d c14116d) {
        this.f25476a = c13714a;
        this.f25477b = c14116d;
        HandlerThread handlerThread = new HandlerThread(C13718e.class.getName() + ":" + i);
        this.f25478c = handlerThread;
        handlerThread.start();
        this.f25479d = new Handler(handlerThread.getLooper());
        this.f25480e = null;
    }

    /* renamed from: a */
    public static void m78423a(C13718e c13718e, boolean z) {
        C13721h c13721h;
        if (z) {
            c13718e.f25480e = null;
        }
        while (true) {
            c13718e.f25477b.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            C13714a c13714a = c13718e.f25476a;
            synchronized (c13714a.f25469a) {
                if (c13714a.f25470b.isEmpty()) {
                    c13721h = null;
                } else {
                    C13720g m78427a = c13714a.m78427a(currentTimeMillis);
                    if (m78427a != null) {
                        c13721h = new C13721h(m78427a, 0L);
                    } else {
                        long j = ((C13720g) c13714a.f25470b.get(0)).f25486c;
                        Iterator it = c13714a.f25470b.iterator();
                        while (it.hasNext()) {
                            j = Math.min(j, ((C13720g) it.next()).f25486c);
                        }
                        c13721h = new C13721h(null, j);
                    }
                }
            }
            if (c13721h == null) {
                c13718e.f25478c.getId();
                return;
            }
            C13720g c13720g = c13721h.f25488a;
            if (c13720g == null) {
                long j2 = c13721h.f25489b;
                c13718e.f25478c.getId();
                Long l = c13718e.f25480e;
                if (l != null && l.longValue() <= j2) {
                    c13718e.f25478c.getId();
                    return;
                }
                c13718e.f25478c.getId();
                c13718e.f25480e = Long.valueOf(j2);
                c13718e.f25479d.postDelayed(new RunnableC13717d(c13718e), Math.max(j2 - currentTimeMillis, 0L));
                return;
            }
            c13718e.f25478c.getId();
            if (c13720g.m78422a() == 2) {
                int i = c13720g.f25487d;
                c13720g.f25486c = currentTimeMillis + (60000 << i);
                c13720g.f25487d = i + 1;
                c13718e.f25476a.m78426a(c13720g);
            }
        }
    }
}
