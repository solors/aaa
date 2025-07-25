package com.fyber.inneractive.sdk.protobuf;

/* renamed from: com.fyber.inneractive.sdk.protobuf.S0 */
/* loaded from: classes4.dex */
public final class C15267S0 {

    /* renamed from: a */
    public final InterfaceC15226E0 f30208a;

    /* renamed from: b */
    public final String f30209b;

    /* renamed from: c */
    public final Object[] f30210c;

    /* renamed from: d */
    public final int f30211d;

    public C15267S0(InterfaceC15226E0 interfaceC15226E0, String str, Object[] objArr) {
        char charAt;
        this.f30208a = interfaceC15226E0;
        this.f30209b = str;
        this.f30210c = objArr;
        int i = 1;
        try {
            charAt = str.charAt(0);
        } catch (StringIndexOutOfBoundsException unused) {
            char[] charArray = str.toCharArray();
            String str2 = new String(charArray);
            try {
                try {
                    charAt = str2.charAt(0);
                    str = str2;
                } catch (ArrayIndexOutOfBoundsException e) {
                    e = e;
                    throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
                } catch (StringIndexOutOfBoundsException e2) {
                    e = e2;
                    throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
                }
            } catch (StringIndexOutOfBoundsException unused2) {
                char[] cArr = new char[str2.length()];
                str2.getChars(0, str2.length(), cArr, 0);
                String str3 = new String(cArr);
                try {
                    charAt = str3.charAt(0);
                    str = str3;
                } catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e3) {
                    e = e3;
                    str2 = str3;
                    throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
                }
            }
        }
        if (charAt < 55296) {
            this.f30211d = charAt;
            return;
        }
        int i2 = charAt & 8191;
        int i3 = 13;
        while (true) {
            int i4 = i + 1;
            char charAt2 = str.charAt(i);
            if (charAt2 >= 55296) {
                i2 |= (charAt2 & 8191) << i3;
                i3 += 13;
                i = i4;
            } else {
                this.f30211d = (charAt2 << i3) | i2;
                return;
            }
        }
    }
}
