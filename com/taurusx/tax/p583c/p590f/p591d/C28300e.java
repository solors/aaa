package com.taurusx.tax.p583c.p590f.p591d;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.taurusx.tax.C28162a;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.c.f.d.e */
/* loaded from: classes7.dex */
public class C28300e {

    /* renamed from: a */
    public static int f73509a = -1;

    /* renamed from: a */
    public static boolean m38269a(Context context) {
        if (m38268b(context)) {
            return true;
        }
        if (f73509a < 0) {
            String str = Build.PRODUCT;
            int i = (str.contains(C28162a.m38504a(new byte[]{42, 49, 50}, new byte[]{89, 85})) || str.contains(C28162a.m38504a(new byte[]{-60, -114, -31, -103}, new byte[]{-123, -32})) || str.contains(C28162a.m38504a(new byte[]{119, -33, 85, -26, 92, -29, 103, -39, 98, -52, 108, -59}, new byte[]{3, -85})) || str.contains(C28162a.m38504a(new byte[]{-24, 98, -32, 106, -29, 104, -48, 126, -21, 102}, new byte[]{-113, 13})) || str.contains(C28162a.m38504a(new byte[]{-62, 83, -23, 72, -30, 21, -34}, new byte[]{-122, 33})) || str.contains(C28162a.m38504a(new byte[]{13, 121, 27}, new byte[]{99, 22})) || str.contains(C28162a.m38504a(new byte[]{-86, 117, -78, 78, -95, 41, -17}, new byte[]{-39, 17})) || str.contains(C28162a.m38504a(new byte[]{-102, -39, -126, -30, -114, -46, -122, -38, -123, -40}, new byte[]{-23, -67})) || str.contains(C28162a.m38504a(new byte[]{-56, 12, -47, 22, -122, 88, -50}, new byte[]{-66, 110})) || str.contains(C28162a.m38504a(new byte[]{-66, 96, -74, 119, -84}, new byte[]{-33, 18}))) ? 1 : 0;
            String str2 = Build.MANUFACTURER;
            if (str2.equals(C28162a.m38504a(new byte[]{-25, 126, -7, 126, -3, 103, -4}, new byte[]{-110, 16})) || str2.equals(C28162a.m38504a(new byte[]{81, 97, 120, 125, 123, 107, 98, 109, 121, 106}, new byte[]{22, 4})) || str2.contains(C28162a.m38504a(new byte[]{58, 63, 31, 40}, new byte[]{123, 81})) || str2.contains(C28162a.m38504a(new byte[]{-116, 109, -107}, new byte[]{-63, 36})) || str2.contains(C28162a.m38504a(new byte[]{-52, 15, -38}, new byte[]{-94, 96})) || str2.contains(C28162a.m38504a(new byte[]{24, -101, 45, -100, 56, -101, 45, -100, 26, -65}, new byte[]{76, -14}))) {
                i++;
            }
            String str3 = Build.BRAND;
            if (str3.equals(C28162a.m38504a(new byte[]{-54, -57, -61, -57, -33, -53, -50}, new byte[]{-83, -94})) || str3.equals(C28162a.m38504a(new byte[]{28, -11, 21, -11, 9, -7, 24, -49, 3, -88, 77}, new byte[]{123, -112})) || str3.equals(C28162a.m38504a(new byte[]{-81, 126, -83, 103}, new byte[]{-5, 42})) || str3.contains(C28162a.m38504a(new byte[]{6, 31, 35, 8}, new byte[]{71, 113}))) {
                i++;
            }
            String str4 = Build.DEVICE;
            if (str4.contains(C28162a.m38504a(new byte[]{101, 77, 108, 77, 112, 65, 97}, new byte[]{2, 40})) || str4.contains(C28162a.m38504a(new byte[]{-11, -6, -4, -6, -32, -10, -15, -64, -22, -89, -92}, new byte[]{-110, -97})) || str4.contains(C28162a.m38504a(new byte[]{36, 70, 1, 81}, new byte[]{101, 40})) || str4.contains(C28162a.m38504a(new byte[]{28, 89, 62, 96, 55, 101, 12, 95, 9, 74, 7, 67}, new byte[]{104, 45})) || str4.contains(C28162a.m38504a(new byte[]{-86, 32, -127, 59, -118, 102, -74}, new byte[]{-18, 82})) || str4.contains(C28162a.m38504a(new byte[]{38, 10, 48}, new byte[]{72, 101})) || str4.contains(C28162a.m38504a(new byte[]{92, -17, 85, -17, 73, -29, 88, -43, 67, -78, 13, -43, 13, -66}, new byte[]{59, -118})) || str4.contains(C28162a.m38504a(new byte[]{-55, -114, -48, -108, -121, -38, -49}, new byte[]{-65, -20})) || str4.contains(C28162a.m38504a(new byte[]{-17, 49, -25, 38, -3}, new byte[]{-114, 67}))) {
                i++;
            }
            String str5 = Build.MODEL;
            if (str5.equals(C28162a.m38504a(new byte[]{43, 93, 51}, new byte[]{88, 57})) || str5.contains(C28162a.m38504a(new byte[]{62, 38, 14, 39, 26, 63, 20, 57}, new byte[]{123, 75})) || str5.equals(C28162a.m38504a(new byte[]{34, 82, 42, 90, 41, 88, 26, 78, 33, 86}, new byte[]{69, 61})) || str5.contains(C28162a.m38504a(new byte[]{-65, 36, -108, 63, -97, 98, -93}, new byte[]{-5, 86})) || str5.contains(C28162a.m38504a(new byte[]{-6, -31, -49, -26, -38, -31, -49, -26, -8, -59}, new byte[]{-82, -120})) || str5.contains(C28162a.m38504a(new byte[]{106, 121, 79, 110}, new byte[]{43, 23})) || str5.equals(C28162a.m38504a(new byte[]{67, -115, 102, -111, 109, -118, 102, -61, 81, -89, 73, -61, 96, -106, 107, -113, 118, -61, 100, -116, 112, -61, 122, -37, 52, -68, 52, -41}, new byte[]{2, -29})) || str5.equals(C28162a.m38504a(new byte[]{-92, 104, -127, 116, -118, 111, -127, 38, -74, 66, -82, 38, -121, 115, -116, 106, -111, 38, -125, 105, -105, 38, -99, 62, -45}, new byte[]{-27, 6}))) {
                i++;
            }
            String str6 = Build.HARDWARE;
            if (str6.equals(C28162a.m38504a(new byte[]{-66, 2, -75, 9, -65, 4, -86, 5}, new byte[]{-39, 109})) || str6.equals(C28162a.m38504a(new byte[]{-46, -60, -53, -34, -100, -112}, new byte[]{-92, -90})) || str6.contains(C28162a.m38504a(new byte[]{-48, -75, -58}, new byte[]{-66, -38})) || str6.contains(C28162a.m38504a(new byte[]{65, -38, 99, -29, 106, -42, 13, -104}, new byte[]{53, -82}))) {
                i++;
            }
            String str7 = Build.FINGERPRINT;
            if (str7.contains(C28162a.m38504a(new byte[]{100, -69, 109, -69, 113, -73, 96, -15, 112, -70, 104, -15, 100, -69, 109, -69, 113, -73, 96}, new byte[]{3, -34})) || str7.contains(C28162a.m38504a(new byte[]{41, 86, 32, 86, 60, 90, 45, 108, 54, 11, 120, 28, 61, 87, 37, 108, 54, 11, 120, 28, 41, 86, 32, 86, 60, 90, 45, 108, 54, 11, 120}, new byte[]{78, 51})) || str7.contains(C28162a.m38504a(new byte[]{30, 8, 59, 31}, new byte[]{95, 102})) || str7.contains(C28162a.m38504a(new byte[]{-27, -57, -57, -2, -50, -5, -11, -63, -16, -44, -2, -35}, new byte[]{-111, -77})) || str7.contains(C28162a.m38504a(new byte[]{-28, 58, -19, 58, -15, 54, -32, 0, -5, 103, -75, 0, -75, 107}, new byte[]{-125, 95})) || str7.contains(C28162a.m38504a(new byte[]{-9, 47, -2, 47, -30, 35, -13, 101, -9, 37, -1, 45, -4, 47, -49, 57, -12, 33, -65, 45, -11, 36, -11, 56, -7, 41}, new byte[]{-112, 74})) || str7.contains(C28162a.m38504a(new byte[]{-57, 37, -34, 63, -119, 113, -63}, new byte[]{-79, 71})) || str7.contains(C28162a.m38504a(new byte[]{116, 87, 125, 87, 97, 91, 112, 29, 101, 80, 124, 74, 43, 4, 99, 29, 101, 80, 124, 74, 43, 4, 99}, new byte[]{19, 50}))) {
                i++;
            }
            try {
                if (new File(Environment.getExternalStorageDirectory().toString() + File.separatorChar + C28162a.m38504a(new byte[]{-106, -115, -113, UnsignedBytes.MAX_POWER_OF_TWO, -114, -109, -110}, new byte[]{-31, -28}) + File.separatorChar + C28162a.m38504a(new byte[]{2, 48, 52, 16, 40, 34, 50, 38, 36, 5, 47, 47, 36, 38, 50}, new byte[]{SignedBytes.MAX_POWER_OF_TWO, 67})).exists()) {
                    i += 10;
                }
            } catch (Exception unused) {
            }
            f73509a = i;
        }
        if (f73509a > 3) {
            return true;
        }
        return C28301a.m38265a(context).m38264a(true).m38261c();
    }

    /* renamed from: b */
    public static boolean m38268b(Context context) {
        if (m38267c(context)) {
            return true;
        }
        String str = Build.PRODUCT;
        if (!str.contains(C28162a.m38504a(new byte[]{-13, 89, -21}, new byte[]{UnsignedBytes.MAX_POWER_OF_TWO, 61})) && !str.contains(C28162a.m38504a(new byte[]{37, 27, 61, 32, 46, 71, 96}, new byte[]{86, Byte.MAX_VALUE})) && !str.contains(C28162a.m38504a(new byte[]{-28, -63, -4, -6, -16, -54, -8, -62, -5, -64}, new byte[]{-105, -91})) && !str.contains(C28162a.m38504a(new byte[]{-98, -17, -69, -8}, new byte[]{-33, -127})) && !str.contains(C28162a.m38504a(new byte[]{12, -37, 39, -64, 44, -99, 16}, new byte[]{72, -87})) && !str.contains(C28162a.m38504a(new byte[]{67, -20, 85}, new byte[]{45, -125})) && !str.contains(C28162a.m38504a(new byte[]{96, -17, 121, -11, 46, -69, 102}, new byte[]{22, -115})) && !str.contains(C28162a.m38504a(new byte[]{-101, -71, -109, -82, -119}, new byte[]{-6, -53}))) {
            String str2 = Build.MANUFACTURER;
            if (str2.equals(C28162a.m38504a(new byte[]{72, -53, 97, -41, 98, -63, 123, -57, 96, -64}, new byte[]{15, -82})) || str2.contains(C28162a.m38504a(new byte[]{-50, -13, -21, -28}, new byte[]{-113, -99})) || str2.contains(C28162a.m38504a(new byte[]{123, 25, 109}, new byte[]{21, 118})) || str2.contains(C28162a.m38504a(new byte[]{-123, -124, -80, -125, -91, -124, -80, -125, -121, -96}, new byte[]{-47, -19})) || Build.BRAND.contains(C28162a.m38504a(new byte[]{-98, -106, -69, -127}, new byte[]{-33, -8}))) {
                return true;
            }
            String str3 = Build.DEVICE;
            if (!str3.contains(C28162a.m38504a(new byte[]{19, 32, 54, 55}, new byte[]{82, 78})) && !str3.contains(C28162a.m38504a(new byte[]{96, -29, 75, -8, SignedBytes.MAX_POWER_OF_TWO, -91, 124}, new byte[]{36, -111})) && !str3.contains(C28162a.m38504a(new byte[]{88, -16, 78}, new byte[]{54, -97})) && !str3.contains(C28162a.m38504a(new byte[]{12, 99, 21, 121, 66, 55, 10}, new byte[]{122, 1})) && !str3.contains(C28162a.m38504a(new byte[]{9, -92, 1, -77, 27}, new byte[]{104, -42}))) {
                String str4 = Build.MODEL;
                if (!str4.contains(C28162a.m38504a(new byte[]{11, 101, 59, 100, 47, 124, 33, 122}, new byte[]{78, 8})) && !str4.equals(C28162a.m38504a(new byte[]{68, -52, 76, -60, 79, -58, 124, -48, 71, -56}, new byte[]{35, -93})) && !str4.contains(C28162a.m38504a(new byte[]{-9, 53, -36, 46, -41, 115, -21}, new byte[]{-77, 71})) && !str4.contains(C28162a.m38504a(new byte[]{59, -40, 14, -33, 27, -40, 14, -33, 57, -4}, new byte[]{111, -79})) && !str4.contains(C28162a.m38504a(new byte[]{-9, -98, -46, -119}, new byte[]{-74, -16})) && !str4.equals(C28162a.m38504a(new byte[]{7, 27, 34, 7, 41, 28, 34, 85, 21, 49, 13, 85, 36, 0, 47, 25, 50, 85, 32, 26, 52, 85, 62, 77, 112, 42, 112, 65}, new byte[]{70, 117})) && !str4.equals(C28162a.m38504a(new byte[]{-94, 85, -121, 73, -116, 82, -121, 27, -80, Byte.MAX_VALUE, -88, 27, -127, 78, -118, 87, -105, 27, -123, 84, -111, 27, -101, 3, -43}, new byte[]{-29, 59}))) {
                    String str5 = Build.HARDWARE;
                    if (!str5.equals(C28162a.m38504a(new byte[]{23, 99, 14, 121, 89, 55}, new byte[]{97, 1})) && !str5.contains(C28162a.m38504a(new byte[]{92, -1, 74}, new byte[]{50, -112})) && !str5.contains(C28162a.m38504a(new byte[]{90, 68, 120, 125, 113, 72, 22, 6}, new byte[]{46, 48}))) {
                        String str6 = Build.FINGERPRINT;
                        if (!str6.contains(C28162a.m38504a(new byte[]{-36, -105, -43, -105, -55, -101, -40, -35, -56, -106, -48, -35, -36, -105, -43, -105, -55, -101, -40}, new byte[]{-69, -14})) && !str6.contains(C28162a.m38504a(new byte[]{-61, 50, -54, 50, -42, 62, -57, 8, -36, 111, -110, 120, -41, 51, -49, 8, -36, 111, -110, 120, -61, 50, -54, 50, -42, 62, -57, 8, -36, 111, -110}, new byte[]{-92, 87})) && !str6.contains(C28162a.m38504a(new byte[]{-63, 99, -28, 116}, new byte[]{UnsignedBytes.MAX_POWER_OF_TWO, 13})) && !str6.contains(C28162a.m38504a(new byte[]{-62, -1, -32, -58, -23, -61, -46, -7, -41, -20, -39, -27}, new byte[]{-74, -117})) && !str6.contains(C28162a.m38504a(new byte[]{25, 109, 16, 109, 12, 97, 29, 39, 25, 103, 17, 111, 18, 109, 33, 123, 26, 99, 81, 111, 27, 102, 27, 122, 23, 107}, new byte[]{126, 8})) && !str6.contains(C28162a.m38504a(new byte[]{74, -113, 83, -107, 4, -37, 76}, new byte[]{60, -19})) && !str6.contains(C28162a.m38504a(new byte[]{-20, -98, -27, -98, -7, -110, -24, -44, -3, -103, -28, -125, -77, -51, -5, -44, -3, -103, -28, -125, -77, -51, -5}, new byte[]{-117, -5}))) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m38267c(Context context) {
        String str;
        StringFogImpl stringFogImpl = C28162a.f73047a;
        String m23824a = stringFogImpl.m23824a(new byte[]{-87, 17, -11, 21, -66, 12, -75, 27, -73, 80, -86, 27, -74, 11}, new byte[]{-37, 126});
        try {
            Class<?> loadClass = context.getClassLoader().loadClass(stringFogImpl.m23824a(new byte[]{21, -102, 16, -122, 27, -99, 16, -38, 27, -121, 90, -89, 13, -121, 0, -111, 25, -92, 6, -101, 4, -111, 6, UnsignedBytes.MAX_POWER_OF_TWO, 29, -111, 7}, new byte[]{116, -12}));
            str = (String) loadClass.getMethod(stringFogImpl.m23824a(new byte[]{-118, 49, -103}, new byte[]{-19, 84}), String.class).invoke(loadClass, m23824a);
        } catch (Exception unused) {
            str = null;
        }
        return C28162a.f73047a.m23824a(new byte[]{42}, new byte[]{27, -55}).equals(str);
    }

    @TargetApi(14)
    /* renamed from: com.taurusx.tax.c.f.d.e$a */
    /* loaded from: classes7.dex */
    public static class C28301a {
        @SuppressLint({"StaticFieldLeak"})

        /* renamed from: l */
        public static C28301a f73518l;

        /* renamed from: a */
        public Context f73519a;

        /* renamed from: b */
        public boolean f73520b = true;

        /* renamed from: c */
        public List<String> f73521c;

        /* renamed from: k */
        public static final String f73517k = C28162a.m38504a(new byte[]{19, -59, 12, -59, 12, -57, 12, -60, 23}, new byte[]{34, -11});

        /* renamed from: d */
        public static final String[] f73510d = {C28162a.m38504a(new byte[]{86, 21, 28, 7, 86, 2, 22, 18, 18, 20, 13, 94, 30, 20, 23, 8, 29}, new byte[]{121, 113}), C28162a.m38504a(new byte[]{-24, -43, -94, -57, -24, -62, -88, -46, -84, -44, -77, -98, -91, -48, -76, -44, -91, -48, -87, -43, -104, -42, -94, -33, -66, -43}, new byte[]{-57, -79})};

        /* renamed from: e */
        public static final String[] f73511e = {C28162a.m38504a(new byte[]{65, -122, 74, -115, SignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 85, -127}, new byte[]{38, -23})};

        /* renamed from: f */
        public static final String[] f73512f = {C28162a.m38504a(new byte[]{-53, 0, -127, 18, -53, 23, -117, 7, -113, 1, -112, 75, -107, 1, -119, 17, UnsignedBytes.MAX_POWER_OF_TWO}, new byte[]{-28, 100}), C28162a.m38504a(new byte[]{45, -27, 103, -9, 45, -16, 103, -20, 119, -34, 114, -24, 114, -28}, new byte[]{2, -127})};

        /* renamed from: g */
        public static final String[] f73513g = {C28162a.m38504a(new byte[]{96, -37, 99, -37, 123, -54, 113, -112, 116, -48, 113, -52, 122, -41, 113, -31, 109, -122, 35, -112, 103, -35}, new byte[]{21, -66}), C28162a.m38504a(new byte[]{-75, 120, -5, 110, -67, 50, -94, 48}, new byte[]{-51, SignedBytes.MAX_POWER_OF_TWO}), C28162a.m38504a(new byte[]{78, 90, 77, 90, 85, 75, 95, 17, 79, 75, 109, 114, 100, 71, 3, 9, 21, 77, 88}, new byte[]{59, 63}), C28162a.m38504a(new byte[]{114, -80, 114, -86, 53, -86, 111, -120, 86, -127, 99, -26, 45, -16, 105, -67}, new byte[]{27, -34}), C28162a.m38504a(new byte[]{-28, -73, -10, -91, -32, -22, -10, -80, -44, -119, -35, -68, -70, -14}, new byte[]{-126, -60}), C28162a.m38504a(new byte[]{-6, 66, -24, 80, -2, 31, -22, 83, -13, 73, -92, 7}, new byte[]{-100, 49}), C28162a.m38504a(new byte[]{-23, -118, -23, -112, -82, -110, -30, -117, -8, -36, -74, -54, -14, -121}, new byte[]{UnsignedBytes.MAX_POWER_OF_TWO, -28}), C28162a.m38504a(new byte[]{103, -31, 100, -31, 124, -16, 118, -86, 100, -26, 125, -4, 42, -78, 60, -10, 113}, new byte[]{18, -124})};

        /* renamed from: h */
        public static final String[] f73514h = {C28162a.m38504a(new byte[]{-14, -104, -32, -118, -10, -59, -11, -123, -16, -110}, new byte[]{-108, -21}), C28162a.m38504a(new byte[]{22, 6, 21, 6, 13, 23, 7, 77, 2, 13, 7, 26, 77, 17, 0}, new byte[]{99, 99})};

        /* renamed from: i */
        public static final String[] f73515i = {C28162a.m38504a(new byte[]{81, -9, 67, -27, 85, -86, 89, -21, 79}, new byte[]{55, -124}), C28162a.m38504a(new byte[]{1, -26, 1, -4, 70, -26, 7, -16, 70, -6, 11}, new byte[]{104, -120}), C28162a.m38504a(new byte[]{-108, -30, -105, -30, -113, -13, -123, -87, -113, -24, -103, -87, -109, -28}, new byte[]{-31, -121})};

        /* renamed from: j */
        public static final C28302a[] f73516j = {new C28302a(C28162a.m38504a(new byte[]{87, 30, 87, 4, 16, 3, 72, 19, 16, 1, 91, 29, 75, 20}, new byte[]{62, 112}), null), new C28302a(C28162a.m38504a(new byte[]{-29, -19, -29, -9, -92, -16, -4, -32, -92, -14, -17, -18, -1, -82, -6, -15, -27, -13, -7}, new byte[]{-118, -125}), null), new C28302a(C28162a.m38504a(new byte[]{81, -91, 77, -75, 14, -88, 87, -18, 77, -95, 73, -82, 75, -91, 89, -77}, new byte[]{32, -64}), null), new C28302a(C28162a.m38504a(new byte[]{56, 104, 36, 120, 103, 126, 47, 35, 47, 108, 34, 104, 22, 110, 40, 96, 44, Byte.MAX_VALUE, 40}, new byte[]{73, 13}), null), new C28302a(C28162a.m38504a(new byte[]{-3, 82, -31, 66, -94, 68, -22, 25, -32, 84, -24, 104, -24, 82, -30, 68, -27, 67, -11}, new byte[]{-116, 55}), null), new C28302a(C28162a.m38504a(new byte[]{-37, 83, -121, 94, -58, 83, -35, 80, -58, 93, -51, 89, -37}, new byte[]{-87, 60}), C28162a.m38504a(new byte[]{-24, -54, -10, -54, -14, -45, -13}, new byte[]{-99, -92})), new C28302a(C28162a.m38504a(new byte[]{92, -96, 0, -83, 65, -96, 90, -94, 65, -85, 75}, new byte[]{46, -49}), C28162a.m38504a(new byte[]{11, 54, 21, 54, 17, 47, 16}, new byte[]{126, 88})), new C28302a(C28162a.m38504a(new byte[]{-76, 104, -24, 111, -89, 117, -94, 112, -89, 117, -93}, new byte[]{-58, 7}), C28162a.m38504a(new byte[]{29, -57, 22, -52, 28, -63, 9, -64}, new byte[]{122, -88})), new C28302a(C28162a.m38504a(new byte[]{96, -84, 60, -88, 119, -79, 124, -90, 126, -19, 115, -83, 118, -79, 125, -86, 118, -19, 99, -90, Byte.MAX_VALUE, -74, 118}, new byte[]{18, -61}), null), new C28302a(C28162a.m38504a(new byte[]{-112, 92, -52, 88, -121, 65, -116, 86, -114, 29, -109, 86, -113, 70, -52, 84, -114, 86, -111}, new byte[]{-30, 51}), null), new C28302a(C28162a.m38504a(new byte[]{-18, 67, -78, 71, -7, 94, -14, 73, -16, 2, -19, 73, -15, 89}, new byte[]{-100, 44}), C28162a.m38504a(new byte[]{-5}, new byte[]{-54, -92})), new C28302a(C28162a.m38504a(new byte[]{-110, -101, -50, -124, -110, -101, -124, -127, -125, UnsignedBytes.MAX_POWER_OF_TWO, -50, -112, -123, -126, -119, -105, -123}, new byte[]{-32, -12}), C28162a.m38504a(new byte[]{15, -109, 6, -109, 26, -97, 11}, new byte[]{104, -10})), new C28302a(C28162a.m38504a(new byte[]{62, 36, 98, 59, 62, 36, 40, 62, 47, 63, 98, 38, 35, 47, 41, 39}, new byte[]{76, 75}), C28162a.m38504a(new byte[]{-61, 122, -37}, new byte[]{-80, 30})), new C28302a(C28162a.m38504a(new byte[]{103, 44, 59, 51, 103, 44, 113, 54, 118, 55, 59, 45, 116, 46, 112}, new byte[]{21, 67}), C28162a.m38504a(new byte[]{54, 117, 46}, new byte[]{69, 17})), new C28302a(C28162a.m38504a(new byte[]{54, 91, 106, 71, 33, 70, 45, 85, 40, 90, 43}, new byte[]{68, 52}), null)};

        /* renamed from: com.taurusx.tax.c.f.d.e$a$a */
        /* loaded from: classes7.dex */
        public static class C28302a {

            /* renamed from: a */
            public String f73522a;

            /* renamed from: b */
            public String f73523b;

            public C28302a(String str, String str2) {
                this.f73522a = str;
                this.f73523b = str2;
            }
        }

        public C28301a(Context context) {
            ArrayList arrayList = new ArrayList();
            this.f73521c = arrayList;
            this.f73519a = context;
            arrayList.add(C28162a.m38504a(new byte[]{119, 107, 121, 42, 115, 107, 123, 99, 120, 97, 58, 101, 122, 96, 102, 107, 125, 96, 58, 104, 117, 113, 122, 103, 124, 97, 102, 42, 120, 101, 109, 107, 97, 112, 103, 42, 115, 97, 122, 125, 121, 107, 96, 109, 123, 106}, new byte[]{20, 4}));
            this.f73521c.add(C28162a.m38504a(new byte[]{-3, 4, -13, 69, -4, 7, -21, 14, -19, 31, -1, 8, -11, 24}, new byte[]{-98, 107}));
            this.f73521c.add(C28162a.m38504a(new byte[]{-101, 16, -107, 81, -102, 22, -97, 17, -105, 7, -42, 30, -120, 15}, new byte[]{-8, Byte.MAX_VALUE}));
        }

        /* renamed from: a */
        public static C28301a m38265a(Context context) {
            if (context != null) {
                if (f73518l == null) {
                    f73518l = new C28301a(context.getApplicationContext());
                }
                return f73518l;
            }
            throw new IllegalArgumentException(C28162a.f73047a.m23824a(new byte[]{54, 72, 27, 83, 16, 95, 1, 7, 24, 82, 6, 83, 85, 73, 26, 83, 85, 69, 16, 7, 27, 82, 25, 75, 91}, new byte[]{117, 39}));
        }

        /* renamed from: b */
        public final boolean m38262b() {
            String[] split;
            Context context = this.f73519a;
            StringFogImpl stringFogImpl = C28162a.f73047a;
            if (ContextCompat.checkSelfPermission(context, stringFogImpl.m23824a(new byte[]{-74, -101, -77, -121, -72, -100, -77, -37, -89, -112, -91, -104, -66, -122, -92, -100, -72, -101, -7, -68, -103, -95, -110, -89, -103, -80, -125}, new byte[]{-41, -11})) != 0) {
                return false;
            }
            String[] strArr = {stringFogImpl.m23824a(new byte[]{96, -66, 54, -66, 59, -88, 34, -30, 45, -92, 33, -30, 33, -88, 59, -82, 41, -86}, new byte[]{79, -51})};
            StringBuilder sb2 = new StringBuilder();
            try {
                ProcessBuilder processBuilder = new ProcessBuilder(strArr);
                processBuilder.directory(new File(stringFogImpl.m23824a(new byte[]{18, -114, 68, -114, 73, -104, 80, -46, 95, -108, 83, -46}, new byte[]{61, -3})));
                processBuilder.redirectErrorStream(true);
                InputStream inputStream = processBuilder.start().getInputStream();
                byte[] bArr = new byte[1024];
                while (inputStream.read(bArr) != -1) {
                    sb2.append(new String(bArr));
                }
                inputStream.close();
            } catch (Exception unused) {
            }
            String sb3 = sb2.toString();
            if (TextUtils.isEmpty(sb3)) {
                return false;
            }
            for (String str : sb3.split("\n")) {
                StringFogImpl stringFogImpl2 = C28162a.f73047a;
                if ((str.contains(stringFogImpl2.m23824a(new byte[]{59, 31, 45, 29, 124}, new byte[]{76, 115})) || str.contains(stringFogImpl2.m23824a(new byte[]{75, 61, 81, 36, 15}, new byte[]{63, 72})) || str.contains(stringFogImpl2.m23824a(new byte[]{33, -110, 44, -42}, new byte[]{68, -26}))) && str.contains(f73517k)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:86:0x029f, code lost:
            if (m38263a(r0) != false) goto L104;
         */
        /* JADX WARN: Removed duplicated region for block: B:104:0x02e0  */
        /* JADX WARN: Removed duplicated region for block: B:127:0x0279 A[ADDED_TO_REGION, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x026b A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0271  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x02a7  */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean m38261c() {
            /*
                Method dump skipped, instructions count: 917
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.p583c.p590f.p591d.C28300e.C28301a.m38261c():boolean");
        }

        /* renamed from: a */
        public C28301a m38264a(boolean z) {
            this.f73520b = z;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x0190 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0191  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean m38266a() {
            /*
                Method dump skipped, instructions count: 757
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.p583c.p590f.p591d.C28300e.C28301a.m38266a():boolean");
        }

        /* renamed from: a */
        public final boolean m38263a(String[] strArr) {
            for (String str : strArr) {
                if (new File(str).exists()) {
                    return true;
                }
            }
            return false;
        }
    }
}
