package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.fn */
/* loaded from: classes9.dex */
public final class C34544fn extends MessageNano {

    /* renamed from: c */
    public static volatile C34544fn[] f94403c;

    /* renamed from: a */
    public boolean f94404a;

    /* renamed from: b */
    public boolean f94405b;

    public C34544fn() {
        m21692a();
    }

    /* renamed from: b */
    public static C34544fn[] m21689b() {
        if (f94403c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f94403c == null) {
                    f94403c = new C34544fn[0];
                }
            }
        }
        return f94403c;
    }

    /* renamed from: a */
    public final C34544fn m21692a() {
        this.f94404a = false;
        this.f94405b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z = this.f94404a;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z);
        }
        boolean z2 = this.f94405b;
        if (z2) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(2, z2);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z = this.f94404a;
        if (z) {
            codedOutputByteBufferNano.writeBool(1, z);
        }
        boolean z2 = this.f94405b;
        if (z2) {
            codedOutputByteBufferNano.writeBool(2, z2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34544fn mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f94404a = codedInputByteBufferNano.readBool();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f94405b = codedInputByteBufferNano.readBool();
            }
        }
    }

    /* renamed from: b */
    public static C34544fn m21688b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34544fn().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34544fn m21690a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34544fn) MessageNano.mergeFrom(new C34544fn(), bArr);
    }
}
