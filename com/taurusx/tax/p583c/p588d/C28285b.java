package com.taurusx.tax.p583c.p588d;

import android.text.TextUtils;
import android.util.Log;
import com.taurusx.tax.C28162a;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.c.d.b */
/* loaded from: classes7.dex */
public class C28285b {

    /* renamed from: a */
    public final String f73467a = C28162a.m38504a(new byte[]{-36, -96, -7, -67, -60, -74, -25, -90, -13, -96, -30}, new byte[]{-106, -45});

    /* renamed from: b */
    public InterfaceC28286a f73468b = null;

    /* renamed from: com.taurusx.tax.c.d.b$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC28286a {

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
        /* renamed from: com.taurusx.tax.c.d.b$a$a */
        /* loaded from: classes7.dex */
        public static final class EnumC28287a {
            public static final EnumC28287a GET;
            public static final EnumC28287a POST;

            /* renamed from: a */
            public static final /* synthetic */ EnumC28287a[] f73469a;

            static {
                StringFogImpl stringFogImpl = C28162a.f73047a;
                EnumC28287a enumC28287a = new EnumC28287a(stringFogImpl.m23824a(new byte[]{-97, -116, -116}, new byte[]{-40, -55}), 0);
                GET = enumC28287a;
                EnumC28287a enumC28287a2 = new EnumC28287a(stringFogImpl.m23824a(new byte[]{-120, -20, -117, -9}, new byte[]{-40, -93}), 1);
                POST = enumC28287a2;
                f73469a = new EnumC28287a[]{enumC28287a, enumC28287a2};
            }

            public EnumC28287a(String str, int i) {
            }

            public static EnumC28287a valueOf(String str) {
                return (EnumC28287a) Enum.valueOf(EnumC28287a.class, str);
            }

            public static EnumC28287a[] values() {
                return (EnumC28287a[]) f73469a.clone();
            }
        }
    }

    /* renamed from: a */
    public static InputStream m38320a(HttpURLConnection httpURLConnection) {
        String contentEncoding;
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            return (inputStream == null || (contentEncoding = httpURLConnection.getContentEncoding()) == null || !TextUtils.equals(contentEncoding, C28162a.f73047a.m23824a(new byte[]{113, 66, Byte.MAX_VALUE, 72}, new byte[]{22, 56}))) ? inputStream : new GZIPInputStream(inputStream);
        } catch (Error | Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public final void m38318b(HttpURLConnection httpURLConnection) {
        ((C28288c) this.f73468b).m38317a(null, false);
    }

    /* renamed from: a */
    public static void m38321a(C28285b c28285b) {
        c28285b.getClass();
        try {
            String str = ((C28288c) c28285b.f73468b).f73471b;
            String str2 = c28285b.f73467a;
            StringBuilder sb2 = new StringBuilder();
            StringFogImpl stringFogImpl = C28162a.f73047a;
            sb2.append(stringFogImpl.m23824a(new byte[]{69, -119, 113, -119, 82, -110, 1, -108, 68, -105, 84, -125, 82, -110, 116, -108, 77, -58, 72, -107, 1}, new byte[]{33, -26}));
            sb2.append(str);
            Log.d(str2, sb2.toString());
            byte[] bArr = ((C28288c) c28285b.f73468b).f73472c;
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setRequestMethod(stringFogImpl.m23824a(new byte[]{-63, 17, -62, 10}, new byte[]{-111, 94}));
            httpURLConnection.setConnectTimeout(((C28288c) c28285b.f73468b).f73474e * 1000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            Map map = ((C28288c) c28285b.f73468b).f73473d;
            if (map != null && !map.isEmpty()) {
                for (String str3 : map.keySet()) {
                    httpURLConnection.setRequestProperty(str3, (String) map.get(str3));
                }
            }
            OutputStream outputStream = httpURLConnection.getOutputStream();
            StringFogImpl stringFogImpl2 = C28162a.f73047a;
            String requestProperty = httpURLConnection.getRequestProperty(stringFogImpl2.m23824a(new byte[]{65, -33, 108, -60, 103, -34, 118, -99, 71, -34, 97, -33, 102, -39, 108, -41}, new byte[]{2, -80}));
            if (!TextUtils.isEmpty(requestProperty) && stringFogImpl2.m23824a(new byte[]{56, -120, 54, -126}, new byte[]{95, -14}).equals(requestProperty)) {
                outputStream.write(c28285b.m38319a(bArr));
            } else {
                outputStream.write(bArr);
            }
            outputStream.flush();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode >= 200 && responseCode < 400) {
                ((C28288c) c28285b.f73468b).m38317a(httpURLConnection, true);
            } else {
                ((C28288c) c28285b.f73468b).m38317a(httpURLConnection, false);
            }
        } catch (Error | Exception unused) {
            c28285b.m38318b(null);
        }
    }

    /* renamed from: a */
    public final byte[] m38319a(byte[] bArr) {
        if (bArr != null && bArr.length > 0) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } catch (Error | Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
