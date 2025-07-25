package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.X1 */
/* loaded from: classes9.dex */
public final class C34315X1 extends MessageNano {

    /* renamed from: c */
    public static final int f93668c = 0;

    /* renamed from: d */
    public static final int f93669d = 1;

    /* renamed from: e */
    public static final int f93670e = 2;

    /* renamed from: f */
    public static final int f93671f = 3;

    /* renamed from: g */
    public static final int f93672g = 4;

    /* renamed from: h */
    public static final int f93673h = 5;

    /* renamed from: i */
    public static final int f93674i = -1;

    /* renamed from: j */
    public static final int f93675j = 0;

    /* renamed from: k */
    public static final int f93676k = 1;

    /* renamed from: l */
    public static volatile C34315X1[] f93677l;

    /* renamed from: a */
    public int f93678a;

    /* renamed from: b */
    public int f93679b;

    public C34315X1() {
        m22126a();
    }

    /* renamed from: b */
    public static C34315X1[] m22123b() {
        if (f93677l == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f93677l == null) {
                    f93677l = new C34315X1[0];
                }
            }
        }
        return f93677l;
    }

    /* renamed from: a */
    public final C34315X1 m22126a() {
        this.f93678a = 0;
        this.f93679b = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt32Size(3, this.f93679b) + CodedOutputByteBufferNano.computeInt32Size(2, this.f93678a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt32(2, this.f93678a);
        codedOutputByteBufferNano.writeInt32(3, this.f93679b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34315X1 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 16) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3 || readInt32 == 4 || readInt32 == 5) {
                    this.f93678a = readInt32;
                }
            } else if (readTag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt322 = codedInputByteBufferNano.readInt32();
                if (readInt322 == -1 || readInt322 == 0 || readInt322 == 1) {
                    this.f93679b = readInt322;
                }
            }
        }
    }

    /* renamed from: b */
    public static C34315X1 m22122b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34315X1().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34315X1 m22124a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34315X1) MessageNano.mergeFrom(new C34315X1(), bArr);
    }
}
