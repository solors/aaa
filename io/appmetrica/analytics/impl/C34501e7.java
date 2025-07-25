package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.e7 */
/* loaded from: classes9.dex */
public final class C34501e7 implements Converter {

    /* renamed from: a */
    public final C34474d7 f94243a;

    public C34501e7() {
        this(null, 1, null);
    }

    @NotNull
    /* renamed from: a */
    public final byte[] m21802a(@NotNull C34528f7 c34528f7) {
        return MessageNano.toByteArray(this.f94243a.fromModel(c34528f7));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f94243a.fromModel((C34528f7) obj));
    }

    public C34501e7(@NotNull C34474d7 c34474d7) {
        this.f94243a = c34474d7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x000d, code lost:
        if (r2 == null) goto L2;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @org.jetbrains.annotations.NotNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.C34528f7 toModel(@org.jetbrains.annotations.Nullable byte[] r2) {
        /*
            r1 = this;
            if (r2 == 0) goto Lf
            io.appmetrica.analytics.impl.o7 r0 = new io.appmetrica.analytics.impl.o7     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            r0.<init>()     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            io.appmetrica.analytics.protobuf.nano.MessageNano r2 = io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(r0, r2)     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            io.appmetrica.analytics.impl.o7 r2 = (io.appmetrica.analytics.impl.C34771o7) r2     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            if (r2 != 0) goto L1a
        Lf:
            io.appmetrica.analytics.impl.o7 r2 = new io.appmetrica.analytics.impl.o7     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            r2.<init>()     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            goto L1a
        L15:
            io.appmetrica.analytics.impl.o7 r2 = new io.appmetrica.analytics.impl.o7
            r2.<init>()
        L1a:
            io.appmetrica.analytics.impl.d7 r0 = r1.f94243a
            io.appmetrica.analytics.impl.f7 r2 = r0.toModel(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C34501e7.toModel(byte[]):io.appmetrica.analytics.impl.f7");
    }

    public /* synthetic */ C34501e7(C34474d7 c34474d7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C34474d7(null, null, 3, null) : c34474d7);
    }
}
