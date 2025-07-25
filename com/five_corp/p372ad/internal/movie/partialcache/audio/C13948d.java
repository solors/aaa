package com.five_corp.p372ad.internal.movie.partialcache.audio;

import com.five_corp.p372ad.internal.movie.partialcache.C14045w1;
import java.util.ArrayDeque;
import java.util.Iterator;

/* renamed from: com.five_corp.ad.internal.movie.partialcache.audio.d */
/* loaded from: classes4.dex */
public final class C13948d {

    /* renamed from: a */
    public final ArrayDeque f25996a = new ArrayDeque();

    /* renamed from: b */
    public final ArrayDeque f25997b = new ArrayDeque();

    /* renamed from: d */
    public boolean f25999d = false;

    /* renamed from: e */
    public long f26000e = 0;

    /* renamed from: c */
    public boolean f25998c = true;

    /* renamed from: a */
    public final void m78212a(C14045w1 c14045w1) {
        this.f25996a.addLast(c14045w1);
        this.f26000e = c14045w1.f26195d;
        if (c14045w1.f26197f) {
            this.f25999d = true;
        }
    }

    /* renamed from: b */
    public final C14045w1 m78211b() {
        C14045w1 c14045w1 = (C14045w1) this.f25996a.pollFirst();
        if (c14045w1 != null) {
            this.f25997b.addLast(c14045w1);
        }
        return c14045w1;
    }

    /* renamed from: a */
    public final void m78214a() {
        this.f25996a.clear();
        this.f25997b.clear();
        this.f25999d = false;
        this.f26000e = 0L;
    }

    /* renamed from: b */
    public final long m78210b(long j) {
        while (!this.f25997b.isEmpty() && j <= ((C14045w1) this.f25997b.peekLast()).f26195d) {
            this.f25996a.addFirst((C14045w1) this.f25997b.pollLast());
        }
        this.f25997b.clear();
        return !this.f25996a.isEmpty() ? ((C14045w1) this.f25996a.peekFirst()).f26195d : j;
    }

    /* renamed from: a */
    public final void m78213a(long j) {
        Iterator it = this.f25997b.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext() && ((C14045w1) it.next()).f26195d < j) {
            i2++;
        }
        if (i2 != this.f25997b.size()) {
            while (true) {
                i2--;
                if (i2 <= 0) {
                    return;
                }
                this.f25997b.pollFirst();
            }
        } else {
            Iterator it2 = this.f25996a.iterator();
            while (it2.hasNext() && ((C14045w1) it2.next()).f26195d < j) {
                i++;
            }
            if (i == this.f25996a.size()) {
                this.f25997b.clear();
                this.f25996a.clear();
            } else if (i == 0) {
                while (this.f25997b.size() > 1) {
                    this.f25997b.pollFirst();
                }
            } else {
                this.f25997b.clear();
                while (true) {
                    i--;
                    if (i <= 0) {
                        return;
                    }
                    this.f25996a.pollFirst();
                }
            }
        }
    }
}
