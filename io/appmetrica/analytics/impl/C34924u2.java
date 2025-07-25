package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.u2 */
/* loaded from: classes9.dex */
public final class C34924u2 extends MessageNano {

    /* renamed from: f */
    public static volatile C34924u2[] f95443f;

    /* renamed from: a */
    public int f95444a;

    /* renamed from: b */
    public String f95445b;

    /* renamed from: c */
    public String f95446c;

    /* renamed from: d */
    public long f95447d;

    /* renamed from: e */
    public long f95448e;

    public C34924u2() {
        m20926a();
    }

    /* renamed from: b */
    public static C34924u2[] m20923b() {
        if (f95443f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f95443f == null) {
                    f95443f = new C34924u2[0];
                }
            }
        }
        return f95443f;
    }

    /* renamed from: a */
    public final C34924u2 m20926a() {
        this.f95444a = 1;
        this.f95445b = "";
        this.f95446c = "";
        this.f95447d = 0L;
        this.f95448e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeUInt64Size(5, this.f95448e) + CodedOutputByteBufferNano.computeUInt64Size(4, this.f95447d) + CodedOutputByteBufferNano.computeStringSize(3, this.f95446c) + CodedOutputByteBufferNano.computeStringSize(2, this.f95445b) + CodedOutputByteBufferNano.computeInt32Size(1, this.f95444a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt32(1, this.f95444a);
        codedOutputByteBufferNano.writeString(2, this.f95445b);
        codedOutputByteBufferNano.writeString(3, this.f95446c);
        codedOutputByteBufferNano.writeUInt64(4, this.f95447d);
        codedOutputByteBufferNano.writeUInt64(5, this.f95448e);
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C34924u2 m20922b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34924u2().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34924u2 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f95444a = readInt32;
                }
            } else if (readTag == 18) {
                this.f95445b = codedInputByteBufferNano.readString();
            } else if (readTag == 26) {
                this.f95446c = codedInputByteBufferNano.readString();
            } else if (readTag == 32) {
                this.f95447d = codedInputByteBufferNano.readUInt64();
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f95448e = codedInputByteBufferNano.readUInt64();
            }
        }
    }

    /* renamed from: a */
    public static C34924u2 m20924a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34924u2) MessageNano.mergeFrom(new C34924u2(), bArr);
    }
}
