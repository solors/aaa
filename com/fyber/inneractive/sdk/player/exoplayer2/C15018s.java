package com.fyber.inneractive.sdk.player.exoplayer2;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.s */
/* loaded from: classes4.dex */
public final class C15018s {

    /* renamed from: d */
    public static final C15018s f29478d = new C15018s(1.0f, 1.0f);

    /* renamed from: a */
    public final float f29479a;

    /* renamed from: b */
    public final float f29480b;

    /* renamed from: c */
    public final int f29481c;

    public C15018s(float f, float f2) {
        this.f29479a = f;
        this.f29480b = f2;
        this.f29481c = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15018s.class != obj.getClass()) {
            return false;
        }
        C15018s c15018s = (C15018s) obj;
        if (this.f29479a == c15018s.f29479a && this.f29480b == c15018s.f29480b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f29480b) + ((Float.floatToRawIntBits(this.f29479a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }
}
