package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.b9 */
/* loaded from: classes9.dex */
public final class C34422b9 extends MessageNano {

    /* renamed from: c */
    public static volatile C34422b9[] f94019c;

    /* renamed from: a */
    public byte[] f94020a;

    /* renamed from: b */
    public byte[] f94021b;

    public C34422b9() {
        m21941a();
    }

    /* renamed from: b */
    public static C34422b9[] m21938b() {
        if (f94019c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f94019c == null) {
                    f94019c = new C34422b9[0];
                }
            }
        }
        return f94019c;
    }

    /* renamed from: a */
    public final C34422b9 m21941a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f94020a = bArr;
        this.f94021b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f94020a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f94020a);
        }
        if (!Arrays.equals(this.f94021b, bArr2)) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f94021b);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f94020a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f94020a);
        }
        if (!Arrays.equals(this.f94021b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f94021b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34422b9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f94020a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f94021b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    /* renamed from: b */
    public static C34422b9 m21937b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34422b9().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34422b9 m21939a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34422b9) MessageNano.mergeFrom(new C34422b9(), bArr);
    }
}
