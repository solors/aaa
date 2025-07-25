package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.D2 */
/* loaded from: classes9.dex */
public final class C33833D2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a */
    public final C34315X1 fromModel(@NonNull C33883F2 c33883f2) {
        C34315X1 c34315x1 = new C34315X1();
        EnumC33858E2 enumC33858E2 = c33883f2.f92811a;
        if (enumC33858E2 != null) {
            int ordinal = enumC33858E2.ordinal();
            if (ordinal == 0) {
                c34315x1.f93678a = 1;
            } else if (ordinal == 1) {
                c34315x1.f93678a = 2;
            } else if (ordinal == 2) {
                c34315x1.f93678a = 3;
            } else if (ordinal == 3) {
                c34315x1.f93678a = 4;
            } else if (ordinal == 4) {
                c34315x1.f93678a = 5;
            }
        }
        Boolean bool = c33883f2.f92812b;
        if (bool != null) {
            if (bool.booleanValue()) {
                c34315x1.f93679b = 1;
            } else {
                c34315x1.f93679b = 0;
            }
        }
        return c34315x1;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a */
    public final C33883F2 toModel(@NonNull C34315X1 c34315x1) {
        EnumC33858E2 enumC33858E2;
        int i = c34315x1.f93678a;
        Boolean bool = null;
        if (i == 1) {
            enumC33858E2 = EnumC33858E2.ACTIVE;
        } else if (i == 2) {
            enumC33858E2 = EnumC33858E2.WORKING_SET;
        } else if (i == 3) {
            enumC33858E2 = EnumC33858E2.FREQUENT;
        } else if (i != 4) {
            enumC33858E2 = i != 5 ? null : EnumC33858E2.RESTRICTED;
        } else {
            enumC33858E2 = EnumC33858E2.RARE;
        }
        int i2 = c34315x1.f93679b;
        if (i2 == 0) {
            bool = Boolean.FALSE;
        } else if (i2 == 1) {
            bool = Boolean.TRUE;
        }
        return new C33883F2(enumC33858E2, bool);
    }
}
