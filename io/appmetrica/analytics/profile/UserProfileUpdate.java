package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.AbstractC34507ed;
import io.appmetrica.analytics.impl.InterfaceC34490dn;

/* loaded from: classes9.dex */
public class UserProfileUpdate<T extends InterfaceC34490dn> {

    /* renamed from: a */
    private final InterfaceC34490dn f95946a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public UserProfileUpdate(AbstractC34507ed abstractC34507ed) {
        this.f95946a = abstractC34507ed;
    }

    @NonNull
    public T getUserProfileUpdatePatcher() {
        return (T) this.f95946a;
    }
}
