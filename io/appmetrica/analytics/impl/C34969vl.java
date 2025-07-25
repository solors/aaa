package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.vl */
/* loaded from: classes9.dex */
public final class C34969vl extends MessageNano {

    /* renamed from: b */
    public static volatile C34969vl[] f95523b;

    /* renamed from: a */
    public long f95524a;

    public C34969vl() {
        m20862a();
    }

    /* renamed from: b */
    public static C34969vl[] m20859b() {
        if (f95523b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f95523b == null) {
                    f95523b = new C34969vl[0];
                }
            }
        }
        return f95523b;
    }

    /* renamed from: a */
    public final C34969vl m20862a() {
        this.f95524a = 864000000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j = this.f95524a;
        if (j != 864000000) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(1, j);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j = this.f95524a;
        if (j != 864000000) {
            codedOutputByteBufferNano.writeInt64(1, j);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34969vl mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f95524a = codedInputByteBufferNano.readInt64();
            }
        }
    }

    /* renamed from: a */
    public static C34969vl m20860a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34969vl) MessageNano.mergeFrom(new C34969vl(), bArr);
    }

    /* renamed from: b */
    public static C34969vl m20858b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34969vl().mergeFrom(codedInputByteBufferNano);
    }
}
