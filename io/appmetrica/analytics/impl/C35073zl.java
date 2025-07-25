package io.appmetrica.analytics.impl;

import com.inmobi.commons.core.configs.AdConfig;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.zl */
/* loaded from: classes9.dex */
public final class C35073zl extends MessageNano {

    /* renamed from: b */
    public static volatile C35073zl[] f95699b;

    /* renamed from: a */
    public int f95700a;

    public C35073zl() {
        m20711a();
    }

    /* renamed from: b */
    public static C35073zl[] m20708b() {
        if (f95699b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f95699b == null) {
                    f95699b = new C35073zl[0];
                }
            }
        }
        return f95699b;
    }

    /* renamed from: a */
    public final C35073zl m20711a() {
        this.f95700a = AdConfig.DEFAULT_CONTEXTUAL_DATA_EXPIRY_TIME;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f95700a;
        if (i != 86400) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(1, i);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f95700a;
        if (i != 86400) {
            codedOutputByteBufferNano.writeUInt32(1, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C35073zl mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f95700a = codedInputByteBufferNano.readUInt32();
            }
        }
    }

    /* renamed from: a */
    public static C35073zl m20709a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C35073zl) MessageNano.mergeFrom(new C35073zl(), bArr);
    }

    /* renamed from: b */
    public static C35073zl m20707b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C35073zl().mergeFrom(codedInputByteBufferNano);
    }
}
