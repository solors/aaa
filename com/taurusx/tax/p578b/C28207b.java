package com.taurusx.tax.p578b;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.WindowManager;
import android.webkit.WebView;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.iab.omid.library.taurusx.Omid;
import com.iab.omid.library.taurusx.adsession.AdSession;
import com.iab.omid.library.taurusx.adsession.AdSessionConfiguration;
import com.iab.omid.library.taurusx.adsession.AdSessionContext;
import com.iab.omid.library.taurusx.adsession.CreativeType;
import com.iab.omid.library.taurusx.adsession.ImpressionType;
import com.iab.omid.library.taurusx.adsession.Owner;
import com.iab.omid.library.taurusx.adsession.Partner;
import com.iab.omid.library.taurusx.adsession.VerificationScriptResource;
import com.ironsource.C21114v8;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import com.taurusx.tax.C28154R;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.api.TaurusXAdError;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.p578b.p579c.C28210c;
import com.taurusx.tax.p578b.p580d.C28218b;
import com.taurusx.tax.p594e.EnumC28381u0;
import com.taurusx.tax.p597g.p599b.p602t.C28427a;
import com.taurusx.tax.p597g.p599b.p602t.C28428b;
import com.taurusx.tax.p597g.p599b.p602t.InterfaceC28429c;
import com.taurusx.tax.p603h.C28430a;
import com.taurusx.tax.p603h.C28431b;
import com.taurusx.tax.p603h.C28432c;
import com.taurusx.tax.p606j.C28512c;
import com.taurusx.tax.p606j.C28549x;
import com.taurusx.tax.vast.VastConfig;
import com.taurusx.tax.vast.ViewabilityVendor;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.mraid.C32180coo2iico;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.b.b */
/* loaded from: classes7.dex */
public class C28207b {
    /* renamed from: a */
    public static <T> T m38455a(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: b */
    public static InterfaceC28429c m38446b() {
        return new C28428b();
    }

    /* renamed from: c */
    public static String m38440c(Context context) {
        Exception e;
        String str;
        if (!TextUtils.isEmpty("")) {
            return "";
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            str = packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 0)).toString();
            try {
                return str.replace(" ", "");
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                return str;
            }
        } catch (Exception e3) {
            e = e3;
            str = "";
        }
    }

    /* renamed from: d */
    public static String m38439d(Context context) {
        try {
            InputStream openRawResource = context.getResources().openRawResource(C28154R.raw.omsdk_v1);
            byte[] bArr = new byte[openRawResource.available()];
            String str = new String(bArr, 0, openRawResource.read(bArr), "UTF-8");
            openRawResource.close();
            return str;
        } catch (IOException e) {
            throw new UnsupportedOperationException("Yikes, omid resource not found", e);
        }
    }

    /* renamed from: e */
    public static String m38438e(Context context) {
        if (context == null) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService(C28162a.f73047a.m23824a(new byte[]{-12, -70, -31, -80, -29, -80, -31, -96}, new byte[]{-107, -39}))).getRunningAppProcesses()) {
            if (runningAppProcessInfo.pid == Process.myPid()) {
                return runningAppProcessInfo.processName;
            }
        }
        return null;
    }

    /* renamed from: f */
    public static int m38437f(Context context) {
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService(C28162a.f73047a.m23824a(new byte[]{0, 122, 25, 119, 24, 100}, new byte[]{119, 19}))).getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.heightPixels;
        } catch (Error | Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: g */
    public static int m38436g(Context context) {
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService(C28162a.f73047a.m23824a(new byte[]{-85, 126, -78, 115, -77, 96}, new byte[]{-36, 23}))).getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.widthPixels;
        } catch (Error | Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: h */
    public static String m38435h(Context context) {
        try {
            return C28549x.m37960b(context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray());
        } catch (Exception e) {
            StringFogImpl stringFogImpl = C28162a.f73047a;
            String m23824a = stringFogImpl.m23824a(new byte[]{12, 14, 13, 29, 13, 28, 0}, new byte[]{120, 111});
            LogUtil.m37901iv(m23824a, stringFogImpl.m23824a(new byte[]{-100, -48, -113, -107, -120, -36, -100, -37, -102, -63, -114, -57, -98, -107, -120, -35, -102, -124, -37, -48, -119, -57, -108, -57, -37, -113, -37}, new byte[]{-5, -75}) + e);
            return "";
        }
    }

    /* renamed from: i */
    public static int m38434i(Context context) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 16384);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            packageInfo = null;
        }
        if (packageInfo != null) {
            return packageInfo.versionCode;
        }
        return 0;
    }

    /* renamed from: j */
    public static String m38433j(Context context) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 16384);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            packageInfo = null;
        }
        if (packageInfo == null) {
            return null;
        }
        return packageInfo.versionName;
    }

    /* renamed from: k */
    public static boolean m38432k(Context context) {
        Intent type = new Intent("android.intent.action.INSERT").setType(C32180coo2iico.cii2c2);
        if (EnumC28381u0.currentApiLevel().isAtLeast(EnumC28381u0.ICE_CREAM_SANDWICH) && m38462a(context, type)) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public static boolean m38431l(Context context) {
        if ("mounted".equals(Environment.getExternalStorageState()) && context.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public static InterfaceC28429c m38430m(Context context) {
        return new C28427a(context);
    }

    /* renamed from: a */
    public static TaurusXAdError m38464a(int i, String str) {
        if (i == 1) {
            if (TextUtils.isEmpty(str)) {
                str = C28162a.f73047a.m23824a(new byte[]{-1, 27, -32, 20, -6, 28, -14, 39, -13, 4, -29, 16, -27, 1}, new byte[]{-106, 117});
            }
            return TaurusXAdError.invalidRequest(str);
        } else if (i == 2) {
            if (TextUtils.isEmpty(str)) {
                str = C28162a.f73047a.m23824a(new byte[]{-49, -37, -43, -55, -50, -52, -54, -5, -45, -52, -50, -52}, new byte[]{-95, -66});
            }
            return TaurusXAdError.networkError(str);
        } else if (i == 3) {
            if (TextUtils.isEmpty(str)) {
                str = C28162a.f73047a.m23824a(new byte[]{-88, 1, -58, 40, -113, 2, -118}, new byte[]{-26, 110});
            }
            return TaurusXAdError.noFill(str);
        } else if (i == 4) {
            if (TextUtils.isEmpty(str)) {
                str = C28162a.f73047a.m23824a(new byte[]{-70, -84, -93, -96, -127, -80, -70}, new byte[]{-50, -59});
            }
            return TaurusXAdError.timeOut(str);
        } else if (i == 5) {
            if (TextUtils.isEmpty(str)) {
                str = C28162a.f73047a.m23824a(new byte[]{19, 104, 15, 119, 38, 97, 9, 108, 5, 100, 37, 114, 18, 111, 18}, new byte[]{96, 0});
            }
            return TaurusXAdError.showFailedError(str);
        } else if (i == 6) {
            if (TextUtils.isEmpty(str)) {
                str = C28162a.f73047a.m23824a(new byte[]{41, 78, 4, 78, 41, 85, 34, 79, 51}, new byte[]{71, 33});
            }
            return TaurusXAdError.noContent(str);
        } else if (i == 7) {
            if (TextUtils.isEmpty(str)) {
                str = C28162a.f73047a.m23824a(new byte[]{120, 123, 101, 112, 99, 123, 112, 121, 84, 103, 99, 122, 99}, new byte[]{17, 21});
            }
            return TaurusXAdError.internalError(str);
        } else if (i == 204) {
            return TaurusXAdError.noFill(C28162a.f73047a.m23824a(new byte[]{50, -103, 92, -80, 21, -102, 16}, new byte[]{124, -10}));
        } else if (i == 408 || i == 504) {
            StringBuilder sb2 = new StringBuilder();
            StringFogImpl stringFogImpl = C28162a.f73047a;
            sb2.append(stringFogImpl.m23824a(new byte[]{-86, 16, -106, 20, -62, 55, -106, 5, -106, 17, -111, 68, -95, 11, -122, 1, -62, 13, -111, 68}, new byte[]{-30, 100}));
            sb2.append(i);
            sb2.append(stringFogImpl.m23824a(new byte[]{-49, 13, -112, 7, -61, 9, -112, SignedBytes.MAX_POWER_OF_TWO}, new byte[]{-29, 96}));
            sb2.append(str);
            return TaurusXAdError.timeOut(sb2.toString());
        } else if (i >= 500) {
            StringBuilder sb3 = new StringBuilder();
            StringFogImpl stringFogImpl2 = C28162a.f73047a;
            sb3.append(stringFogImpl2.m23824a(new byte[]{-70, -18, -122, -22, -46, -55, -122, -5, -122, -17, -127, -70, -79, -11, -106, -1, -46, -13, -127, -70}, new byte[]{-14, -102}));
            sb3.append(i);
            sb3.append(stringFogImpl2.m23824a(new byte[]{-29, -107, -68, -97, -17, -111, -68, -40}, new byte[]{-49, -8}));
            sb3.append(str);
            return TaurusXAdError.internalError(sb3.toString());
        } else {
            StringBuilder sb4 = new StringBuilder();
            StringFogImpl stringFogImpl3 = C28162a.f73047a;
            sb4.append(stringFogImpl3.m23824a(new byte[]{-42, -52, -22, -56, -66, -21, -22, -39, -22, -51, -19, -104, -35, -41, -6, -35, -66, -47, -19, -104}, new byte[]{-98, -72}));
            sb4.append(i);
            sb4.append(stringFogImpl3.m23824a(new byte[]{77, 46, 18, 36, 65, 42, 18, 99}, new byte[]{97, 67}));
            sb4.append(str);
            return TaurusXAdError.internalError(sb4.toString());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: b */
    public static int m38445b(Context context) {
        try {
            StringFogImpl stringFogImpl = C28162a.f73047a;
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService(stringFogImpl.m23824a(new byte[]{40, 12, 37, 13, 46, 0, 63, 10, 61, 10, 63, 26}, new byte[]{75, 99}))).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return 0;
            }
            if (activeNetworkInfo.getType() == 1) {
                return 2;
            }
            if (activeNetworkInfo.getType() == 0) {
                String subtypeName = activeNetworkInfo.getSubtypeName();
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        return 4;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        break;
                    case 13:
                    case 18:
                    case 19:
                        return 6;
                    case 16:
                    case 17:
                    default:
                        byte[] bArr = new byte[8];
                        bArr[0] = 37;
                        bArr[1] = 79;
                        bArr[2] = 92;
                        bArr[3] = 88;
                        bArr[4] = 50;
                        bArr[5] = 79;
                        bArr[6] = 60;
                        bArr[7] = 74;
                        if (!subtypeName.equalsIgnoreCase(stringFogImpl.m23824a(bArr, new byte[]{113, 11})) && !subtypeName.equalsIgnoreCase(stringFogImpl.m23824a(new byte[]{110, -81, 125, -95, 120}, new byte[]{57, -20}))) {
                            if (!subtypeName.equalsIgnoreCase(stringFogImpl.m23824a(new byte[]{-30, -106, -20, -109, -109, -30, -111, -30}, new byte[]{-95, -46}))) {
                                return 0;
                            }
                        }
                        break;
                    case 20:
                        return 7;
                }
                return 5;
            }
            return 0;
        } catch (Error | Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: b */
    public static void m38443b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        LogUtil.m37900v("TaxTrackEvent", "progress list:" + str);
        C28432c.m38095a().m38094a(m38452a(str, "", str2), "ad-progress", new C28431b());
    }

    /* renamed from: b */
    public static byte[] m38444b(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) (m38467a(str.charAt(i2 + 1)) | (m38467a(str.charAt(i2)) << 4));
            }
            return bArr;
        }
        throw new IllegalArgumentException(C28162a.f73047a.m23824a(new byte[]{-113, -52, -115, -50, -105, -63, -61, -60, -106, -38, -105, -119, -127, -52, -61, -52, -107, -52, -115, -120}, new byte[]{-29, -87}));
    }

    /* renamed from: b */
    public static byte[] m38441b(byte[] bArr, byte[] bArr2) throws Exception {
        StringFogImpl stringFogImpl = C28162a.f73047a;
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, stringFogImpl.m23824a(new byte[]{73, -36, 91}, new byte[]{8, -103}));
        Cipher cipher = Cipher.getInstance(stringFogImpl.m23824a(new byte[]{-108, -109, -122, -7, -106, -108, -106, -7, -123, -99, -106, -123, -32, -122, -76, -78, -79, -65, -69, -79}, new byte[]{-43, -42}));
        cipher.init(1, secretKeySpec, new IvParameterSpec(new byte[cipher.getBlockSize()]));
        return cipher.doFinal(bArr2);
    }

    /* renamed from: b */
    public static String m38442b(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (byte b : bArr) {
            StringFogImpl stringFogImpl = C28162a.f73047a;
            stringBuffer.append(stringFogImpl.m23824a(new byte[]{49, 18, 51, 16, 53, 22, 55, 20, 57, 26, SignedBytes.MAX_POWER_OF_TWO, 97, 66, 103, 68, 101}, new byte[]{1, 35}).charAt((b >> 4) & 15));
            stringBuffer.append(stringFogImpl.m23824a(new byte[]{-15, 58, -13, 56, -11, 62, -9, 60, -7, 50, UnsignedBytes.MAX_POWER_OF_TWO, 73, -126, 79, -124, 77}, new byte[]{-63, 11}).charAt(b & 15));
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static String m38460a(Context context, String str) {
        BufferedInputStream bufferedInputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BufferedInputStream bufferedInputStream2 = null;
        try {
            try {
                bufferedInputStream = new BufferedInputStream(context.getAssets().open(str));
            } catch (Error e) {
                e = e;
            } catch (Exception e2) {
                e = e2;
            }
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                m38456a((Closeable) bufferedInputStream);
            } catch (Error e3) {
                e = e3;
                bufferedInputStream2 = bufferedInputStream;
                LogUtil.m37904e("", C28162a.f73047a.m23824a(new byte[]{-33, -59, -45, -14, -11, -17, -26, -2, -1, -27, -8, -86, -84}, new byte[]{-106, -118}) + e.getMessage());
                m38456a((Closeable) bufferedInputStream2);
                return byteArrayOutputStream.toString();
            } catch (Exception e4) {
                e = e4;
                bufferedInputStream2 = bufferedInputStream;
                LogUtil.m37904e("", C28162a.f73047a.m23824a(new byte[]{-33, -59, -45, -14, -11, -17, -26, -2, -1, -27, -8, -86, -84}, new byte[]{-106, -118}) + e.getMessage());
                m38456a((Closeable) bufferedInputStream2);
                return byteArrayOutputStream.toString();
            } catch (Throwable th) {
                th = th;
                bufferedInputStream2 = bufferedInputStream;
                m38456a((Closeable) bufferedInputStream2);
                throw th;
            }
            return byteArrayOutputStream.toString();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    public static byte[] m38448a(byte[] bArr, String str, String str2) {
        try {
            byte[] m38050a = C28512c.m38050a(str);
            byte[] m38050a2 = C28512c.m38050a(str2);
            StringFogImpl stringFogImpl = C28162a.f73047a;
            Cipher cipher = Cipher.getInstance(stringFogImpl.m23824a(new byte[]{61, 47, 47, 69, 63, 40, 63, 69, 44, 33, 63, 57, 73, 58, 29, 14, 24, 3, 18, 13}, new byte[]{124, 106}));
            cipher.getBlockSize();
            cipher.init(1, new SecretKeySpec(m38050a, stringFogImpl.m23824a(new byte[]{1, 123, 19}, new byte[]{SignedBytes.MAX_POWER_OF_TWO, 62})), new IvParameterSpec(m38050a2));
            return cipher.doFinal(bArr);
        } catch (Error | Exception e) {
            StringFogImpl stringFogImpl2 = C28162a.f73047a;
            String m23824a = stringFogImpl2.m23824a(new byte[]{28, -71, 29, -86, 29, -85, 16}, new byte[]{104, -40});
            LogUtil.m37904e(m23824a, stringFogImpl2.m23824a(new byte[]{10, 90, 12, 70, 22, 68, 27, 20, 10, 70, 29, 91, 29, 20, 85, 20}, new byte[]{111, 52}) + e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m38453a(String str, String str2) {
        try {
            byte[] m38449a = m38449a(str.getBytes());
            int length = str2.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = Integer.valueOf(str2.substring(i2, i2 + 2), 16).byteValue();
            }
            return new String(m38447a(m38449a, bArr));
        } catch (Exception e) {
            PrintStream printStream = System.out;
            printStream.println(C28162a.f73047a.m23824a(new byte[]{-64, -15, -57, -26, -35, -28, -48, -76, -63, -26, -42, -5, -42, -82, -124}, new byte[]{-92, -108}) + e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m38463a(Context context) {
        if (C28206a.m38470e().f73194j) {
            return "http://192.46.225.199/ssp/v1/ad";
        }
        String m38408i = C28218b.m38408i();
        return TextUtils.isEmpty(m38408i) ? "https://sdksg.ssp.taxssp.com/ssp/v1/ad" : m38408i;
    }

    /* renamed from: a */
    public static void m38450a(HashSet<String> hashSet, String str, String str2) {
        if (hashSet.size() <= 0) {
            return;
        }
        LogUtil.m37900v("TaxTrackEvent", "error list:" + hashSet.toString());
        Iterator<String> it = hashSet.iterator();
        while (it.hasNext()) {
            C28432c.m38095a().m38094a(m38452a(it.next(), str, str2), "ad-error", new C28430a());
        }
    }

    /* renamed from: a */
    public static byte[] m38447a(byte[] bArr, byte[] bArr2) throws Exception {
        StringFogImpl stringFogImpl = C28162a.f73047a;
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, stringFogImpl.m23824a(new byte[]{55, -10, 37}, new byte[]{118, -77}));
        Cipher cipher = Cipher.getInstance(stringFogImpl.m23824a(new byte[]{59, -91, 41, -49, 57, -94, 57, -49, 42, -85, 57, -77, 79, -80, 27, -124, 30, -119, 20, -121}, new byte[]{122, -32}));
        cipher.init(2, secretKeySpec, new IvParameterSpec(new byte[cipher.getBlockSize()]));
        return cipher.doFinal(bArr2);
    }

    /* renamed from: a */
    public static Map<String, String> m38468a() {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "application/json");
        hashMap.put("Accept-Encoding", "identity");
        hashMap.put("x-ssp-ce", "aesgzip");
        hashMap.put("x-ssp-ae", "aesgzip");
        return hashMap;
    }

    /* renamed from: a */
    public static void m38456a(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Error | Exception unused) {
        }
    }

    /* renamed from: a */
    public static int m38466a(float f, Context context) {
        return (int) (TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics()) + 0.5f);
    }

    /* renamed from: a */
    public static int m38465a(int i, Context context) {
        return (i * 160) / context.getResources().getDisplayMetrics().densityDpi;
    }

    /* renamed from: a */
    public static String m38452a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "0";
        }
        return str.replace("[ERRORCODE]", str2).replace("[CONTENTPLAYHEAD]", new SimpleDateFormat("HH:MM:SS.mmm").format(Calendar.getInstance().getTime())).replace("[CACHEBUSTING]", C28549x.m37976a(8)).replace("[ASSETURI]", str3);
    }

    /* renamed from: a */
    public static int m38467a(char c) {
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                if (c < '0' || c > '9') {
                    throw new IllegalArgumentException(C28162a.f73047a.m23824a(new byte[]{-60, -20, -38, -19, -119, -5, -52, -71, -63, -4, -47, -72}, new byte[]{-87, -103}));
                }
                return c - '0';
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: a */
    public static byte[] m38454a(String str) {
        if (str != null && str.length() > 0) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(str.getBytes());
                gZIPOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m38462a(Context context, Intent intent) {
        return context.getPackageManager().queryIntentActivities(intent, 0).size() > 0;
    }

    /* renamed from: a */
    public static byte[] m38449a(byte[] bArr) throws Exception {
        byte[] bArr2 = new byte[16];
        if (bArr != null) {
            if (bArr.length != 0) {
                if (bArr.length < 16) {
                    for (int i = 0; i < 16; i++) {
                        if (i < bArr.length) {
                            bArr2[i] = bArr[i];
                        } else {
                            bArr2[i] = 0;
                        }
                    }
                }
                return bArr2;
            }
            throw new IllegalArgumentException(C28162a.f73047a.m23824a(new byte[]{-7, 92, -17, 93, -92, 85, -17, 87, -19, 77, -30, 25, -73, 4, -86, 9}, new byte[]{-118, 57}));
        }
        throw new IllegalArgumentException(C28162a.f73047a.m23824a(new byte[]{69, 40, 83, 41, 22, 112, 11, 109, 88, 56, 90, 33}, new byte[]{54, 77}));
    }

    /* renamed from: a */
    public static void m38451a(StringBuilder sb2, Object obj, Map<Object[], Object> map) {
        if (obj == null) {
            sb2.append("null");
        } else if (!obj.getClass().isArray()) {
            try {
                sb2.append(obj.toString());
            } catch (Throwable th) {
                System.err.println("SLF4J: Failed toString() invocation on an object of type [" + obj.getClass().getName() + C21114v8.C21123i.f54139e);
                System.err.println("Reported exception:");
                th.printStackTrace();
                sb2.append("[FAILED toString()]");
            }
        } else {
            int i = 0;
            if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                sb2.append('[');
                int length = zArr.length;
                while (i < length) {
                    sb2.append(zArr[i]);
                    if (i != length - 1) {
                        sb2.append(", ");
                    }
                    i++;
                }
                sb2.append(']');
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                sb2.append('[');
                int length2 = bArr.length;
                while (i < length2) {
                    sb2.append((int) bArr[i]);
                    if (i != length2 - 1) {
                        sb2.append(", ");
                    }
                    i++;
                }
                sb2.append(']');
            } else if (obj instanceof char[]) {
                char[] cArr = (char[]) obj;
                sb2.append('[');
                int length3 = cArr.length;
                while (i < length3) {
                    sb2.append(cArr[i]);
                    if (i != length3 - 1) {
                        sb2.append(", ");
                    }
                    i++;
                }
                sb2.append(']');
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                sb2.append('[');
                int length4 = sArr.length;
                while (i < length4) {
                    sb2.append((int) sArr[i]);
                    if (i != length4 - 1) {
                        sb2.append(", ");
                    }
                    i++;
                }
                sb2.append(']');
            } else if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                sb2.append('[');
                int length5 = iArr.length;
                while (i < length5) {
                    sb2.append(iArr[i]);
                    if (i != length5 - 1) {
                        sb2.append(", ");
                    }
                    i++;
                }
                sb2.append(']');
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                sb2.append('[');
                int length6 = jArr.length;
                while (i < length6) {
                    sb2.append(jArr[i]);
                    if (i != length6 - 1) {
                        sb2.append(", ");
                    }
                    i++;
                }
                sb2.append(']');
            } else if (obj instanceof float[]) {
                float[] fArr = (float[]) obj;
                sb2.append('[');
                int length7 = fArr.length;
                while (i < length7) {
                    sb2.append(fArr[i]);
                    if (i != length7 - 1) {
                        sb2.append(", ");
                    }
                    i++;
                }
                sb2.append(']');
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                sb2.append('[');
                int length8 = dArr.length;
                while (i < length8) {
                    sb2.append(dArr[i]);
                    if (i != length8 - 1) {
                        sb2.append(", ");
                    }
                    i++;
                }
                sb2.append(']');
            } else {
                Object[] objArr = (Object[]) obj;
                sb2.append('[');
                if (!map.containsKey(objArr)) {
                    map.put(objArr, null);
                    int length9 = objArr.length;
                    while (i < length9) {
                        m38451a(sb2, objArr[i], map);
                        if (i != length9 - 1) {
                            sb2.append(", ");
                        }
                        i++;
                    }
                    map.remove(objArr);
                } else {
                    sb2.append(APSSharedUtil.TRUNCATE_SEPARATOR);
                }
                sb2.append(']');
            }
        }
    }

    /* renamed from: a */
    public static AdSession m38461a(Context context, WebView webView, String str, CreativeType creativeType) {
        Omid.activate(context.getApplicationContext());
        ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
        Owner owner = Owner.NATIVE;
        AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, (creativeType == CreativeType.HTML_DISPLAY || creativeType == CreativeType.DEFINED_BY_JAVASCRIPT) ? Owner.NONE : owner, false), AdSessionContext.createHtmlAdSessionContext(Partner.createPartner("Taurusx", "1.1.9"), webView, null, str));
        createAdSession.registerAdView(webView);
        return createAdSession;
    }

    /* renamed from: a */
    public static AdSession m38458a(Context context, String str, CreativeType creativeType, VastConfig vastConfig) throws Exception {
        if (vastConfig == null) {
            return null;
        }
        Omid.activate(context.getApplicationContext());
        ImpressionType impressionType = creativeType == CreativeType.AUDIO ? ImpressionType.AUDIBLE : ImpressionType.VIEWABLE;
        Owner owner = Owner.NATIVE;
        AdSessionConfiguration createAdSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, (creativeType == CreativeType.HTML_DISPLAY || creativeType == CreativeType.NATIVE_DISPLAY) ? Owner.NONE : owner, false);
        Partner createPartner = Partner.createPartner("Taurusx", "1.1.9");
        String m38439d = m38439d(context);
        ArrayList arrayList = new ArrayList();
        for (ViewabilityVendor viewabilityVendor : vastConfig.getViewabilityVendors()) {
            arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(viewabilityVendor.getVendorKey(), viewabilityVendor.getJavascriptResourceUrl(), viewabilityVendor.getVerificationParameters()));
        }
        return AdSession.createAdSession(createAdSessionConfiguration, AdSessionContext.createNativeAdSessionContext(createPartner, m38439d, arrayList, null, null));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(47:1|2|3|4|(2:5|6)|7|(2:8|9)|10|(39:14|(1:16)(2:85|(3:87|(1:89)|97))|17|18|19|20|21|22|23|24|25|26|(1:28)(1:76)|29|(1:31)|32|(1:34)(1:75)|35|(1:37)(1:74)|38|(1:40)(1:73)|41|(1:43)|44|(1:46)(1:72)|47|(1:49)(1:71)|50|(1:52)(1:70)|53|(1:55)(1:69)|56|(1:58)|59|(1:61)(1:68)|62|(1:64)|65|66)|98|17|18|19|20|21|22|23|24|25|26|(0)(0)|29|(0)|32|(0)(0)|35|(0)(0)|38|(0)(0)|41|(0)|44|(0)(0)|47|(0)(0)|50|(0)(0)|53|(0)(0)|56|(0)|59|(0)(0)|62|(0)|65|66) */
    /* JADX WARN: Can't wrap try/catch for region: R(49:1|2|3|4|5|6|7|8|9|10|(39:14|(1:16)(2:85|(3:87|(1:89)|97))|17|18|19|20|21|22|23|24|25|26|(1:28)(1:76)|29|(1:31)|32|(1:34)(1:75)|35|(1:37)(1:74)|38|(1:40)(1:73)|41|(1:43)|44|(1:46)(1:72)|47|(1:49)(1:71)|50|(1:52)(1:70)|53|(1:55)(1:69)|56|(1:58)|59|(1:61)(1:68)|62|(1:64)|65|66)|98|17|18|19|20|21|22|23|24|25|26|(0)(0)|29|(0)|32|(0)(0)|35|(0)(0)|38|(0)(0)|41|(0)|44|(0)(0)|47|(0)(0)|50|(0)(0)|53|(0)(0)|56|(0)|59|(0)(0)|62|(0)|65|66) */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x00fd, code lost:
        if (r10.equalsIgnoreCase("CDMA2000") == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0115, code lost:
        r2 = com.taurusx.tax.C28162a.f73047a.m23824a(new byte[]{-42, 19}, new byte[]{-84, 123});
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x013e, code lost:
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x013f, code lost:
        r14.printStackTrace();
        r14 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0154, code lost:
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0155, code lost:
        r14.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0277  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.taurusx.tax.p595f.p596a.C28389a.C28390a m38457a(android.content.Context r13, java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 713
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.p578b.C28207b.m38457a(android.content.Context, java.lang.String, java.lang.String):com.taurusx.tax.f.a.a$a");
    }

    /* renamed from: a */
    public static AdSession m38459a(Context context, String str, CreativeType creativeType, C28210c.C28211a c28211a) throws Exception {
        ArrayList<String> arrayList;
        if (c28211a == null || (arrayList = c28211a.f73239j) == null || arrayList.isEmpty()) {
            return null;
        }
        Omid.activate(context.getApplicationContext());
        ImpressionType impressionType = creativeType == CreativeType.AUDIO ? ImpressionType.AUDIBLE : ImpressionType.VIEWABLE;
        Owner owner = Owner.NATIVE;
        AdSessionConfiguration createAdSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, (creativeType == CreativeType.HTML_DISPLAY || creativeType == CreativeType.NATIVE_DISPLAY) ? Owner.NONE : owner, false);
        Partner createPartner = Partner.createPartner("Taurusx", "1.1.9");
        String m38439d = m38439d(context);
        ArrayList arrayList2 = new ArrayList();
        Iterator<String> it = c28211a.f73239j.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject = new JSONObject(it.next());
            String optString = jSONObject.optString("url");
            JSONObject optJSONObject = jSONObject.optJSONObject("ext");
            arrayList2.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(optJSONObject.optString(POBNativeConstants.NATIVE_VENDOR_KEY), new URL(optString), optJSONObject.optString(POBNativeConstants.NATIVE_VERIFICATION_PARAMETERS)));
        }
        return AdSession.createAdSession(createAdSessionConfiguration, AdSessionContext.createNativeAdSessionContext(createPartner, m38439d, arrayList2, null, null));
    }
}
