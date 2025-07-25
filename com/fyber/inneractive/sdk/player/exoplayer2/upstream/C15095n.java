package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15133z;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.n */
/* loaded from: classes4.dex */
public final class C15095n implements InterfaceC15089h {

    /* renamed from: a */
    public final InterfaceC15089h f29723a;

    /* renamed from: b */
    public final C15100s f29724b;

    /* renamed from: c */
    public final C15085d f29725c;

    /* renamed from: d */
    public final C15087f f29726d;

    /* renamed from: e */
    public InterfaceC15089h f29727e;

    public C15095n(Context context, C15094m c15094m, InterfaceC15089h interfaceC15089h) {
        interfaceC15089h.getClass();
        this.f29723a = interfaceC15089h;
        this.f29724b = new C15100s(c15094m);
        this.f29725c = new C15085d(context, c15094m);
        this.f29726d = new C15087f(context, c15094m);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15089h
    /* renamed from: a */
    public final long mo77234a(C15092k c15092k) {
        if (this.f29727e == null) {
            String scheme = c15092k.f29706a.getScheme();
            Uri uri = c15092k.f29706a;
            int i = AbstractC15133z.f29832a;
            String scheme2 = uri.getScheme();
            if (!TextUtils.isEmpty(scheme2) && !scheme2.equals("file")) {
                if ("asset".equals(scheme)) {
                    this.f29727e = this.f29725c;
                } else if ("content".equals(scheme)) {
                    this.f29727e = this.f29726d;
                } else {
                    this.f29727e = this.f29723a;
                }
            } else if (c15092k.f29706a.getPath().startsWith("/android_asset/")) {
                this.f29727e = this.f29725c;
            } else {
                this.f29727e = this.f29724b;
            }
            return this.f29727e.mo77234a(c15092k);
        }
        throw new IllegalStateException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15089h
    public final void close() {
        InterfaceC15089h interfaceC15089h = this.f29727e;
        if (interfaceC15089h != null) {
            try {
                interfaceC15089h.close();
            } finally {
                this.f29727e = null;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15089h
    public final int read(byte[] bArr, int i, int i2) {
        return this.f29727e.read(bArr, i, i2);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15089h
    /* renamed from: a */
    public final Uri mo77235a() {
        InterfaceC15089h interfaceC15089h = this.f29727e;
        if (interfaceC15089h == null) {
            return null;
        }
        return interfaceC15089h.mo77235a();
    }
}
