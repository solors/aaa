package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.Tuples;
import p804nd.C38513v;

/* renamed from: io.appmetrica.analytics.impl.x7 */
/* loaded from: classes9.dex */
public final class C35007x7 implements ProtobufConverter {
    @NonNull
    /* renamed from: a */
    public final BigDecimal m20784a(@NonNull C34529f8 c34529f8) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        C34529f8 c34529f8 = (C34529f8) obj;
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a */
    public final C34529f8 fromModel(@NonNull BigDecimal bigDecimal) {
        BigInteger bigInteger = AbstractC35059z7.f95686a;
        int i = -bigDecimal.scale();
        BigInteger unscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (unscaledValue.compareTo(AbstractC35059z7.f95686a) <= 0 && unscaledValue.compareTo(AbstractC35059z7.f95687b) >= 0) {
                Tuples m14532a = C38513v.m14532a(Long.valueOf(unscaledValue.longValue()), Integer.valueOf(i));
                C35033y7 c35033y7 = new C35033y7(((Number) m14532a.m17629d()).intValue(), ((Number) m14532a.m17630c()).longValue());
                C34529f8 c34529f8 = new C34529f8();
                c34529f8.f94338a = c35033y7.f95643a;
                c34529f8.f94339b = c35033y7.f95644b;
                return c34529f8;
            }
            unscaledValue = unscaledValue.divide(BigInteger.TEN);
            i++;
        }
    }
}
