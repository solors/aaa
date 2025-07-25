package com.smaato.sdk.core.dns;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.Locale;

/* renamed from: com.smaato.sdk.core.dns.h */
/* loaded from: classes7.dex */
final class DnsLabel implements CharSequence {
    @NonNull

    /* renamed from: b */
    private final String f71510b;
    @Nullable

    /* renamed from: c */
    private DnsLabel f71511c;

    /* renamed from: d */
    private byte[] f71512d;

    /* compiled from: DnsLabel.java */
    /* renamed from: com.smaato.sdk.core.dns.h$a */
    /* loaded from: classes7.dex */
    static class C27093a extends IllegalArgumentException {
        @NonNull

        /* renamed from: b */
        final String f71513b;

        C27093a(@NonNull String str) {
            this.f71513b = str;
        }
    }

    private DnsLabel(@NonNull String str) {
        this.f71510b = str;
        m39602d();
        if (this.f71512d.length <= 63) {
            return;
        }
        throw new C27093a(str);
    }

    @NonNull
    /* renamed from: b */
    public static DnsLabel m39604b(@Nullable String str) {
        if (str != null && !str.isEmpty()) {
            return new DnsLabel(str);
        }
        throw new IllegalArgumentException("Label is null or empty");
    }

    @NonNull
    /* renamed from: c */
    public static DnsLabel[] m39603c(@NonNull String[] strArr) {
        DnsLabel[] dnsLabelArr = new DnsLabel[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            dnsLabelArr[i] = m39604b(strArr[i]);
        }
        return dnsLabelArr;
    }

    /* renamed from: d */
    private void m39602d() {
        if (this.f71512d == null) {
            this.f71512d = this.f71510b.getBytes(Charset.forName("US-ASCII"));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: a */
    public final DnsLabel m39605a() {
        if (this.f71511c == null) {
            this.f71511c = m39604b(this.f71510b.toLowerCase(Locale.US));
        }
        return this.f71511c;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f71510b.charAt(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m39601e(@NonNull ByteArrayOutputStream byteArrayOutputStream) {
        m39602d();
        byteArrayOutputStream.write(this.f71512d.length);
        byte[] bArr = this.f71512d;
        byteArrayOutputStream.write(bArr, 0, bArr.length);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DnsLabel)) {
            return false;
        }
        return this.f71510b.equals(((DnsLabel) obj).f71510b);
    }

    public final int hashCode() {
        return this.f71510b.hashCode();
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f71510b.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f71510b.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public final String toString() {
        return this.f71510b;
    }
}
