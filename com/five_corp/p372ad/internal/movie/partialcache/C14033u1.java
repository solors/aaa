package com.five_corp.p372ad.internal.movie.partialcache;

import android.os.Handler;
import android.os.Looper;
import com.five_corp.p372ad.internal.C14068s;
import com.five_corp.p372ad.internal.cache.C13741n;
import com.five_corp.p372ad.internal.context.C13760i;
import com.five_corp.p372ad.internal.handler.InterfaceC13782b;
import com.five_corp.p372ad.internal.http.movcache.C13812h;
import com.five_corp.p372ad.internal.logger.C13836a;
import com.five_corp.p372ad.internal.movie.C13882h;
import com.five_corp.p372ad.internal.movie.C14060x;
import com.five_corp.p372ad.internal.movie.RunnableC13886l;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.five_corp.ad.internal.movie.partialcache.u1 */
/* loaded from: classes4.dex */
public final class C14033u1 implements InterfaceC13964d {

    /* renamed from: a */
    public final C13836a f26153a;

    /* renamed from: b */
    public final C13741n f26154b;

    /* renamed from: c */
    public final C13760i f26155c;

    /* renamed from: d */
    public final C13812h f26156d;

    /* renamed from: e */
    public final C14060x f26157e;

    /* renamed from: f */
    public final Looper f26158f;

    /* renamed from: g */
    public Handler f26159g;

    /* renamed from: h */
    public C14036v1 f26160h;

    public C14033u1(C13836a c13836a, C13741n c13741n, C13760i c13760i, C13812h c13812h, C14060x c14060x, Looper looper) {
        this.f26153a = c13836a;
        this.f26154b = c13741n;
        this.f26155c = c13760i;
        this.f26156d = c13812h;
        this.f26157e = c14060x;
        this.f26158f = looper;
    }

    /* JADX WARN: Removed duplicated region for block: B:198:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0044 A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m78174a(com.five_corp.p372ad.internal.movie.partialcache.C14033u1 r26, com.five_corp.p372ad.internal.movie.partialcache.C14036v1 r27) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.five_corp.p372ad.internal.movie.partialcache.C14033u1.m78174a(com.five_corp.ad.internal.movie.partialcache.u1, com.five_corp.ad.internal.movie.partialcache.v1):void");
    }

    /* renamed from: b */
    public final void m78170b(InterfaceC13782b interfaceC13782b) {
        Handler handler = this.f26159g;
        if (handler == null) {
            return;
        }
        try {
            handler.postAtFrontOfQueue(new RunnableC14015o1(this, interfaceC13782b));
        } catch (IllegalStateException unused) {
        }
    }

    /* renamed from: b */
    public final C14045w1 m78171b() {
        C14045w1 c14045w1;
        boolean z;
        C14036v1 c14036v1 = this.f26160h;
        if (c14036v1.f26166d != 2) {
            return null;
        }
        synchronized (c14036v1.f26170h) {
            ArrayDeque arrayDeque = c14036v1.f26171i;
            c14045w1 = arrayDeque.isEmpty() ? null : (C14045w1) arrayDeque.pollFirst();
            z = arrayDeque.size() < 3;
        }
        if (z) {
            c14036v1.f26163a.m78202c();
        }
        return c14045w1;
    }

    /* renamed from: a */
    public final boolean m78172a(List list) {
        boolean z;
        boolean z2;
        C14036v1 c14036v1 = this.f26160h;
        synchronized (c14036v1.f26168f) {
            int size = c14036v1.f26169g.size();
            int size2 = list.size() + size;
            z = size < 1 && size2 >= 1;
            z2 = size2 > 50;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c14036v1.f26169g.addLast((C14045w1) it.next());
            }
            if (!c14036v1.f26169g.isEmpty()) {
                boolean z3 = ((C14045w1) c14036v1.f26169g.peekLast()).f26197f;
            }
        }
        if (z) {
            C14060x c14060x = this.f26157e;
            c14060x.getClass();
            c14060x.f26227n.post(new RunnableC13886l(c14060x, new C13882h(c14060x)));
        }
        return z2;
    }

    /* renamed from: a */
    public final void m78173a(C14036v1 c14036v1, C14068s c14068s) {
        if (c14036v1.f26166d == 3) {
            return;
        }
        c14036v1.f26166d = 3;
        this.f26157e.m78148a(c14068s);
    }

    /* renamed from: a */
    public final void m78175a(InterfaceC13782b interfaceC13782b) {
        Handler handler = this.f26159g;
        if (handler == null) {
            return;
        }
        try {
            handler.post(new RunnableC14012n1(this, interfaceC13782b));
        } catch (IllegalStateException unused) {
        }
    }

    /* renamed from: a */
    public final C14045w1 m78176a() {
        C14045w1 c14045w1;
        boolean z;
        C14036v1 c14036v1 = this.f26160h;
        if (c14036v1.f26166d != 2) {
            return null;
        }
        synchronized (c14036v1.f26168f) {
            ArrayDeque arrayDeque = c14036v1.f26169g;
            c14045w1 = arrayDeque.isEmpty() ? null : (C14045w1) arrayDeque.pollFirst();
            z = arrayDeque.size() < 3;
        }
        if (z) {
            c14036v1.f26163a.m78202c();
        }
        return c14045w1;
    }
}
