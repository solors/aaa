package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.ironsource.C21114v8;
import java.io.File;

/* renamed from: com.yandex.mobile.ads.impl.em */
/* loaded from: classes8.dex */
public class C30255em implements Comparable<C30255em> {

    /* renamed from: b */
    public final String f78702b;

    /* renamed from: c */
    public final long f78703c;

    /* renamed from: d */
    public final long f78704d;

    /* renamed from: e */
    public final boolean f78705e;
    @Nullable

    /* renamed from: f */
    public final File f78706f;

    /* renamed from: g */
    public final long f78707g;

    public C30255em(String str, long j, long j2, long j3, @Nullable File file) {
        boolean z;
        this.f78702b = str;
        this.f78703c = j;
        this.f78704d = j2;
        if (file != null) {
            z = true;
        } else {
            z = false;
        }
        this.f78705e = z;
        this.f78706f = file;
        this.f78707g = j3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C30255em c30255em) {
        C30255em c30255em2 = c30255em;
        if (!this.f78702b.equals(c30255em2.f78702b)) {
            return this.f78702b.compareTo(c30255em2.f78702b);
        }
        int i = ((this.f78703c - c30255em2.f78703c) > 0L ? 1 : ((this.f78703c - c30255em2.f78703c) == 0L ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        if (i < 0) {
            return -1;
        }
        return 1;
    }

    public final String toString() {
        return C21114v8.C21123i.f54137d + this.f78703c + ", " + this.f78704d + C21114v8.C21123i.f54139e;
    }
}
