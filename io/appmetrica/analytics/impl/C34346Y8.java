package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.Y8 */
/* loaded from: classes9.dex */
public final class C34346Y8 extends MessageNano {

    /* renamed from: j */
    public static final int f93807j = 0;

    /* renamed from: k */
    public static final int f93808k = 1;

    /* renamed from: l */
    public static final int f93809l = 2;

    /* renamed from: m */
    public static volatile C34346Y8[] f93810m;

    /* renamed from: a */
    public double f93811a;

    /* renamed from: b */
    public double f93812b;

    /* renamed from: c */
    public long f93813c;

    /* renamed from: d */
    public int f93814d;

    /* renamed from: e */
    public int f93815e;

    /* renamed from: f */
    public int f93816f;

    /* renamed from: g */
    public int f93817g;

    /* renamed from: h */
    public int f93818h;

    /* renamed from: i */
    public String f93819i;

    public C34346Y8() {
        m22072a();
    }

    /* renamed from: b */
    public static C34346Y8[] m22069b() {
        if (f93810m == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f93810m == null) {
                    f93810m = new C34346Y8[0];
                }
            }
        }
        return f93810m;
    }

    /* renamed from: a */
    public final C34346Y8 m22072a() {
        this.f93811a = 0.0d;
        this.f93812b = 0.0d;
        this.f93813c = 0L;
        this.f93814d = 0;
        this.f93815e = 0;
        this.f93816f = 0;
        this.f93817g = 0;
        this.f93818h = 0;
        this.f93819i = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeDoubleSize = CodedOutputByteBufferNano.computeDoubleSize(2, this.f93812b) + CodedOutputByteBufferNano.computeDoubleSize(1, this.f93811a) + super.computeSerializedSize();
        long j = this.f93813c;
        if (j != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeUInt64Size(3, j);
        }
        int i = this.f93814d;
        if (i != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(4, i);
        }
        int i2 = this.f93815e;
        if (i2 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(5, i2);
        }
        int i3 = this.f93816f;
        if (i3 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(6, i3);
        }
        int i4 = this.f93817g;
        if (i4 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(7, i4);
        }
        int i5 = this.f93818h;
        if (i5 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(8, i5);
        }
        if (!this.f93819i.equals("")) {
            return computeDoubleSize + CodedOutputByteBufferNano.computeStringSize(9, this.f93819i);
        }
        return computeDoubleSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeDouble(1, this.f93811a);
        codedOutputByteBufferNano.writeDouble(2, this.f93812b);
        long j = this.f93813c;
        if (j != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j);
        }
        int i = this.f93814d;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(4, i);
        }
        int i2 = this.f93815e;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i2);
        }
        int i3 = this.f93816f;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeUInt32(6, i3);
        }
        int i4 = this.f93817g;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(7, i4);
        }
        int i5 = this.f93818h;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeInt32(8, i5);
        }
        if (!this.f93819i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.f93819i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C34346Y8 m22068b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34346Y8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34346Y8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 9) {
                this.f93811a = codedInputByteBufferNano.readDouble();
            } else if (readTag == 17) {
                this.f93812b = codedInputByteBufferNano.readDouble();
            } else if (readTag == 24) {
                this.f93813c = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 32) {
                this.f93814d = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 40) {
                this.f93815e = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 48) {
                this.f93816f = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 56) {
                this.f93817g = codedInputByteBufferNano.readInt32();
            } else if (readTag == 64) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f93818h = readInt32;
                }
            } else if (readTag != 74) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f93819i = codedInputByteBufferNano.readString();
            }
        }
    }

    /* renamed from: a */
    public static C34346Y8 m22070a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34346Y8) MessageNano.mergeFrom(new C34346Y8(), bArr);
    }
}
