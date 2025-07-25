package com.taurusx.tax.p606j.p613b0;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.p606j.C28518e;
import com.taurusx.tax.p606j.C28530n;
import com.taurusx.tax.p606j.C28535r;
import com.taurusx.tax.p606j.p613b0.C28506e;
import java.net.URISyntaxException;
import java.util.List;
import p692h2.StringFogImpl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.taurusx.tax.j.b0.b */
/* loaded from: classes7.dex */
public abstract class EnumC28492b {
    public static final EnumC28492b FOLLOW_DEEP_LINK;
    public static final EnumC28492b FOLLOW_DEEP_LINK_WITH_FALLBACK;
    public static final EnumC28492b HANDLE_PHONE_SCHEME;
    public static final EnumC28492b HANDLE_SHARE_TWEET;
    public static final EnumC28492b HANDLE_TAX_SCHEME;
    public static final EnumC28492b IGNORE_ABOUT_SCHEME;
    public static final EnumC28492b NOOP;
    public static final EnumC28492b OPEN_APP_MARKET;
    public static final EnumC28492b OPEN_IN_APP_BROWSER;
    public static final EnumC28492b OPEN_NATIVE_BROWSER;

    /* renamed from: b */
    public static final /* synthetic */ EnumC28492b[] f73924b;

    /* renamed from: a */
    public final boolean f73925a;

    /* renamed from: com.taurusx.tax.j.b0.b$b */
    /* loaded from: classes7.dex */
    public enum C28494b extends EnumC28492b {
        public C28494b(String str, int i, boolean z) {
            super(str, i, z, null);
        }

        @Override // com.taurusx.tax.p606j.p613b0.EnumC28492b
        /* renamed from: a */
        public void mo38064a(Context context, Uri uri, C28506e c28506e, String str) throws C28535r {
            String host = uri.getHost();
            C28506e.InterfaceC28511e interfaceC28511e = c28506e.f73937c;
            StringFogImpl stringFogImpl = C28162a.f73047a;
            if (stringFogImpl.m23824a(new byte[]{35, 62, 43, 62, 54, 63, 9, 56, 36, 51}, new byte[]{69, 87}).equalsIgnoreCase(host)) {
                ((C28506e.C28508b) interfaceC28511e).getClass();
            } else if (stringFogImpl.m23824a(new byte[]{38, 38, 42, 57, 32}, new byte[]{69, 74}).equalsIgnoreCase(host)) {
                ((C28506e.C28508b) interfaceC28511e).getClass();
            } else if (stringFogImpl.m23824a(new byte[]{-8, 88, -9, 85, -46, 86, -1, 93}, new byte[]{-98, 57}).equalsIgnoreCase(host)) {
                ((C28506e.C28508b) interfaceC28511e).getClass();
            } else {
                throw new C28535r(stringFogImpl.m23824a(new byte[]{-68, 84, -118, 87, -101, 27, -111, 84, -117, 27, -105, 90, -111, 95, -109, 94, -33, 111, -98, 78, -115, 78, -116, 67, -33, 104, -100, 83, -102, 86, -102, 27, -118, 73, -109, 1, -33}, new byte[]{-1, 59}) + uri);
            }
        }

        @Override // com.taurusx.tax.p606j.p613b0.EnumC28492b
        public boolean shouldTryHandlingUrl(Uri uri) {
            return C28162a.f73047a.m23824a(new byte[]{113, -102, 125}, new byte[]{5, -5}).equalsIgnoreCase(uri.getScheme());
        }
    }

    static {
        StringFogImpl stringFogImpl = C28162a.f73047a;
        C28494b c28494b = new C28494b(stringFogImpl.m23824a(new byte[]{-49, 124, -55, 121, -53, 120, -40, 105, -58, 101, -40, 110, -60, 117, -62, 112, -62}, new byte[]{-121, 61}), 0, false);
        HANDLE_TAX_SCHEME = c28494b;
        EnumC28492b enumC28492b = new EnumC28492b(stringFogImpl.m23824a(new byte[]{-98, -43, -103, -35, -123, -41, -120, -45, -107, -35, -126, -58, -120, -63, -108, -38, -110, -33, -110}, new byte[]{-41, -110}), 1, false) { // from class: com.taurusx.tax.j.b0.b.c
            @Override // com.taurusx.tax.p606j.p613b0.EnumC28492b
            /* renamed from: a */
            public void mo38064a(Context context, Uri uri, C28506e c28506e, String str) throws C28535r {
                StringFogImpl stringFogImpl2 = C28162a.f73047a;
                LogUtil.m37905d(stringFogImpl2.m23824a(new byte[]{96, -101, 97, -120, 97, -119, 108}, new byte[]{20, -6}), stringFogImpl2.m23824a(new byte[]{-52, -49, -18, -51, -96, -46, -17, -122, -31, -60, -17, -45, -12, -122, -16, -57, -25, -61, -96, -49, -25, -56, -17, -44, -27, -62, -82}, new byte[]{UnsignedBytes.MAX_POWER_OF_TWO, -90}));
            }

            @Override // com.taurusx.tax.p606j.p613b0.EnumC28492b
            public boolean shouldTryHandlingUrl(Uri uri) {
                return C28162a.f73047a.m23824a(new byte[]{104, 81, 102, 70, 125}, new byte[]{9, 51}).equalsIgnoreCase(uri.getScheme());
            }
        };
        IGNORE_ABOUT_SCHEME = enumC28492b;
        EnumC28492b enumC28492b2 = new EnumC28492b(stringFogImpl.m23824a(new byte[]{7, -33, 1, -38, 3, -37, 16, -50, 7, -47, 1, -37, 16, -51, 12, -42, 10, -45, 10}, new byte[]{79, -98}), 2, true) { // from class: com.taurusx.tax.j.b0.b.d
            @Override // com.taurusx.tax.p606j.p613b0.EnumC28492b
            /* renamed from: a */
            public void mo38064a(Context context, Uri uri, C28506e c28506e, String str) throws C28535r {
                StringBuilder sb2 = new StringBuilder();
                StringFogImpl stringFogImpl2 = C28162a.f73047a;
                sb2.append(stringFogImpl2.m23824a(new byte[]{74, 40, 124, 43, 109, 103, 103, 40, 125, 103, 97, 38, 103, 35, 101, 34, 41, 46, 103, 51, 108, 41, 125, 103, 126, 46, 125, 47, 41, 18, 91, 14, 51, 103}, new byte[]{9, 71}));
                sb2.append(uri);
                sb2.append(stringFogImpl2.m23824a(new byte[]{-28, -55, -89, -77, -50, -76, -122, -87, -99, -32, -121, -82, -102, -91, UnsignedBytes.MAX_POWER_OF_TWO, -76, -50, -77, -101, -80, -98, -81, -100, -76, -117, -92, -50, -81, UnsignedBytes.MAX_POWER_OF_TWO, -32, -105, -81, -101, -78, -50, -80, -122, -81, UnsignedBytes.MAX_POWER_OF_TWO, -91, -47}, new byte[]{-18, -64}));
                C28518e.m38039a(context, uri, sb2.toString());
            }

            @Override // com.taurusx.tax.p606j.p613b0.EnumC28492b
            public boolean shouldTryHandlingUrl(Uri uri) {
                String scheme = uri.getScheme();
                StringFogImpl stringFogImpl2 = C28162a.f73047a;
                if (!stringFogImpl2.m23824a(new byte[]{61, -83, 37}, new byte[]{73, -56}).equalsIgnoreCase(scheme) && !stringFogImpl2.m23824a(new byte[]{38, 11, 57, 7, 53, 9, 49, 13, 60}, new byte[]{80, 100}).equalsIgnoreCase(scheme) && !stringFogImpl2.m23824a(new byte[]{98, -72, 98}, new byte[]{17, -43}).equalsIgnoreCase(scheme) && !stringFogImpl2.m23824a(new byte[]{-62, -47, -58, -36, -37, -33}, new byte[]{-81, -80}).equalsIgnoreCase(scheme) && !stringFogImpl2.m23824a(new byte[]{63, 75, 55}, new byte[]{88, 46}).equalsIgnoreCase(scheme) && !stringFogImpl2.m23824a(new byte[]{58, 36, 50, 44, 49, 46, 115, 56, 41, 57, 56, 46, 41, 61, 52, 46, 42}, new byte[]{93, 75}).equalsIgnoreCase(scheme)) {
                    return false;
                }
                return true;
            }
        };
        HANDLE_PHONE_SCHEME = enumC28492b2;
        EnumC28492b enumC28492b3 = new EnumC28492b(stringFogImpl.m23824a(new byte[]{-122, 85, -116, 75, -106, 75, -120, 81, UnsignedBytes.MAX_POWER_OF_TWO, 83, -116, 90, -117, 87, -122, 82, -102, SignedBytes.MAX_POWER_OF_TWO, -101}, new byte[]{-55, 5}), 3, true) { // from class: com.taurusx.tax.j.b0.b.e
            @Override // com.taurusx.tax.p606j.p613b0.EnumC28492b
            /* renamed from: a */
            public void mo38064a(Context context, Uri uri, C28506e c28506e, String str) throws C28535r {
                String str2 = C28162a.f73047a.m23824a(new byte[]{-36, 40, -24, 36, -27, 35, -87, 50, -26, 102, -27, 41, -24, 34, -87, 50, -24, 62, -87, 40, -24, 50, -32, 48, -20, 102, -21, 52, -26, 49, -6, 35, -5, 102, -4, 52, -27, 124, -87}, new byte[]{-119, 70}) + uri;
                try {
                    C28518e.m38016c(context, C28518e.m38036a(uri));
                } catch (Exception e) {
                    throw new C28535r(str2 + "\n\t" + e.getMessage());
                }
            }

            @Override // com.taurusx.tax.p606j.p613b0.EnumC28492b
            public boolean shouldTryHandlingUrl(Uri uri) {
                return C28162a.f73047a.m23824a(new byte[]{107, -21, 103, -28, 126, -2, 118, -4, 122, -24, 109, -27, 104, -7, 122, -8}, new byte[]{31, -118}).equalsIgnoreCase(uri.getScheme());
            }
        };
        OPEN_NATIVE_BROWSER = enumC28492b3;
        EnumC28492b enumC28492b4 = new EnumC28492b(stringFogImpl.m23824a(new byte[]{35, 81, 41, 79, 51, SignedBytes.MAX_POWER_OF_TWO, 60, 81, 51, 76, 45, 83, 39, 68, 56}, new byte[]{108, 1}), 4, true) { // from class: com.taurusx.tax.j.b0.b.f
            @Override // com.taurusx.tax.p606j.p613b0.EnumC28492b
            /* renamed from: a */
            public void mo38064a(Context context, Uri uri, C28506e c28506e, String str) throws C28535r {
                C28518e.m38040a(context, uri);
            }

            @Override // com.taurusx.tax.p606j.p613b0.EnumC28492b
            public boolean shouldTryHandlingUrl(Uri uri) {
                String scheme = uri.getScheme();
                String host = uri.getHost();
                StringFogImpl stringFogImpl2 = C28162a.f73047a;
                if (!stringFogImpl2.m23824a(new byte[]{66, -1, 83, -22, 28, -12, 93, -4, 85, -1, 87, -67, 81, -4, 95}, new byte[]{50, -109}).equalsIgnoreCase(host) && !stringFogImpl2.m23824a(new byte[]{24, 3, 7, 9, 16, 22, 91, 3, 27, 6, 7, 13, 28, 6, 91, 1, 26, 15}, new byte[]{117, 98}).equalsIgnoreCase(host) && !stringFogImpl2.m23824a(new byte[]{-19, 63, -14, 53, -27, 42}, new byte[]{UnsignedBytes.MAX_POWER_OF_TWO, 94}).equalsIgnoreCase(scheme) && !uri.toString().toLowerCase().startsWith(stringFogImpl2.m23824a(new byte[]{-110, -78, -125, -89, -52, -71, -115, -79, -123, -78, -121, -16, -127, -79, -113, -15}, new byte[]{-30, -34})) && !uri.toString().toLowerCase().startsWith(stringFogImpl2.m23824a(new byte[]{-41, -11, -56, -1, -33, -32, -108, -11, -44, -16, -56, -5, -45, -16, -108, -9, -43, -7, -107}, new byte[]{-70, -108}))) {
                    return false;
                }
                return true;
            }
        };
        OPEN_APP_MARKET = enumC28492b4;
        EnumC28492b enumC28492b5 = new EnumC28492b(stringFogImpl.m23824a(new byte[]{1, 32, 11, 62, 17, 57, 0, 47, 15, 32, 30, 47, 12, 34, 1, 39, 29, 53, 28}, new byte[]{78, 112}), 5, true) { // from class: com.taurusx.tax.j.b0.b.g
            @Override // com.taurusx.tax.p606j.p613b0.EnumC28492b
            /* renamed from: a */
            public void mo38064a(Context context, Uri uri, C28506e c28506e, String str) throws C28535r {
                if (!c28506e.f73939e) {
                    C28518e.m38024b(context, uri, str);
                }
            }

            @Override // com.taurusx.tax.p606j.p613b0.EnumC28492b
            public boolean shouldTryHandlingUrl(Uri uri) {
                String scheme = uri.getScheme();
                StringFogImpl stringFogImpl2 = C28162a.f73047a;
                if (!stringFogImpl2.m23824a(new byte[]{-90, -89, -70, -93}, new byte[]{-50, -45}).equalsIgnoreCase(scheme) && !stringFogImpl2.m23824a(new byte[]{19, 17, 15, 21, 8}, new byte[]{123, 101}).equalsIgnoreCase(scheme)) {
                    return false;
                }
                return true;
            }
        };
        OPEN_IN_APP_BROWSER = enumC28492b5;
        EnumC28492b enumC28492b6 = new EnumC28492b(stringFogImpl.m23824a(new byte[]{-107, -29, -109, -26, -111, -25, -126, -15, -107, -29, -113, -25, -126, -10, -118, -25, -104, -10}, new byte[]{-35, -94}), 6, true) { // from class: com.taurusx.tax.j.b0.b.h
            @Override // com.taurusx.tax.p606j.p613b0.EnumC28492b
            /* renamed from: a */
            public void mo38064a(Context context, Uri uri, C28506e c28506e, String str) throws C28535r {
                C28530n.m37997a(context);
                C28530n.m37997a(uri);
                StringFogImpl stringFogImpl2 = C28162a.f73047a;
                stringFogImpl2.m23824a(new byte[]{-110, 51, -96, 41, -92, 123, -73, 50, -96}, new byte[]{-63, 91});
                String str2 = stringFogImpl2.m23824a(new byte[]{16, -34, 38, -35, 55, -111, 61, -34, 39, -111, 59, -48, 61, -43, 63, -44, 115, -62, 59, -48, 33, -44, 115, -59, 36, -44, 54, -59, 115, -40, 61, -59, 54, -33, 39, -111, 36, -40, 39, -39, 115, -28, 1, -8, 115}, new byte[]{83, -79}) + uri;
                try {
                    C28518e.m38016c(context, Intent.createChooser(C28518e.m38022b(uri), stringFogImpl2.m23824a(new byte[]{-36, 3, -18, 25, -22, 75, -7, 2, -18}, new byte[]{-113, 107})));
                } catch (Exception e) {
                    throw new C28535r(str2 + "\n\t" + e.getMessage());
                }
            }

            @Override // com.taurusx.tax.p606j.p613b0.EnumC28492b
            public boolean shouldTryHandlingUrl(Uri uri) {
                C28530n.m37997a(uri);
                StringFogImpl stringFogImpl2 = C28162a.f73047a;
                if (stringFogImpl2.m23824a(new byte[]{116, 68, 120, 86, 104, 68, 114, SignedBytes.MAX_POWER_OF_TWO}, new byte[]{0, 37}).equalsIgnoreCase(uri.getScheme()) && stringFogImpl2.m23824a(new byte[]{-27, -119, -12, -101, -27}, new byte[]{-111, -2}).equalsIgnoreCase(uri.getHost())) {
                    return true;
                }
                return false;
            }
        };
        HANDLE_SHARE_TWEET = enumC28492b6;
        EnumC28492b enumC28492b7 = new EnumC28492b(stringFogImpl.m23824a(new byte[]{-32, 86, -22, 85, -23, 78, -7, 93, -29, 92, -10, 70, -22, 80, -24, 82, -7, 78, -17, 77, -18, 70, -32, 88, -22, 85, -28, 88, -27, 82}, new byte[]{-90, 25}), 7, true) { // from class: com.taurusx.tax.j.b0.b.i
            @Override // com.taurusx.tax.p606j.p613b0.EnumC28492b
            /* renamed from: a */
            public void mo38064a(Context context, Uri uri, C28506e c28506e, String str) throws C28535r {
                if (C28162a.m38504a(new byte[]{-67, -41, -91, -33, -76, -41, -89, -45}, new byte[]{-45, -74}).equalsIgnoreCase(uri.getHost())) {
                    try {
                        String queryParameter = uri.getQueryParameter(C28162a.m38504a(new byte[]{115, 113, 106, 110, 98, 113, 122, 86, 113, 111}, new byte[]{3, 3}));
                        uri.getQueryParameters(C28162a.m38504a(new byte[]{124, -80, 101, -81, 109, -80, 117, -106, 126, -93, 111, -87, 101, -84, 107, -105, 126, -82}, new byte[]{12, -62}));
                        String queryParameter2 = uri.getQueryParameter(C28162a.m38504a(new byte[]{-119, -92, -125, -87, -115, -92, -116, -82, -70, -73, -125}, new byte[]{-17, -59}));
                        List<String> queryParameters = uri.getQueryParameters(C28162a.m38504a(new byte[]{27, -21, 17, -26, 31, -21, 30, -31, 41, -8, 28, -23, 22, -29, 19, -19, 40, -8, 17}, new byte[]{125, -118}));
                        if (queryParameter != null) {
                            Uri parse = Uri.parse(queryParameter);
                            if (!shouldTryHandlingUrl(parse)) {
                                try {
                                    C28518e.m38040a(context, parse);
                                    return;
                                } catch (C28535r unused) {
                                    if (queryParameter2 != null) {
                                        if (!shouldTryHandlingUrl(Uri.parse(queryParameter2))) {
                                            c28506e.m38057a(context, queryParameter2, true, queryParameters);
                                            return;
                                        }
                                        throw new C28535r(C28162a.m38504a(new byte[]{-7, 78, -40, 91, -47, 66, -45, SignedBytes.MAX_POWER_OF_TWO, -106, 11, -24, 121, -15, 11, -43, 74, -39, 11, -36, 69, -46, 95, -43, 78, -49, 11, -7, 78, -40, 91, -47, 66, -45, SignedBytes.MAX_POWER_OF_TWO, -106, 11, -24, 121, -15, 11, -36, 88, -99, 95, -43, 78, -99, 12, -37, 74, -47, 71, -33, 74, -34, SignedBytes.MAX_POWER_OF_TWO, -24, 89, -47, 12, -109}, new byte[]{-67, 43}));
                                    }
                                    throw new C28535r(C28162a.m38504a(new byte[]{75, 62, Byte.MAX_VALUE, 50, 114, 53, 62, 36, 113, 112, 118, 49, 112, 52, 114, 53, 62, 119, 110, 34, 119, 61, Byte.MAX_VALUE, 34, 103, 5, 108, 60, 57, 112, 120, 63, 108, 112, 90, 53, 123, 32, 114, 57, 112, 59, 53, 112, Byte.MAX_VALUE, 62, 122, 112, 57, 54, Byte.MAX_VALUE, 60, 114, 50, Byte.MAX_VALUE, 51, 117, 5, 108, 60, 57, 112, 105, 49, 109, 112, 115, 57, 109, 35, 119, 62, 121, 126}, new byte[]{30, 80}));
                                }
                            }
                            throw new C28535r(C28162a.m38504a(new byte[]{-92, -86, -123, -65, -116, -90, -114, -92, -53, -17, -120, -82, -124, -17, -127, -95, -113, -69, -120, -86, -110, -17, -92, -86, -123, -65, -116, -90, -114, -92, -53, -17, -127, -68, -64, -69, -120, -86, -64, -24, -112, -67, -119, -94, -127, -67, -103, -102, -110, -93, -57, -31}, new byte[]{-32, -49}));
                        }
                        throw new C28535r(C28162a.m38504a(new byte[]{-12, 36, -43, 49, -36, 40, -34, 42, -101, 97, -44, 40, -44, 97, -34, 46, -60, 97, -40, 32, -58, 36, -112, 102, -64, 51, -39, 44, -47, 51, -55, 20, -62, 45, -105, 97, -63, 52, -43, 51, -55, 97, -64, 32, -62, 32, -35, 111}, new byte[]{-80, 65}));
                    } catch (UnsupportedOperationException unused2) {
                        throw new C28535r(C28162a.m38504a(new byte[]{-72, SignedBytes.MAX_POWER_OF_TWO, -103, 85, -112, 76, -110, 78, -41, 5, -87, 119, -80, 5, -117, 68, -113, 5, -110, 74, -120, 5, -99, 5, -108, 76, -103, 87, -99, 87, -97, 77, -107, 70, -99, 73, -36, 112, -82, 108, -46}, new byte[]{-4, 37}));
                    }
                }
                throw new C28535r(C28162a.m38504a(new byte[]{-99, -20, -68, -7, -75, -32, -73, -30, -14, -87, -116, -37, -107, -87, -67, -32, -67, -87, -73, -26, -83, -87, -79, -24, -81, -20, -7, -82, -73, -24, -81, -32, -66, -24, -83, -20, -2, -87, -72, -6, -7, -3, -79, -20, -7, -31, -74, -6, -83, -89}, new byte[]{-39, -119}));
            }

            @Override // com.taurusx.tax.p606j.p613b0.EnumC28492b
            public boolean shouldTryHandlingUrl(Uri uri) {
                return C28162a.f73047a.m23824a(new byte[]{-81, 40, -82, 61, -89, 36, -91, 38, -32}, new byte[]{-53, 77}).equalsIgnoreCase(uri.getScheme());
            }
        };
        FOLLOW_DEEP_LINK_WITH_FALLBACK = enumC28492b7;
        EnumC28492b enumC28492b8 = new EnumC28492b(stringFogImpl.m23824a(new byte[]{93, 17, 87, 18, 84, 9, 68, 26, 94, 27, 75, 1, 87, 23, 85, 21}, new byte[]{27, 94}), 8, true) { // from class: com.taurusx.tax.j.b0.b.j
            @Override // com.taurusx.tax.p606j.p613b0.EnumC28492b
            /* renamed from: a */
            public void mo38064a(Context context, Uri uri, C28506e c28506e, String str) throws C28535r {
                StringFogImpl stringFogImpl2 = C28162a.f73047a;
                if (stringFogImpl2.m23824a(new byte[]{87, 124, 74, 119, 80, 102}, new byte[]{62, 18}).equalsIgnoreCase(uri.getScheme())) {
                    try {
                        Intent parseUri = Intent.parseUri(uri.toString(), 1);
                        parseUri.addCategory(stringFogImpl2.m23824a(new byte[]{119, -19, 114, -15, 121, -22, 114, -83, Byte.MAX_VALUE, -19, 98, -26, 120, -9, 56, -32, 119, -9, 115, -28, 121, -15, 111, -83, 84, -47, 89, -44, 69, -62, 84, -49, 83}, new byte[]{22, -125}));
                        parseUri.setComponent(null);
                        parseUri.setSelector(null);
                        C28518e.m38025b(context, parseUri);
                        return;
                    } catch (URISyntaxException unused) {
                        throw new C28535r(C28162a.f73047a.m23824a(new byte[]{-118, -126, -73, -119, -83, -104, -29, -103, -79, -123, -29, -124, -94, -120, -29, -123, -83, -102, -94, UnsignedBytes.MAX_POWER_OF_TWO, -86, -120, -29, -97, -70, -126, -73, -115, -69, -42, -29}, new byte[]{-61, -20}) + uri.toString());
                    }
                }
                C28518e.m38040a(context, uri);
            }

            @Override // com.taurusx.tax.p606j.p613b0.EnumC28492b
            public boolean shouldTryHandlingUrl(Uri uri) {
                return !TextUtils.isEmpty(uri.getScheme());
            }
        };
        FOLLOW_DEEP_LINK = enumC28492b8;
        EnumC28492b enumC28492b9 = new EnumC28492b(stringFogImpl.m23824a(new byte[]{6, -112, 7, -113}, new byte[]{72, -33}), 9, false) { // from class: com.taurusx.tax.j.b0.b.a
            @Override // com.taurusx.tax.p606j.p613b0.EnumC28492b
            public boolean shouldTryHandlingUrl(Uri uri) {
                return false;
            }

            @Override // com.taurusx.tax.p606j.p613b0.EnumC28492b
            /* renamed from: a */
            public void mo38064a(Context context, Uri uri, C28506e c28506e, String str) throws C28535r {
            }
        };
        NOOP = enumC28492b9;
        f73924b = new EnumC28492b[]{c28494b, enumC28492b, enumC28492b2, enumC28492b3, enumC28492b4, enumC28492b5, enumC28492b6, enumC28492b7, enumC28492b8, enumC28492b9};
    }

    public /* synthetic */ EnumC28492b(String str, int i, boolean z, C28494b c28494b) {
        this(str, i, z);
    }

    public static EnumC28492b valueOf(String str) {
        return (EnumC28492b) Enum.valueOf(EnumC28492b.class, str);
    }

    public static EnumC28492b[] values() {
        return (EnumC28492b[]) f73924b.clone();
    }

    /* renamed from: a */
    public abstract void mo38064a(Context context, Uri uri, C28506e c28506e, String str) throws C28535r;

    public void handleUrl(C28506e c28506e, Context context, Uri uri, boolean z, String str) throws C28535r {
        StringFogImpl stringFogImpl = C28162a.f73047a;
        String m23824a = stringFogImpl.m23824a(new byte[]{12, 92, 13, 79, 13, 78, 0}, new byte[]{120, 61});
        LogUtil.m37905d(m23824a, stringFogImpl.m23824a(new byte[]{-28, -83, -123, -84, -45, -84, -53, -67, -123, -100, -9, -123, -97, -23}, new byte[]{-91, -55}) + uri);
        if (this.f73925a && !z) {
            throw new C28535r(stringFogImpl.m23824a(new byte[]{95, -70, 106, -85, 115, -66, 106, -85, 122, -18, 106, -95, 62, -90, Byte.MAX_VALUE, -96, 122, -94, 123, -18, Byte.MAX_VALUE, -83, 106, -89, 113, -96, 62, -71, 119, -70, 118, -95, 107, -70, 62, -69, 109, -85, 108, -18, 119, -96, 106, -85, 108, -81, 125, -70, 119, -95, 112, -32}, new byte[]{30, -50}));
        }
        mo38064a(context, uri, c28506e, str);
    }

    public abstract boolean shouldTryHandlingUrl(Uri uri);

    public EnumC28492b(String str, int i, boolean z) {
        this.f73925a = z;
    }
}
