package io.appmetrica.analytics.adrevenue.admob.v23.impl;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.nativead.NativeAd;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;

/* renamed from: io.appmetrica.analytics.adrevenue.admob.v23.impl.g */
/* loaded from: classes9.dex */
public final class C33673g extends AbstractC33671e {
    public C33673g(@NonNull C33668b c33668b, @NonNull ClientContext clientContext) {
        super(c33668b, clientContext);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(Object... objArr) {
        if (!ReflectionUtils.isArgumentsOfClasses(objArr, AdValue.class, NativeAd.class)) {
            return false;
        }
        this.f92254a.getClass();
        m22816a(C33668b.m22817a((AdValue) objArr[0], ModuleAdType.NATIVE, ((NativeAd) objArr[1]).getResponseInfo(), null));
        return true;
    }
}
