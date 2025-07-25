package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.UUID;

/* renamed from: io.appmetrica.analytics.impl.c0 */
/* loaded from: classes9.dex */
public final class C34440c0 implements InterfaceC34867rn {
    @Override // io.appmetrica.analytics.impl.InterfaceC34867rn
    /* renamed from: a */
    public final C34814pn mo20778a(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return new C34814pn(this, false, "ApiKey is empty. Please, read official documentation how to obtain one: https://appmetrica.io/docs/mobile-sdk-dg/android/about/android-initialize.html");
        }
        try {
            UUID.fromString(str);
            return new C34814pn(this, true, "");
        } catch (Throwable unused) {
            return new C34814pn(this, false, "Invalid ApiKey=" + str + ". Please, read official documentation how to obtain one: https://appmetrica.io/docs/mobile-sdk-dg/android/about/android-initialize.html");
        }
    }
}
