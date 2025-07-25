package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.y9 */
/* loaded from: classes9.dex */
public final class C35035y9 extends MessageNano {

    /* renamed from: c */
    public static final int f95645c = 0;

    /* renamed from: d */
    public static final int f95646d = 1;

    /* renamed from: e */
    public static final int f95647e = 2;

    /* renamed from: f */
    public static final int f95648f = 3;

    /* renamed from: g */
    public static final int f95649g = 4;

    /* renamed from: h */
    public static final int f95650h = 5;

    /* renamed from: i */
    public static final int f95651i = 6;

    /* renamed from: j */
    public static volatile C35035y9[] f95652j;

    /* renamed from: a */
    public int f95653a;

    /* renamed from: b */
    public byte[] f95654b;

    public C35035y9() {
        m20749a();
    }

    /* renamed from: b */
    public static C35035y9[] m20746b() {
        if (f95652j == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f95652j == null) {
                    f95652j = new C35035y9[0];
                }
            }
        }
        return f95652j;
    }

    /* renamed from: a */
    public final C35035y9 m20749a() {
        this.f95653a = 0;
        this.f95654b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f95653a;
        if (i != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i);
        }
        if (!Arrays.equals(this.f95654b, WireFormatNano.EMPTY_BYTES)) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f95654b);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f95653a;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(1, i);
        }
        if (!Arrays.equals(this.f95654b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f95654b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C35035y9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                switch (readInt32) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        this.f95653a = readInt32;
                        continue;
                }
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f95654b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    /* renamed from: b */
    public static C35035y9 m20745b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C35035y9().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C35035y9 m20747a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C35035y9) MessageNano.mergeFrom(new C35035y9(), bArr);
    }
}
