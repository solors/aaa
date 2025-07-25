package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ValueEncoderContext;
import java.io.IOException;

/* loaded from: classes4.dex */
class ProtobufValueEncoderContext implements ValueEncoderContext {

    /* renamed from: a */
    private boolean f43025a = false;

    /* renamed from: b */
    private boolean f43026b = false;

    /* renamed from: c */
    private FieldDescriptor f43027c;

    /* renamed from: d */
    private final ProtobufDataEncoderContext f43028d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ProtobufValueEncoderContext(ProtobufDataEncoderContext protobufDataEncoderContext) {
        this.f43028d = protobufDataEncoderContext;
    }

    /* renamed from: a */
    private void m66825a() {
        if (!this.f43025a) {
            this.f43025a = true;
            return;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public ValueEncoderContext add(@Nullable String str) throws IOException {
        m66825a();
        this.f43028d.m66841d(this.f43027c, str, this.f43026b);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m66824b(FieldDescriptor fieldDescriptor, boolean z) {
        this.f43025a = false;
        this.f43027c = fieldDescriptor;
        this.f43026b = z;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public ValueEncoderContext add(float f) throws IOException {
        m66825a();
        this.f43028d.m66842c(this.f43027c, f, this.f43026b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public ValueEncoderContext add(double d) throws IOException {
        m66825a();
        this.f43028d.m66843b(this.f43027c, d, this.f43026b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public ValueEncoderContext add(int i) throws IOException {
        m66825a();
        this.f43028d.m66840e(this.f43027c, i, this.f43026b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public ValueEncoderContext add(long j) throws IOException {
        m66825a();
        this.f43028d.m66839f(this.f43027c, j, this.f43026b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public ValueEncoderContext add(boolean z) throws IOException {
        m66825a();
        this.f43028d.m66838g(this.f43027c, z, this.f43026b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public ValueEncoderContext add(@NonNull byte[] bArr) throws IOException {
        m66825a();
        this.f43028d.m66841d(this.f43027c, bArr, this.f43026b);
        return this;
    }
}
