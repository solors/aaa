package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;
import com.ironsource.sdk.controller.C20903v;
import com.ironsource.sdk.utils.Logger;
import java.lang.reflect.Method;
import java.security.AccessControlException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.ironsource.sdk.controller.b */
/* loaded from: classes6.dex */
public class C20813b {

    /* renamed from: b */
    private static final String f52963b = "b";

    /* renamed from: a */
    private final C20903v.C20922r f52964a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C20813b(C20903v.C20922r c20922r) {
        this.f52964a = c20922r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m55317a(String str) {
        C20903v.C20922r c20922r = this.f52964a;
        if (c20922r != null) {
            c20922r.m54988c(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m55316a(String str, String str2) throws Exception {
        if (this.f52964a == null) {
            Logger.m54972e(f52963b, "!!! nativeAPI == null !!!");
            return;
        }
        Method declaredMethod = C20903v.C20922r.class.getDeclaredMethod(str, String.class);
        if (declaredMethod.isAnnotationPresent(JavascriptInterface.class)) {
            declaredMethod.invoke(this.f52964a, str2);
            return;
        }
        throw new AccessControlException("Trying to access a private function: " + str);
    }
}
