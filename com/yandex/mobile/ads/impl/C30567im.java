package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

/* renamed from: com.yandex.mobile.ads.impl.im */
/* loaded from: classes8.dex */
final class C30567im {

    /* renamed from: a */
    public final int f80529a;

    /* renamed from: b */
    public final String f80530b;

    /* renamed from: c */
    private final TreeSet<yt1> f80531c = new TreeSet<>();

    /* renamed from: d */
    private final ArrayList<C30568a> f80532d = new ArrayList<>();

    /* renamed from: e */
    private C30130cy f80533e;

    /* renamed from: com.yandex.mobile.ads.impl.im$a */
    /* loaded from: classes8.dex */
    private static final class C30568a {

        /* renamed from: a */
        public final long f80534a;

        /* renamed from: b */
        public final long f80535b;

        public C30568a(long j, long j2) {
            this.f80534a = j;
            this.f80535b = j2;
        }
    }

    public C30567im(int i, String str, C30130cy c30130cy) {
        this.f80529a = i;
        this.f80530b = str;
        this.f80533e = c30130cy;
    }

    /* renamed from: a */
    public final void m33194a(yt1 yt1Var) {
        this.f80531c.add(yt1Var);
    }

    /* renamed from: b */
    public final yt1 m33191b(long j, long j2) {
        yt1 m26580a = yt1.m26580a(this.f80530b, j);
        yt1 floor = this.f80531c.floor(m26580a);
        if (floor == null || floor.f78703c + floor.f78704d <= j) {
            yt1 ceiling = this.f80531c.ceiling(m26580a);
            if (ceiling != null) {
                long j3 = ceiling.f78703c - j;
                j2 = j2 == -1 ? j3 : Math.min(j3, j2);
            }
            return yt1.m26579a(this.f80530b, j, j2);
        }
        return floor;
    }

    /* renamed from: c */
    public final boolean m33190c() {
        return this.f80531c.isEmpty();
    }

    /* renamed from: d */
    public final boolean m33188d() {
        return this.f80532d.isEmpty();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C30567im.class != obj.getClass()) {
            return false;
        }
        C30567im c30567im = (C30567im) obj;
        if (this.f80529a == c30567im.f80529a && this.f80530b.equals(c30567im.f80530b) && this.f80531c.equals(c30567im.f80531c) && this.f80533e.equals(c30567im.f80533e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f80533e.hashCode() + C31014o3.m31189a(this.f80530b, this.f80529a * 31, 31);
    }

    /* renamed from: a */
    public final boolean m33195a(C31762wq c31762wq) {
        C30130cy c30130cy = this.f80533e;
        C30130cy m35137a = c30130cy.m35137a(c31762wq);
        this.f80533e = m35137a;
        return !m35137a.equals(c30130cy);
    }

    /* renamed from: c */
    public final boolean m33189c(long j, long j2) {
        for (int i = 0; i < this.f80532d.size(); i++) {
            C30568a c30568a = this.f80532d.get(i);
            long j3 = c30568a.f80535b;
            if (j3 == -1) {
                if (j >= c30568a.f80534a) {
                    return true;
                }
            } else if (j2 == -1) {
                continue;
            } else {
                long j4 = c30568a.f80534a;
                if (j4 <= j && j + j2 <= j4 + j3) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m33187d(long j, long j2) {
        int i;
        for (i = 0; i < this.f80532d.size(); i = i + 1) {
            C30568a c30568a = this.f80532d.get(i);
            long j3 = c30568a.f80534a;
            if (j3 > j) {
                i = (j2 != -1 && j + j2 <= j3) ? i + 1 : 0;
                return false;
            }
            long j4 = c30568a.f80535b;
            if (j4 != -1 && j3 + j4 <= j) {
            }
            return false;
        }
        this.f80532d.add(new C30568a(j, j2));
        return true;
    }

    /* renamed from: a */
    public final long m33197a(long j, long j2) {
        if (j >= 0) {
            if (j2 >= 0) {
                yt1 m33191b = m33191b(j, j2);
                if (!m33191b.f78705e) {
                    long j3 = m33191b.f78704d;
                    return -Math.min(j3 != -1 ? j3 : Long.MAX_VALUE, j2);
                }
                long j4 = j + j2;
                long j5 = j4 >= 0 ? j4 : Long.MAX_VALUE;
                long j6 = m33191b.f78703c + m33191b.f78704d;
                if (j6 < j5) {
                    for (yt1 yt1Var : this.f80531c.tailSet(m33191b, false)) {
                        long j7 = yt1Var.f78703c;
                        if (j7 > j6) {
                            break;
                        }
                        j6 = Math.max(j6, j7 + yt1Var.f78704d);
                        if (j6 >= j5) {
                            break;
                        }
                    }
                }
                return Math.min(j6 - j, j2);
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public final TreeSet<yt1> m33192b() {
        return this.f80531c;
    }

    /* renamed from: a */
    public final C30130cy m33199a() {
        return this.f80533e;
    }

    /* renamed from: a */
    public final boolean m33196a(C30255em c30255em) {
        if (this.f80531c.remove(c30255em)) {
            File file = c30255em.f78706f;
            if (file != null) {
                file.delete();
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final yt1 m33193a(yt1 yt1Var, long j, boolean z) {
        if (this.f80531c.remove(yt1Var)) {
            File file = yt1Var.f78706f;
            file.getClass();
            if (z) {
                File parentFile = file.getParentFile();
                parentFile.getClass();
                long j2 = yt1Var.f78703c;
                int i = this.f80529a;
                int i2 = yt1.f88542k;
                File file2 = new File(parentFile, i + "." + j2 + "." + j + ".v3.exo");
                if (file.renameTo(file2)) {
                    file = file2;
                } else {
                    gq0.m33792d("CachedContent", "Failed to rename " + file + " to " + file2);
                }
            }
            yt1 m26582a = yt1Var.m26582a(file, j);
            this.f80531c.add(m26582a);
            return m26582a;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public final void m33198a(long j) {
        for (int i = 0; i < this.f80532d.size(); i++) {
            if (this.f80532d.get(i).f80534a == j) {
                this.f80532d.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }
}
