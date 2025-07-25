package com.amazon.p047a.p048a.p055d;

import com.google.firebase.sessions.settings.RemoteSettings;

/* renamed from: com.amazon.a.a.d.b */
/* loaded from: classes2.dex */
public abstract class KiwiException extends Exception {

    /* renamed from: a */
    private static final long f2381a = 1;

    /* renamed from: b */
    private final String f2382b;

    /* renamed from: c */
    private final String f2383c;

    /* renamed from: d */
    private final String f2384d;

    /* JADX INFO: Access modifiers changed from: protected */
    public KiwiException(String str) {
        this(str, (String) null);
    }

    /* renamed from: a */
    public final String m103141a() {
        return this.f2382b;
    }

    /* renamed from: b */
    public final String m103139b() {
        return this.f2383c;
    }

    /* renamed from: c */
    public final String m103137c() {
        return this.f2384d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public KiwiException(String str, String str2) {
        this(str, str2, (String) null);
    }

    /* renamed from: a */
    private static String m103140a(Throwable th) {
        if (th == null) {
            return null;
        }
        Throwable m103136c = m103136c(th);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m103138b(th));
        sb2.append(":");
        sb2.append(th.getMessage());
        if (th != m103136c) {
            sb2.append(RemoteSettings.FORWARD_SLASH_STRING);
            sb2.append(m103138b(m103136c));
            sb2.append(":");
            sb2.append(m103136c.getMessage());
        }
        return sb2.toString();
    }

    /* renamed from: b */
    private static String m103138b(Throwable th) {
        return th.getClass().getName();
    }

    /* renamed from: c */
    private static Throwable m103136c(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public KiwiException(String str, String str2, String str3) {
        super(str + ": " + str2 + ": " + str3);
        this.f2382b = str;
        this.f2383c = str2;
        this.f2384d = str3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public KiwiException(String str, Throwable th) {
        this(str, m103138b(th), th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public KiwiException(String str, String str2, Throwable th) {
        this(str, str2, m103140a(th));
    }
}
