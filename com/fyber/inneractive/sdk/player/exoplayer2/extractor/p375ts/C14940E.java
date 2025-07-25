package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p375ts;

import com.google.firebase.sessions.settings.RemoteSettings;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.E */
/* loaded from: classes4.dex */
public final class C14940E {

    /* renamed from: a */
    public final String f29052a;

    /* renamed from: b */
    public final int f29053b;

    /* renamed from: c */
    public final int f29054c;

    /* renamed from: d */
    public int f29055d;

    /* renamed from: e */
    public String f29056e;

    public C14940E(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            str = i + RemoteSettings.FORWARD_SLASH_STRING;
        } else {
            str = "";
        }
        this.f29052a = str;
        this.f29053b = i2;
        this.f29054c = i3;
        this.f29055d = Integer.MIN_VALUE;
    }

    /* renamed from: a */
    public final void m77417a() {
        int i;
        int i2 = this.f29055d;
        if (i2 == Integer.MIN_VALUE) {
            i = this.f29053b;
        } else {
            i = i2 + this.f29054c;
        }
        this.f29055d = i;
        this.f29056e = this.f29052a + this.f29055d;
    }

    /* renamed from: b */
    public final void m77416b() {
        if (this.f29055d != Integer.MIN_VALUE) {
            return;
        }
        throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }
}
