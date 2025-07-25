package io.appmetrica.analytics.impl;

import com.inmobi.commons.core.configs.AdConfig;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.sl */
/* loaded from: classes9.dex */
public final class C34891sl extends MessageNano {

    /* renamed from: c */
    public static volatile C34891sl[] f95337c;

    /* renamed from: a */
    public int f95338a;

    /* renamed from: b */
    public int f95339b;

    public C34891sl() {
        m20968a();
    }

    /* renamed from: b */
    public static C34891sl[] m20965b() {
        if (f95337c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f95337c == null) {
                    f95337c = new C34891sl[0];
                }
            }
        }
        return f95337c;
    }

    /* renamed from: a */
    public final C34891sl m20968a() {
        this.f95338a = AdConfig.DEFAULT_CONTEXTUAL_DATA_EXPIRY_TIME;
        this.f95339b = AdConfig.DEFAULT_CONTEXTUAL_DATA_EXPIRY_TIME;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f95338a;
        if (i != 86400) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i);
        }
        int i2 = this.f95339b;
        if (i2 != 86400) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i2);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f95338a;
        if (i != 86400) {
            codedOutputByteBufferNano.writeInt32(1, i);
        }
        int i2 = this.f95339b;
        if (i2 != 86400) {
            codedOutputByteBufferNano.writeInt32(2, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34891sl mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f95338a = codedInputByteBufferNano.readInt32();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f95339b = codedInputByteBufferNano.readInt32();
            }
        }
    }

    /* renamed from: b */
    public static C34891sl m20964b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34891sl().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34891sl m20966a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34891sl) MessageNano.mergeFrom(new C34891sl(), bArr);
    }
}
