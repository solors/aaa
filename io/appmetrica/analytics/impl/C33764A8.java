package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.A8 */
/* loaded from: classes9.dex */
public final class C33764A8 implements InterfaceC34893sn {

    /* renamed from: a */
    public final C33864E8 f92564a;

    public C33764A8() {
        this(new C33864E8());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34893sn
    @NonNull
    /* renamed from: a */
    public final byte[] mo20878a(@NonNull C34011K8 c34011k8, @NonNull C33897Fg c33897Fg) {
        byte[] bArr;
        String str = c34011k8.f93106b;
        if (str != null) {
            bArr = StringUtils.getUTF8Bytes(str);
        } else {
            bArr = new byte[0];
        }
        C33864E8 c33864e8 = this.f92564a;
        return ((InterfaceC33839D8) c33864e8.f92782a.m21158a(c34011k8.f93119o)).mo21957a(bArr);
    }

    public C33764A8(C33864E8 c33864e8) {
        this.f92564a = c33864e8;
    }
}
