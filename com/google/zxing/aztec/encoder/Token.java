package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class Token {

    /* renamed from: b */
    static final Token f44227b = new SimpleToken(null, 0, 0);

    /* renamed from: a */
    private final Token f44228a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Token(Token token) {
        this.f44228a = token;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final Token m66081a(int i, int i2) {
        return new SimpleToken(this, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void appendTo(BitArray bitArray, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final Token m66080b(int i, int i2) {
        return new BinaryShiftToken(this, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final Token m66079c() {
        return this.f44228a;
    }
}
