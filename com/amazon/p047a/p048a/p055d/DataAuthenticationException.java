package com.amazon.p047a.p048a.p055d;

/* renamed from: com.amazon.a.a.d.a */
/* loaded from: classes2.dex */
public class DataAuthenticationException extends Exception {

    /* renamed from: a */
    private static final long f2380a = 1;

    public DataAuthenticationException(String str) {
        super(str);
    }

    public DataAuthenticationException(String str, Throwable th) {
        super("Failed to authenticate data: " + str, th);
    }
}
