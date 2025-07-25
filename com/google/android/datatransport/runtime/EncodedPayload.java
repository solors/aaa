package com.google.android.datatransport.runtime;

import androidx.annotation.NonNull;
import com.google.android.datatransport.Encoding;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class EncodedPayload {

    /* renamed from: a */
    private final Encoding f31050a;

    /* renamed from: b */
    private final byte[] f31051b;

    public EncodedPayload(@NonNull Encoding encoding, @NonNull byte[] bArr) {
        if (encoding != null) {
            if (bArr != null) {
                this.f31050a = encoding;
                this.f31051b = bArr;
                return;
            }
            throw new NullPointerException("bytes is null");
        }
        throw new NullPointerException("encoding is null");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EncodedPayload)) {
            return false;
        }
        EncodedPayload encodedPayload = (EncodedPayload) obj;
        if (!this.f31050a.equals(encodedPayload.f31050a)) {
            return false;
        }
        return Arrays.equals(this.f31051b, encodedPayload.f31051b);
    }

    public byte[] getBytes() {
        return this.f31051b;
    }

    public Encoding getEncoding() {
        return this.f31050a;
    }

    public int hashCode() {
        return ((this.f31050a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f31051b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f31050a + ", bytes=[...]}";
    }
}
