package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.M2 */
/* loaded from: classes9.dex */
public abstract class AbstractC34053M2 implements ProtobufStateSerializer {
    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    /* renamed from: a */
    public abstract MessageNano defaultValue();

    @NonNull
    /* renamed from: a */
    public final byte[] m22459a(@NonNull MessageNano messageNano) {
        return MessageNano.toByteArray(messageNano);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    public final byte[] toByteArray(@NonNull Object obj) {
        return MessageNano.toByteArray((MessageNano) obj);
    }
}
