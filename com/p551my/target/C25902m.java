package com.p551my.target;

import com.p551my.target.common.models.IAdLoadingError;

/* renamed from: com.my.target.m */
/* loaded from: classes7.dex */
public final class C25902m implements IAdLoadingError {

    /* renamed from: c */
    public static final C25902m f67221c = new C25902m(1000);

    /* renamed from: d */
    public static final C25902m f67222d = new C25902m(1002);

    /* renamed from: e */
    public static final C25902m f67223e = new C25902m(1003);

    /* renamed from: f */
    public static final C25902m f67224f = new C25902m(IAdLoadingError.LoadErrorType.FORBIDDEN);

    /* renamed from: g */
    public static final C25902m f67225g = new C25902m(IAdLoadingError.LoadErrorType.NOT_FOUND);

    /* renamed from: h */
    public static final C25902m f67226h = new C25902m(1500);

    /* renamed from: i */
    public static final C25902m f67227i = new C25902m(2000);

    /* renamed from: j */
    public static final C25902m f67228j = new C25902m(2001);

    /* renamed from: k */
    public static final C25902m f67229k = new C25902m(2002);

    /* renamed from: l */
    public static final C25902m f67230l = new C25902m(2003);

    /* renamed from: m */
    public static final C25902m f67231m = new C25902m(2004);

    /* renamed from: n */
    public static final C25902m f67232n = new C25902m(2005);

    /* renamed from: o */
    public static final C25902m f67233o = new C25902m(3000);

    /* renamed from: p */
    public static final C25902m f67234p = new C25902m(3001);

    /* renamed from: q */
    public static final C25902m f67235q = new C25902m(3002);

    /* renamed from: r */
    public static final C25902m f67236r = new C25902m(3003);

    /* renamed from: s */
    public static final C25902m f67237s = new C25902m(3004);

    /* renamed from: t */
    public static final C25902m f67238t = new C25902m(4001);

    /* renamed from: u */
    public static final C25902m f67239u = new C25902m(5000);

    /* renamed from: a */
    public final int f67240a;

    /* renamed from: b */
    public final String f67241b;

    public C25902m(int i) {
        this.f67240a = i;
        this.f67241b = m43495a(i);
    }

    /* renamed from: a */
    public static String m43495a(int i) {
        if (i != 1403) {
            if (i != 1404) {
                if (i != 1500) {
                    if (i != 4001) {
                        if (i != 5000) {
                            if (i != 5001) {
                                switch (i) {
                                    case 1000:
                                        return "undefined network error";
                                    case 1001:
                                        return "invalid url error";
                                    case 1002:
                                        return "hasn't network connection error";
                                    case 1003:
                                        return "request timeout error";
                                    default:
                                        switch (i) {
                                            case 2000:
                                                return "undefined parse error";
                                            case 2001:
                                                return "empty response error";
                                            case 2002:
                                                return "invalid json error";
                                            case 2003:
                                                return "invalid xml error";
                                            case 2004:
                                                return "invalid ad type error";
                                            case 2005:
                                                return "required field missed";
                                            default:
                                                switch (i) {
                                                    case 3000:
                                                        return "undefined data error";
                                                    case 3001:
                                                        return "hasn't images error";
                                                    case 3002:
                                                        return "hasn't html source error";
                                                    case 3003:
                                                        return "hasn't banners error";
                                                    case 3004:
                                                        return "invalid banner type error";
                                                    default:
                                                        return "undefined error";
                                                }
                                        }
                                }
                            }
                            return "ad not loaded from mediation network";
                        }
                        return "undefined mediation error";
                    }
                    return "reloading not allowed error";
                }
                return "internal error";
            }
            return "request not found error";
        }
        return "request forbidden error";
    }

    @Override // com.p551my.target.common.models.IAdLoadingError
    public int getCode() {
        return this.f67240a;
    }

    @Override // com.p551my.target.common.models.IAdLoadingError
    public String getMessage() {
        return this.f67241b;
    }

    public String toString() {
        return "AdLoadingError{code=" + this.f67240a + ", message='" + this.f67241b + "'}";
    }

    public C25902m(int i, String str) {
        this.f67240a = i;
        this.f67241b = str;
    }

    /* renamed from: a */
    public static C25902m m43494a(int i, String str) {
        return new C25902m(i, str);
    }
}
