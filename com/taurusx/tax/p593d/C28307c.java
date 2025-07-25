package com.taurusx.tax.p593d;

import android.text.TextUtils;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.p606j.C28512c;
import com.taurusx.tax.p606j.p613b0.C28503c;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.d.c */
/* loaded from: classes7.dex */
public class C28307c {

    /* renamed from: b */
    public static final String f73534b = C28162a.f73047a.m23824a(new byte[]{-17, 52, -54, 41, -9, 34, -44, 50, -64, 52, -47}, new byte[]{-91, 71});

    /* renamed from: a */
    public InterfaceC28310c f73535a = null;

    /* renamed from: com.taurusx.tax.d.c$a */
    /* loaded from: classes7.dex */
    public class RunnableC28308a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f73536a;

        public RunnableC28308a(int i) {
            this.f73536a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC28310c interfaceC28310c = C28307c.this.f73535a;
            if (interfaceC28310c != null) {
                InterfaceC28310c.EnumC28311a mo38245c = interfaceC28310c.mo38245c();
                if (mo38245c == InterfaceC28310c.EnumC28311a.GET) {
                    C28307c.this.m38257a(this.f73536a);
                } else if (mo38245c == InterfaceC28310c.EnumC28311a.POST) {
                    C28307c.this.m38250b(this.f73536a);
                } else {
                    StringFogImpl stringFogImpl = C28162a.f73047a;
                    LogUtil.m37901iv(stringFogImpl.m23824a(new byte[]{-123, 63, -124, 44, -124, 45, -119, 115, -125, 59, -99, 59, -112, 45, -108}, new byte[]{-15, 94}), stringFogImpl.m23824a(new byte[]{-57, 40, -39, 50, -118, 51, -49, 48, -33, 36, -39, 53, -118, 44, -49, 53, -62, 46, -50}, new byte[]{-86, 65}));
                }
            }
        }
    }

    /* renamed from: com.taurusx.tax.d.c$b */
    /* loaded from: classes7.dex */
    public static class C28309b extends Exception {
        public C28309b() {
        }

        public C28309b(String str) {
            super(str);
        }

        public C28309b(String str, Throwable th) {
            super(str, th);
        }
    }

    /* renamed from: com.taurusx.tax.d.c$c */
    /* loaded from: classes7.dex */
    public interface InterfaceC28310c {

        /* JADX WARN: Enum visitor error
        jadx.core.utils.exceptions.JadxRuntimeException: Init of enum GET uses external variables
        	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
        	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
        	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
        	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
        	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
        	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
         */
        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* renamed from: com.taurusx.tax.d.c$c$a */
        /* loaded from: classes7.dex */
        public static final class EnumC28311a {
            public static final EnumC28311a GET;
            public static final EnumC28311a POST;

            /* renamed from: a */
            public static final /* synthetic */ EnumC28311a[] f73538a;

            static {
                StringFogImpl stringFogImpl = C28162a.f73047a;
                EnumC28311a enumC28311a = new EnumC28311a(stringFogImpl.m23824a(new byte[]{92, -11, 79}, new byte[]{27, -80}), 0);
                GET = enumC28311a;
                EnumC28311a enumC28311a2 = new EnumC28311a(stringFogImpl.m23824a(new byte[]{121, -57, 122, -36}, new byte[]{41, -120}), 1);
                POST = enumC28311a2;
                f73538a = new EnumC28311a[]{enumC28311a, enumC28311a2};
            }

            public EnumC28311a(String str, int i) {
            }

            public static EnumC28311a valueOf(String str) {
                return (EnumC28311a) Enum.valueOf(EnumC28311a.class, str);
            }

            public static EnumC28311a[] values() {
                return (EnumC28311a[]) f73538a.clone();
            }
        }

        /* renamed from: a */
        String mo38248a();

        /* renamed from: a */
        void mo38247a(int i, byte[] bArr, Map<String, List<String>> map, String str);

        /* renamed from: b */
        int mo38246b();

        /* renamed from: c */
        EnumC28311a mo38245c();

        /* renamed from: d */
        int mo38244d();

        /* renamed from: e */
        String mo38243e();

        /* renamed from: f */
        Map<String, String> mo38242f();
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0333  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m38257a(int r30) {
        /*
            Method dump skipped, instructions count: 1115
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.p593d.C28307c.m38257a(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x04af  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m38250b(int r35) {
        /*
            Method dump skipped, instructions count: 1497
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.p593d.C28307c.m38250b(int):void");
    }

    /* renamed from: c */
    public void m38249c(int i) {
        StringFogImpl stringFogImpl = C28162a.f73047a;
        LogUtil.m37901iv(stringFogImpl.m23824a(new byte[]{-26, 92, -25, 79, -25, 78, -22, 16, -32, 88, -2, 88, -13, 78, -9}, new byte[]{-110, 61}), stringFogImpl.m23824a(new byte[]{77, -106, 95, -112, 74, -62, 76, -121, 79, -105, 91, -111, 74, -62, 87, -116, 30, -106, 86, -112, 91, -125, 90, -62, 78, -115, 81, -114}, new byte[]{62, -30}));
        RunnableC28308a runnableC28308a = new RunnableC28308a(i);
        if (i == 1) {
            C28503c.m38063a().execute(runnableC28308a);
        } else {
            C28503c.m38062b().execute(runnableC28308a);
        }
    }

    /* renamed from: a */
    public static String m38251a(byte[] bArr, int i) {
        try {
            return new String(m38254a(m38253a(new ByteArrayInputStream(bArr), C28162a.f73047a.m23824a(new byte[]{-91, 123, -73, 121, -66, 119, -76}, new byte[]{-60, 30}), (String) null, i)), StandardCharsets.UTF_8);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static byte[] m38252a(HttpURLConnection httpURLConnection, int i) throws Exception {
        String str;
        if (httpURLConnection != null) {
            InputStream inputStream = httpURLConnection.getInputStream();
            StringFogImpl stringFogImpl = C28162a.f73047a;
            Iterator it = Arrays.asList(stringFogImpl.m23824a(new byte[]{-97, 8, -108, 86, -73, 8, -124, SignedBytes.MAX_POWER_OF_TWO}, new byte[]{-57, 37}), stringFogImpl.m23824a(new byte[]{40, -58, 35, -104, 32, -58, 51, -114}, new byte[]{80, -21})).iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = null;
                    break;
                }
                str = httpURLConnection.getHeaderField((String) it.next());
                if (!TextUtils.isEmpty(str)) {
                    break;
                }
            }
            return m38254a(m38253a(inputStream, str, httpURLConnection.getContentEncoding(), i));
        }
        throw new C28309b(C28162a.f73047a.m23824a(new byte[]{-80, -41, -91, -50, -84, -59, -74, -43, -69, -44, -80, -39, -95, -45, -70, -44}, new byte[]{-11, -102}));
    }

    /* renamed from: a */
    public static InputStream m38253a(InputStream inputStream, String str, String str2, int i) throws Exception {
        String str3;
        String str4;
        ByteArrayInputStream byteArrayInputStream;
        InputStream inputStream2 = inputStream;
        if (inputStream2 != null) {
            StringFogImpl stringFogImpl = C28162a.f73047a;
            if (stringFogImpl.m23824a(new byte[]{101, -75, 119, -73, 126, -71, 116}, new byte[]{4, -48}).equalsIgnoreCase(str)) {
                if (i == 1) {
                    str3 = C28512c.m38054a();
                    str4 = C28512c.m38049b();
                } else if (i == 2) {
                    str3 = C28512c.m38051a(C28512c.f73954h, C28512c.f73950d);
                    str4 = C28512c.m38051a(C28512c.f73954h, C28512c.f73951e);
                } else {
                    str3 = "";
                    str4 = "";
                }
                try {
                    byte[] m38050a = C28512c.m38050a(str3);
                    byte[] m38050a2 = C28512c.m38050a(str4);
                    Cipher cipher = Cipher.getInstance(stringFogImpl.m23824a(new byte[]{-36, 102, -50, 12, -34, 97, -34, 12, -51, 104, -34, 112, -88, 115, -4, 71, -7, 74, -13, 68}, new byte[]{-99, 35}));
                    cipher.init(2, new SecretKeySpec(m38050a, stringFogImpl.m23824a(new byte[]{77, 8, 95}, new byte[]{12, 77})), new IvParameterSpec(m38050a2));
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream2.read(bArr);
                        if (-1 == read) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    byteArrayInputStream = new ByteArrayInputStream(cipher.doFinal(byteArrayOutputStream.toByteArray()));
                } catch (Exception e) {
                    StringFogImpl stringFogImpl2 = C28162a.f73047a;
                    String m23824a = stringFogImpl2.m23824a(new byte[]{108, -20, 109, -1, 109, -2, 96}, new byte[]{24, -115});
                    LogUtil.m37904e(m23824a, stringFogImpl2.m23824a(new byte[]{-92, -41, -75, -97, -76, -38, -93, -97, -75, -51, -94, -48, -94, -97, -71, -52, -22, -97}, new byte[]{-48, -65}) + e);
                    byteArrayInputStream = null;
                }
                if (byteArrayInputStream != null) {
                    try {
                        inputStream2 = new GZIPInputStream(byteArrayInputStream);
                    } catch (Exception e2) {
                        throw new C28309b(C28162a.f73047a.m23824a(new byte[]{22, -4, 24, -10, 14, -17, 30, -7, 20, -2, 18, -29, 1, -14, 24, -23, 31}, new byte[]{81, -90}), e2);
                    }
                } else {
                    throw new C28309b(C28162a.f73047a.m23824a(new byte[]{123, 59, 105, 33, 126, 59, 121, 44, 99, 46, 110, 33, Byte.MAX_VALUE, 44, 104, 49, 104}, new byte[]{58, 126}));
                }
            } else if (stringFogImpl.m23824a(new byte[]{14, -27, 0, -17}, new byte[]{105, -97}).equalsIgnoreCase(str)) {
                try {
                    return new GZIPInputStream(inputStream2);
                } catch (Exception e3) {
                    throw new C28309b(C28162a.f73047a.m23824a(new byte[]{57, UnsignedBytes.MAX_POWER_OF_TWO, 55, -118, 33, -109, 49, -123, 59, -126, 61, -97, 46, -114, 55, -107, 48}, new byte[]{126, -38}), e3);
                }
            } else if (stringFogImpl.m23824a(new byte[]{-109, 59, -99, 49}, new byte[]{-12, 65}).equalsIgnoreCase(str2)) {
                try {
                    return new GZIPInputStream(inputStream2);
                } catch (Exception e4) {
                    throw new C28309b(C28162a.f73047a.m23824a(new byte[]{86, -66, 88, -76, 78, -83, 94, -69, 84, -68, 82, -95, 65, -80, 88, -85, 95}, new byte[]{17, -28}), e4);
                }
            }
        }
        return inputStream2;
    }

    /* renamed from: a */
    public static byte[] m38254a(InputStream inputStream) throws Exception {
        if (inputStream == null) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    inputStream.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
            }
        } catch (Exception e) {
            String str = f73534b;
            StringBuilder sb2 = new StringBuilder();
            StringFogImpl stringFogImpl = C28162a.f73047a;
            sb2.append(stringFogImpl.m23824a(new byte[]{-44, 121, -45, 115, -44, 121, -112, 110, -43, 111, -64, 115, -34, 111, -43, 60, -43, 110, -62, 115, -62, 60, -118, 60}, new byte[]{-80, 28}));
            sb2.append(e);
            LogUtil.m37901iv(str, sb2.toString());
            if (!(e instanceof TimeoutException)) {
                if (e instanceof ZipException) {
                    throw new C28309b(stringFogImpl.m23824a(new byte[]{-103, 123, -109, 109, -122, 106, UnsignedBytes.MAX_POWER_OF_TWO, 119, -109, 102, -118, 125, -115}, new byte[]{-61, 50}), e);
                }
                throw new C28309b(stringFogImpl.m23824a(new byte[]{-106, -53, UnsignedBytes.MAX_POWER_OF_TWO, -63, -121, -57, -102, -44, -117, -51, -112, -54}, new byte[]{-33, -124}), e);
            }
            throw new C28309b(stringFogImpl.m23824a(new byte[]{-18, 73, -3, 72, -29, 88, -11, 65, -7, 67, -23, 88}, new byte[]{-68, 12}), e);
        }
    }

    /* renamed from: a */
    public final void m38255a(int i, byte[] bArr, Map<String, List<String>> map, String str) {
        this.f73535a.mo38247a(i, bArr, map, str);
    }

    /* renamed from: a */
    public static String m38256a(int i, String str) {
        if (i == 200) {
            return C28162a.f73047a.m23824a(new byte[]{35, 72, 51, 94, 53, 78, 35}, new byte[]{112, 29});
        } else if (i == 400) {
            return C28162a.f73047a.m23824a(new byte[]{95, -19, 67, -23, 72, -115, 39, -119, 72, -4, 69, -21, 88, -21}, new byte[]{23, -71});
        } else if (i == 400) {
            return C28162a.f73047a.m23824a(new byte[]{-27, -74, -7, -78, -14, -42, -99, -46, -14, -89, -1, -80, -30, -80}, new byte[]{-83, -30});
        } else if (i == 403) {
            return C28162a.f73047a.m23824a(new byte[]{65, 79, 93, 75, 86, 47, 57, 40, 86, 94, 91, 73, 70, 73}, new byte[]{9, 27});
        } else if (i == 404) {
            return C28162a.f73047a.m23824a(new byte[]{-126, 18, -98, 22, -107, 114, -6, 114, -107, 3, -104, 20, -123, 20}, new byte[]{-54, 70});
        } else if (i == 500) {
            return C28162a.f73047a.m23824a(new byte[]{-95, -74, -67, -78, -74, -41, -39, -46, -74, -89, -69, -80, -90, -80}, new byte[]{-23, -30});
        } else if (i == 502) {
            return C28162a.f73047a.m23824a(new byte[]{-63, 41, -35, 45, -42, 72, -71, 79, -42, 56, -37, 47, -58, 47}, new byte[]{-119, 125});
        } else if (i == 503) {
            return C28162a.f73047a.m23824a(new byte[]{81, -101, 77, -97, 70, -6, 41, -3, 70, -118, 75, -99, 86, -99}, new byte[]{25, -49});
        } else if (i == 504) {
            return C28162a.f73047a.m23824a(new byte[]{-93, 89, -65, 93, -76, 56, -37, 63, -76, 72, -71, 95, -92, 95}, new byte[]{-21, 13});
        } else {
            return str;
        }
    }
}
