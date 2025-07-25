package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.cm */
/* loaded from: classes9.dex */
public final class C34462cm implements InterfaceC34893sn {
    @Override // io.appmetrica.analytics.impl.InterfaceC34893sn
    @NonNull
    /* renamed from: a */
    public final byte[] mo20878a(@NonNull C34011K8 c34011k8, @NonNull C33897Fg c33897Fg) {
        if (!TextUtils.isEmpty(c34011k8.f93106b)) {
            return StringUtils.getUTF8Bytes(c34011k8.f93106b);
        }
        return new byte[0];
    }
}
