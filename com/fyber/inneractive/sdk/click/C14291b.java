package com.fyber.inneractive.sdk.click;

import java.util.ArrayList;

/* renamed from: com.fyber.inneractive.sdk.click.b */
/* loaded from: classes4.dex */
public final class C14291b {

    /* renamed from: a */
    public final EnumC14306q f26999a;

    /* renamed from: b */
    public final Throwable f27000b;

    /* renamed from: c */
    public final String f27001c;

    /* renamed from: d */
    public final String f27002d;

    /* renamed from: e */
    public long f27003e;

    /* renamed from: f */
    public final ArrayList f27004f = new ArrayList();

    public C14291b(String str, EnumC14306q enumC14306q, String str2, Exception exc) {
        this.f27002d = str;
        this.f26999a = enumC14306q;
        this.f27001c = str2;
        this.f27000b = exc;
    }

    public final String toString() {
        String str;
        EnumC14306q enumC14306q = this.f26999a;
        if (enumC14306q == EnumC14306q.FAILED) {
            Throwable th = this.f27000b;
            if (th != null) {
                str = th.getMessage();
            } else {
                str = "none";
            }
            return "Open result: Failed! error: " + str;
        }
        String str2 = this.f27001c;
        return "Open result: Success! target: " + enumC14306q + " method: " + str2;
    }
}
