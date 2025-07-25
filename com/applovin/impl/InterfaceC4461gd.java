package com.applovin.impl;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.applovin.impl.C5643ul;
import java.nio.ByteBuffer;

/* renamed from: com.applovin.impl.gd */
/* loaded from: classes2.dex */
public interface InterfaceC4461gd {

    /* renamed from: com.applovin.impl.gd$a */
    /* loaded from: classes2.dex */
    public static final class C4462a {

        /* renamed from: a */
        public final C4647jd f6395a;

        /* renamed from: b */
        public final MediaFormat f6396b;

        /* renamed from: c */
        public final C4310e9 f6397c;

        /* renamed from: d */
        public final Surface f6398d;

        /* renamed from: e */
        public final MediaCrypto f6399e;

        /* renamed from: f */
        public final int f6400f;

        /* renamed from: g */
        public final boolean f6401g;

        private C4462a(C4647jd c4647jd, MediaFormat mediaFormat, C4310e9 c4310e9, Surface surface, MediaCrypto mediaCrypto, int i, boolean z) {
            this.f6395a = c4647jd;
            this.f6396b = mediaFormat;
            this.f6397c = c4310e9;
            this.f6398d = surface;
            this.f6399e = mediaCrypto;
            this.f6400f = i;
            this.f6401g = z;
        }

        /* renamed from: a */
        public static C4462a m98961a(C4647jd c4647jd, MediaFormat mediaFormat, C4310e9 c4310e9, MediaCrypto mediaCrypto) {
            return new C4462a(c4647jd, mediaFormat, c4310e9, null, mediaCrypto, 0, false);
        }

        /* renamed from: a */
        public static C4462a m98960a(C4647jd c4647jd, MediaFormat mediaFormat, C4310e9 c4310e9, Surface surface, MediaCrypto mediaCrypto) {
            return new C4462a(c4647jd, mediaFormat, c4310e9, surface, mediaCrypto, 0, false);
        }
    }

    /* renamed from: com.applovin.impl.gd$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC4463b {

        /* renamed from: a */
        public static final InterfaceC4463b f6402a = new C5643ul.C5646c();

        /* renamed from: a */
        InterfaceC4461gd mo94050a(C4462a c4462a);
    }

    /* renamed from: com.applovin.impl.gd$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC4464c {
        /* renamed from: a */
        void mo96735a(InterfaceC4461gd interfaceC4461gd, long j, long j2);
    }

    /* renamed from: a */
    int mo94063a(MediaCodec.BufferInfo bufferInfo);

    /* renamed from: a */
    ByteBuffer mo94068a(int i);

    /* renamed from: a */
    void mo94069a();

    /* renamed from: a */
    void mo94067a(int i, int i2, int i3, long j, int i4);

    /* renamed from: a */
    void mo94066a(int i, int i2, C5950z4 c5950z4, long j, int i3);

    /* renamed from: a */
    void mo94065a(int i, long j);

    /* renamed from: a */
    void mo94064a(int i, boolean z);

    /* renamed from: a */
    void mo94062a(Bundle bundle);

    /* renamed from: a */
    void mo94061a(Surface surface);

    /* renamed from: a */
    void mo94059a(InterfaceC4464c interfaceC4464c, Handler handler);

    /* renamed from: b */
    ByteBuffer mo94056b(int i);

    /* renamed from: b */
    void mo94057b();

    /* renamed from: c */
    void mo94054c(int i);

    /* renamed from: c */
    boolean mo94055c();

    /* renamed from: d */
    int mo94053d();

    /* renamed from: e */
    MediaFormat mo94052e();
}
