package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.N3 */
/* loaded from: classes9.dex */
public final class C34078N3 extends MessageNano {

    /* renamed from: c */
    public static volatile C34078N3[] f93253c;

    /* renamed from: a */
    public String f93254a;

    /* renamed from: b */
    public String f93255b;

    public C34078N3() {
        m22408a();
    }

    /* renamed from: b */
    public static C34078N3[] m22405b() {
        if (f93253c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f93253c == null) {
                    f93253c = new C34078N3[0];
                }
            }
        }
        return f93253c;
    }

    /* renamed from: a */
    public final C34078N3 m22408a() {
        this.f93254a = "";
        this.f93255b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f93254a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f93254a);
        }
        if (!this.f93255b.equals("")) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(2, this.f93255b);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f93254a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f93254a);
        }
        if (!this.f93255b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f93255b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34078N3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f93254a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f93255b = codedInputByteBufferNano.readString();
            }
        }
    }

    /* renamed from: b */
    public static C34078N3 m22404b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34078N3().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34078N3 m22406a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34078N3) MessageNano.mergeFrom(new C34078N3(), bArr);
    }
}
