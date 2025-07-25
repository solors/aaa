package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.pl */
/* loaded from: classes9.dex */
public final class C34812pl extends MessageNano {

    /* renamed from: b */
    public static volatile C34812pl[] f95185b;

    /* renamed from: a */
    public String f95186a;

    public C34812pl() {
        m21140a();
    }

    /* renamed from: b */
    public static C34812pl[] m21137b() {
        if (f95185b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f95185b == null) {
                    f95185b = new C34812pl[0];
                }
            }
        }
        return f95185b;
    }

    /* renamed from: a */
    public final C34812pl m21140a() {
        this.f95186a = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f95186a.equals("")) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(1, this.f95186a);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f95186a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f95186a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34812pl mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f95186a = codedInputByteBufferNano.readString();
            }
        }
    }

    /* renamed from: a */
    public static C34812pl m21138a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34812pl) MessageNano.mergeFrom(new C34812pl(), bArr);
    }

    /* renamed from: b */
    public static C34812pl m21136b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34812pl().mergeFrom(codedInputByteBufferNano);
    }
}
