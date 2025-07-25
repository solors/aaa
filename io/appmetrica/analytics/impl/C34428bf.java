package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.bf */
/* loaded from: classes9.dex */
public final class C34428bf implements InterfaceC34893sn, InterfaceC34982w8 {
    @Override // io.appmetrica.analytics.impl.InterfaceC34982w8
    /* renamed from: a */
    public final int mo20738a(@NonNull EnumC33889F8 enumC33889F8) {
        return 2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34893sn
    @NonNull
    /* renamed from: a */
    public final byte[] mo20878a(@NonNull C34011K8 c34011k8, @NonNull C33897Fg c33897Fg) {
        return TextUtils.isEmpty(c34011k8.f93106b) ? new byte[0] : Base64.decode(c34011k8.f93106b, 0);
    }
}
