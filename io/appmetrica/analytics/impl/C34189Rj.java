package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.Rj */
/* loaded from: classes9.dex */
public final class C34189Rj extends MessageNano {

    /* renamed from: c */
    public static volatile C34189Rj[] f93452c;

    /* renamed from: a */
    public byte[] f93453a;

    /* renamed from: b */
    public byte[] f93454b;

    public C34189Rj() {
        m22311a();
    }

    /* renamed from: b */
    public static C34189Rj[] m22308b() {
        if (f93452c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f93452c == null) {
                    f93452c = new C34189Rj[0];
                }
            }
        }
        return f93452c;
    }

    /* renamed from: a */
    public final C34189Rj m22311a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f93453a = bArr;
        this.f93454b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f93453a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f93453a);
        }
        if (!Arrays.equals(this.f93454b, bArr2)) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f93454b);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f93453a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f93453a);
        }
        if (!Arrays.equals(this.f93454b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f93454b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34189Rj mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f93453a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f93454b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    /* renamed from: b */
    public static C34189Rj m22307b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34189Rj().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34189Rj m22309a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34189Rj) MessageNano.mergeFrom(new C34189Rj(), bArr);
    }
}
