package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.cf */
/* loaded from: classes9.dex */
public final class C34455cf implements ProtobufStateStorage {

    /* renamed from: a */
    public final String f94091a;

    /* renamed from: b */
    public final IBinaryDataHelper f94092b;

    /* renamed from: c */
    public final ProtobufStateSerializer f94093c;

    /* renamed from: d */
    public final ProtobufConverter f94094d;

    public C34455cf(@NonNull String str, @NonNull IBinaryDataHelper iBinaryDataHelper, @NonNull ProtobufStateSerializer<MessageNano> protobufStateSerializer, @NonNull ProtobufConverter<Object, MessageNano> protobufConverter) {
        this.f94091a = str;
        this.f94092b = iBinaryDataHelper;
        this.f94093c = protobufStateSerializer;
        this.f94094d = protobufConverter;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final void delete() {
        this.f94092b.remove(this.f94091a);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    @NonNull
    public final Object read() {
        try {
            byte[] bArr = this.f94092b.get(this.f94091a);
            if (bArr != null && bArr.length != 0) {
                return this.f94094d.toModel((MessageNano) this.f94093c.toState(bArr));
            }
            return this.f94094d.toModel((MessageNano) this.f94093c.defaultValue());
        } catch (Throwable unused) {
            return this.f94094d.toModel((MessageNano) this.f94093c.defaultValue());
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final void save(@NonNull Object obj) {
        this.f94092b.insert(this.f94091a, this.f94093c.toByteArray((MessageNano) this.f94094d.fromModel(obj)));
    }
}
