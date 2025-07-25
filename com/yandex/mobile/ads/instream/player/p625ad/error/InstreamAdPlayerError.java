package com.yandex.mobile.ads.instream.player.p625ad.error;

import com.zeus.gmc.sdk.mobileads.columbus.common.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.C44401b;
import td.EnumEntries;

@Metadata
/* renamed from: com.yandex.mobile.ads.instream.player.ad.error.InstreamAdPlayerError */
/* loaded from: classes8.dex */
public final class InstreamAdPlayerError {
    @NotNull

    /* renamed from: a */
    private final Reason f89196a;
    @NotNull

    /* renamed from: b */
    private final Throwable f89197b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata
    /* renamed from: com.yandex.mobile.ads.instream.player.ad.error.InstreamAdPlayerError$Reason */
    /* loaded from: classes8.dex */
    public static final class Reason {
        public static final Reason AUDIO_ERROR;
        public static final Reason BEHIND_LIVE_WINDOW_ERROR;
        public static final Reason CACHE_ERROR;
        public static final Reason CONTENT_PARSER_ERROR;
        public static final Reason DECODER_INITIALIZATION_ERROR;
        public static final Reason DECODER_QUERY_ERROR;
        public static final Reason DECODER_UNKNOWN_ERROR;
        public static final Reason DRM_KEYS_EXPIRED;
        public static final Reason DRM_MEDIA_RESOURCE_BUSY;
        public static final Reason DRM_SESSION_ERROR;
        public static final Reason HTTP_CLEARTEXT_NOT_PERMITTED;
        public static final Reason HTTP_CODE_FORBIDDEN;
        public static final Reason HTTP_CODE_NOT_FOUND;
        public static final Reason HTTP_CODE_UNAUTHORIZED;
        public static final Reason HTTP_CODE_UNKNOWN;
        public static final Reason ILLEGAL_SEEK_POSITION;
        public static final Reason LOADER_UNEXPECTED_ERROR;
        public static final Reason NETWORK_UNAVAILABLE;
        public static final Reason RENDERER_FAILED_DEQUEUE_INPUT_BUFFER;
        public static final Reason RENDERER_FAILED_DEQUEUE_OUTPUT_BUFFER;
        public static final Reason RENDERER_FAILED_QUEUE_SECURE_INPUT_BUFFER;
        public static final Reason RENDERER_FAILED_RELEASE_OUTPUT_BUFFER;
        public static final Reason RENDERER_FAILED_SET_SURFACE;
        public static final Reason RENDERER_FAILED_STOP;
        public static final Reason RENDERER_MEDIA_CODEC_UNKNOWN;
        public static final Reason SSL_HANDSHAKE_ERROR;
        public static final Reason SUBTITLE_ERROR;
        public static final Reason TIMEOUT;
        public static final Reason UNKNOWN;

        /* renamed from: b */
        private static final /* synthetic */ Reason[] f89198b;

        /* renamed from: c */
        private static final /* synthetic */ EnumEntries f89199c;

        static {
            Reason reason = new Reason(0, "RENDERER_FAILED_DEQUEUE_OUTPUT_BUFFER");
            RENDERER_FAILED_DEQUEUE_OUTPUT_BUFFER = reason;
            Reason reason2 = new Reason(1, "RENDERER_FAILED_DEQUEUE_INPUT_BUFFER");
            RENDERER_FAILED_DEQUEUE_INPUT_BUFFER = reason2;
            Reason reason3 = new Reason(2, "RENDERER_FAILED_STOP");
            RENDERER_FAILED_STOP = reason3;
            Reason reason4 = new Reason(3, "RENDERER_FAILED_SET_SURFACE");
            RENDERER_FAILED_SET_SURFACE = reason4;
            Reason reason5 = new Reason(4, "RENDERER_FAILED_RELEASE_OUTPUT_BUFFER");
            RENDERER_FAILED_RELEASE_OUTPUT_BUFFER = reason5;
            Reason reason6 = new Reason(5, "RENDERER_FAILED_QUEUE_SECURE_INPUT_BUFFER");
            RENDERER_FAILED_QUEUE_SECURE_INPUT_BUFFER = reason6;
            Reason reason7 = new Reason(6, "RENDERER_MEDIA_CODEC_UNKNOWN");
            RENDERER_MEDIA_CODEC_UNKNOWN = reason7;
            Reason reason8 = new Reason(7, "TIMEOUT");
            TIMEOUT = reason8;
            Reason reason9 = new Reason(8, "ILLEGAL_SEEK_POSITION");
            ILLEGAL_SEEK_POSITION = reason9;
            Reason reason10 = new Reason(9, "DECODER_QUERY_ERROR");
            DECODER_QUERY_ERROR = reason10;
            Reason reason11 = new Reason(10, "DECODER_INITIALIZATION_ERROR");
            DECODER_INITIALIZATION_ERROR = reason11;
            Reason reason12 = new Reason(11, "DECODER_UNKNOWN_ERROR");
            DECODER_UNKNOWN_ERROR = reason12;
            Reason reason13 = new Reason(12, "BEHIND_LIVE_WINDOW_ERROR");
            BEHIND_LIVE_WINDOW_ERROR = reason13;
            Reason reason14 = new Reason(13, "DRM_KEYS_EXPIRED");
            DRM_KEYS_EXPIRED = reason14;
            Reason reason15 = new Reason(14, "DRM_MEDIA_RESOURCE_BUSY");
            DRM_MEDIA_RESOURCE_BUSY = reason15;
            Reason reason16 = new Reason(15, "DRM_SESSION_ERROR");
            DRM_SESSION_ERROR = reason16;
            Reason reason17 = new Reason(16, "HTTP_CLEARTEXT_NOT_PERMITTED");
            HTTP_CLEARTEXT_NOT_PERMITTED = reason17;
            Reason reason18 = new Reason(17, "HTTP_CODE_UNAUTHORIZED");
            HTTP_CODE_UNAUTHORIZED = reason18;
            Reason reason19 = new Reason(18, "HTTP_CODE_FORBIDDEN");
            HTTP_CODE_FORBIDDEN = reason19;
            Reason reason20 = new Reason(19, "HTTP_CODE_NOT_FOUND");
            HTTP_CODE_NOT_FOUND = reason20;
            Reason reason21 = new Reason(20, "HTTP_CODE_UNKNOWN");
            HTTP_CODE_UNKNOWN = reason21;
            Reason reason22 = new Reason(21, "SSL_HANDSHAKE_ERROR");
            SSL_HANDSHAKE_ERROR = reason22;
            Reason reason23 = new Reason(22, Constants.NETWORK_IS_UNAVAILABLE);
            NETWORK_UNAVAILABLE = reason23;
            Reason reason24 = new Reason(23, "CONTENT_PARSER_ERROR");
            CONTENT_PARSER_ERROR = reason24;
            Reason reason25 = new Reason(24, "LOADER_UNEXPECTED_ERROR");
            LOADER_UNEXPECTED_ERROR = reason25;
            Reason reason26 = new Reason(25, "AUDIO_ERROR");
            AUDIO_ERROR = reason26;
            Reason reason27 = new Reason(26, "SUBTITLE_ERROR");
            SUBTITLE_ERROR = reason27;
            Reason reason28 = new Reason(27, "CACHE_ERROR");
            CACHE_ERROR = reason28;
            Reason reason29 = new Reason(28, "UNKNOWN");
            UNKNOWN = reason29;
            Reason[] reasonArr = {reason, reason2, reason3, reason4, reason5, reason6, reason7, reason8, reason9, reason10, reason11, reason12, reason13, reason14, reason15, reason16, reason17, reason18, reason19, reason20, reason21, reason22, reason23, reason24, reason25, reason26, reason27, reason28, reason29};
            f89198b = reasonArr;
            f89199c = C44401b.m3113a(reasonArr);
        }

        private Reason(int i, String str) {
        }

        @NotNull
        public static EnumEntries<Reason> getEntries() {
            return f89199c;
        }

        public static Reason valueOf(String str) {
            return (Reason) Enum.valueOf(Reason.class, str);
        }

        public static Reason[] values() {
            return (Reason[]) f89198b.clone();
        }
    }

    public InstreamAdPlayerError(@NotNull Reason reason, @NotNull Throwable underlyingError) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(underlyingError, "underlyingError");
        this.f89196a = reason;
        this.f89197b = underlyingError;
    }

    @NotNull
    public final Reason getReason() {
        return this.f89196a;
    }

    @NotNull
    public final Throwable getUnderlyingError() {
        return this.f89197b;
    }
}
