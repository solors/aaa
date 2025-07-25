package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import com.ironsource.C21114v8;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.k */
/* loaded from: classes4.dex */
public final class C15092k {

    /* renamed from: a */
    public final Uri f29706a;

    /* renamed from: b */
    public final long f29707b;

    /* renamed from: c */
    public final long f29708c;

    /* renamed from: d */
    public final long f29709d;

    /* renamed from: e */
    public final String f29710e;

    /* renamed from: f */
    public final int f29711f;

    public C15092k(Uri uri, long j, long j2, long j3, String str, int i) {
        if (j >= 0) {
            if (j2 >= 0) {
                if (j3 <= 0 && j3 != -1) {
                    throw new IllegalArgumentException();
                }
                this.f29706a = uri;
                this.f29707b = j;
                this.f29708c = j2;
                this.f29709d = j3;
                this.f29710e = str;
                this.f29711f = i;
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public final String toString() {
        return "DataSpec[" + this.f29706a + ", " + Arrays.toString((byte[]) null) + ", " + this.f29707b + ", " + this.f29708c + ", " + this.f29709d + ", " + this.f29710e + ", " + this.f29711f + C21114v8.C21123i.f54139e;
    }
}
