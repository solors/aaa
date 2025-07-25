package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.s8 */
/* loaded from: classes9.dex */
public final class C34878s8 extends MessageNano {

    /* renamed from: b */
    public static volatile C34878s8[] f95324b;

    /* renamed from: a */
    public C34799p8 f95325a;

    public C34878s8() {
        m20981a();
    }

    /* renamed from: b */
    public static C34878s8[] m20978b() {
        if (f95324b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f95324b == null) {
                    f95324b = new C34878s8[0];
                }
            }
        }
        return f95324b;
    }

    /* renamed from: a */
    public final C34878s8 m20981a() {
        this.f95325a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C34799p8 c34799p8 = this.f95325a;
        if (c34799p8 != null) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(1, c34799p8);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C34799p8 c34799p8 = this.f95325a;
        if (c34799p8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c34799p8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34878s8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                if (this.f95325a == null) {
                    this.f95325a = new C34799p8();
                }
                codedInputByteBufferNano.readMessage(this.f95325a);
            }
        }
    }

    /* renamed from: b */
    public static C34878s8 m20977b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34878s8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34878s8 m20979a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34878s8) MessageNano.mergeFrom(new C34878s8(), bArr);
    }
}
