package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.Y1 */
/* loaded from: classes9.dex */
public final class C34339Y1 extends MessageNano {

    /* renamed from: c */
    public static volatile C34339Y1[] f93790c;

    /* renamed from: a */
    public String f93791a;

    /* renamed from: b */
    public boolean f93792b;

    public C34339Y1() {
        m22086a();
    }

    /* renamed from: b */
    public static C34339Y1[] m22083b() {
        if (f93790c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f93790c == null) {
                    f93790c = new C34339Y1[0];
                }
            }
        }
        return f93790c;
    }

    /* renamed from: a */
    public final C34339Y1 m22086a() {
        this.f93791a = "";
        this.f93792b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeBoolSize(2, this.f93792b) + CodedOutputByteBufferNano.computeStringSize(1, this.f93791a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f93791a);
        codedOutputByteBufferNano.writeBool(2, this.f93792b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34339Y1 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f93791a = codedInputByteBufferNano.readString();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f93792b = codedInputByteBufferNano.readBool();
            }
        }
    }

    /* renamed from: b */
    public static C34339Y1 m22082b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34339Y1().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34339Y1 m22084a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34339Y1) MessageNano.mergeFrom(new C34339Y1(), bArr);
    }
}
