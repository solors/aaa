package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.b6 */
/* loaded from: classes9.dex */
public final class C34419b6 extends MessageNano {

    /* renamed from: b */
    public static volatile C34419b6[] f94011b;

    /* renamed from: a */
    public String f94012a;

    public C34419b6() {
        m21953a();
    }

    /* renamed from: b */
    public static C34419b6[] m21950b() {
        if (f94011b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f94011b == null) {
                    f94011b = new C34419b6[0];
                }
            }
        }
        return f94011b;
    }

    /* renamed from: a */
    public final C34419b6 m21953a() {
        this.f94012a = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeStringSize(1, this.f94012a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f94012a);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34419b6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f94012a = codedInputByteBufferNano.readString();
            }
        }
    }

    /* renamed from: a */
    public static C34419b6 m21951a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34419b6) MessageNano.mergeFrom(new C34419b6(), bArr);
    }

    /* renamed from: b */
    public static C34419b6 m21949b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34419b6().mergeFrom(codedInputByteBufferNano);
    }
}
