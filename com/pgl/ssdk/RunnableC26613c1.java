package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;
import com.pgl.ssdk.ces.C26614a;

/* renamed from: com.pgl.ssdk.c1 */
/* loaded from: classes7.dex */
public class RunnableC26613c1 implements Runnable {

    /* renamed from: a */
    private final InterfaceC26625d1 f69857a;

    /* renamed from: b */
    private final Context f69858b;

    public RunnableC26613c1(Context context, InterfaceC26625d1 interfaceC26625d1) {
        this.f69857a = interfaceC26625d1;
        this.f69858b = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        byte[] bArr;
        String m40832b = C26645l0.m40832b();
        try {
            bArr = (byte[]) C26614a.meta(301, this.f69858b, null);
        } catch (Throwable unused) {
            C26609b1.f69845a = 501;
        }
        if (bArr != null && bArr.length > 0) {
            if (TextUtils.isEmpty(m40832b)) {
                return;
            }
            new C26628e1(this.f69858b, null).m40826a(1, 2, bArr);
            InterfaceC26625d1 interfaceC26625d1 = this.f69857a;
            if (interfaceC26625d1 != null) {
                interfaceC26625d1.m40883a(C26609b1.m40931a());
                return;
            }
            return;
        }
        C26609b1.f69845a = 501;
    }
}
