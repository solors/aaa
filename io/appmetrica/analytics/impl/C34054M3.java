package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.M3 */
/* loaded from: classes9.dex */
public final class C34054M3 extends MessageNano {

    /* renamed from: c */
    public static volatile C34054M3[] f93202c;

    /* renamed from: a */
    public C34102O3 f93203a;

    /* renamed from: b */
    public int f93204b;

    public C34054M3() {
        m22458a();
    }

    /* renamed from: b */
    public static C34054M3[] m22455b() {
        if (f93202c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f93202c == null) {
                    f93202c = new C34054M3[0];
                }
            }
        }
        return f93202c;
    }

    /* renamed from: a */
    public final C34054M3 m22458a() {
        this.f93203a = null;
        this.f93204b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C34102O3 c34102o3 = this.f93203a;
        if (c34102o3 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c34102o3);
        }
        int i = this.f93204b;
        if (i != 0) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C34102O3 c34102o3 = this.f93203a;
        if (c34102o3 != null) {
            codedOutputByteBufferNano.writeMessage(1, c34102o3);
        }
        int i = this.f93204b;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(2, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34054M3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f93203a == null) {
                    this.f93203a = new C34102O3();
                }
                codedInputByteBufferNano.readMessage(this.f93203a);
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f93204b = readInt32;
                }
            }
        }
    }

    /* renamed from: b */
    public static C34054M3 m22454b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34054M3().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34054M3 m22456a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34054M3) MessageNano.mergeFrom(new C34054M3(), bArr);
    }
}
