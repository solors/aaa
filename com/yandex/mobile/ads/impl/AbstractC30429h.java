package com.yandex.mobile.ads.impl;

import android.util.Pair;
import com.yandex.mobile.ads.impl.g02;

/* renamed from: com.yandex.mobile.ads.impl.h */
/* loaded from: classes8.dex */
public abstract class AbstractC30429h extends g02 {

    /* renamed from: c */
    private final int f79811c;

    /* renamed from: d */
    private final st1 f79812d;

    /* renamed from: e */
    private final boolean f79813e = false;

    public AbstractC30429h(st1 st1Var) {
        this.f79812d = st1Var;
        this.f79811c = st1Var.mo29537b();
    }

    /* renamed from: a */
    public static Object m33750a(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    /* renamed from: c */
    public static Object m33746c(Object obj) {
        return ((Pair) obj).second;
    }

    /* renamed from: d */
    public static Object m33745d(Object obj) {
        return ((Pair) obj).first;
    }

    /* renamed from: b */
    protected abstract int mo33565b(int i);

    /* renamed from: b */
    protected abstract int mo33564b(Object obj);

    @Override // com.yandex.mobile.ads.impl.g02
    /* renamed from: b */
    public final int mo33747b(boolean z) {
        int i = this.f79811c;
        if (i == 0) {
            return -1;
        }
        if (this.f79813e) {
            z = false;
        }
        int mo29535c = z ? this.f79812d.mo29535c() : i - 1;
        while (mo33558g(mo29535c).m34028c()) {
            if (z) {
                mo29535c = this.f79812d.mo29532d(mo29535c);
                continue;
            } else if (mo29535c > 0) {
                mo29535c--;
                continue;
            } else {
                mo29535c = -1;
                continue;
            }
            if (mo29535c == -1) {
                return -1;
            }
        }
        return mo33558g(mo29535c).mo33747b(z) + mo33559f(mo29535c);
    }

    /* renamed from: c */
    protected abstract int mo33563c(int i);

    /* renamed from: d */
    protected abstract Object mo33561d(int i);

    /* renamed from: e */
    protected abstract int mo33560e(int i);

    /* renamed from: f */
    protected abstract int mo33559f(int i);

    /* renamed from: g */
    protected abstract g02 mo33558g(int i);

    @Override // com.yandex.mobile.ads.impl.g02
    /* renamed from: a */
    public final int mo33749a(boolean z) {
        if (this.f79811c == 0) {
            return -1;
        }
        if (this.f79813e) {
            z = false;
        }
        int mo29540a = z ? this.f79812d.mo29540a() : 0;
        while (mo33558g(mo29540a).m34028c()) {
            if (z) {
                mo29540a = this.f79812d.mo29539a(mo29540a);
                continue;
            } else if (mo29540a < this.f79811c - 1) {
                mo29540a++;
                continue;
            } else {
                mo29540a = -1;
                continue;
            }
            if (mo29540a == -1) {
                return -1;
            }
        }
        return mo33558g(mo29540a).mo33749a(z) + mo33559f(mo29540a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
        if (r0 > 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004a, code lost:
        if (r0 > 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004c, code lost:
        r0 = r0 - 1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0034 -> B:21:0x0035). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x004c -> B:21:0x0035). Please submit an issue!!! */
    @Override // com.yandex.mobile.ads.impl.g02
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo33748b(int r7, int r8, boolean r9) {
        /*
            r6 = this;
            boolean r0 = r6.f79813e
            r1 = 0
            r2 = 1
            r3 = 2
            if (r0 == 0) goto Lb
            if (r8 != r2) goto La
            r8 = r3
        La:
            r9 = r1
        Lb:
            int r0 = r6.mo33563c(r7)
            int r4 = r6.mo33559f(r0)
            com.yandex.mobile.ads.impl.g02 r5 = r6.mo33558g(r0)
            int r7 = r7 - r4
            if (r8 != r3) goto L1b
            goto L1c
        L1b:
            r1 = r8
        L1c:
            int r7 = r5.mo33748b(r7, r1, r9)
            r1 = -1
            if (r7 == r1) goto L25
            int r4 = r4 + r7
            return r4
        L25:
            if (r9 == 0) goto L30
            com.yandex.mobile.ads.impl.st1 r7 = r6.f79812d
            int r7 = r7.mo29532d(r0)
            r0 = r7
            r7 = r6
            goto L35
        L30:
            r7 = r6
            if (r0 <= 0) goto L34
            goto L4c
        L34:
            r0 = r1
        L35:
            if (r0 == r1) goto L4e
            com.yandex.mobile.ads.impl.g02 r4 = r7.mo33558g(r0)
            boolean r4 = r4.m34028c()
            if (r4 == 0) goto L4e
            if (r9 == 0) goto L4a
            com.yandex.mobile.ads.impl.st1 r4 = r7.f79812d
            int r0 = r4.mo29532d(r0)
            goto L35
        L4a:
            if (r0 <= 0) goto L34
        L4c:
            int r0 = r0 - r2
            goto L35
        L4e:
            if (r0 == r1) goto L5e
            int r8 = r7.mo33559f(r0)
            com.yandex.mobile.ads.impl.g02 r7 = r7.mo33558g(r0)
            int r7 = r7.mo33747b(r9)
            int r7 = r7 + r8
            return r7
        L5e:
            if (r8 != r3) goto L65
            int r7 = r7.mo33747b(r9)
            return r7
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.AbstractC30429h.mo33748b(int, int, boolean):int");
    }

    @Override // com.yandex.mobile.ads.impl.g02
    /* renamed from: a */
    public final int mo31765a(Object obj) {
        int mo31765a;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            int mo33564b = mo33564b(obj2);
            if (mo33564b == -1 || (mo31765a = mo33558g(mo33564b).mo31765a(obj3)) == -1) {
                return -1;
            }
            return mo33560e(mo33564b) + mo31765a;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0051, code lost:
        if (r0 < (r7.f79811c - 1)) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047 A[LOOP:0: B:22:0x0039->B:26:0x0047, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004e A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0038 -> B:22:0x0039). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0053 -> B:22:0x0039). Please submit an issue!!! */
    @Override // com.yandex.mobile.ads.impl.g02
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo33752a(int r7, int r8, boolean r9) {
        /*
            r6 = this;
            boolean r0 = r6.f79813e
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto Lb
            if (r8 != r3) goto La
            r8 = r2
        La:
            r9 = r1
        Lb:
            int r0 = r6.mo33563c(r7)
            int r4 = r6.mo33559f(r0)
            com.yandex.mobile.ads.impl.g02 r5 = r6.mo33558g(r0)
            int r7 = r7 - r4
            if (r8 != r2) goto L1b
            goto L1c
        L1b:
            r1 = r8
        L1c:
            int r7 = r5.mo33752a(r7, r1, r9)
            r1 = -1
            if (r7 == r1) goto L25
            int r4 = r4 + r7
            return r4
        L25:
            if (r9 == 0) goto L30
            com.yandex.mobile.ads.impl.st1 r7 = r6.f79812d
            int r7 = r7.mo29539a(r0)
            r0 = r7
            r7 = r6
            goto L39
        L30:
            int r7 = r6.f79811c
            int r7 = r7 - r3
            if (r0 >= r7) goto L37
            r7 = r6
            goto L53
        L37:
            r7 = r6
        L38:
            r0 = r1
        L39:
            if (r0 == r1) goto L55
            com.yandex.mobile.ads.impl.g02 r4 = r7.mo33558g(r0)
            boolean r4 = r4.m34028c()
            if (r4 == 0) goto L55
            if (r9 == 0) goto L4e
            com.yandex.mobile.ads.impl.st1 r4 = r7.f79812d
            int r0 = r4.mo29539a(r0)
            goto L39
        L4e:
            int r4 = r7.f79811c
            int r4 = r4 - r3
            if (r0 >= r4) goto L38
        L53:
            int r0 = r0 + r3
            goto L39
        L55:
            if (r0 == r1) goto L65
            int r8 = r7.mo33559f(r0)
            com.yandex.mobile.ads.impl.g02 r7 = r7.mo33558g(r0)
            int r7 = r7.mo33749a(r9)
            int r7 = r7 + r8
            return r7
        L65:
            if (r8 != r2) goto L6c
            int r7 = r7.mo33749a(r9)
            return r7
        L6c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.AbstractC30429h.mo33752a(int, int, boolean):int");
    }

    @Override // com.yandex.mobile.ads.impl.g02
    /* renamed from: a */
    public final g02.C30352b mo31767a(int i, g02.C30352b c30352b, boolean z) {
        int mo33565b = mo33565b(i);
        int mo33559f = mo33559f(mo33565b);
        mo33558g(mo33565b).mo31767a(i - mo33560e(mo33565b), c30352b, z);
        c30352b.f79386d += mo33559f;
        if (z) {
            Object mo33561d = mo33561d(mo33565b);
            Object obj = c30352b.f79385c;
            obj.getClass();
            c30352b.f79385c = Pair.create(mo33561d, obj);
        }
        return c30352b;
    }

    @Override // com.yandex.mobile.ads.impl.g02
    /* renamed from: a */
    public final g02.C30352b mo33751a(Object obj, g02.C30352b c30352b) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int mo33564b = mo33564b(obj2);
        int mo33559f = mo33559f(mo33564b);
        mo33558g(mo33564b).mo33751a(obj3, c30352b);
        c30352b.f79386d += mo33559f;
        c30352b.f79385c = obj;
        return c30352b;
    }

    @Override // com.yandex.mobile.ads.impl.g02
    /* renamed from: a */
    public final Object mo31768a(int i) {
        int mo33565b = mo33565b(i);
        return Pair.create(mo33561d(mo33565b), mo33558g(mo33565b).mo31768a(i - mo33560e(mo33565b)));
    }

    @Override // com.yandex.mobile.ads.impl.g02
    /* renamed from: a */
    public final g02.C30354d mo31766a(int i, g02.C30354d c30354d, long j) {
        int mo33563c = mo33563c(i);
        int mo33559f = mo33559f(mo33563c);
        int mo33560e = mo33560e(mo33563c);
        mo33558g(mo33563c).mo31766a(i - mo33559f, c30354d, j);
        Object mo33561d = mo33561d(mo33563c);
        if (!g02.C30354d.f79395s.equals(c30354d.f79399b)) {
            mo33561d = Pair.create(mo33561d, c30354d.f79399b);
        }
        c30354d.f79399b = mo33561d;
        c30354d.f79413p += mo33560e;
        c30354d.f79414q += mo33560e;
        return c30354d;
    }
}
