package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.o8 */
/* loaded from: classes9.dex */
public final class C34772o8 extends MessageNano {

    /* renamed from: d */
    public static volatile C34772o8[] f95100d;

    /* renamed from: a */
    public byte[] f95101a;

    /* renamed from: b */
    public byte[] f95102b;

    /* renamed from: c */
    public C34799p8 f95103c;

    public C34772o8() {
        m21223a();
    }

    /* renamed from: b */
    public static C34772o8[] m21220b() {
        if (f95100d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f95100d == null) {
                    f95100d = new C34772o8[0];
                }
            }
        }
        return f95100d;
    }

    /* renamed from: a */
    public final C34772o8 m21223a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f95101a = bArr;
        this.f95102b = bArr;
        this.f95103c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f95101a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f95101a);
        }
        if (!Arrays.equals(this.f95102b, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f95102b);
        }
        C34799p8 c34799p8 = this.f95103c;
        if (c34799p8 != null) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, c34799p8);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f95101a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f95101a);
        }
        if (!Arrays.equals(this.f95102b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f95102b);
        }
        C34799p8 c34799p8 = this.f95103c;
        if (c34799p8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c34799p8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34772o8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f95101a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                this.f95102b = codedInputByteBufferNano.readBytes();
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f95103c == null) {
                    this.f95103c = new C34799p8();
                }
                codedInputByteBufferNano.readMessage(this.f95103c);
            }
        }
    }

    /* renamed from: b */
    public static C34772o8 m21219b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34772o8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34772o8 m21221a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34772o8) MessageNano.mergeFrom(new C34772o8(), bArr);
    }
}
