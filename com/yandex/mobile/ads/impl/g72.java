package com.yandex.mobile.ads.impl;

import com.zeus.gmc.sdk.mobileads.columbus.common.Constants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.C44401b;

/* loaded from: classes8.dex */
public final class g72 {
    @NotNull

    /* renamed from: a */
    private final EnumC30368a f79535a;
    @NotNull

    /* renamed from: b */
    private final Throwable f79536b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.yandex.mobile.ads.impl.g72$a */
    /* loaded from: classes8.dex */
    public static final class EnumC30368a {

        /* renamed from: A */
        public static final EnumC30368a f79537A;

        /* renamed from: B */
        public static final EnumC30368a f79538B;

        /* renamed from: C */
        public static final EnumC30368a f79539C;

        /* renamed from: D */
        public static final EnumC30368a f79540D;

        /* renamed from: E */
        public static final EnumC30368a f79541E;

        /* renamed from: F */
        public static final EnumC30368a f79542F;

        /* renamed from: G */
        private static final /* synthetic */ EnumC30368a[] f79543G;

        /* renamed from: b */
        public static final EnumC30368a f79544b;

        /* renamed from: c */
        public static final EnumC30368a f79545c;

        /* renamed from: d */
        public static final EnumC30368a f79546d;

        /* renamed from: e */
        public static final EnumC30368a f79547e;

        /* renamed from: f */
        public static final EnumC30368a f79548f;

        /* renamed from: g */
        public static final EnumC30368a f79549g;

        /* renamed from: h */
        public static final EnumC30368a f79550h;

        /* renamed from: i */
        public static final EnumC30368a f79551i;

        /* renamed from: j */
        public static final EnumC30368a f79552j;

        /* renamed from: k */
        public static final EnumC30368a f79553k;

        /* renamed from: l */
        public static final EnumC30368a f79554l;

        /* renamed from: m */
        public static final EnumC30368a f79555m;

        /* renamed from: n */
        public static final EnumC30368a f79556n;

        /* renamed from: o */
        public static final EnumC30368a f79557o;

        /* renamed from: p */
        public static final EnumC30368a f79558p;

        /* renamed from: q */
        public static final EnumC30368a f79559q;

        /* renamed from: r */
        public static final EnumC30368a f79560r;

        /* renamed from: s */
        public static final EnumC30368a f79561s;

        /* renamed from: t */
        public static final EnumC30368a f79562t;

        /* renamed from: u */
        public static final EnumC30368a f79563u;

        /* renamed from: v */
        public static final EnumC30368a f79564v;

        /* renamed from: w */
        public static final EnumC30368a f79565w;

        /* renamed from: x */
        public static final EnumC30368a f79566x;

        /* renamed from: y */
        public static final EnumC30368a f79567y;

        /* renamed from: z */
        public static final EnumC30368a f79568z;

        static {
            EnumC30368a enumC30368a = new EnumC30368a(0, "RENDERER_FAILED_DEQUEUE_OUTPUT_BUFFER");
            f79544b = enumC30368a;
            EnumC30368a enumC30368a2 = new EnumC30368a(1, "RENDERER_FAILED_DEQUEUE_INPUT_BUFFER");
            f79545c = enumC30368a2;
            EnumC30368a enumC30368a3 = new EnumC30368a(2, "RENDERER_FAILED_STOP");
            f79546d = enumC30368a3;
            EnumC30368a enumC30368a4 = new EnumC30368a(3, "RENDERER_FAILED_SET_SURFACE");
            f79547e = enumC30368a4;
            EnumC30368a enumC30368a5 = new EnumC30368a(4, "RENDERER_FAILED_RELEASE_OUTPUT_BUFFER");
            f79548f = enumC30368a5;
            EnumC30368a enumC30368a6 = new EnumC30368a(5, "RENDERER_FAILED_QUEUE_SECURE_INPUT_BUFFER");
            f79549g = enumC30368a6;
            EnumC30368a enumC30368a7 = new EnumC30368a(6, "RENDERER_MEDIA_CODEC_UNKNOWN");
            f79550h = enumC30368a7;
            EnumC30368a enumC30368a8 = new EnumC30368a(7, "TIMEOUT");
            f79551i = enumC30368a8;
            EnumC30368a enumC30368a9 = new EnumC30368a(8, "ILLEGAL_SEEK_POSITION");
            f79552j = enumC30368a9;
            EnumC30368a enumC30368a10 = new EnumC30368a(9, "DECODER_QUERY_ERROR");
            f79553k = enumC30368a10;
            EnumC30368a enumC30368a11 = new EnumC30368a(10, "DECODER_INITIALIZATION_ERROR");
            f79554l = enumC30368a11;
            EnumC30368a enumC30368a12 = new EnumC30368a(11, "DECODER_UNKNOWN_ERROR");
            f79555m = enumC30368a12;
            EnumC30368a enumC30368a13 = new EnumC30368a(12, "BEHIND_LIVE_WINDOW_ERROR");
            f79556n = enumC30368a13;
            EnumC30368a enumC30368a14 = new EnumC30368a(13, "DRM_KEYS_EXPIRED");
            f79557o = enumC30368a14;
            EnumC30368a enumC30368a15 = new EnumC30368a(14, "DRM_MEDIA_RESOURCE_BUSY");
            f79558p = enumC30368a15;
            EnumC30368a enumC30368a16 = new EnumC30368a(15, "DRM_SESSION_ERROR");
            f79559q = enumC30368a16;
            EnumC30368a enumC30368a17 = new EnumC30368a(16, "HTTP_CLEARTEXT_NOT_PERMITTED");
            f79560r = enumC30368a17;
            EnumC30368a enumC30368a18 = new EnumC30368a(17, "HTTP_CODE_UNAUTHORIZED");
            f79561s = enumC30368a18;
            EnumC30368a enumC30368a19 = new EnumC30368a(18, "HTTP_CODE_FORBIDDEN");
            f79562t = enumC30368a19;
            EnumC30368a enumC30368a20 = new EnumC30368a(19, "HTTP_CODE_NOT_FOUND");
            f79563u = enumC30368a20;
            EnumC30368a enumC30368a21 = new EnumC30368a(20, "HTTP_CODE_UNKNOWN");
            f79564v = enumC30368a21;
            EnumC30368a enumC30368a22 = new EnumC30368a(21, "SSL_HANDSHAKE_ERROR");
            f79565w = enumC30368a22;
            EnumC30368a enumC30368a23 = new EnumC30368a(22, Constants.NETWORK_IS_UNAVAILABLE);
            f79566x = enumC30368a23;
            EnumC30368a enumC30368a24 = new EnumC30368a(23, "CONTENT_PARSER_ERROR");
            f79567y = enumC30368a24;
            EnumC30368a enumC30368a25 = new EnumC30368a(24, "LOADER_UNEXPECTED_ERROR");
            f79568z = enumC30368a25;
            EnumC30368a enumC30368a26 = new EnumC30368a(25, "AUDIO_ERROR");
            f79537A = enumC30368a26;
            EnumC30368a enumC30368a27 = new EnumC30368a(26, "SUBTITLE_ERROR");
            f79538B = enumC30368a27;
            EnumC30368a enumC30368a28 = new EnumC30368a(27, "CACHE_ERROR");
            f79539C = enumC30368a28;
            EnumC30368a enumC30368a29 = new EnumC30368a(28, "UNKNOWN");
            f79540D = enumC30368a29;
            EnumC30368a enumC30368a30 = new EnumC30368a(29, "PLAYBACK_UNKNOWN");
            f79541E = enumC30368a30;
            EnumC30368a enumC30368a31 = new EnumC30368a(30, "UNKNOWN_NOT_MATCHED");
            f79542F = enumC30368a31;
            EnumC30368a[] enumC30368aArr = {enumC30368a, enumC30368a2, enumC30368a3, enumC30368a4, enumC30368a5, enumC30368a6, enumC30368a7, enumC30368a8, enumC30368a9, enumC30368a10, enumC30368a11, enumC30368a12, enumC30368a13, enumC30368a14, enumC30368a15, enumC30368a16, enumC30368a17, enumC30368a18, enumC30368a19, enumC30368a20, enumC30368a21, enumC30368a22, enumC30368a23, enumC30368a24, enumC30368a25, enumC30368a26, enumC30368a27, enumC30368a28, enumC30368a29, enumC30368a30, enumC30368a31};
            f79543G = enumC30368aArr;
            C44401b.m3113a(enumC30368aArr);
        }

        private EnumC30368a(int i, String str) {
        }

        public static EnumC30368a valueOf(String str) {
            return (EnumC30368a) Enum.valueOf(EnumC30368a.class, str);
        }

        public static EnumC30368a[] values() {
            return (EnumC30368a[]) f79543G.clone();
        }
    }

    public g72(@NotNull EnumC30368a reason, @NotNull Throwable underlyingError) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(underlyingError, "underlyingError");
        this.f79535a = reason;
        this.f79536b = underlyingError;
    }

    @NotNull
    /* renamed from: a */
    public final EnumC30368a m33913a() {
        return this.f79535a;
    }

    @NotNull
    /* renamed from: b */
    public final Throwable m33912b() {
        return this.f79536b;
    }
}
