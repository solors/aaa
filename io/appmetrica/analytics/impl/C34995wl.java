package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.wl */
/* loaded from: classes9.dex */
public final class C34995wl extends MessageNano {

    /* renamed from: g */
    public static volatile C34995wl[] f95568g;

    /* renamed from: a */
    public boolean f95569a;

    /* renamed from: b */
    public boolean f95570b;

    /* renamed from: c */
    public boolean f95571c;

    /* renamed from: d */
    public boolean f95572d;

    /* renamed from: e */
    public boolean f95573e;

    /* renamed from: f */
    public int f95574f;

    public C34995wl() {
        m20816a();
    }

    /* renamed from: b */
    public static C34995wl[] m20813b() {
        if (f95568g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f95568g == null) {
                    f95568g = new C34995wl[0];
                }
            }
        }
        return f95568g;
    }

    /* renamed from: a */
    public final C34995wl m20816a() {
        this.f95569a = false;
        this.f95570b = false;
        this.f95571c = false;
        this.f95572d = false;
        this.f95573e = false;
        this.f95574f = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeBoolSize = CodedOutputByteBufferNano.computeBoolSize(4, this.f95572d) + CodedOutputByteBufferNano.computeBoolSize(3, this.f95571c) + CodedOutputByteBufferNano.computeBoolSize(2, this.f95570b) + CodedOutputByteBufferNano.computeBoolSize(1, this.f95569a) + super.computeSerializedSize();
        boolean z = this.f95573e;
        if (z) {
            computeBoolSize += CodedOutputByteBufferNano.computeBoolSize(5, z);
        }
        int i = this.f95574f;
        if (i != -1) {
            return computeBoolSize + CodedOutputByteBufferNano.computeInt32Size(6, i);
        }
        return computeBoolSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBool(1, this.f95569a);
        codedOutputByteBufferNano.writeBool(2, this.f95570b);
        codedOutputByteBufferNano.writeBool(3, this.f95571c);
        codedOutputByteBufferNano.writeBool(4, this.f95572d);
        boolean z = this.f95573e;
        if (z) {
            codedOutputByteBufferNano.writeBool(5, z);
        }
        int i = this.f95574f;
        if (i != -1) {
            codedOutputByteBufferNano.writeInt32(6, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C34995wl m20812b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34995wl().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34995wl mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f95569a = codedInputByteBufferNano.readBool();
            } else if (readTag == 16) {
                this.f95570b = codedInputByteBufferNano.readBool();
            } else if (readTag == 24) {
                this.f95571c = codedInputByteBufferNano.readBool();
            } else if (readTag == 32) {
                this.f95572d = codedInputByteBufferNano.readBool();
            } else if (readTag == 40) {
                this.f95573e = codedInputByteBufferNano.readBool();
            } else if (readTag != 48) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == -1 || readInt32 == 0 || readInt32 == 1) {
                    this.f95574f = readInt32;
                }
            }
        }
    }

    /* renamed from: a */
    public static C34995wl m20814a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34995wl) MessageNano.mergeFrom(new C34995wl(), bArr);
    }
}
