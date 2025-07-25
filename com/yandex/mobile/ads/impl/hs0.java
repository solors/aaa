package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public interface hs0 {

    /* renamed from: com.yandex.mobile.ads.impl.hs0$a */
    /* loaded from: classes8.dex */
    public static final class C30496a {

        /* renamed from: a */
        public final ls0 f80170a;

        /* renamed from: b */
        public final MediaFormat f80171b;

        /* renamed from: c */
        public final v90 f80172c;
        @Nullable

        /* renamed from: d */
        public final Surface f80173d;
        @Nullable

        /* renamed from: e */
        public final MediaCrypto f80174e;

        private C30496a(ls0 ls0Var, MediaFormat mediaFormat, v90 v90Var, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto) {
            this.f80170a = ls0Var;
            this.f80171b = mediaFormat;
            this.f80172c = v90Var;
            this.f80173d = surface;
            this.f80174e = mediaCrypto;
        }

        /* renamed from: a */
        public static C30496a m33473a(ls0 ls0Var, MediaFormat mediaFormat, v90 v90Var, @Nullable MediaCrypto mediaCrypto) {
            return new C30496a(ls0Var, mediaFormat, v90Var, null, mediaCrypto);
        }

        /* renamed from: a */
        public static C30496a m33472a(ls0 ls0Var, MediaFormat mediaFormat, v90 v90Var, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto) {
            return new C30496a(ls0Var, mediaFormat, v90Var, surface, mediaCrypto);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.hs0$b */
    /* loaded from: classes8.dex */
    public interface InterfaceC30497b {
        /* renamed from: a */
        hs0 mo26515a(C30496a c30496a) throws IOException;
    }

    /* renamed from: com.yandex.mobile.ads.impl.hs0$c */
    /* loaded from: classes8.dex */
    public interface InterfaceC30498c {
        /* renamed from: a */
        void mo27798a(long j);
    }

    /* renamed from: a */
    int mo26525a(MediaCodec.BufferInfo bufferInfo);

    /* renamed from: a */
    MediaFormat mo26530a();

    /* renamed from: a */
    void mo26529a(int i);

    /* renamed from: a */
    void mo26528a(int i, int i2, long j, int i3);

    @RequiresApi(21)
    /* renamed from: a */
    void mo26527a(int i, long j);

    /* renamed from: a */
    void mo26526a(int i, C31767wt c31767wt, long j);

    @RequiresApi(19)
    /* renamed from: a */
    void mo26524a(Bundle bundle);

    @RequiresApi(23)
    /* renamed from: a */
    void mo26523a(Surface surface);

    @RequiresApi(23)
    /* renamed from: a */
    void mo26521a(InterfaceC30498c interfaceC30498c, Handler handler);

    /* renamed from: a */
    void mo26519a(boolean z, int i);

    /* renamed from: b */
    int mo26518b();

    @Nullable
    /* renamed from: b */
    ByteBuffer mo26517b(int i);

    @Nullable
    /* renamed from: c */
    ByteBuffer mo26516c(int i);

    void flush();

    void release();
}
