package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.w */
/* loaded from: classes6.dex */
public final class C19502w extends RuntimeException {

    /* renamed from: a */
    public final InMobiAdRequestStatus f48746a;

    /* renamed from: b */
    public final short f48747b;

    public C19502w(InMobiAdRequestStatus status, short s) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f48746a = status;
        this.f48747b = s;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f48746a.getMessage();
    }
}
