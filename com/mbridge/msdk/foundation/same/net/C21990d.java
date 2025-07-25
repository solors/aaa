package com.mbridge.msdk.foundation.same.net;

import com.mbridge.msdk.foundation.same.net.p443a.CommonError;
import com.mbridge.msdk.foundation.same.net.p446d.C21991a;

/* compiled from: Response.java */
/* renamed from: com.mbridge.msdk.foundation.same.net.d */
/* loaded from: classes6.dex */
public final class C21990d<T> {

    /* renamed from: a */
    public CommonError f56584a = null;

    /* renamed from: b */
    public C21991a f56585b;

    /* renamed from: c */
    public T f56586c;

    private C21990d(T t, C21991a c21991a) {
        this.f56586c = t;
        this.f56585b = c21991a;
    }

    /* renamed from: a */
    public static <T> C21990d<T> m52210a(T t, C21991a c21991a) {
        return new C21990d<>(t, c21991a);
    }
}
