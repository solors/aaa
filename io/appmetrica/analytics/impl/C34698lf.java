package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.lf */
/* loaded from: classes9.dex */
public final class C34698lf extends MessageNano {

    /* renamed from: e */
    public static final int f94856e = 0;

    /* renamed from: f */
    public static final int f94857f = 1;

    /* renamed from: g */
    public static final int f94858g = 2;

    /* renamed from: h */
    public static volatile C34698lf[] f94859h;

    /* renamed from: a */
    public byte[] f94860a;

    /* renamed from: b */
    public long f94861b;

    /* renamed from: c */
    public long f94862c;

    /* renamed from: d */
    public int f94863d;

    public C34698lf() {
        m21420a();
    }

    /* renamed from: b */
    public static C34698lf[] m21417b() {
        if (f94859h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f94859h == null) {
                    f94859h = new C34698lf[0];
                }
            }
        }
        return f94859h;
    }

    /* renamed from: a */
    public final C34698lf m21420a() {
        this.f94860a = WireFormatNano.EMPTY_BYTES;
        this.f94861b = 0L;
        this.f94862c = 0L;
        this.f94863d = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeBytesSize = CodedOutputByteBufferNano.computeBytesSize(1, this.f94860a) + super.computeSerializedSize();
        long j = this.f94861b;
        if (j != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeUInt64Size(2, j);
        }
        long j2 = this.f94862c;
        if (j2 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeUInt64Size(3, j2);
        }
        int i = this.f94863d;
        if (i != 0) {
            return computeBytesSize + CodedOutputByteBufferNano.computeInt32Size(4, i);
        }
        return computeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBytes(1, this.f94860a);
        long j = this.f94861b;
        if (j != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j);
        }
        long j2 = this.f94862c;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j2);
        }
        int i = this.f94863d;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(4, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34698lf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f94860a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 16) {
                this.f94861b = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 24) {
                this.f94862c = codedInputByteBufferNano.readUInt64();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f94863d = readInt32;
                }
            }
        }
    }

    /* renamed from: b */
    public static C34698lf m21416b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34698lf().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34698lf m21418a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34698lf) MessageNano.mergeFrom(new C34698lf(), bArr);
    }
}
