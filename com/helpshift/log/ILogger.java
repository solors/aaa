package com.helpshift.log;

/* loaded from: classes5.dex */
public interface ILogger {

    /* loaded from: classes5.dex */
    public enum LEVEL {
        DEBUG,
        WARN,
        ERROR
    }

    /* renamed from: d */
    void mo65435d(String str, String str2);

    /* renamed from: d */
    void mo65434d(String str, String str2, Throwable th);

    /* renamed from: e */
    void mo65433e(String str, String str2);

    /* renamed from: e */
    void mo65432e(String str, String str2, Throwable th);

    /* renamed from: w */
    void mo65431w(String str, String str2);

    /* renamed from: w */
    void mo65430w(String str, String str2, Throwable th);
}
