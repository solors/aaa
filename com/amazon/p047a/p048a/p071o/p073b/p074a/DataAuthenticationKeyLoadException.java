package com.amazon.p047a.p048a.p071o.p073b.p074a;

import com.amazon.p047a.p048a.p055d.KiwiException;

/* renamed from: com.amazon.a.a.o.b.a.a */
/* loaded from: classes2.dex */
public class DataAuthenticationKeyLoadException extends KiwiException {

    /* renamed from: a */
    public static final String f2747a = "DATA_AUTH_KEY_LOAD_FAILURE";

    /* renamed from: b */
    private static final long f2748b = 1;

    private DataAuthenticationKeyLoadException(String str, Throwable th) {
        super(f2747a, str, th);
    }

    /* renamed from: a */
    public static DataAuthenticationKeyLoadException m102862a(Throwable th) {
        return new DataAuthenticationKeyLoadException("CERT_FAILED_TO_LOAD", th);
    }

    /* renamed from: b */
    public static DataAuthenticationKeyLoadException m102861b(Throwable th) {
        return new DataAuthenticationKeyLoadException("FAILED_TO_ESTABLISH_TRUST", th);
    }

    /* renamed from: d */
    public static DataAuthenticationKeyLoadException m102860d() {
        return new DataAuthenticationKeyLoadException("CERT_NOT_FOUND", null);
    }

    /* renamed from: e */
    public static DataAuthenticationKeyLoadException m102859e() {
        return new DataAuthenticationKeyLoadException("CERT_INVALID", null);
    }

    /* renamed from: f */
    public static DataAuthenticationKeyLoadException m102858f() {
        return new DataAuthenticationKeyLoadException("VERIFICATION_FAILED", null);
    }
}
