package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* renamed from: io.appmetrica.analytics.impl.He */
/* loaded from: classes9.dex */
public final class C33945He implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a */
    public final Integer fromModel(@NonNull EnumC34154Q7 enumC34154Q7) {
        int ordinal = enumC34154Q7.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    return 0;
                }
                return 2;
            }
            return 3;
        }
        return 1;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a */
    public final EnumC34154Q7 toModel(@NonNull Integer num) {
        int intValue = num.intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                if (intValue != 3) {
                    return EnumC34154Q7.f93389b;
                }
                return EnumC34154Q7.f93391d;
            }
            return EnumC34154Q7.f93392e;
        }
        return EnumC34154Q7.f93390c;
    }
}
