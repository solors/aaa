package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.c8 */
/* loaded from: classes9.dex */
public final class C34448c8 extends MessageNano {

    /* renamed from: b */
    public static volatile C34448c8[] f94081b;

    /* renamed from: a */
    public C34475d8 f94082a;

    public C34448c8() {
        m21896a();
    }

    /* renamed from: b */
    public static C34448c8[] m21893b() {
        if (f94081b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f94081b == null) {
                    f94081b = new C34448c8[0];
                }
            }
        }
        return f94081b;
    }

    /* renamed from: a */
    public final C34448c8 m21896a() {
        this.f94082a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C34475d8 c34475d8 = this.f94082a;
        if (c34475d8 != null) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(1, c34475d8);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C34475d8 c34475d8 = this.f94082a;
        if (c34475d8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c34475d8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34448c8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                if (this.f94082a == null) {
                    this.f94082a = new C34475d8();
                }
                codedInputByteBufferNano.readMessage(this.f94082a);
            }
        }
    }

    /* renamed from: b */
    public static C34448c8 m21892b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34448c8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34448c8 m21894a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34448c8) MessageNano.mergeFrom(new C34448c8(), bArr);
    }
}
