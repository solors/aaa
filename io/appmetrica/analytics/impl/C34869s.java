package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.s */
/* loaded from: classes9.dex */
public final class C34869s extends MessageNano {

    /* renamed from: c */
    public static volatile C34869s[] f95310c;

    /* renamed from: a */
    public long f95311a;

    /* renamed from: b */
    public int f95312b;

    public C34869s() {
        m20996a();
    }

    /* renamed from: b */
    public static C34869s[] m20993b() {
        if (f95310c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f95310c == null) {
                    f95310c = new C34869s[0];
                }
            }
        }
        return f95310c;
    }

    /* renamed from: a */
    public final C34869s m20996a() {
        this.f95311a = 0L;
        this.f95312b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j = this.f95311a;
        if (j != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j);
        }
        int i = this.f95312b;
        if (i != 0) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j = this.f95311a;
        if (j != 0) {
            codedOutputByteBufferNano.writeInt64(1, j);
        }
        int i = this.f95312b;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(2, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34869s mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f95311a = codedInputByteBufferNano.readInt64();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f95312b = codedInputByteBufferNano.readInt32();
            }
        }
    }

    /* renamed from: b */
    public static C34869s m20992b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34869s().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34869s m20994a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34869s) MessageNano.mergeFrom(new C34869s(), bArr);
    }
}
