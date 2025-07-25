package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h */
/* loaded from: classes4.dex */
public final class C15060h {

    /* renamed from: a */
    public final int f29604a;

    /* renamed from: b */
    public final AbstractC15054b[] f29605b;

    /* renamed from: c */
    public int f29606c;

    public C15060h(AbstractC15054b... abstractC15054bArr) {
        this.f29605b = abstractC15054bArr;
        this.f29604a = abstractC15054bArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C15060h.class == obj.getClass()) {
            return Arrays.equals(this.f29605b, ((C15060h) obj).f29605b);
        }
        return false;
    }

    public final int hashCode() {
        if (this.f29606c == 0) {
            this.f29606c = Arrays.hashCode(this.f29605b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        }
        return this.f29606c;
    }
}
