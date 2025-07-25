package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.q7 */
/* loaded from: classes9.dex */
public final class C34825q7 extends MessageNano {

    /* renamed from: d */
    public static volatile C34825q7[] f95213d;

    /* renamed from: a */
    public long f95214a;

    /* renamed from: b */
    public long f95215b;

    /* renamed from: c */
    public int f95216c;

    public C34825q7() {
        m21097a();
    }

    /* renamed from: b */
    public static C34825q7[] m21094b() {
        if (f95213d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f95213d == null) {
                    f95213d = new C34825q7[0];
                }
            }
        }
        return f95213d;
    }

    /* renamed from: a */
    public final C34825q7 m21097a() {
        this.f95214a = -1L;
        this.f95215b = -1L;
        this.f95216c = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j = this.f95214a;
        if (j != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j);
        }
        long j2 = this.f95215b;
        if (j2 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(2, j2);
        }
        int i = this.f95216c;
        if (i != -1) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(3, i);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j = this.f95214a;
        if (j != -1) {
            codedOutputByteBufferNano.writeInt64(1, j);
        }
        long j2 = this.f95215b;
        if (j2 != -1) {
            codedOutputByteBufferNano.writeInt64(2, j2);
        }
        int i = this.f95216c;
        if (i != -1) {
            codedOutputByteBufferNano.writeInt32(3, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34825q7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f95214a = codedInputByteBufferNano.readInt64();
            } else if (readTag == 16) {
                this.f95215b = codedInputByteBufferNano.readInt64();
            } else if (readTag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == -1 || readInt32 == 0 || readInt32 == 1) {
                    this.f95216c = readInt32;
                }
            }
        }
    }

    /* renamed from: b */
    public static C34825q7 m21093b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34825q7().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34825q7 m21095a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34825q7) MessageNano.mergeFrom(new C34825q7(), bArr);
    }
}
