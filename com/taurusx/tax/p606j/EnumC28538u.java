package com.taurusx.tax.p606j;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.log.LogUtil;
import p692h2.StringFogImpl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.taurusx.tax.j.u */
/* loaded from: classes7.dex */
public abstract class EnumC28538u {
    public static final EnumC28538u FOLLOW_DEEP_LINK;
    public static final EnumC28538u FOLLOW_DEEP_LINK_WITH_FALLBACK;
    public static final EnumC28538u HANDLE_PHONE_SCHEME;
    public static final EnumC28538u NOOP;
    public static final EnumC28538u OPEN_APP_MARKET;
    public static final EnumC28538u OPEN_NATIVE_BROWSER;

    /* renamed from: a */
    public static final /* synthetic */ EnumC28538u[] f73995a;

    /* renamed from: com.taurusx.tax.j.u$a */
    /* loaded from: classes7.dex */
    public enum C28539a extends EnumC28538u {
        public C28539a(String str, int i) {
            super(str, i, null);
        }

        @Override // com.taurusx.tax.p606j.EnumC28538u
        /* renamed from: a */
        public void mo37983a(Context context, Uri uri, C28546w c28546w) {
            StringBuilder sb2 = new StringBuilder();
            StringFogImpl stringFogImpl = C28162a.f73047a;
            sb2.append(stringFogImpl.m23824a(new byte[]{22, 70, 32, 69, 49, 9, 59, 70, 33, 9, 61, 72, 59, 77, 57, 76, 117, SignedBytes.MAX_POWER_OF_TWO, 59, 93, 48, 71, 33, 9, 34, SignedBytes.MAX_POWER_OF_TWO, 33, 65, 117, 124, 7, 96, 111, 9}, new byte[]{85, 41}));
            sb2.append(uri);
            sb2.append(stringFogImpl.m23824a(new byte[]{-64, 67, -125, 57, -22, 62, -94, 35, -71, 106, -93, 36, -66, 47, -92, 62, -22, 57, -65, 58, -70, 37, -72, 62, -81, 46, -22, 37, -92, 106, -77, 37, -65, 56, -22, 58, -94, 37, -92, 47, -11}, new byte[]{-54, 74}));
            try {
                C28518e.m38039a(context, uri, sb2.toString());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        @Override // com.taurusx.tax.p606j.EnumC28538u
        public boolean shouldTryHandlingUrl(Uri uri) {
            String scheme = uri.getScheme();
            StringFogImpl stringFogImpl = C28162a.f73047a;
            if (!stringFogImpl.m23824a(new byte[]{-117, 111, -109}, new byte[]{-1, 10}).equalsIgnoreCase(scheme) && !stringFogImpl.m23824a(new byte[]{-77, -18, -84, -30, -96, -20, -92, -24, -87}, new byte[]{-59, -127}).equalsIgnoreCase(scheme) && !stringFogImpl.m23824a(new byte[]{-117, 28, -117}, new byte[]{-8, 113}).equalsIgnoreCase(scheme) && !stringFogImpl.m23824a(new byte[]{78, -18, 74, -29, 87, -32}, new byte[]{35, -113}).equalsIgnoreCase(scheme) && !stringFogImpl.m23824a(new byte[]{97, 37, 105}, new byte[]{6, SignedBytes.MAX_POWER_OF_TWO}).equalsIgnoreCase(scheme) && !stringFogImpl.m23824a(new byte[]{-89, -97, -81, -105, -84, -107, -18, -125, -76, -126, -91, -107, -76, -122, -87, -107, -73}, new byte[]{-64, -16}).equalsIgnoreCase(scheme)) {
                return false;
            }
            return true;
        }
    }

    static {
        StringFogImpl stringFogImpl = C28162a.f73047a;
        C28539a c28539a = new C28539a(stringFogImpl.m23824a(new byte[]{-82, 76, -88, 73, -86, 72, -71, 93, -82, 66, -88, 72, -71, 94, -91, 69, -93, SignedBytes.MAX_POWER_OF_TWO, -93}, new byte[]{-26, 13}), 0);
        HANDLE_PHONE_SCHEME = c28539a;
        EnumC28538u enumC28538u = new EnumC28538u(stringFogImpl.m23824a(new byte[]{-105, 23, -99, 9, -121, 9, -103, 19, -111, 17, -99, 24, -102, 21, -105, 16, -117, 2, -118}, new byte[]{-40, 71}), 1) { // from class: com.taurusx.tax.j.u.b
            @Override // com.taurusx.tax.p606j.EnumC28538u
            /* renamed from: a */
            public void mo37983a(Context context, Uri uri, C28546w c28546w) {
                StringBuilder sb2 = new StringBuilder();
                StringFogImpl stringFogImpl2 = C28162a.f73047a;
                sb2.append(stringFogImpl2.m23824a(new byte[]{99, -111, 85, -110, 68, -34, 78, -111, 84, -34, 72, -97, 78, -102, 76, -101, 0, -105, 78, -118, 69, -112, 84, -34, 87, -105, 84, -106, 0, -85, 114, -73, 26, -34}, new byte[]{32, -2}));
                sb2.append(uri);
                sb2.append(stringFogImpl2.m23824a(new byte[]{-89, 55, -28, 77, -115, 74, -59, 87, -34, 30, -60, 80, -39, 91, -61, 74, -115, 77, -40, 78, -35, 81, -33, 74, -56, 90, -115, 81, -61, 30, -44, 81, -40, 76, -115, 78, -59, 81, -61, 91, -110}, new byte[]{-83, 62}));
                try {
                    C28518e.m38039a(context, uri, sb2.toString());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }

            @Override // com.taurusx.tax.p606j.EnumC28538u
            public boolean shouldTryHandlingUrl(Uri uri) {
                String scheme = uri.getScheme();
                StringFogImpl stringFogImpl2 = C28162a.f73047a;
                if (!stringFogImpl2.m23824a(new byte[]{30, -27, 2, -31}, new byte[]{118, -111}).equalsIgnoreCase(scheme) && !stringFogImpl2.m23824a(new byte[]{76, -87, 80, -83, 87}, new byte[]{36, -35}).equalsIgnoreCase(scheme)) {
                    return false;
                }
                return true;
            }
        };
        OPEN_NATIVE_BROWSER = enumC28538u;
        EnumC28538u enumC28538u2 = new EnumC28538u(stringFogImpl.m23824a(new byte[]{97, -88, 107, -74, 113, -71, 126, -88, 113, -75, 111, -86, 101, -67, 122}, new byte[]{46, -8}), 2) { // from class: com.taurusx.tax.j.u.c
            @Override // com.taurusx.tax.p606j.EnumC28538u
            /* renamed from: a */
            public void mo37983a(Context context, Uri uri, C28546w c28546w) {
                try {
                    C28518e.m38040a(context, uri);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }

            @Override // com.taurusx.tax.p606j.EnumC28538u
            public boolean shouldTryHandlingUrl(Uri uri) {
                String scheme = uri.getScheme();
                String host = uri.getHost();
                StringFogImpl stringFogImpl2 = C28162a.f73047a;
                if (!stringFogImpl2.m23824a(new byte[]{-104, -82, -119, -69, -58, -91, -121, -83, -113, -82, -115, -20, -117, -83, -123}, new byte[]{-24, -62}).equalsIgnoreCase(host) && !stringFogImpl2.m23824a(new byte[]{-38, -53, -59, -63, -46, -34, -103, -53, -39, -50, -59, -59, -34, -50, -103, -55, -40, -57}, new byte[]{-73, -86}).equalsIgnoreCase(host) && !stringFogImpl2.m23824a(new byte[]{SignedBytes.MAX_POWER_OF_TWO, 37, 95, 47, 72, 48}, new byte[]{45, 68}).equalsIgnoreCase(scheme) && !uri.toString().toLowerCase().startsWith(stringFogImpl2.m23824a(new byte[]{-97, 86, -114, 67, -63, 93, UnsignedBytes.MAX_POWER_OF_TWO, 85, -120, 86, -118, 20, -116, 85, -126, 21}, new byte[]{-17, 58})) && !uri.toString().toLowerCase().startsWith(stringFogImpl2.m23824a(new byte[]{25, 23, 6, 29, 17, 2, 90, 23, 26, 18, 6, 25, 29, 18, 90, 21, 27, 27, 91}, new byte[]{116, 118}))) {
                    return false;
                }
                return true;
            }
        };
        OPEN_APP_MARKET = enumC28538u2;
        EnumC28538u enumC28538u3 = new EnumC28538u(stringFogImpl.m23824a(new byte[]{-97, -65, -107, -68, -106, -89, -122, -76, -100, -75, -119, -81, -107, -71, -105, -69, -122, -89, -112, -92, -111, -81, -97, -79, -107, -68, -101, -79, -102, -69}, new byte[]{-39, -16}), 3) { // from class: com.taurusx.tax.j.u.d
            @Override // com.taurusx.tax.p606j.EnumC28538u
            /* renamed from: a */
            public void mo37983a(Context context, Uri uri, C28546w c28546w) {
                if (!C28162a.m38504a(new byte[]{-91, -116, -67, -124, -84, -116, -65, -120}, new byte[]{-53, -19}).equalsIgnoreCase(uri.getHost())) {
                    LogUtil.m37905d(C28162a.m38504a(new byte[]{-73, 88, -117, 107, -127, 94, -117, 69, -116}, new byte[]{-30, 42}), C28162a.m38504a(new byte[]{-124, -59, -91, -48, -84, -55, -82, -53, -21, UnsignedBytes.MAX_POWER_OF_TWO, -107, -14, -116, UnsignedBytes.MAX_POWER_OF_TWO, -92, -55, -92, UnsignedBytes.MAX_POWER_OF_TWO, -82, -49, -76, UnsignedBytes.MAX_POWER_OF_TWO, -88, -63, -74, -59, -32, -121, -82, -63, -74, -55, -89, -63, -76, -59, -25, UnsignedBytes.MAX_POWER_OF_TWO, -95, -45, -32, -44, -88, -59, -32, -56, -81, -45, -76, -114}, new byte[]{-64, -96}));
                    return;
                }
                try {
                    String queryParameter = uri.getQueryParameter(C28162a.m38504a(new byte[]{25, 107, 0, 116, 8, 107, 16, 76, 27, 117}, new byte[]{105, 25}));
                    uri.getQueryParameters(C28162a.m38504a(new byte[]{97, 46, 120, 49, 112, 46, 104, 8, 99, 61, 114, 55, 120, 50, 118, 9, 99, 48}, new byte[]{17, 92}));
                    String queryParameter2 = uri.getQueryParameter(C28162a.m38504a(new byte[]{-19, -109, -25, -98, -23, -109, -24, -103, -34, UnsignedBytes.MAX_POWER_OF_TWO, -25}, new byte[]{-117, -14}));
                    uri.getQueryParameters(C28162a.m38504a(new byte[]{66, 43, 72, 38, 70, 43, 71, 33, 112, 56, 69, 41, 79, 35, 74, 45, 113, 56, 72}, new byte[]{36, 74}));
                    if (queryParameter == null) {
                        LogUtil.m37901iv(C28162a.m38504a(new byte[]{24, 53, 25, 38, 25, 39, 20}, new byte[]{108, 84}), C28162a.m38504a(new byte[]{77, 42, 108, 63, 101, 38, 103, 36, 34, 111, 109, 38, 109, 111, 103, 32, 125, 111, 97, 46, Byte.MAX_VALUE, 42, 41, 104, 121, 61, 96, 34, 104, 61, 112, 26, 123, 35, 46, 111, 120, 58, 108, 61, 112, 111, 121, 46, 123, 46, 100, 97}, new byte[]{9, 79}));
                        return;
                    }
                    Uri parse = Uri.parse(queryParameter);
                    if (shouldTryHandlingUrl(parse)) {
                        LogUtil.m37901iv(C28162a.m38504a(new byte[]{-97, 108, -98, Byte.MAX_VALUE, -98, 126, -109}, new byte[]{-21, 13}), C28162a.m38504a(new byte[]{-66, -101, -97, -114, -106, -105, -108, -107, -47, -34, -110, -97, -98, -34, -101, -112, -107, -118, -110, -101, -120, -34, -66, -101, -97, -114, -106, -105, -108, -107, -47, -34, -101, -115, -38, -118, -110, -101, -38, -39, -118, -116, -109, -109, -101, -116, -125, -85, -120, -110, -35, -48}, new byte[]{-6, -2}));
                        return;
                    }
                    try {
                        C28518e.m38040a(context, parse);
                    } catch (Exception unused) {
                        if (queryParameter2 == null) {
                            LogUtil.m37901iv(C28162a.m38504a(new byte[]{32, 94, 33, 77, 33, 76, 44}, new byte[]{84, 63}), C28162a.m38504a(new byte[]{70, -54, 114, -58, Byte.MAX_VALUE, -63, 51, -48, 124, -124, 123, -59, 125, -64, Byte.MAX_VALUE, -63, 51, -125, 99, -42, 122, -55, 114, -42, 106, -15, 97, -56, 52, -124, 117, -53, 97, -124, 87, -63, 118, -44, Byte.MAX_VALUE, -51, 125, -49, 56, -124, 114, -54, 119, -124, 52, -62, 114, -56, Byte.MAX_VALUE, -58, 114, -57, 120, -15, 97, -56, 52, -124, 100, -59, 96, -124, 126, -51, 96, -41, 122, -54, 116, -118}, new byte[]{19, -92}));
                        } else if (shouldTryHandlingUrl(Uri.parse(queryParameter2))) {
                            LogUtil.m37901iv(C28162a.m38504a(new byte[]{98, 27, 99, 8, 99, 9, 110}, new byte[]{22, 122}), C28162a.m38504a(new byte[]{96, -63, 65, -44, 72, -51, 74, -49, 15, -124, 113, -10, 104, -124, 76, -59, SignedBytes.MAX_POWER_OF_TWO, -124, 69, -54, 75, -48, 76, -63, 86, -124, 96, -63, 65, -44, 72, -51, 74, -49, 4, -15, 118, -24, 4, -59, 87, -124, 80, -52, 65, -124, 3, -62, 69, -56, 72, -58, 69, -57, 79, -15, 86, -56, 3, -118}, new byte[]{36, -92}));
                        } else {
                            c28546w.m37981a(context, queryParameter2);
                        }
                    }
                } catch (Exception unused2) {
                    LogUtil.m37901iv(C28162a.m38504a(new byte[]{Byte.MAX_VALUE, -115, 126, -98, 126, -97, 115}, new byte[]{11, -20}), C28162a.m38504a(new byte[]{116, -57, 85, -46, 92, -53, 94, -55, 27, -126, 101, -16, 124, -126, 71, -61, 67, -126, 94, -51, 68, -126, 81, -126, 88, -53, 85, -48, 81, -48, 83, -54, 89, -63, 81, -50, 16, -9, 98, -21, 30}, new byte[]{48, -94}));
                }
            }

            @Override // com.taurusx.tax.p606j.EnumC28538u
            public boolean shouldTryHandlingUrl(Uri uri) {
                return C28162a.f73047a.m23824a(new byte[]{-75, -18, -76, -5, -67, -30, -65, -32, -6}, new byte[]{-47, -117}).equalsIgnoreCase(uri.getScheme());
            }
        };
        FOLLOW_DEEP_LINK_WITH_FALLBACK = enumC28538u3;
        EnumC28538u enumC28538u4 = new EnumC28538u(stringFogImpl.m23824a(new byte[]{102, -47, 108, -46, 111, -55, Byte.MAX_VALUE, -38, 101, -37, 112, -63, 108, -41, 110, -43}, new byte[]{32, -98}), 4) { // from class: com.taurusx.tax.j.u.e
            @Override // com.taurusx.tax.p606j.EnumC28538u
            /* renamed from: a */
            public void mo37983a(Context context, Uri uri, C28546w c28546w) {
                if (C28162a.f73047a.m23824a(new byte[]{-57, -40, -38, -45, -64, -62}, new byte[]{-82, -74}).equalsIgnoreCase(uri.getScheme())) {
                    try {
                        C28518e.m38025b(context, Intent.parseUri(uri.toString(), 1));
                        return;
                    } catch (Exception e) {
                        e.printStackTrace();
                        return;
                    }
                }
                try {
                    C28518e.m38040a(context, uri);
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }

            @Override // com.taurusx.tax.p606j.EnumC28538u
            public boolean shouldTryHandlingUrl(Uri uri) {
                return !TextUtils.isEmpty(uri.getScheme());
            }
        };
        FOLLOW_DEEP_LINK = enumC28538u4;
        EnumC28538u enumC28538u5 = new EnumC28538u(stringFogImpl.m23824a(new byte[]{-106, 60, -105, 35}, new byte[]{-40, 115}), 5) { // from class: com.taurusx.tax.j.u.f
            @Override // com.taurusx.tax.p606j.EnumC28538u
            public boolean shouldTryHandlingUrl(Uri uri) {
                return false;
            }

            @Override // com.taurusx.tax.p606j.EnumC28538u
            /* renamed from: a */
            public void mo37983a(Context context, Uri uri, C28546w c28546w) {
            }
        };
        NOOP = enumC28538u5;
        f73995a = new EnumC28538u[]{c28539a, enumC28538u, enumC28538u2, enumC28538u3, enumC28538u4, enumC28538u5};
    }

    public /* synthetic */ EnumC28538u(String str, int i, C28539a c28539a) {
        this(str, i);
    }

    public static EnumC28538u valueOf(String str) {
        return (EnumC28538u) Enum.valueOf(EnumC28538u.class, str);
    }

    public static EnumC28538u[] values() {
        return (EnumC28538u[]) f73995a.clone();
    }

    /* renamed from: a */
    public abstract void mo37983a(Context context, Uri uri, C28546w c28546w);

    public void handleUrl(C28546w c28546w, Context context, Uri uri) {
        StringFogImpl stringFogImpl = C28162a.f73047a;
        String m23824a = stringFogImpl.m23824a(new byte[]{-125, 48, -126, 35, -126, 34, -113}, new byte[]{-9, 81});
        LogUtil.m37901iv(m23824a, stringFogImpl.m23824a(new byte[]{-11, 54, -108, 55, -62, 55, -38, 38, -108, 7, -26, 30, -114, 114}, new byte[]{-76, 82}) + uri);
        mo37983a(context, uri, c28546w);
    }

    public abstract boolean shouldTryHandlingUrl(Uri uri);

    public EnumC28538u(String str, int i) {
    }
}
