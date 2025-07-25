package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Function;
import java.util.Comparator;

/* renamed from: com.applovin.impl.vg */
/* loaded from: classes2.dex */
public abstract class AbstractC5699vg implements Comparator {
    /* renamed from: a */
    public static AbstractC5699vg m93895a(Comparator comparator) {
        if (comparator instanceof AbstractC5699vg) {
            return (AbstractC5699vg) comparator;
        }
        return new C5816x3(comparator);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public AbstractC5699vg m93894b() {
        return m93897a(AbstractC5622uc.m94173a());
    }

    /* renamed from: c */
    public AbstractC5699vg mo92405c() {
        return new C5919yi(this);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    /* renamed from: a */
    public AbstractC4247db m93896a(Iterable iterable) {
        return AbstractC4247db.m99837a((Comparator) this, iterable);
    }

    /* renamed from: a */
    public static AbstractC5699vg m93898a() {
        return C5970zf.f12565a;
    }

    /* renamed from: a */
    public AbstractC5699vg m93897a(Function function) {
        return new C5234r2(function, this);
    }
}
