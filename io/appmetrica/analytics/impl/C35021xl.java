package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.xl */
/* loaded from: classes9.dex */
public final class C35021xl extends MessageNano {

    /* renamed from: c */
    public static volatile C35021xl[] f95618c;

    /* renamed from: a */
    public String f95619a;

    /* renamed from: b */
    public byte[] f95620b;

    public C35021xl() {
        m20766a();
    }

    /* renamed from: b */
    public static C35021xl[] m20763b() {
        if (f95618c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f95618c == null) {
                    f95618c = new C35021xl[0];
                }
            }
        }
        return f95618c;
    }

    /* renamed from: a */
    public final C35021xl m20766a() {
        this.f95619a = "";
        this.f95620b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f95619a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f95619a);
        }
        if (!Arrays.equals(this.f95620b, WireFormatNano.EMPTY_BYTES)) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f95620b);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f95619a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f95619a);
        }
        if (!Arrays.equals(this.f95620b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f95620b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C35021xl mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f95619a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f95620b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    /* renamed from: b */
    public static C35021xl m20762b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C35021xl().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C35021xl m20764a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C35021xl) MessageNano.mergeFrom(new C35021xl(), bArr);
    }
}
