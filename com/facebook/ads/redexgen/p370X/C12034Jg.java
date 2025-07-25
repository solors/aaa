package com.facebook.ads.redexgen.p370X;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.Jg */
/* loaded from: assets/audience_network.dex */
public final class C12034Jg {
    public final AdErrorType A00;
    public final String A01;

    public C12034Jg(int i, String str) {
        this(AdErrorType.adErrorTypeFromCode(i), str);
    }

    public C12034Jg(AdErrorType adErrorType, String str) {
        str = TextUtils.isEmpty(str) ? adErrorType.getDefaultErrorMessage() : str;
        this.A00 = adErrorType;
        this.A01 = str;
    }

    public static C12034Jg A00(AdErrorType adErrorType) {
        return new C12034Jg(adErrorType, (String) null);
    }

    public static C12034Jg A01(AdErrorType adErrorType, String str) {
        return new C12034Jg(adErrorType, str);
    }

    public static C12034Jg A02(C12035Jh c12035Jh) {
        return new C12034Jg(c12035Jh.A00(), c12035Jh.A01());
    }

    public final AdErrorType A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }
}
