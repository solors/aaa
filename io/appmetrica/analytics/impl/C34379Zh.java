package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.Zh */
/* loaded from: classes9.dex */
public final class C34379Zh extends MessageNano {

    /* renamed from: c */
    public static volatile C34379Zh[] f93891c;

    /* renamed from: a */
    public byte[] f93892a;

    /* renamed from: b */
    public byte[] f93893b;

    public C34379Zh() {
        m22033a();
    }

    /* renamed from: b */
    public static C34379Zh[] m22030b() {
        if (f93891c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f93891c == null) {
                    f93891c = new C34379Zh[0];
                }
            }
        }
        return f93891c;
    }

    /* renamed from: a */
    public final C34379Zh m22033a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f93892a = bArr;
        this.f93893b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f93892a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f93892a);
        }
        if (!Arrays.equals(this.f93893b, bArr2)) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f93893b);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f93892a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f93892a);
        }
        if (!Arrays.equals(this.f93893b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f93893b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34379Zh mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f93892a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f93893b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    /* renamed from: b */
    public static C34379Zh m22029b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34379Zh().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34379Zh m22031a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34379Zh) MessageNano.mergeFrom(new C34379Zh(), bArr);
    }
}
