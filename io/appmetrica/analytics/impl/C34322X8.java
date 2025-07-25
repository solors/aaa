package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.X8 */
/* loaded from: classes9.dex */
public final class C34322X8 extends MessageNano {

    /* renamed from: c */
    public static volatile C34322X8[] f93720c;

    /* renamed from: a */
    public String f93721a;

    /* renamed from: b */
    public String f93722b;

    public C34322X8() {
        m22110a();
    }

    /* renamed from: b */
    public static C34322X8[] m22107b() {
        if (f93720c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f93720c == null) {
                    f93720c = new C34322X8[0];
                }
            }
        }
        return f93720c;
    }

    /* renamed from: a */
    public final C34322X8 m22110a() {
        this.f93721a = "";
        this.f93722b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeStringSize(2, this.f93722b) + CodedOutputByteBufferNano.computeStringSize(1, this.f93721a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f93721a);
        codedOutputByteBufferNano.writeString(2, this.f93722b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34322X8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f93721a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f93722b = codedInputByteBufferNano.readString();
            }
        }
    }

    /* renamed from: b */
    public static C34322X8 m22106b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34322X8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34322X8 m22108a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34322X8) MessageNano.mergeFrom(new C34322X8(), bArr);
    }
}
