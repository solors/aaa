package com.fyber.inneractive.sdk.player.exoplayer2.source;

import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.z */
/* loaded from: classes4.dex */
public final class C15047z {

    /* renamed from: d */
    public static final /* synthetic */ int f29586d = 0;

    /* renamed from: a */
    public final int f29587a;

    /* renamed from: b */
    public final C15046y[] f29588b;

    /* renamed from: c */
    public int f29589c;

    static {
        new C15047z(new C15046y[0]);
    }

    public C15047z(C15046y... c15046yArr) {
        this.f29588b = c15046yArr;
        this.f29587a = c15046yArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15047z.class != obj.getClass()) {
            return false;
        }
        C15047z c15047z = (C15047z) obj;
        if (this.f29587a == c15047z.f29587a && Arrays.equals(this.f29588b, c15047z.f29588b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f29589c == 0) {
            this.f29589c = Arrays.hashCode(this.f29588b);
        }
        return this.f29589c;
    }
}
