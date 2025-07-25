package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.r7 */
/* loaded from: classes9.dex */
public final class C34851r7 implements ProtobufConverter {

    /* renamed from: a */
    public final C33944Hd f95267a;

    public C34851r7() {
        this(null, 1, null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a */
    public final C34825q7 fromModel(@NotNull C34903t7 c34903t7) {
        C34825q7 c34825q7 = new C34825q7();
        Long l = c34903t7.f95373a;
        if (l != null) {
            c34825q7.f95214a = l.longValue();
        }
        Long l2 = c34903t7.f95374b;
        if (l2 != null) {
            c34825q7.f95215b = l2.longValue();
        }
        Boolean bool = c34903t7.f95375c;
        if (bool != null) {
            c34825q7.f95216c = this.f95267a.fromModel(Boolean.valueOf(bool.booleanValue())).intValue();
        }
        return c34825q7;
    }

    public C34851r7(@NotNull C33944Hd c33944Hd) {
        this.f95267a = c33944Hd;
    }

    public /* synthetic */ C34851r7(C33944Hd c33944Hd, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C33944Hd() : c33944Hd);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a */
    public final C34903t7 toModel(@NotNull C34825q7 c34825q7) {
        C34825q7 c34825q72 = new C34825q7();
        Long valueOf = Long.valueOf(c34825q7.f95214a);
        if (valueOf.longValue() == c34825q72.f95214a) {
            valueOf = null;
        }
        Long valueOf2 = Long.valueOf(c34825q7.f95215b);
        return new C34903t7(valueOf, valueOf2.longValue() != c34825q72.f95215b ? valueOf2 : null, this.f95267a.m22565a(c34825q7.f95216c));
    }
}
