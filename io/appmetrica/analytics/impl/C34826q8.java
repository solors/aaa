package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.q8 */
/* loaded from: classes9.dex */
public final class C34826q8 extends MessageNano {

    /* renamed from: c */
    public static volatile C34826q8[] f95217c;

    /* renamed from: a */
    public C34718m8 f95218a;

    /* renamed from: b */
    public C34799p8 f95219b;

    public C34826q8() {
        m21092a();
    }

    /* renamed from: b */
    public static C34826q8[] m21089b() {
        if (f95217c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f95217c == null) {
                    f95217c = new C34826q8[0];
                }
            }
        }
        return f95217c;
    }

    /* renamed from: a */
    public final C34826q8 m21092a() {
        this.f95218a = null;
        this.f95219b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C34718m8 c34718m8 = this.f95218a;
        if (c34718m8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c34718m8);
        }
        C34799p8 c34799p8 = this.f95219b;
        if (c34799p8 != null) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c34799p8);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C34718m8 c34718m8 = this.f95218a;
        if (c34718m8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c34718m8);
        }
        C34799p8 c34799p8 = this.f95219b;
        if (c34799p8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c34799p8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34826q8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f95218a == null) {
                    this.f95218a = new C34718m8();
                }
                codedInputByteBufferNano.readMessage(this.f95218a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f95219b == null) {
                    this.f95219b = new C34799p8();
                }
                codedInputByteBufferNano.readMessage(this.f95219b);
            }
        }
    }

    /* renamed from: b */
    public static C34826q8 m21088b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34826q8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34826q8 m21090a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34826q8) MessageNano.mergeFrom(new C34826q8(), bArr);
    }
}
