package com.five_corp.p372ad.internal.movie;

import android.os.SystemClock;
import com.five_corp.p372ad.internal.C14068s;
import com.five_corp.p372ad.internal.EnumC14106t;

/* renamed from: com.five_corp.ad.internal.movie.v */
/* loaded from: classes4.dex */
public final class RunnableC14058v implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C14060x f26213a;

    public RunnableC14058v(C14060x c14060x) {
        this.f26213a = c14060x;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C14060x c14060x = this.f26213a;
        if (c14060x.f26230q != null) {
            if (SystemClock.uptimeMillis() > c14060x.f26229p) {
                c14060x.m78148a(new C14068s(EnumC14106t.f26328B0, null, null, null));
            } else {
                c14060x.f26227n.postAtTime(new RunnableC14058v(c14060x), c14060x.f26230q, SystemClock.uptimeMillis() + 500);
            }
        }
    }
}
