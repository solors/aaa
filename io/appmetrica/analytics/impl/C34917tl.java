package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.tl */
/* loaded from: classes9.dex */
public final class C34917tl extends MessageNano {

    /* renamed from: b */
    public static volatile C34917tl[] f95419b;

    /* renamed from: a */
    public long f95420a;

    public C34917tl() {
        m20937a();
    }

    /* renamed from: b */
    public static C34917tl[] m20934b() {
        if (f95419b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f95419b == null) {
                    f95419b = new C34917tl[0];
                }
            }
        }
        return f95419b;
    }

    /* renamed from: a */
    public final C34917tl m20937a() {
        this.f95420a = 10000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j = this.f95420a;
        if (j != 10000) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(1, j);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j = this.f95420a;
        if (j != 10000) {
            codedOutputByteBufferNano.writeInt64(1, j);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34917tl mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f95420a = codedInputByteBufferNano.readInt64();
            }
        }
    }

    /* renamed from: a */
    public static C34917tl m20935a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34917tl) MessageNano.mergeFrom(new C34917tl(), bArr);
    }

    /* renamed from: b */
    public static C34917tl m20933b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34917tl().mergeFrom(codedInputByteBufferNano);
    }
}
