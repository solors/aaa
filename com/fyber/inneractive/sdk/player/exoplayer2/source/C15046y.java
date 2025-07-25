package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.exoplayer2.C15014o;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.y */
/* loaded from: classes4.dex */
public final class C15046y {

    /* renamed from: a */
    public final int f29583a;

    /* renamed from: b */
    public final C15014o[] f29584b;

    /* renamed from: c */
    public int f29585c;

    public C15046y(C15014o... c15014oArr) {
        if (c15014oArr.length > 0) {
            this.f29584b = c15014oArr;
            this.f29583a = c15014oArr.length;
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public final int m77277a(C15014o c15014o) {
        int i = 0;
        while (true) {
            C15014o[] c15014oArr = this.f29584b;
            if (i < c15014oArr.length) {
                if (c15014o == c15014oArr[i]) {
                    return i;
                }
                i++;
            } else {
                return -1;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15046y.class != obj.getClass()) {
            return false;
        }
        C15046y c15046y = (C15046y) obj;
        if (this.f29583a == c15046y.f29583a && Arrays.equals(this.f29584b, c15046y.f29584b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f29585c == 0) {
            this.f29585c = Arrays.hashCode(this.f29584b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        }
        return this.f29585c;
    }
}
