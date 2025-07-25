package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.m9 */
/* loaded from: classes9.dex */
public final class C34719m9 extends MessageNano {

    /* renamed from: b */
    public static volatile C34719m9[] f94918b;

    /* renamed from: a */
    public byte[] f94919a;

    public C34719m9() {
        m21329a();
    }

    /* renamed from: b */
    public static C34719m9[] m21326b() {
        if (f94918b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f94918b == null) {
                    f94918b = new C34719m9[0];
                }
            }
        }
        return f94918b;
    }

    /* renamed from: a */
    public final C34719m9 m21329a() {
        this.f94919a = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f94919a, WireFormatNano.EMPTY_BYTES)) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(1, this.f94919a);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f94919a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f94919a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34719m9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f94919a = codedInputByteBufferNano.readBytes();
            }
        }
    }

    /* renamed from: a */
    public static C34719m9 m21327a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34719m9) MessageNano.mergeFrom(new C34719m9(), bArr);
    }

    /* renamed from: b */
    public static C34719m9 m21325b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34719m9().mergeFrom(codedInputByteBufferNano);
    }
}
