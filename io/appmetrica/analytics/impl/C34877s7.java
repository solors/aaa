package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.s7 */
/* loaded from: classes9.dex */
public final class C34877s7 implements Converter {

    /* renamed from: a */
    public final C34851r7 f95323a;

    public C34877s7() {
        this(null, 1, null);
    }

    @NotNull
    /* renamed from: a */
    public final byte[] m20983a(@NotNull C34903t7 c34903t7) {
        return MessageNano.toByteArray(this.f95323a.fromModel(c34903t7));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f95323a.fromModel((C34903t7) obj));
    }

    public C34877s7(@NotNull C34851r7 c34851r7) {
        this.f95323a = c34851r7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
        if (r2 == null) goto L2;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @org.jetbrains.annotations.NotNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.C34903t7 toModel(@org.jetbrains.annotations.Nullable byte[] r2) {
        /*
            r1 = this;
            if (r2 == 0) goto Lf
            io.appmetrica.analytics.impl.q7 r0 = new io.appmetrica.analytics.impl.q7     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            r0.<init>()     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            io.appmetrica.analytics.protobuf.nano.MessageNano r2 = io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(r0, r2)     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            io.appmetrica.analytics.impl.q7 r2 = (io.appmetrica.analytics.impl.C34825q7) r2     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            if (r2 != 0) goto L1a
        Lf:
            io.appmetrica.analytics.impl.q7 r2 = new io.appmetrica.analytics.impl.q7     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            r2.<init>()     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            goto L1a
        L15:
            io.appmetrica.analytics.impl.q7 r2 = new io.appmetrica.analytics.impl.q7
            r2.<init>()
        L1a:
            io.appmetrica.analytics.impl.r7 r0 = r1.f95323a
            io.appmetrica.analytics.impl.t7 r2 = r0.toModel(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C34877s7.toModel(byte[]):io.appmetrica.analytics.impl.t7");
    }

    public /* synthetic */ C34877s7(C34851r7 c34851r7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C34851r7(null, 1, null) : c34851r7);
    }
}
