package com.applovin.impl;

import android.util.Pair;
import com.applovin.impl.AbstractC4406fo;

/* renamed from: com.applovin.impl.b */
/* loaded from: classes2.dex */
public abstract class AbstractC4096b extends AbstractC4406fo {

    /* renamed from: c */
    private final int f4865c;

    /* renamed from: d */
    private final InterfaceC5783wj f4866d;

    /* renamed from: f */
    private final boolean f4867f;

    public AbstractC4096b(boolean z, InterfaceC5783wj interfaceC5783wj) {
        this.f4867f = z;
        this.f4866d = interfaceC5783wj;
        this.f4865c = interfaceC5783wj.mo93507a();
    }

    /* renamed from: a */
    public static Object m100605a(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    /* renamed from: c */
    public static Object m100603c(Object obj) {
        return ((Pair) obj).second;
    }

    /* renamed from: d */
    public static Object m100602d(Object obj) {
        return ((Pair) obj).first;
    }

    /* renamed from: b */
    protected abstract int mo94615b(Object obj);

    @Override // com.applovin.impl.AbstractC4406fo
    /* renamed from: b */
    public int mo98764b(boolean z) {
        int i = this.f4865c;
        if (i == 0) {
            return -1;
        }
        if (this.f4867f) {
            z = false;
        }
        int mo93500c = z ? this.f4866d.mo93500c() : i - 1;
        while (mo94608i(mo93500c).m99123c()) {
            mo93500c = m100604b(mo93500c, z);
            if (mo93500c == -1) {
                return -1;
            }
        }
        return mo94609h(mo93500c) + mo94608i(mo93500c).mo98764b(z);
    }

    /* renamed from: d */
    protected abstract int mo94613d(int i);

    /* renamed from: e */
    protected abstract int mo94612e(int i);

    /* renamed from: f */
    protected abstract Object mo94611f(int i);

    /* renamed from: g */
    protected abstract int mo94610g(int i);

    /* renamed from: h */
    protected abstract int mo94609h(int i);

    /* renamed from: i */
    protected abstract AbstractC4406fo mo94608i(int i);

    @Override // com.applovin.impl.AbstractC4406fo
    /* renamed from: a */
    public int mo98766a(boolean z) {
        if (this.f4865c == 0) {
            return -1;
        }
        if (this.f4867f) {
            z = false;
        }
        int mo93503b = z ? this.f4866d.mo93503b() : 0;
        while (mo94608i(mo93503b).m99123c()) {
            mo93503b = m100606a(mo93503b, z);
            if (mo93503b == -1) {
                return -1;
            }
        }
        return mo94609h(mo93503b) + mo94608i(mo93503b).mo98766a(z);
    }

    /* renamed from: b */
    private int m100604b(int i, boolean z) {
        if (z) {
            return this.f4866d.mo93502b(i);
        }
        if (i > 0) {
            return i - 1;
        }
        return -1;
    }

    @Override // com.applovin.impl.AbstractC4406fo
    /* renamed from: a */
    public final int mo93561a(Object obj) {
        int mo93561a;
        if (obj instanceof Pair) {
            Object m100602d = m100602d(obj);
            Object m100603c = m100603c(obj);
            int mo94615b = mo94615b(m100602d);
            if (mo94615b == -1 || (mo93561a = mo94608i(mo94615b).mo93561a(m100603c)) == -1) {
                return -1;
            }
            return mo94610g(mo94615b) + mo93561a;
        }
        return -1;
    }

    @Override // com.applovin.impl.AbstractC4406fo
    /* renamed from: b */
    public int mo98765b(int i, int i2, boolean z) {
        if (this.f4867f) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int mo94612e = mo94612e(i);
        int mo94609h = mo94609h(mo94612e);
        int mo98765b = mo94608i(mo94612e).mo98765b(i - mo94609h, i2 != 2 ? i2 : 0, z);
        if (mo98765b != -1) {
            return mo94609h + mo98765b;
        }
        int m100604b = m100604b(mo94612e, z);
        while (m100604b != -1 && mo94608i(m100604b).m99123c()) {
            m100604b = m100604b(m100604b, z);
        }
        if (m100604b != -1) {
            return mo94609h(m100604b) + mo94608i(m100604b).mo98764b(z);
        }
        if (i2 == 2) {
            return mo98764b(z);
        }
        return -1;
    }

    /* renamed from: a */
    private int m100606a(int i, boolean z) {
        if (z) {
            return this.f4866d.mo93506a(i);
        }
        if (i < this.f4865c - 1) {
            return i + 1;
        }
        return -1;
    }

    @Override // com.applovin.impl.AbstractC4406fo
    /* renamed from: a */
    public int mo98767a(int i, int i2, boolean z) {
        if (this.f4867f) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int mo94612e = mo94612e(i);
        int mo94609h = mo94609h(mo94612e);
        int mo98767a = mo94608i(mo94612e).mo98767a(i - mo94609h, i2 != 2 ? i2 : 0, z);
        if (mo98767a != -1) {
            return mo94609h + mo98767a;
        }
        int m100606a = m100606a(mo94612e, z);
        while (m100606a != -1 && mo94608i(m100606a).m99123c()) {
            m100606a = m100606a(m100606a, z);
        }
        if (m100606a != -1) {
            return mo94609h(m100606a) + mo94608i(m100606a).mo98766a(z);
        }
        if (i2 == 2) {
            return mo98766a(z);
        }
        return -1;
    }

    @Override // com.applovin.impl.AbstractC4406fo
    /* renamed from: b */
    public final Object mo93559b(int i) {
        int mo94613d = mo94613d(i);
        return m100605a(mo94611f(mo94613d), mo94608i(mo94613d).mo93559b(i - mo94610g(mo94613d)));
    }

    @Override // com.applovin.impl.AbstractC4406fo
    /* renamed from: a */
    public final AbstractC4406fo.C4408b mo93563a(int i, AbstractC4406fo.C4408b c4408b, boolean z) {
        int mo94613d = mo94613d(i);
        int mo94609h = mo94609h(mo94613d);
        mo94608i(mo94613d).mo93563a(i - mo94610g(mo94613d), c4408b, z);
        c4408b.f6159c += mo94609h;
        if (z) {
            c4408b.f6158b = m100605a(mo94611f(mo94613d), AbstractC4100b1.m100583a(c4408b.f6158b));
        }
        return c4408b;
    }

    @Override // com.applovin.impl.AbstractC4406fo
    /* renamed from: a */
    public final AbstractC4406fo.C4408b mo99126a(Object obj, AbstractC4406fo.C4408b c4408b) {
        Object m100602d = m100602d(obj);
        Object m100603c = m100603c(obj);
        int mo94615b = mo94615b(m100602d);
        int mo94609h = mo94609h(mo94615b);
        mo94608i(mo94615b).mo99126a(m100603c, c4408b);
        c4408b.f6159c += mo94609h;
        c4408b.f6158b = obj;
        return c4408b;
    }

    @Override // com.applovin.impl.AbstractC4406fo
    /* renamed from: a */
    public final AbstractC4406fo.C4410d mo93562a(int i, AbstractC4406fo.C4410d c4410d, long j) {
        int mo94612e = mo94612e(i);
        int mo94609h = mo94609h(mo94612e);
        int mo94610g = mo94610g(mo94612e);
        mo94608i(mo94612e).mo93562a(i - mo94609h, c4410d, j);
        Object mo94611f = mo94611f(mo94612e);
        if (!AbstractC4406fo.C4410d.f6168s.equals(c4410d.f6172a)) {
            mo94611f = m100605a(mo94611f, c4410d.f6172a);
        }
        c4410d.f6172a = mo94611f;
        c4410d.f6186p += mo94610g;
        c4410d.f6187q += mo94610g;
        return c4410d;
    }
}
