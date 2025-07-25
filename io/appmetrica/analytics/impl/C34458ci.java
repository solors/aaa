package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.ci */
/* loaded from: classes9.dex */
public final class C34458ci extends MessageNano {

    /* renamed from: d */
    public static volatile C34458ci[] f94101d;

    /* renamed from: a */
    public boolean f94102a;

    /* renamed from: b */
    public C34431bi f94103b;

    /* renamed from: c */
    public C34404ai f94104c;

    public C34458ci() {
        m21859a();
    }

    /* renamed from: b */
    public static C34458ci[] m21856b() {
        if (f94101d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f94101d == null) {
                    f94101d = new C34458ci[0];
                }
            }
        }
        return f94101d;
    }

    /* renamed from: a */
    public final C34458ci m21859a() {
        this.f94102a = false;
        this.f94103b = null;
        this.f94104c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z = this.f94102a;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z);
        }
        C34431bi c34431bi = this.f94103b;
        if (c34431bi != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c34431bi);
        }
        C34404ai c34404ai = this.f94104c;
        if (c34404ai != null) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, c34404ai);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z = this.f94102a;
        if (z) {
            codedOutputByteBufferNano.writeBool(1, z);
        }
        C34431bi c34431bi = this.f94103b;
        if (c34431bi != null) {
            codedOutputByteBufferNano.writeMessage(2, c34431bi);
        }
        C34404ai c34404ai = this.f94104c;
        if (c34404ai != null) {
            codedOutputByteBufferNano.writeMessage(3, c34404ai);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34458ci mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f94102a = codedInputByteBufferNano.readBool();
            } else if (readTag == 18) {
                if (this.f94103b == null) {
                    this.f94103b = new C34431bi();
                }
                codedInputByteBufferNano.readMessage(this.f94103b);
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f94104c == null) {
                    this.f94104c = new C34404ai();
                }
                codedInputByteBufferNano.readMessage(this.f94104c);
            }
        }
    }

    /* renamed from: b */
    public static C34458ci m21855b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34458ci().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34458ci m21857a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34458ci) MessageNano.mergeFrom(new C34458ci(), bArr);
    }
}
