package com.taurusx.tax.api;

import com.taurusx.tax.C28162a;
import p692h2.StringFogImpl;

/* loaded from: classes7.dex */
public class TaurusXAdError {
    public static final int ERROR_CODE_DOWNLOAD_ERROR = 9;
    public static final int ERROR_CODE_INTERNAL_ERROR = 7;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_CONTENT = 6;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int ERROR_CODE_PARSE_ERROR = 8;
    public static final int ERROR_CODE_SHOW = 5;
    public static final int ERROR_CODE_TIMEOUT = 4;

    /* renamed from: a */
    public final int f73051a;

    /* renamed from: b */
    public final String f73052b;

    public TaurusXAdError(int i, String str) {
        this.f73051a = i;
        this.f73052b = str;
    }

    public static TaurusXAdError downloadError(String str) {
        return new TaurusXAdError(9, str);
    }

    public static TaurusXAdError internalError(String str) {
        return new TaurusXAdError(7, str);
    }

    public static TaurusXAdError invalidRequest(String str) {
        return new TaurusXAdError(1, str);
    }

    public static TaurusXAdError networkError(String str) {
        return new TaurusXAdError(2, str);
    }

    public static TaurusXAdError noContent(String str) {
        return new TaurusXAdError(6, str);
    }

    public static TaurusXAdError noFill(String str) {
        return new TaurusXAdError(3, str);
    }

    public static TaurusXAdError parseError(String str) {
        return new TaurusXAdError(8, str);
    }

    public static TaurusXAdError showFailedError(String str) {
        return new TaurusXAdError(5, str);
    }

    public static TaurusXAdError timeOut(String str) {
        return new TaurusXAdError(4, str);
    }

    public int getCode() {
        return this.f73051a;
    }

    public String getMessage() {
        return this.f73052b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        StringFogImpl stringFogImpl = C28162a.f73047a;
        sb2.append(stringFogImpl.m23824a(new byte[]{3, -85, 52, -74, 52, -102, 41, -67, 35, -7, 47, -86, 102}, new byte[]{70, -39}));
        sb2.append(this.f73051a);
        sb2.append(stringFogImpl.m23824a(new byte[]{4, -30, 101, -89, 91, -79, 91, -93, 79, -89, 8, -85, 91, -30}, new byte[]{40, -62}));
        sb2.append(getMessage());
        return sb2.toString();
    }
}
