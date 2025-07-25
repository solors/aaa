package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.p8 */
/* loaded from: classes9.dex */
public final class C34799p8 extends MessageNano {

    /* renamed from: e */
    public static volatile C34799p8[] f95164e;

    /* renamed from: a */
    public byte[] f95165a;

    /* renamed from: b */
    public C34502e8 f95166b;

    /* renamed from: c */
    public byte[] f95167c;

    /* renamed from: d */
    public C34664k8 f95168d;

    public C34799p8() {
        m21167a();
    }

    /* renamed from: b */
    public static C34799p8[] m21164b() {
        if (f95164e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f95164e == null) {
                    f95164e = new C34799p8[0];
                }
            }
        }
        return f95164e;
    }

    /* renamed from: a */
    public final C34799p8 m21167a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f95165a = bArr;
        this.f95166b = null;
        this.f95167c = bArr;
        this.f95168d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f95165a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f95165a);
        }
        C34502e8 c34502e8 = this.f95166b;
        if (c34502e8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c34502e8);
        }
        if (!Arrays.equals(this.f95167c, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f95167c);
        }
        C34664k8 c34664k8 = this.f95168d;
        if (c34664k8 != null) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(4, c34664k8);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f95165a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f95165a);
        }
        C34502e8 c34502e8 = this.f95166b;
        if (c34502e8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c34502e8);
        }
        if (!Arrays.equals(this.f95167c, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f95167c);
        }
        C34664k8 c34664k8 = this.f95168d;
        if (c34664k8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c34664k8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34799p8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f95165a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                if (this.f95166b == null) {
                    this.f95166b = new C34502e8();
                }
                codedInputByteBufferNano.readMessage(this.f95166b);
            } else if (readTag == 26) {
                this.f95167c = codedInputByteBufferNano.readBytes();
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f95168d == null) {
                    this.f95168d = new C34664k8();
                }
                codedInputByteBufferNano.readMessage(this.f95168d);
            }
        }
    }

    /* renamed from: b */
    public static C34799p8 m21163b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34799p8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34799p8 m21165a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34799p8) MessageNano.mergeFrom(new C34799p8(), bArr);
    }
}
