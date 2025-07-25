package io.appmetrica.analytics.impl;

import android.util.Base64;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.u3 */
/* loaded from: classes9.dex */
public final class C34925u3 implements InterfaceC34893sn {

    /* renamed from: a */
    public final C33864E8 f95449a;

    public C34925u3() {
        this(new C33864E8());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34893sn
    @NonNull
    /* renamed from: a */
    public final byte[] mo20878a(@NonNull C34011K8 c34011k8, @NonNull C33897Fg c33897Fg) {
        byte[] bArr = new byte[0];
        String str = c34011k8.f93106b;
        if (str != null) {
            try {
                bArr = Base64.decode(str, 0);
            } catch (Throwable unused) {
            }
        }
        C33864E8 c33864e8 = this.f95449a;
        return ((InterfaceC33839D8) c33864e8.f92782a.m21158a(c34011k8.f93119o)).mo21957a(bArr);
    }

    public C34925u3(C33864E8 c33864e8) {
        this.f95449a = c33864e8;
    }
}
