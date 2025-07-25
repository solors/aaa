package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.d6 */
/* loaded from: classes9.dex */
public final class C34473d6 extends MessageNano {

    /* renamed from: c */
    public static volatile C34473d6[] f94144c;

    /* renamed from: a */
    public int f94145a;

    /* renamed from: b */
    public String f94146b;

    public C34473d6() {
        m21844a();
    }

    /* renamed from: b */
    public static C34473d6[] m21841b() {
        if (f94144c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f94144c == null) {
                    f94144c = new C34473d6[0];
                }
            }
        }
        return f94144c;
    }

    /* renamed from: a */
    public final C34473d6 m21844a() {
        this.f94145a = 0;
        this.f94146b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f94145a;
        if (i != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i);
        }
        if (!this.f94146b.equals("")) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(2, this.f94146b);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f94145a;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(1, i);
        }
        if (!this.f94146b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f94146b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34473d6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 3) {
                    this.f94145a = readInt32;
                }
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f94146b = codedInputByteBufferNano.readString();
            }
        }
    }

    /* renamed from: b */
    public static C34473d6 m21840b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34473d6().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34473d6 m21842a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34473d6) MessageNano.mergeFrom(new C34473d6(), bArr);
    }
}
