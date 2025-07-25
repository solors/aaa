package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.H8 */
/* loaded from: classes9.dex */
public final class C33939H8 extends MessageNano {

    /* renamed from: c */
    public static volatile C33939H8[] f92949c;

    /* renamed from: a */
    public String f92950a;

    /* renamed from: b */
    public byte[] f92951b;

    public C33939H8() {
        m22574a();
    }

    /* renamed from: b */
    public static C33939H8[] m22571b() {
        if (f92949c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f92949c == null) {
                    f92949c = new C33939H8[0];
                }
            }
        }
        return f92949c;
    }

    /* renamed from: a */
    public final C33939H8 m22574a() {
        this.f92950a = "";
        this.f92951b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f92950a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f92950a);
        }
        if (!Arrays.equals(this.f92951b, WireFormatNano.EMPTY_BYTES)) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f92951b);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f92950a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f92950a);
        }
        if (!Arrays.equals(this.f92951b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f92951b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C33939H8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f92950a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f92951b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    /* renamed from: b */
    public static C33939H8 m22570b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C33939H8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C33939H8 m22572a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C33939H8) MessageNano.mergeFrom(new C33939H8(), bArr);
    }
}
