package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.bi */
/* loaded from: classes9.dex */
public final class C34431bi extends MessageNano {

    /* renamed from: c */
    public static final int f94030c = 0;

    /* renamed from: d */
    public static final int f94031d = 1;

    /* renamed from: e */
    public static final int f94032e = 2;

    /* renamed from: f */
    public static final int f94033f = 3;

    /* renamed from: g */
    public static final int f94034g = 4;

    /* renamed from: h */
    public static volatile C34431bi[] f94035h;

    /* renamed from: a */
    public int f94036a;

    /* renamed from: b */
    public int f94037b;

    public C34431bi() {
        m21930a();
    }

    /* renamed from: b */
    public static C34431bi[] m21927b() {
        if (f94035h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f94035h == null) {
                    f94035h = new C34431bi[0];
                }
            }
        }
        return f94035h;
    }

    /* renamed from: a */
    public final C34431bi m21930a() {
        this.f94036a = 0;
        this.f94037b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f94036a;
        if (i != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i);
        }
        int i2 = this.f94037b;
        if (i2 != 0) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i2);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f94036a;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i);
        }
        int i2 = this.f94037b;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34431bi mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f94036a = codedInputByteBufferNano.readUInt32();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3 || readInt32 == 4) {
                    this.f94037b = readInt32;
                }
            }
        }
    }

    /* renamed from: b */
    public static C34431bi m21926b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34431bi().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34431bi m21928a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34431bi) MessageNano.mergeFrom(new C34431bi(), bArr);
    }
}
