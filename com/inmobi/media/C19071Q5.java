package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.Q5 */
/* loaded from: classes6.dex */
public final class C19071Q5 {

    /* renamed from: a */
    public final String f47638a;

    /* renamed from: b */
    public final long f47639b;

    /* renamed from: c */
    public final int f47640c;

    /* renamed from: d */
    public final long f47641d;

    /* renamed from: e */
    public final boolean f47642e;

    /* renamed from: f */
    public final int f47643f;

    public C19071Q5(String fileName, long j, int i, long j2, boolean z, int i2) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.f47638a = fileName;
        this.f47639b = j;
        this.f47640c = i;
        this.f47641d = j2;
        this.f47642e = z;
        this.f47643f = i2;
    }

    public /* synthetic */ C19071Q5(String str, long j, int i, long j2, boolean z, int i2, int i3) {
        this(str, j, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0L : j2, (i3 & 16) != 0 ? false : z, (i3 & 32) != 0 ? 0 : i2);
    }
}
