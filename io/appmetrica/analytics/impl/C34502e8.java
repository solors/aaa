package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.e8 */
/* loaded from: classes9.dex */
public final class C34502e8 extends MessageNano {

    /* renamed from: b */
    public static volatile C34502e8[] f94244b;

    /* renamed from: a */
    public byte[][] f94245a;

    public C34502e8() {
        m21800a();
    }

    /* renamed from: b */
    public static C34502e8[] m21797b() {
        if (f94244b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f94244b == null) {
                    f94244b = new C34502e8[0];
                }
            }
        }
        return f94244b;
    }

    /* renamed from: a */
    public final C34502e8 m21800a() {
        this.f94245a = WireFormatNano.EMPTY_BYTES_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[][] bArr = this.f94245a;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                byte[][] bArr2 = this.f94245a;
                if (i < bArr2.length) {
                    byte[] bArr3 = bArr2[i];
                    if (bArr3 != null) {
                        i3++;
                        i2 = CodedOutputByteBufferNano.computeBytesSizeNoTag(bArr3) + i2;
                    }
                    i++;
                } else {
                    return computeSerializedSize + i2 + i3;
                }
            }
        } else {
            return computeSerializedSize;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[][] bArr = this.f94245a;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            while (true) {
                byte[][] bArr2 = this.f94245a;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    codedOutputByteBufferNano.writeBytes(1, bArr3);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34502e8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                byte[][] bArr = this.f94245a;
                int length = bArr == null ? 0 : bArr.length;
                int i = repeatedFieldArrayLength + length;
                byte[][] bArr2 = new byte[i];
                if (length != 0) {
                    System.arraycopy(bArr, 0, bArr2, 0, length);
                }
                while (length < i - 1) {
                    bArr2[length] = codedInputByteBufferNano.readBytes();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                bArr2[length] = codedInputByteBufferNano.readBytes();
                this.f94245a = bArr2;
            }
        }
    }

    /* renamed from: b */
    public static C34502e8 m21796b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34502e8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34502e8 m21798a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34502e8) MessageNano.mergeFrom(new C34502e8(), bArr);
    }
}
