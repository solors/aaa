package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.Em */
/* loaded from: classes9.dex */
public final class C33878Em implements ProtobufConverter {

    /* renamed from: a */
    public final C33901Fk f92802a;

    public C33878Em() {
        this(new C33901Fk());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a */
    public final C34554g6 fromModel(@NonNull C33903Fm c33903Fm) {
        C34554g6 c34554g6 = new C34554g6();
        c34554g6.f94427a = (String) WrapUtils.getOrDefault(c33903Fm.f92872a, "");
        c34554g6.f94428b = StringUtils.correctIllFormedString((String) WrapUtils.getOrDefault(c33903Fm.f92873b, ""));
        List<C33951Hk> list = c33903Fm.f92874c;
        if (list != null) {
            c34554g6.f94429c = this.f92802a.fromModel(list);
        }
        C33903Fm c33903Fm2 = c33903Fm.f92875d;
        if (c33903Fm2 != null) {
            c34554g6.f94430d = fromModel(c33903Fm2);
        }
        List<C33903Fm> list2 = c33903Fm.f92876e;
        int i = 0;
        if (list2 == null) {
            c34554g6.f94431e = new C34554g6[0];
        } else {
            c34554g6.f94431e = new C34554g6[list2.size()];
            for (C33903Fm c33903Fm3 : list2) {
                c34554g6.f94431e[i] = fromModel(c33903Fm3);
                i++;
            }
        }
        return c34554g6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        C34554g6 c34554g6 = (C34554g6) obj;
        throw new UnsupportedOperationException();
    }

    public C33878Em(C33901Fk c33901Fk) {
        this.f92802a = c33901Fk;
    }

    @NonNull
    /* renamed from: a */
    public final C33903Fm m22667a(@NonNull C34554g6 c34554g6) {
        throw new UnsupportedOperationException();
    }
}
