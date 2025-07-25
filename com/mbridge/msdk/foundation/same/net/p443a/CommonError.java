package com.mbridge.msdk.foundation.same.net.p443a;

import com.mbridge.msdk.foundation.same.net.p446d.C21991a;

/* renamed from: com.mbridge.msdk.foundation.same.net.a.a */
/* loaded from: classes6.dex */
public final class CommonError extends Exception {

    /* renamed from: a */
    public int f56579a;

    /* renamed from: b */
    public String f56580b;

    /* renamed from: c */
    public C21991a f56581c;

    public CommonError(int i, C21991a c21991a) {
        this.f56579a = i;
        this.f56581c = c21991a;
    }

    public CommonError(int i, C21991a c21991a, String str) {
        this.f56579a = i;
        this.f56581c = c21991a;
        this.f56580b = str;
    }
}
