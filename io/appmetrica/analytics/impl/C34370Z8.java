package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.Z8 */
/* loaded from: classes9.dex */
public final class C34370Z8 extends MessageNano {

    /* renamed from: c */
    public static volatile C34370Z8[] f93870c;

    /* renamed from: a */
    public String f93871a;

    /* renamed from: b */
    public long f93872b;

    public C34370Z8() {
        m22047a();
    }

    /* renamed from: b */
    public static C34370Z8[] m22044b() {
        if (f93870c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f93870c == null) {
                    f93870c = new C34370Z8[0];
                }
            }
        }
        return f93870c;
    }

    /* renamed from: a */
    public final C34370Z8 m22047a() {
        this.f93871a = "";
        this.f93872b = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeUInt64Size(2, this.f93872b) + CodedOutputByteBufferNano.computeStringSize(1, this.f93871a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f93871a);
        codedOutputByteBufferNano.writeUInt64(2, this.f93872b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34370Z8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f93871a = codedInputByteBufferNano.readString();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f93872b = codedInputByteBufferNano.readUInt64();
            }
        }
    }

    /* renamed from: b */
    public static C34370Z8 m22043b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34370Z8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34370Z8 m22045a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34370Z8) MessageNano.mergeFrom(new C34370Z8(), bArr);
    }
}
