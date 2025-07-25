package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.yl */
/* loaded from: classes9.dex */
public final class C35047yl extends MessageNano {

    /* renamed from: c */
    public static volatile C35047yl[] f95662c;

    /* renamed from: a */
    public long f95663a;

    /* renamed from: b */
    public long f95664b;

    public C35047yl() {
        m20735a();
    }

    /* renamed from: b */
    public static C35047yl[] m20732b() {
        if (f95662c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f95662c == null) {
                    f95662c = new C35047yl[0];
                }
            }
        }
        return f95662c;
    }

    /* renamed from: a */
    public final C35047yl m20735a() {
        this.f95663a = 86400L;
        this.f95664b = 432000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt64Size(2, this.f95664b) + CodedOutputByteBufferNano.computeInt64Size(1, this.f95663a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt64(1, this.f95663a);
        codedOutputByteBufferNano.writeInt64(2, this.f95664b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C35047yl mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f95663a = codedInputByteBufferNano.readInt64();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f95664b = codedInputByteBufferNano.readInt64();
            }
        }
    }

    /* renamed from: b */
    public static C35047yl m20731b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C35047yl().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C35047yl m20733a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C35047yl) MessageNano.mergeFrom(new C35047yl(), bArr);
    }
}
