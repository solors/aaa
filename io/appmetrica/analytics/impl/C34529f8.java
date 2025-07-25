package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.f8 */
/* loaded from: classes9.dex */
public final class C34529f8 extends MessageNano {

    /* renamed from: c */
    public static volatile C34529f8[] f94337c;

    /* renamed from: a */
    public long f94338a;

    /* renamed from: b */
    public int f94339b;

    public C34529f8() {
        m21737a();
    }

    /* renamed from: b */
    public static C34529f8[] m21734b() {
        if (f94337c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f94337c == null) {
                    f94337c = new C34529f8[0];
                }
            }
        }
        return f94337c;
    }

    /* renamed from: a */
    public final C34529f8 m21737a() {
        this.f94338a = 0L;
        this.f94339b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j = this.f94338a;
        if (j != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j);
        }
        int i = this.f94339b;
        if (i != 0) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j = this.f94338a;
        if (j != 0) {
            codedOutputByteBufferNano.writeInt64(1, j);
        }
        int i = this.f94339b;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(2, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34529f8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f94338a = codedInputByteBufferNano.readInt64();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f94339b = codedInputByteBufferNano.readInt32();
            }
        }
    }

    /* renamed from: b */
    public static C34529f8 m21733b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34529f8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34529f8 m21735a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34529f8) MessageNano.mergeFrom(new C34529f8(), bArr);
    }
}
