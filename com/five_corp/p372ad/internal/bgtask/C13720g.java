package com.five_corp.p372ad.internal.bgtask;

import com.five_corp.p372ad.internal.C13837m;
import com.five_corp.p372ad.internal.logger.C13836a;

/* renamed from: com.five_corp.ad.internal.bgtask.g */
/* loaded from: classes4.dex */
public final class C13720g {

    /* renamed from: a */
    public final AbstractC13726m f25484a;

    /* renamed from: b */
    public final C13836a f25485b;

    /* renamed from: c */
    public long f25486c = 0;

    /* renamed from: d */
    public int f25487d = 0;

    public C13720g(AbstractC13726m abstractC13726m, C13836a c13836a) {
        this.f25484a = abstractC13726m;
        this.f25485b = c13836a;
    }

    /* renamed from: a */
    public final int m78422a() {
        this.f25484a.toString();
        try {
            if (this.f25484a.mo78312b()) {
                this.f25484a.toString();
                C13837m c13837m = this.f25484a.f25499b;
                if (c13837m != null) {
                    synchronized (c13837m.f25839h) {
                        c13837m.f25840i = false;
                    }
                    return 1;
                }
                return 1;
            } else if (this.f25487d < 3) {
                this.f25484a.toString();
                return 2;
            } else {
                this.f25484a.toString();
                this.f25484a.m78420a();
                return 3;
            }
        } catch (Exception e) {
            this.f25484a.toString();
            this.f25485b.m78269a(e);
            this.f25484a.m78420a();
            return 3;
        }
    }
}
