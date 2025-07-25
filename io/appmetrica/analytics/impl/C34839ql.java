package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.ql */
/* loaded from: classes9.dex */
public final class C34839ql extends MessageNano {

    /* renamed from: c */
    public static volatile C34839ql[] f95242c;

    /* renamed from: a */
    public String f95243a;

    /* renamed from: b */
    public C34812pl f95244b;

    public C34839ql() {
        m21071a();
    }

    /* renamed from: b */
    public static C34839ql[] m21068b() {
        if (f95242c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f95242c == null) {
                    f95242c = new C34839ql[0];
                }
            }
        }
        return f95242c;
    }

    /* renamed from: a */
    public final C34839ql m21071a() {
        this.f95243a = "";
        this.f95244b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f95243a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f95243a);
        }
        C34812pl c34812pl = this.f95244b;
        if (c34812pl != null) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c34812pl);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f95243a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f95243a);
        }
        C34812pl c34812pl = this.f95244b;
        if (c34812pl != null) {
            codedOutputByteBufferNano.writeMessage(2, c34812pl);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34839ql mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f95243a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f95244b == null) {
                    this.f95244b = new C34812pl();
                }
                codedInputByteBufferNano.readMessage(this.f95244b);
            }
        }
    }

    /* renamed from: b */
    public static C34839ql m21067b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34839ql().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34839ql m21069a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34839ql) MessageNano.mergeFrom(new C34839ql(), bArr);
    }
}
