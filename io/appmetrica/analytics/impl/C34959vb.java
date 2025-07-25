package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.vb */
/* loaded from: classes9.dex */
public final class C34959vb extends MessageNano {

    /* renamed from: f */
    public static volatile C34959vb[] f95510f;

    /* renamed from: a */
    public String f95511a;

    /* renamed from: b */
    public String f95512b;

    /* renamed from: c */
    public boolean f95513c;

    /* renamed from: d */
    public String f95514d;

    /* renamed from: e */
    public String f95515e;

    public C34959vb() {
        m20876a();
    }

    /* renamed from: b */
    public static C34959vb[] m20873b() {
        if (f95510f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f95510f == null) {
                    f95510f = new C34959vb[0];
                }
            }
        }
        return f95510f;
    }

    /* renamed from: a */
    public final C34959vb m20876a() {
        this.f95511a = "";
        this.f95512b = "";
        this.f95513c = false;
        this.f95514d = "";
        this.f95515e = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f95511a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f95511a);
        }
        if (!this.f95512b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(19, this.f95512b);
        }
        boolean z = this.f95513c;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(22, z);
        }
        if (!this.f95514d.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(25, this.f95514d);
        }
        if (!this.f95515e.equals("")) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(26, this.f95515e);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f95511a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f95511a);
        }
        if (!this.f95512b.equals("")) {
            codedOutputByteBufferNano.writeString(19, this.f95512b);
        }
        boolean z = this.f95513c;
        if (z) {
            codedOutputByteBufferNano.writeBool(22, z);
        }
        if (!this.f95514d.equals("")) {
            codedOutputByteBufferNano.writeString(25, this.f95514d);
        }
        if (!this.f95515e.equals("")) {
            codedOutputByteBufferNano.writeString(26, this.f95515e);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C34959vb m20872b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34959vb().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34959vb mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f95511a = codedInputByteBufferNano.readString();
            } else if (readTag == 154) {
                this.f95512b = codedInputByteBufferNano.readString();
            } else if (readTag == 176) {
                this.f95513c = codedInputByteBufferNano.readBool();
            } else if (readTag == 202) {
                this.f95514d = codedInputByteBufferNano.readString();
            } else if (readTag != 210) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f95515e = codedInputByteBufferNano.readString();
            }
        }
    }

    /* renamed from: a */
    public static C34959vb m20874a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34959vb) MessageNano.mergeFrom(new C34959vb(), bArr);
    }
}
