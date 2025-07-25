package io.appmetrica.analytics.impl;

import androidx.work.WorkRequest;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.Al */
/* loaded from: classes9.dex */
public final class C33777Al extends MessageNano {

    /* renamed from: b */
    public static volatile C33777Al[] f92592b;

    /* renamed from: a */
    public long f92593a;

    public C33777Al() {
        m22767a();
    }

    /* renamed from: b */
    public static C33777Al[] m22764b() {
        if (f92592b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f92592b == null) {
                    f92592b = new C33777Al[0];
                }
            }
        }
        return f92592b;
    }

    /* renamed from: a */
    public final C33777Al m22767a() {
        this.f92593a = WorkRequest.MAX_BACKOFF_MILLIS;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt64Size(1, this.f92593a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt64(1, this.f92593a);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C33777Al mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f92593a = codedInputByteBufferNano.readInt64();
            }
        }
    }

    /* renamed from: a */
    public static C33777Al m22765a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C33777Al) MessageNano.mergeFrom(new C33777Al(), bArr);
    }

    /* renamed from: b */
    public static C33777Al m22763b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C33777Al().mergeFrom(codedInputByteBufferNano);
    }
}
