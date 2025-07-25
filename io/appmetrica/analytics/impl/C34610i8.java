package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.i8 */
/* loaded from: classes9.dex */
public final class C34610i8 extends MessageNano {

    /* renamed from: b */
    public static volatile C34610i8[] f94616b;

    /* renamed from: a */
    public C34556g8 f94617a;

    public C34610i8() {
        m21550a();
    }

    /* renamed from: b */
    public static C34610i8[] m21547b() {
        if (f94616b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f94616b == null) {
                    f94616b = new C34610i8[0];
                }
            }
        }
        return f94616b;
    }

    /* renamed from: a */
    public final C34610i8 m21550a() {
        this.f94617a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C34556g8 c34556g8 = this.f94617a;
        if (c34556g8 != null) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(1, c34556g8);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C34556g8 c34556g8 = this.f94617a;
        if (c34556g8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c34556g8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34610i8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f94617a == null) {
                    this.f94617a = new C34556g8();
                }
                codedInputByteBufferNano.readMessage(this.f94617a);
            }
        }
    }

    /* renamed from: b */
    public static C34610i8 m21546b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34610i8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34610i8 m21548a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34610i8) MessageNano.mergeFrom(new C34610i8(), bArr);
    }
}
