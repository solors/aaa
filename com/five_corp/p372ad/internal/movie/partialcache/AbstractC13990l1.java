package com.five_corp.p372ad.internal.movie.partialcache;

import com.five_corp.p372ad.internal.logger.C13836a;
import java.util.Iterator;

/* renamed from: com.five_corp.ad.internal.movie.partialcache.l1 */
/* loaded from: classes4.dex */
public abstract class AbstractC13990l1 {

    /* renamed from: l */
    public static final /* synthetic */ int f26074l = 0;

    /* renamed from: a */
    public final C13836a f26075a;

    /* renamed from: b */
    public C14020q0 f26076b;

    /* renamed from: c */
    public C14014o0 f26077c;

    /* renamed from: f */
    public int f26080f;

    /* renamed from: g */
    public C14048x1 f26081g;

    /* renamed from: h */
    public C13942a f26082h;

    /* renamed from: i */
    public C13987k1 f26083i;

    /* renamed from: j */
    public C13987k1 f26084j;

    /* renamed from: d */
    public int f26078d = 0;

    /* renamed from: e */
    public int f26079e = 0;

    /* renamed from: k */
    public boolean f26085k = false;

    public AbstractC13990l1(C13836a c13836a) {
        this.f26075a = c13836a;
    }

    /* renamed from: b */
    public static AbstractC13897D m78189b(AbstractC13897D abstractC13897D, Class cls) {
        Iterator it = abstractC13897D.f25962c.iterator();
        while (it.hasNext()) {
            AbstractC13897D abstractC13897D2 = (AbstractC13897D) it.next();
            if (cls.isInstance(abstractC13897D2)) {
                return abstractC13897D2;
            }
        }
        return null;
    }
}
