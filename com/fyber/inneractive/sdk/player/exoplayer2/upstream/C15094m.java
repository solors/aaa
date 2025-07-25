package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C15126s;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C15127t;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.m */
/* loaded from: classes4.dex */
public final class C15094m {

    /* renamed from: a */
    public final C15127t f29717a = new C15127t();

    /* renamed from: b */
    public int f29718b;

    /* renamed from: c */
    public long f29719c;

    /* renamed from: d */
    public long f29720d;

    /* renamed from: e */
    public long f29721e;

    /* renamed from: f */
    public long f29722f;

    /* renamed from: a */
    public final synchronized void m77242a() {
        C15126s c15126s;
        int i;
        float f;
        if (this.f29718b > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i2 = (int) (elapsedRealtime - this.f29719c);
            long j = i2;
            this.f29721e += j;
            long j2 = this.f29722f;
            long j3 = this.f29720d;
            this.f29722f = j2 + j3;
            if (i2 > 0) {
                float f2 = (float) ((8000 * j3) / j);
                C15127t c15127t = this.f29717a;
                int sqrt = (int) Math.sqrt(j3);
                if (c15127t.f29820d != 1) {
                    Collections.sort(c15127t.f29818b, C15127t.f29815h);
                    c15127t.f29820d = 1;
                }
                int i3 = c15127t.f29823g;
                if (i3 > 0) {
                    C15126s[] c15126sArr = c15127t.f29819c;
                    int i4 = i3 - 1;
                    c15127t.f29823g = i4;
                    c15126s = c15126sArr[i4];
                } else {
                    c15126s = new C15126s();
                }
                int i5 = c15127t.f29821e;
                c15127t.f29821e = i5 + 1;
                c15126s.f29812a = i5;
                c15126s.f29813b = sqrt;
                c15126s.f29814c = f2;
                c15127t.f29818b.add(c15126s);
                c15127t.f29822f += sqrt;
                while (true) {
                    int i6 = c15127t.f29822f;
                    int i7 = c15127t.f29817a;
                    i = 0;
                    if (i6 <= i7) {
                        break;
                    }
                    int i8 = i6 - i7;
                    C15126s c15126s2 = (C15126s) c15127t.f29818b.get(0);
                    int i9 = c15126s2.f29813b;
                    if (i9 <= i8) {
                        c15127t.f29822f -= i9;
                        c15127t.f29818b.remove(0);
                        int i10 = c15127t.f29823g;
                        if (i10 < 5) {
                            C15126s[] c15126sArr2 = c15127t.f29819c;
                            c15127t.f29823g = i10 + 1;
                            c15126sArr2[i10] = c15126s2;
                        }
                    } else {
                        c15126s2.f29813b = i9 - i8;
                        c15127t.f29822f -= i8;
                    }
                }
                if (this.f29721e >= 2000 || this.f29722f >= 524288) {
                    C15127t c15127t2 = this.f29717a;
                    if (c15127t2.f29820d != 0) {
                        Collections.sort(c15127t2.f29818b, C15127t.f29816i);
                        c15127t2.f29820d = 0;
                    }
                    float f3 = 0.5f * c15127t2.f29822f;
                    int i11 = 0;
                    while (true) {
                        if (i < c15127t2.f29818b.size()) {
                            C15126s c15126s3 = (C15126s) c15127t2.f29818b.get(i);
                            i11 += c15126s3.f29813b;
                            if (i11 >= f3) {
                                f = c15126s3.f29814c;
                                break;
                            }
                            i++;
                        } else if (c15127t2.f29818b.isEmpty()) {
                            f = Float.NaN;
                        } else {
                            ArrayList arrayList = c15127t2.f29818b;
                            f = ((C15126s) arrayList.get(arrayList.size() - 1)).f29814c;
                        }
                    }
                    Float.isNaN(f);
                }
            }
            int i12 = this.f29718b - 1;
            this.f29718b = i12;
            if (i12 > 0) {
                this.f29719c = elapsedRealtime;
            }
            this.f29720d = 0L;
        } else {
            throw new IllegalStateException();
        }
    }
}
