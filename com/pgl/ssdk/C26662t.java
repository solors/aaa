package com.pgl.ssdk;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.ironsource.C19577ad;
import com.ironsource.C21018tj;
import com.maticoo.sdk.utils.constant.KeyConstants;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.p552ot.pubsub.p561i.p562a.C26559a;
import com.pgl.ssdk.ces.C26614a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pgl.ssdk.t */
/* loaded from: classes7.dex */
public class C26662t {

    /* renamed from: a */
    private static volatile String f69954a = null;

    /* renamed from: b */
    private static volatile String f69955b = null;

    /* renamed from: c */
    private static volatile boolean f69956c = false;

    /* renamed from: d */
    private static String f69957d = null;

    /* renamed from: e */
    private static String f69958e = null;

    /* renamed from: f */
    private static String f69959f = null;

    /* renamed from: g */
    private static int f69960g = -1;

    /* renamed from: h */
    private static long f69961h = 0;

    /* renamed from: i */
    private static long f69962i = 0;

    /* renamed from: j */
    private static volatile long f69963j = -1;

    /* renamed from: a */
    public static void m40771a(File file, boolean z) {
        RandomAccessFile randomAccessFile;
        C26626e m40772a;
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
            } catch (FileNotFoundException unused) {
            } catch (IOException unused2) {
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (TextUtils.isEmpty(f69954a) && (m40772a = m40772a(file)) != null) {
                    f69954a = m40769a(m40772a.m40882a());
                    f69957d = m40772a.m40881b();
                    if (z) {
                        m40773a();
                        try {
                            randomAccessFile.close();
                            return;
                        } catch (IOException unused3) {
                            return;
                        }
                    }
                }
                if (TextUtils.isEmpty(f69958e)) {
                    f69958e = m40770a(randomAccessFile);
                }
                if (f69961h == 0) {
                    f69961h = randomAccessFile.length() / 1024;
                }
                if (f69962i == 0) {
                    f69962i = m40767b(file);
                }
                randomAccessFile.close();
            } catch (FileNotFoundException unused4) {
                randomAccessFile2 = randomAccessFile;
                if (randomAccessFile2 != null) {
                    randomAccessFile2.close();
                }
            } catch (IOException unused5) {
                randomAccessFile2 = randomAccessFile;
                if (randomAccessFile2 != null) {
                    randomAccessFile2.close();
                }
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile2 = randomAccessFile;
                if (randomAccessFile2 != null) {
                    try {
                        randomAccessFile2.close();
                    } catch (IOException unused6) {
                    }
                }
                throw th;
            }
        } catch (IOException unused7) {
        }
    }

    /* renamed from: b */
    public static String m40768b() {
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        long j;
        long j2;
        if (TextUtils.isEmpty(f69954a) || TextUtils.isEmpty(f69958e) || f69960g == -1) {
            SharedPreferences m40743a = C26667u0.m40743a(C26676x.m40709b());
            long j3 = -1;
            if (m40743a != null) {
                j3 = m40743a.getLong(C19577ad.f49057I0, -1L);
                str2 = m40743a.getString("sa", null);
                str3 = m40743a.getString("sj", null);
                str4 = m40743a.getString("md5", null);
                j = m40743a.getLong(KeyConstants.Android.KEY_AS, 0L);
                j2 = m40743a.getLong(ApsMetricsDataMap.APSMETRICS_FIELD_SCREENSIZE, 0L);
                i = m40743a.getInt("cpc", -1);
                str = m40743a.getString(C21018tj.f53566c, null);
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                i = 0;
                j = 0;
                j2 = 0;
            }
            String m40766c = m40766c();
            if (m40766c == null) {
                return null;
            }
            File file = new File(m40766c);
            Object[] objArr = (Object[]) C26614a.meta(158, C26676x.m40709b(), m40766c);
            Integer num = (Integer) objArr[0];
            String str5 = (String) objArr[1];
            long lastModified = file.lastModified();
            if (lastModified == j3 && str2 != null && i != -1) {
                f69954a = str2;
                f69957d = str3;
                f69961h = j;
                f69962i = j2;
                f69958e = str4;
                f69960g = i;
                f69959f = str;
            } else {
                f69963j = lastModified;
                if (str5 != null) {
                    f69959f = str5;
                }
                if (num != null) {
                    f69960g = num.intValue();
                }
                m40771a(file, false);
                m40773a();
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(f69954a)) {
                jSONObject.put("sign", f69954a);
            }
            if (!TextUtils.isEmpty(f69957d)) {
                jSONObject.put("subject", f69957d);
            }
            if (!TextUtils.isEmpty(f69958e)) {
                jSONObject.put("md5", f69958e);
            }
            if (!TextUtils.isEmpty(f69959f)) {
                jSONObject.put("path", f69959f);
            }
            long j4 = f69961h;
            if (j4 != 0) {
                jSONObject.put("apkSize", j4);
            }
            long j5 = f69962i;
            if (j5 != 0) {
                jSONObject.put("dexSize", j5);
            }
            int i2 = f69960g;
            if (i2 != -1) {
                jSONObject.put(C26559a.f69635d, i2);
            }
            m40763f();
            jSONObject.put("signpm", f69955b);
            if (!TextUtils.isEmpty(f69955b) && !TextUtils.isEmpty(f69954a)) {
                if (!f69955b.equals(f69954a)) {
                    f69956c = true;
                }
                jSONObject.put("rebud", f69956c);
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static String m40766c() {
        if (C26676x.m40709b() == null) {
            return null;
        }
        String packageCodePath = C26676x.m40709b().getPackageCodePath();
        if (TextUtils.isEmpty(packageCodePath)) {
            return null;
        }
        File file = new File(packageCodePath);
        if (!file.exists() || !file.canRead()) {
            return null;
        }
        return packageCodePath;
    }

    /* renamed from: d */
    public static void m40765d() {
        if (TextUtils.isEmpty(f69954a)) {
            SharedPreferences m40743a = C26667u0.m40743a(C26676x.m40709b());
            String str = null;
            long j = -1;
            if (m40743a != null) {
                j = m40743a.getLong(C19577ad.f49057I0, -1L);
                str = m40743a.getString("sa", null);
            }
            String m40766c = m40766c();
            if (TextUtils.isEmpty(m40766c)) {
                return;
            }
            File file = new File(m40766c);
            long lastModified = file.lastModified();
            if (lastModified == j && str != null) {
                f69954a = str;
            } else {
                f69963j = lastModified;
                m40771a(file, true);
                m40773a();
            }
        }
        m40763f();
        if (!TextUtils.isEmpty(f69955b) && !TextUtils.isEmpty(f69954a) && !f69955b.equals(f69954a)) {
            f69956c = true;
        }
    }

    /* renamed from: e */
    public static String m40764e() {
        m40765d();
        return f69954a;
    }

    /* renamed from: f */
    public static String m40763f() {
        if (!TextUtils.isEmpty(f69955b)) {
            return f69955b;
        }
        try {
            String m40769a = m40769a(C26676x.m40709b().getPackageManager().getPackageInfo(C26676x.m40709b().getPackageName(), 64).signatures[0].toByteArray());
            f69955b = m40769a;
            return m40769a;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static boolean m40762g() {
        m40765d();
        return f69956c;
    }

    /* renamed from: a */
    public static void m40773a() {
        SharedPreferences m40743a = C26667u0.m40743a(C26676x.m40709b());
        if (m40743a != null) {
            if (!TextUtils.isEmpty(f69954a)) {
                m40743a.edit().putString("sa", f69954a).apply();
            }
            if (!TextUtils.isEmpty(f69958e)) {
                m40743a.edit().putString("md5", f69958e).apply();
            }
            if (!TextUtils.isEmpty(f69957d)) {
                m40743a.edit().putString("sj", f69957d).apply();
            }
            if (f69961h != 0) {
                m40743a.edit().putLong(KeyConstants.Android.KEY_AS, f69961h).apply();
            }
            if (f69962i != 0) {
                m40743a.edit().putLong(ApsMetricsDataMap.APSMETRICS_FIELD_SCREENSIZE, f69962i).apply();
            }
            if (f69963j != -1) {
                m40743a.edit().putLong(C19577ad.f49057I0, f69963j).apply();
            }
            if (f69960g != -1) {
                m40743a.edit().putInt("cpc", f69960g).apply();
            }
            if (TextUtils.isEmpty(f69959f)) {
                return;
            }
            m40743a.edit().putString(C21018tj.f53566c, f69959f).apply();
        }
    }

    /* renamed from: a */
    public static String m40769a(byte[] bArr) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(bArr);
            StringBuilder sb2 = new StringBuilder();
            for (byte b : digest) {
                sb2.append(Integer.toHexString((b & 255) | 256).substring(1, 3).toUpperCase());
                sb2.append(":");
            }
            return sb2.substring(0, sb2.length() - 1);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x003a  */
    @com.pgl.ssdk.ces.out.DungeonFlag
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.pgl.ssdk.C26626e m40772a(java.io.File r6) {
        /*
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L1e com.pgl.ssdk.C26629f.C26630a -> L25
            java.lang.String r2 = "r"
            r1.<init>(r6, r2)     // Catch: java.lang.Throwable -> L1e com.pgl.ssdk.C26629f.C26630a -> L25
            long r2 = r1.length()     // Catch: java.lang.Throwable -> L1f com.pgl.ssdk.C26629f.C26630a -> L26
            r4 = 0
            com.pgl.ssdk.o r2 = com.pgl.ssdk.AbstractC26653p.m40799a(r1, r4, r2)     // Catch: java.lang.Throwable -> L1f com.pgl.ssdk.C26629f.C26630a -> L26
            com.pgl.ssdk.c$a r3 = com.pgl.ssdk.AbstractC26610c.m40925a(r2)     // Catch: java.lang.Throwable -> L1f com.pgl.ssdk.C26629f.C26630a -> L26
            java.util.List r2 = com.pgl.ssdk.C26642k.m40841a(r2, r3)     // Catch: java.lang.Throwable -> L1f com.pgl.ssdk.C26629f.C26630a -> L26
            r1.close()     // Catch: java.io.IOException -> L2c
            goto L2c
        L1e:
            r1 = r0
        L1f:
            if (r1 == 0) goto L2b
            r1.close()     // Catch: java.io.IOException -> L2b
            goto L2b
        L25:
            r1 = r0
        L26:
            if (r1 == 0) goto L2b
            r1.close()     // Catch: java.io.IOException -> L2b
        L2b:
            r2 = r0
        L2c:
            if (r2 == 0) goto L34
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L38
        L34:
            java.util.List r2 = com.pgl.ssdk.C26640j.m40849a(r6)
        L38:
            if (r2 == 0) goto L48
            boolean r6 = r2.isEmpty()
            if (r6 != 0) goto L48
            r6 = 0
            java.lang.Object r6 = r2.get(r6)
            com.pgl.ssdk.e r6 = (com.pgl.ssdk.C26626e) r6
            return r6
        L48:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.C26662t.m40772a(java.io.File):com.pgl.ssdk.e");
    }

    /* renamed from: b */
    public static long m40767b(File file) {
        String format;
        ZipFile zipFile = null;
        try {
            try {
                ZipFile zipFile2 = new ZipFile(file);
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i == 0) {
                        format = "classes.dex";
                    } else {
                        format = String.format(Locale.getDefault(), "classes%d.dex", Integer.valueOf(i));
                    }
                    ZipEntry entry = zipFile2.getEntry(format);
                    if (entry == null) {
                        break;
                    }
                    try {
                        i2 = (int) (i2 + entry.getSize());
                        i++;
                    } catch (ZipException unused) {
                        zipFile = zipFile2;
                        if (zipFile != null) {
                            zipFile.close();
                            return 0L;
                        }
                        return 0L;
                    } catch (IOException unused2) {
                        zipFile = zipFile2;
                        if (zipFile != null) {
                            zipFile.close();
                            return 0L;
                        }
                        return 0L;
                    } catch (Throwable th) {
                        th = th;
                        zipFile = zipFile2;
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                }
                long j = i2 / 1000;
                try {
                    zipFile2.close();
                } catch (IOException unused4) {
                }
                return j;
            } catch (ZipException unused5) {
            } catch (IOException unused6) {
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused7) {
            return 0L;
        }
    }

    /* renamed from: a */
    public static String m40770a(RandomAccessFile randomAccessFile) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            byte[] bArr = new byte[1048576];
            while (true) {
                int read = randomAccessFile.read(bArr);
                if (read == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, read);
            }
            String bigInteger = new BigInteger(1, messageDigest.digest()).toString(16);
            while (bigInteger.length() < 32) {
                bigInteger = "0".concat(bigInteger);
            }
            return bigInteger;
        } catch (FileNotFoundException | IOException | NoSuchAlgorithmException unused) {
            return "";
        }
    }
}
