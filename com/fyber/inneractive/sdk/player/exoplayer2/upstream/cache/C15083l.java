package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.os.ConditionVariable;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Pattern;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.l */
/* loaded from: classes4.dex */
public final class C15083l {

    /* renamed from: a */
    public final File f29677a;

    /* renamed from: b */
    public final C15081j f29678b;

    /* renamed from: d */
    public final C15080i f29680d;

    /* renamed from: f */
    public C15072a f29682f;

    /* renamed from: c */
    public final HashMap f29679c = new HashMap();

    /* renamed from: e */
    public final HashMap f29681e = new HashMap();

    public C15083l(File file, C15081j c15081j) {
        this.f29677a = file;
        this.f29678b = c15081j;
        this.f29680d = new C15080i(file);
        ConditionVariable conditionVariable = new ConditionVariable();
        new C15082k(this, conditionVariable).start();
        conditionVariable.block();
    }

    /* renamed from: a */
    public final synchronized C15084m m77248a(String str, long j) {
        C15084m m77258a;
        C15084m c15084m;
        C15072a c15072a = this.f29682f;
        if (c15072a == null) {
            C15079h c15079h = (C15079h) this.f29680d.f29666a.get(str);
            if (c15079h == null) {
                c15084m = new C15084m(str, j, -1L, -9223372036854775807L, null);
            } else {
                while (true) {
                    m77258a = c15079h.m77258a(j);
                    if (!m77258a.f29659d || m77258a.f29660e.length() == m77258a.f29658c) {
                        break;
                    }
                    m77253a();
                }
                c15084m = m77258a;
            }
            if (c15084m.f29659d) {
                C15079h c15079h2 = (C15079h) this.f29680d.f29666a.get(str);
                if (c15079h2.f29664c.remove(c15084m)) {
                    int i = c15079h2.f29662a;
                    if (c15084m.f29659d) {
                        long currentTimeMillis = System.currentTimeMillis();
                        File parentFile = c15084m.f29660e.getParentFile();
                        long j2 = c15084m.f29657b;
                        Pattern pattern = C15084m.f29683g;
                        File file = new File(parentFile, i + "." + j2 + "." + currentTimeMillis + ".v3.exo");
                        C15084m c15084m2 = new C15084m(c15084m.f29656a, c15084m.f29657b, c15084m.f29658c, currentTimeMillis, file);
                        if (c15084m.f29660e.renameTo(file)) {
                            c15079h2.f29664c.add(c15084m2);
                            ArrayList arrayList = (ArrayList) this.f29681e.get(c15084m.f29656a);
                            if (arrayList != null) {
                                for (int size = arrayList.size() - 1; size >= 0; size--) {
                                    C15081j c15081j = (C15081j) arrayList.get(size);
                                    c15081j.f29673a.remove(c15084m);
                                    c15081j.f29674b -= c15084m.f29658c;
                                    c15081j.f29673a.add(c15084m2);
                                    c15081j.f29674b += c15084m2.f29658c;
                                    c15081j.m77254a(this, 0L);
                                }
                            }
                            C15081j c15081j2 = this.f29678b;
                            c15081j2.f29673a.remove(c15084m);
                            c15081j2.f29674b -= c15084m.f29658c;
                            c15081j2.f29673a.add(c15084m2);
                            c15081j2.f29674b += c15084m2.f29658c;
                            c15081j2.m77254a(this, 0L);
                            return c15084m2;
                        }
                        throw new C15072a("Renaming of " + c15084m.f29660e + " to " + file + " failed.");
                    }
                    throw new IllegalStateException();
                }
                throw new IllegalStateException();
            } else if (this.f29679c.containsKey(str)) {
                return null;
            } else {
                this.f29679c.put(str, c15084m);
                return c15084m;
            }
        }
        throw c15072a;
    }

    /* renamed from: b */
    public final synchronized void m77247b(C15084m c15084m) {
        if (c15084m == this.f29679c.remove(c15084m.f29656a)) {
            notifyAll();
        } else {
            throw new IllegalStateException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d5, code lost:
        if (r5 == null) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m77251a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C15083l r12) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C15083l.m77251a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.l):void");
    }

    /* renamed from: a */
    public final void m77250a(C15084m c15084m) {
        C15080i c15080i = this.f29680d;
        String str = c15084m.f29656a;
        C15079h c15079h = (C15079h) c15080i.f29666a.get(str);
        if (c15079h == null) {
            c15079h = c15080i.m77256a(str, -1L);
        }
        c15079h.f29664c.add(c15084m);
        ArrayList arrayList = (ArrayList) this.f29681e.get(c15084m.f29656a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C15081j c15081j = (C15081j) arrayList.get(size);
                c15081j.f29673a.add(c15084m);
                c15081j.f29674b += c15084m.f29658c;
                c15081j.m77254a(this, 0L);
            }
        }
        C15081j c15081j2 = this.f29678b;
        c15081j2.f29673a.add(c15084m);
        c15081j2.f29674b += c15084m.f29658c;
        c15081j2.m77254a(this, 0L);
    }

    /* renamed from: a */
    public final void m77252a(AbstractC15078g abstractC15078g, boolean z) {
        C15079h c15079h = (C15079h) this.f29680d.f29666a.get(abstractC15078g.f29656a);
        if (c15079h == null || !c15079h.f29664c.remove(abstractC15078g)) {
            return;
        }
        abstractC15078g.f29660e.delete();
        if (z && c15079h.f29664c.isEmpty()) {
            C15080i c15080i = this.f29680d;
            C15079h c15079h2 = (C15079h) c15080i.f29666a.remove(c15079h.f29663b);
            if (c15079h2 != null) {
                if (c15079h2.f29664c.isEmpty()) {
                    c15080i.f29667b.remove(c15079h2.f29662a);
                    c15080i.f29671f = true;
                } else {
                    throw new IllegalStateException();
                }
            }
            this.f29680d.m77255b();
        }
        ArrayList arrayList = (ArrayList) this.f29681e.get(abstractC15078g.f29656a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C15081j c15081j = (C15081j) arrayList.get(size);
                c15081j.f29673a.remove(abstractC15078g);
                c15081j.f29674b -= abstractC15078g.f29658c;
            }
        }
        C15081j c15081j2 = this.f29678b;
        c15081j2.f29673a.remove(abstractC15078g);
        c15081j2.f29674b -= abstractC15078g.f29658c;
    }

    /* renamed from: a */
    public final void m77253a() {
        LinkedList linkedList = new LinkedList();
        for (C15079h c15079h : this.f29680d.f29666a.values()) {
            Iterator it = c15079h.f29664c.iterator();
            while (it.hasNext()) {
                AbstractC15078g abstractC15078g = (AbstractC15078g) it.next();
                if (abstractC15078g.f29660e.length() != abstractC15078g.f29658c) {
                    linkedList.add(abstractC15078g);
                }
            }
        }
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()) {
            m77252a((AbstractC15078g) it2.next(), false);
        }
        this.f29680d.m77257a();
        this.f29680d.m77255b();
    }

    /* renamed from: a */
    public final synchronized long m77249a(String str) {
        C15079h c15079h;
        c15079h = (C15079h) this.f29680d.f29666a.get(str);
        return c15079h == null ? -1L : c15079h.f29665d;
    }
}
