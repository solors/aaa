package com.apm.insight.p129k;

import android.text.TextUtils;
import com.apm.insight.AppDataCenter;
import com.apm.insight.Npth;
import com.apm.insight.NpthBus;
import com.apm.insight.p119b.LooperMonitor;
import com.apm.insight.p130l.C3822f;
import com.ironsource.C21018tj;
import com.ironsource.C21114v8;
import com.learnings.purchase.event.EventUploader;
import com.maticoo.sdk.utils.constant.KeyConstants;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cioii2c22c2.InterfaceC32663coo2iico;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.zip.Deflater;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.k.e */
/* loaded from: classes2.dex */
public final class CrashUploader {

    /* renamed from: a */
    public static boolean f3868a = false;

    /* renamed from: b */
    private static LooperMonitor.InterfaceC3784a f3869b;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* compiled from: CrashUploader.java */
    /* renamed from: com.apm.insight.k.e$a */
    /* loaded from: classes2.dex */
    public static final class EnumC3811a {

        /* renamed from: d */
        private int f3873d;

        /* renamed from: c */
        private static EnumC3811a f3872c = new EnumC3811a(InterfaceC32663coo2iico.cco22, 0, 0);

        /* renamed from: a */
        public static final EnumC3811a f3870a = new EnumC3811a("GZIP", 1, 1);

        /* renamed from: b */
        public static final EnumC3811a f3871b = new EnumC3811a("DEFLATER", 2, 2);

        private EnumC3811a(String str, int i, int i2) {
            this.f3873d = i2;
        }
    }

    /* compiled from: CrashUploader.java */
    /* renamed from: com.apm.insight.k.e$b */
    /* loaded from: classes2.dex */
    public enum EnumC3812b {
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5),
        MOBILE_5G(6),
        WIFI_24GHZ(7),
        WIFI_5GHZ(8),
        MOBILE_3G_H(9),
        MOBILE_3G_HP(10);
        

        /* renamed from: l */
        private int f3886l;

        EnumC3812b(int i) {
            this.f3886l = i;
        }
    }

    /* renamed from: a */
    public static boolean m101815a() {
        return false;
    }

    /* renamed from: b */
    public static boolean m101805b() {
        return false;
    }

    /* renamed from: c */
    private static String m101801c(String str, String str2) {
        try {
            if (TextUtils.isEmpty(new URL(str).getQuery())) {
                if (!str.endsWith("?")) {
                    str = str + "?";
                }
            } else if (!str.endsWith(C21114v8.C21123i.f54135c)) {
                str = str + C21114v8.C21123i.f54135c;
            }
            return str + str2;
        } catch (Throwable unused) {
            return str;
        }
    }

    /* renamed from: d */
    public static String m101800d() {
        return NpthBus.m102009i().getAlogUploadUrl();
    }

    /* renamed from: e */
    public static String m101798e() {
        return NpthBus.m102009i().getLaunchCrashUploadUrl();
    }

    /* renamed from: f */
    public static String m101797f() {
        return NpthBus.m102009i().getExceptionUploadUrl();
    }

    /* renamed from: g */
    public static String m101796g() {
        return NpthBus.m102009i().getNativeCrashUploadUrl();
    }

    /* renamed from: a */
    private static C3822f m101808a(String str, byte[] bArr, EnumC3811a enumC3811a, String str2) throws IOException {
        String str3;
        if (Npth.isStopUpload()) {
            return new C3822f(201);
        }
        if (str == null) {
            return new C3822f(201);
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        int length = bArr.length;
        if (EnumC3811a.f3870a == enumC3811a && length > 128) {
            bArr = m101806a(bArr);
            str3 = "gzip";
        } else if (EnumC3811a.f3871b != enumC3811a || length <= 128) {
            str3 = null;
        } else {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
            Deflater deflater = new Deflater();
            deflater.setInput(bArr);
            deflater.finish();
            byte[] bArr2 = new byte[8192];
            while (!deflater.finished()) {
                byteArrayOutputStream.write(bArr2, 0, deflater.deflate(bArr2));
            }
            deflater.end();
            bArr = byteArrayOutputStream.toByteArray();
            str3 = "deflate";
        }
        if (bArr == null) {
            return new C3822f(202);
        }
        return m101807a(str, bArr, str2, str3, "POST");
    }

    /* renamed from: b */
    public static C3822f m101804b(String str, String str2) {
        return m101799d(str, str2);
    }

    /* renamed from: d */
    private static C3822f m101799d(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                return m101808a(str, str2.getBytes(), EnumC3811a.f3870a, EventUploader.MEDIA_TYPE_JSON);
            }
            return new C3822f(201);
        } catch (Throwable th) {
            AppDataCenter.m102158b(th);
            return new C3822f(207, th);
        }
    }

    /* renamed from: b */
    private static C3822f m101803b(String str, String str2, File... fileArr) {
        if (Npth.isStopUpload()) {
            return new C3822f(201);
        }
        try {
            MultipartUtility multipartUtility = new MultipartUtility(m101801c(str, "have_dump=true"), "UTF-8", true);
            multipartUtility.m101774b("json", str2);
            multipartUtility.m101775a("file", fileArr);
            try {
                return new C3822f(new JSONObject(multipartUtility.m101778a()));
            } catch (JSONException e) {
                return new C3822f(0, e);
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            return new C3822f(207);
        }
    }

    /* renamed from: c */
    public static String m101802c() {
        return NpthBus.m102009i().getJavaCrashUploadUrl();
    }

    /* renamed from: a */
    private static byte[] m101806a(byte[] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            try {
                AppDataCenter.m102158b(th);
                gZIPOutputStream.close();
                return null;
            } catch (Throwable th2) {
                gZIPOutputStream.close();
                throw th2;
            }
        }
    }

    /* renamed from: a */
    public static void m101814a(LooperMonitor.InterfaceC3784a interfaceC3784a) {
        f3869b = interfaceC3784a;
    }

    /* renamed from: a */
    private static C3822f m101807a(String str, byte[] bArr, String str2, String str3, String str4) {
        InputStream inputStream;
        GZIPInputStream gZIPInputStream;
        byte[] m101813a;
        DataOutputStream dataOutputStream;
        HttpURLConnection httpURLConnection = null;
        GZIPInputStream gZIPInputStream2 = null;
        try {
            LooperMonitor.InterfaceC3784a interfaceC3784a = f3869b;
            if (interfaceC3784a != null) {
                try {
                    str = interfaceC3784a.m102062c();
                } catch (Throwable unused) {
                }
            }
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection2.setDoOutput(true);
                if (str2 != null) {
                    httpURLConnection2.setRequestProperty("Content-Type", str2);
                }
                if (str3 != null) {
                    httpURLConnection2.setRequestProperty("Content-Encoding", str3);
                }
                httpURLConnection2.setRequestProperty("Accept-Encoding", "gzip");
                httpURLConnection2.setRequestMethod(str4);
                if (bArr != null && bArr.length > 0) {
                    try {
                        dataOutputStream = new DataOutputStream(httpURLConnection2.getOutputStream());
                    } catch (Throwable th) {
                        th = th;
                        dataOutputStream = null;
                    }
                    try {
                        dataOutputStream.write(bArr);
                        dataOutputStream.flush();
                        AppDataCenter.m102180a((Closeable) dataOutputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        AppDataCenter.m102180a((Closeable) dataOutputStream);
                        throw th;
                    }
                }
                int responseCode = httpURLConnection2.getResponseCode();
                if (responseCode == 200) {
                    InputStream inputStream2 = httpURLConnection2.getInputStream();
                    try {
                        if ("gzip".equalsIgnoreCase(httpURLConnection2.getContentEncoding())) {
                            try {
                                gZIPInputStream = new GZIPInputStream(inputStream2);
                            } catch (Throwable th3) {
                                th = th3;
                            }
                            try {
                                m101813a = m101813a(gZIPInputStream);
                                AppDataCenter.m102180a((Closeable) gZIPInputStream);
                            } catch (Throwable th4) {
                                th = th4;
                                gZIPInputStream2 = gZIPInputStream;
                                AppDataCenter.m102180a((Closeable) gZIPInputStream2);
                                throw th;
                            }
                        } else {
                            m101813a = m101813a(inputStream2);
                        }
                        C3822f c3822f = new C3822f(m101813a);
                        try {
                            httpURLConnection2.disconnect();
                        } catch (Exception unused2) {
                        }
                        AppDataCenter.m102180a((Closeable) inputStream2);
                        return c3822f;
                    } catch (Throwable th5) {
                        httpURLConnection = httpURLConnection2;
                        inputStream = inputStream2;
                        th = th5;
                        try {
                            AppDataCenter.m102174a(th);
                            return new C3822f(207, th);
                        } finally {
                            if (httpURLConnection != null) {
                                try {
                                    httpURLConnection.disconnect();
                                } catch (Exception unused3) {
                                }
                            }
                            AppDataCenter.m102180a((Closeable) inputStream);
                        }
                    }
                }
                C3822f c3822f2 = new C3822f("http response code ".concat(String.valueOf(responseCode)));
                try {
                    httpURLConnection2.disconnect();
                } catch (Exception unused4) {
                }
                AppDataCenter.m102180a((Closeable) null);
                return c3822f2;
            } catch (Throwable th6) {
                th = th6;
                httpURLConnection = httpURLConnection2;
                inputStream = null;
            }
        } catch (Throwable th7) {
            th = th7;
            inputStream = null;
        }
    }

    /* renamed from: a */
    public static C3822f m101812a(String str, String str2) {
        return m101799d(str, str2);
    }

    /* renamed from: a */
    public static C3822f m101810a(String str, String str2, File... fileArr) {
        return m101803b(str, str2, fileArr);
    }

    /* renamed from: a */
    public static boolean m101811a(String str, String str2, String str3, String str4, List<String> list) {
        if (Npth.isStopUpload()) {
            return false;
        }
        try {
            MultipartUtility multipartUtility = new MultipartUtility(str, "UTF-8", false);
            multipartUtility.m101776a(C21018tj.f53565b, str2);
            multipartUtility.m101776a("device_id", str3);
            multipartUtility.m101776a("os", "Android");
            multipartUtility.m101776a("process_name", str4);
            for (String str5 : list) {
                File file = new File(str5);
                if (file.exists()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("logtype", "alog");
                    hashMap.put(KeyConstants.RequestBody.KEY_SCENE, "Crash");
                    multipartUtility.m101777a(file.getName(), file, hashMap);
                }
            }
            return new JSONObject(multipartUtility.m101778a()).optInt("errno", -1) == 200;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    private static byte[] m101813a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 != read) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                inputStream.close();
                try {
                    return byteArrayOutputStream.toByteArray();
                } finally {
                    AppDataCenter.m102180a((Closeable) byteArrayOutputStream);
                }
            }
        }
    }

    /* renamed from: a */
    public static byte[] m101809a(String str, byte[] bArr) {
        try {
            TextUtils.isDigitsOnly(str);
            return m101808a(str, bArr, EnumC3811a.f3870a, EventUploader.MEDIA_TYPE_JSON).m101711b();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
