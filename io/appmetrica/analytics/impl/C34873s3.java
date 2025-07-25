package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.s3 */
/* loaded from: classes9.dex */
public class C34873s3 implements InterfaceC34899t3 {

    /* renamed from: a */
    public final int f95318a;

    public C34873s3(int i) {
        this.f95318a = i;
    }

    /* renamed from: a */
    public static InterfaceC34899t3 m20985a(InterfaceC34899t3... interfaceC34899t3Arr) {
        return new C34873s3(m20984b(interfaceC34899t3Arr));
    }

    /* renamed from: b */
    public static int m20984b(InterfaceC34899t3... interfaceC34899t3Arr) {
        int i = 0;
        for (InterfaceC34899t3 interfaceC34899t3 : interfaceC34899t3Arr) {
            if (interfaceC34899t3 != null) {
                i = interfaceC34899t3.getBytesTruncated() + i;
            }
        }
        return i;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34899t3
    public final int getBytesTruncated() {
        return this.f95318a;
    }

    public String toString() {
        return "BytesTruncatedInfo{bytesTruncated=" + this.f95318a + '}';
    }
}
