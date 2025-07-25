package com.five_corp.p372ad.internal.movie.partialcache.video;

import com.five_corp.p372ad.internal.movie.partialcache.C14045w1;
import java.util.ArrayDeque;

/* renamed from: com.five_corp.ad.internal.movie.partialcache.video.e */
/* loaded from: classes4.dex */
public final class C14041e {

    /* renamed from: a */
    public final ArrayDeque f26178a = new ArrayDeque();

    /* renamed from: b */
    public final ArrayDeque f26179b = new ArrayDeque();

    /* renamed from: c */
    public long f26180c = 0;

    /* renamed from: d */
    public long f26181d = 0;

    /* renamed from: e */
    public boolean f26182e = false;

    /* renamed from: f */
    public long f26183f = 0;

    /* renamed from: a */
    public final void m78166a(C14045w1 c14045w1) {
        this.f26178a.addLast(c14045w1);
        this.f26183f = c14045w1.f26195d;
        if (c14045w1.f26197f) {
            this.f26182e = true;
        }
    }

    /* renamed from: b */
    public final C14045w1 m78165b() {
        C14045w1 c14045w1 = (C14045w1) this.f26178a.pollFirst();
        if (c14045w1 == null) {
            return null;
        }
        if (c14045w1.f26196e == 1) {
            this.f26181d = c14045w1.f26195d;
        }
        this.f26179b.addLast(c14045w1);
        return c14045w1;
    }

    /* renamed from: c */
    public final void m78164c() {
        while (!this.f26179b.isEmpty()) {
            this.f26178a.addFirst((C14045w1) this.f26179b.pollLast());
        }
    }

    /* renamed from: a */
    public final void m78168a() {
        this.f26178a.clear();
        this.f26179b.clear();
        this.f26180c = 0L;
        this.f26181d = 0L;
        this.f26182e = false;
        this.f26183f = 0L;
    }

    /* renamed from: a */
    public final void m78167a(long j) {
        long j2 = this.f26181d;
        if (j2 == this.f26180c || j2 > j) {
            return;
        }
        while (!this.f26179b.isEmpty() && ((C14045w1) this.f26179b.peekFirst()).f26195d < this.f26181d) {
            this.f26179b.pollFirst();
        }
        this.f26180c = this.f26181d;
    }
}
