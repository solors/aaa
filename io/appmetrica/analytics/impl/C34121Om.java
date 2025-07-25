package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.p726io.Base64Utils;

/* renamed from: io.appmetrica.analytics.impl.Om */
/* loaded from: classes9.dex */
public final class C34121Om implements InterfaceC34893sn {

    /* renamed from: a */
    public final C33864E8 f93316a;

    public C34121Om() {
        this(new C33864E8());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34893sn
    @NonNull
    /* renamed from: a */
    public final byte[] mo20878a(@NonNull C34011K8 c34011k8, @NonNull C33897Fg c33897Fg) {
        byte[] bArr = new byte[0];
        try {
            bArr = Base64Utils.decompressBase64GzipAsBytes(c34011k8.f93106b);
        } catch (Throwable unused) {
        }
        byte[] mo21957a = ((InterfaceC33839D8) this.f93316a.f92782a.m21158a(c34011k8.f93119o)).mo21957a(bArr);
        return mo21957a == null ? new byte[0] : mo21957a;
    }

    public C34121Om(C33864E8 c33864e8) {
        this.f93316a = c33864e8;
    }

    @NonNull
    @VisibleForTesting
    /* renamed from: a */
    public final C33864E8 m22370a() {
        return this.f93316a;
    }
}
