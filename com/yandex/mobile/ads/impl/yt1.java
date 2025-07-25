package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.io.File;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public final class yt1 extends C30255em {

    /* renamed from: h */
    private static final Pattern f88539h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* renamed from: i */
    private static final Pattern f88540i = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* renamed from: j */
    private static final Pattern f88541j = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    /* renamed from: k */
    public static final /* synthetic */ int f88542k = 0;

    private yt1(String str, long j, long j2, long j3, @Nullable File file) {
        super(str, j, j2, j3, file);
    }

    /* renamed from: a */
    public final yt1 m26582a(File file, long j) {
        if (this.f78705e) {
            return new yt1(this.f78702b, this.f78703c, this.f78704d, j, file);
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x008f, code lost:
        if (r14.renameTo(r3) == false) goto L36;
     */
    @androidx.annotation.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.yandex.mobile.ads.impl.yt1 m26581a(java.io.File r14, long r15, long r17, com.yandex.mobile.ads.impl.C30634jm r19) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.yt1.m26581a(java.io.File, long, long, com.yandex.mobile.ads.impl.jm):com.yandex.mobile.ads.impl.yt1");
    }

    /* renamed from: a */
    public static yt1 m26580a(String str, long j) {
        return new yt1(str, j, -1L, -9223372036854775807L, null);
    }

    /* renamed from: a */
    public static yt1 m26579a(String str, long j, long j2) {
        return new yt1(str, j, j2, -9223372036854775807L, null);
    }
}
