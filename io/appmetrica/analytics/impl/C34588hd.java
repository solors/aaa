package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import java.util.Map;
import kotlin.collections.C37559r0;
import org.jetbrains.annotations.NotNull;
import p804nd.C38513v;

/* renamed from: io.appmetrica.analytics.impl.hd */
/* loaded from: classes9.dex */
public final class C34588hd implements ProtobufConverter {
    @NotNull

    /* renamed from: a */
    public static final C34561gd f94543a = new C34561gd();

    /* renamed from: b */
    public static final Map f94544b;

    static {
        Map m17281m;
        m17281m = C37559r0.m17281m(C38513v.m14532a(NativeCrashSource.UNKNOWN, 0), C38513v.m14532a(NativeCrashSource.CRASHPAD, 3));
        f94544b = m17281m;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a */
    public final C34392a6 fromModel(@NotNull C34669kd c34669kd) {
        C34392a6 c34392a6 = new C34392a6();
        c34392a6.f93924f = 1;
        C34367Z5 c34367z5 = new C34367Z5();
        c34367z5.f93865a = c34669kd.f94784a;
        C34473d6 c34473d6 = new C34473d6();
        Integer num = (Integer) f94544b.get(c34669kd.f94785b.f94704a);
        if (num != null) {
            c34473d6.f94145a = num.intValue();
        }
        String str = c34669kd.f94785b.f94705b;
        if (str == null) {
            str = "";
        }
        c34473d6.f94146b = str;
        c34367z5.f93866b = c34473d6;
        c34392a6.f93925g = c34367z5;
        return c34392a6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        C34392a6 c34392a6 = (C34392a6) obj;
        throw new UnsupportedOperationException();
    }

    @NotNull
    /* renamed from: a */
    public final C34669kd m21575a(@NotNull C34392a6 c34392a6) {
        throw new UnsupportedOperationException();
    }
}
