package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.gn */
/* loaded from: classes9.dex */
public final class C34571gn extends MessageNano {

    /* renamed from: e */
    public static volatile C34571gn[] f94477e;

    /* renamed from: a */
    public byte[] f94478a;

    /* renamed from: b */
    public double f94479b;

    /* renamed from: c */
    public double f94480c;

    /* renamed from: d */
    public boolean f94481d;

    public C34571gn() {
        m21646a();
    }

    /* renamed from: b */
    public static C34571gn[] m21643b() {
        if (f94477e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f94477e == null) {
                    f94477e = new C34571gn[0];
                }
            }
        }
        return f94477e;
    }

    /* renamed from: a */
    public final C34571gn m21646a() {
        this.f94478a = WireFormatNano.EMPTY_BYTES;
        this.f94479b = 0.0d;
        this.f94480c = 0.0d;
        this.f94481d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f94478a, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f94478a);
        }
        if (Double.doubleToLongBits(this.f94479b) != Double.doubleToLongBits(0.0d)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(2, this.f94479b);
        }
        if (Double.doubleToLongBits(this.f94480c) != Double.doubleToLongBits(0.0d)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(3, this.f94480c);
        }
        boolean z = this.f94481d;
        if (z) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(4, z);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f94478a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f94478a);
        }
        if (Double.doubleToLongBits(this.f94479b) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.writeDouble(2, this.f94479b);
        }
        if (Double.doubleToLongBits(this.f94480c) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.writeDouble(3, this.f94480c);
        }
        boolean z = this.f94481d;
        if (z) {
            codedOutputByteBufferNano.writeBool(4, z);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34571gn mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f94478a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 17) {
                this.f94479b = codedInputByteBufferNano.readDouble();
            } else if (readTag == 25) {
                this.f94480c = codedInputByteBufferNano.readDouble();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f94481d = codedInputByteBufferNano.readBool();
            }
        }
    }

    /* renamed from: b */
    public static C34571gn m21642b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34571gn().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34571gn m21644a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34571gn) MessageNano.mergeFrom(new C34571gn(), bArr);
    }
}
