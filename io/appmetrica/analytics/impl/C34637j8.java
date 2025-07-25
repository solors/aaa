package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.j8 */
/* loaded from: classes9.dex */
public final class C34637j8 extends MessageNano {

    /* renamed from: c */
    public static volatile C34637j8[] f94685c;

    /* renamed from: a */
    public byte[] f94686a;

    /* renamed from: b */
    public byte[] f94687b;

    public C34637j8() {
        m21524a();
    }

    /* renamed from: b */
    public static C34637j8[] m21521b() {
        if (f94685c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f94685c == null) {
                    f94685c = new C34637j8[0];
                }
            }
        }
        return f94685c;
    }

    /* renamed from: a */
    public final C34637j8 m21524a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f94686a = bArr;
        this.f94687b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f94686a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f94686a);
        }
        if (!Arrays.equals(this.f94687b, bArr2)) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f94687b);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f94686a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f94686a);
        }
        if (!Arrays.equals(this.f94687b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f94687b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34637j8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f94686a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f94687b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    /* renamed from: b */
    public static C34637j8 m21520b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34637j8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34637j8 m21522a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34637j8) MessageNano.mergeFrom(new C34637j8(), bArr);
    }
}
