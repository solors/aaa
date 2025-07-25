package p038c3;

import p038c3.HSRootApiException;

/* renamed from: c3.b */
/* loaded from: classes5.dex */
public enum NetworkException implements HSRootApiException.InterfaceC3418a {
    GENERIC,
    NO_CONNECTION,
    UNKNOWN_HOST,
    SSL_PEER_UNVERIFIED,
    SSL_HANDSHAKE,
    TIMESTAMP_CORRECTION_RETRIES_EXHAUSTED,
    UNSUPPORTED_ENCODING_EXCEPTION,
    AUTH_TOKEN_NOT_PROVIDED,
    INVALID_AUTH_TOKEN;
    

    /* renamed from: b */
    public int f1848b;

    /* renamed from: c */
    public String f1849c;
}
