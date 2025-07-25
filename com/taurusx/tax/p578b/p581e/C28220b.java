package com.taurusx.tax.p578b.p581e;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.primitives.UnsignedBytes;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.api.TaurusXAds;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.p593d.C28305b;
import com.taurusx.tax.p606j.C28518e;
import com.taurusx.tax.p606j.C28520g;
import com.taurusx.tax.p606j.p613b0.C28503c;
import java.io.File;
import java.io.FilenameFilter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.b.e.b */
/* loaded from: classes7.dex */
public class C28220b {

    /* renamed from: i */
    public static C28220b f73292i;

    /* renamed from: a */
    public Context f73293a;

    /* renamed from: b */
    public File f73294b;

    /* renamed from: c */
    public ExecutorService f73295c;

    /* renamed from: d */
    public final String f73296d;

    /* renamed from: e */
    public final String f73297e;

    /* renamed from: f */
    public boolean f73298f;

    /* renamed from: g */
    public long f73299g;

    /* renamed from: h */
    public ScheduledExecutorService f73300h;

    /* renamed from: com.taurusx.tax.b.e.b$a */
    /* loaded from: classes7.dex */
    public class C28221a implements FilenameFilter {
        public C28221a(C28220b c28220b) {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith(C28162a.f73047a.m23824a(new byte[]{-85, 69, -86, 86, -86, 87, -89, 123, -85, 86, -66, 71, -76, 123}, new byte[]{-33, 36}));
        }
    }

    /* renamed from: com.taurusx.tax.b.e.b$b */
    /* loaded from: classes7.dex */
    public class RunnableC28222b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f73301a;

        public RunnableC28222b(String str) {
            this.f73301a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String m38387a = C28220b.m38387a(C28220b.this, this.f73301a);
                StringFogImpl stringFogImpl = C28162a.f73047a;
                String m23824a = stringFogImpl.m23824a(new byte[]{-77, 119, -78, 100, -78, 101, -65, 59, -75, 115, -85, 115, -90, 101, -94}, new byte[]{-57, 22});
                LogUtil.m37901iv(m23824a, stringFogImpl.m23824a(new byte[]{-60, -69, -43, -13, -42, -70, -36, -74, -34, -78, -35, -74, -112, -70, -61, -13}, new byte[]{-80, -45}) + m38387a);
                C28520g.m38007a(this.f73301a, C28220b.this.f73294b, m38387a, false);
            } catch (Error | Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.taurusx.tax.b.e.b$c */
    /* loaded from: classes7.dex */
    public class RunnableC28223c implements Runnable {

        /* renamed from: a */
        public WeakReference<Context> f73303a;

        /* renamed from: com.taurusx.tax.b.e.b$c$a */
        /* loaded from: classes7.dex */
        public class C28224a implements C28305b.InterfaceC28306a {

            /* renamed from: a */
            public final /* synthetic */ C28226d f73305a;

            /* renamed from: b */
            public final /* synthetic */ Context f73306b;

            /* renamed from: c */
            public final /* synthetic */ String f73307c;

            /* renamed from: d */
            public final /* synthetic */ long f73308d;

            /* renamed from: e */
            public final /* synthetic */ String f73309e;

            public C28224a(RunnableC28223c runnableC28223c, C28226d c28226d, Context context, String str, long j, String str2) {
                this.f73305a = c28226d;
                this.f73306b = context;
                this.f73307c = str;
                this.f73308d = j;
                this.f73309e = str2;
            }

            @Override // com.taurusx.tax.p593d.C28305b.InterfaceC28306a
            public void onResult(int i, String str, String str2) {
                StringFogImpl stringFogImpl = C28162a.f73047a;
                String m23824a = stringFogImpl.m23824a(new byte[]{-61, -102, -62, -119, -62, -120, -49, -42, -59, -98, -37, -98, -42, -120, -46}, new byte[]{-73, -5});
                LogUtil.m37901iv(m23824a, stringFogImpl.m23824a(new byte[]{-47, -115, -52, -116, -126, -117, -61, -117, -54, -115, -126, -102, -57, -101, -41, -124, -42, -56, -63, -121, -58, -115, -126, -46, -126, -77}, new byte[]{-94, -24}) + i + stringFogImpl.m23824a(new byte[]{17, -103, 108, -40, 63, -46, 108, -113, 108}, new byte[]{76, -75}) + str + stringFogImpl.m23824a(new byte[]{-122, 23, -122, 78, -44, 87, -122, 1, -122}, new byte[]{-90, 59}) + this.f73305a.f73313b);
                if (i >= 200 && i < 400) {
                    C28220b m38389a = C28220b.m38389a(this.f73306b);
                    m38389a.f73295c.execute(new RunnableC28227c(m38389a, this.f73305a));
                }
                new C28236i().m38366a(this.f73307c, i, str, str2, this.f73308d, this.f73309e);
            }
        }

        /* renamed from: com.taurusx.tax.b.e.b$c$b */
        /* loaded from: classes7.dex */
        public class C28225b implements C28305b.InterfaceC28306a {

            /* renamed from: a */
            public final /* synthetic */ C28226d f73310a;

            /* renamed from: b */
            public final /* synthetic */ Context f73311b;

            public C28225b(RunnableC28223c runnableC28223c, C28226d c28226d, Context context) {
                this.f73310a = c28226d;
                this.f73311b = context;
            }

            @Override // com.taurusx.tax.p593d.C28305b.InterfaceC28306a
            public void onResult(int i, String str, String str2) {
                StringFogImpl stringFogImpl = C28162a.f73047a;
                String m23824a = stringFogImpl.m23824a(new byte[]{-106, -106, -105, -123, -105, -124, -102, -38, -112, -110, -114, -110, -125, -124, -121}, new byte[]{-30, -9});
                LogUtil.m37901iv(m23824a, stringFogImpl.m23824a(new byte[]{-17, -103, -14, -104, -68, -97, -3, -97, -12, -103, -68, -114, -7, -113, -23, -112, -24, -36, -1, -109, -8, -103, -68, -58, -68, -89}, new byte[]{-100, -4}) + i + stringFogImpl.m23824a(new byte[]{-5, -85, -122, -22, -43, -32, -122, -67, -122}, new byte[]{-90, -121}) + str + stringFogImpl.m23824a(new byte[]{108, -80, 108, -23, 62, -16, 108, -90, 108}, new byte[]{76, -100}) + this.f73310a.f73313b);
                if (i >= 200 && i < 400) {
                    C28220b m38389a = C28220b.m38389a(this.f73311b);
                    m38389a.f73295c.execute(new RunnableC28227c(m38389a, this.f73310a));
                }
            }
        }

        public RunnableC28223c(Context context) {
            this.f73303a = new WeakReference<>(context);
        }

        /* JADX WARN: Type inference failed for: r7v0 */
        /* JADX WARN: Type inference failed for: r7v2 */
        /* JADX WARN: Type inference failed for: r7v3 */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r7v5 */
        /* JADX WARN: Type inference failed for: r7v6 */
        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            ScheduledExecutorService scheduledExecutorService;
            Throwable th;
            WeakReference<Context> weakReference;
            Context context;
            int i;
            C28220b c28220b = C28220b.this;
            if (!c28220b.f73298f) {
                c28220b.f73299g = System.currentTimeMillis();
                char c = 0;
                try {
                    try {
                        weakReference = this.f73303a;
                    } catch (Error | Exception e) {
                        try {
                            e.printStackTrace();
                        } catch (Throwable th2) {
                            th = th2;
                            z = false;
                            scheduledExecutorService = null;
                            th = th;
                            C28220b c28220b2 = C28220b.this;
                            c28220b2.f73298f = z;
                            c28220b2.f73300h.shutdown();
                            C28220b.m38386a(C28220b.this, scheduledExecutorService);
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    z = false;
                }
                if (weakReference != null && (context = weakReference.get()) != null) {
                    char c2 = 1;
                    C28220b.this.f73298f = true;
                    byte b = -78;
                    int i2 = 15;
                    int i3 = 10;
                    int i4 = 9;
                    int i5 = 7;
                    char c3 = 4;
                    int i6 = 3;
                    if (!C28518e.m38010f(context)) {
                        LogUtil.m37901iv(C28162a.m38504a(new byte[]{-22, -74, -21, -91, -21, -92, -26, -6, -20, -78, -14, -78, -1, -92, -5}, new byte[]{-98, -41}), C28162a.m38504a(new byte[]{-33, 118, -27, 100, -2, 97, -6, 51, -40, 96, -79, 93, -2, 103, -79, 80, -2, 125, -1, 118, -14, 103, -12, 119}, new byte[]{-111, 19}));
                        C28220b c28220b3 = C28220b.this;
                        c28220b3.f73298f = false;
                        c28220b3.f73300h.shutdown();
                        C28220b.m38386a(C28220b.this, (ScheduledExecutorService) null);
                        return;
                    }
                    ArrayList arrayList = (ArrayList) C28220b.m38389a(context).m38383c();
                    if (arrayList.isEmpty()) {
                        LogUtil.m37901iv(C28162a.m38504a(new byte[]{103, 48, 102, 35, 102, 34, 107, 124, 97, 52, Byte.MAX_VALUE, 52, 114, 34, 118}, new byte[]{19, 81}), C28162a.m38504a(new byte[]{-107, -77, -5, -97, -70, -65, -77, -71, -65, -4, -113, -82, -70, -65, -80}, new byte[]{-37, -36}));
                        C28220b c28220b4 = C28220b.this;
                        c28220b4.f73298f = false;
                        c28220b4.f73300h.shutdown();
                        C28220b.m38386a(C28220b.this, (ScheduledExecutorService) null);
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C28226d c28226d = (C28226d) it.next();
                        if (c28226d != null && !TextUtils.isEmpty(c28226d.f73313b) && !TextUtils.isEmpty(c28226d.f73312a)) {
                            byte[] bArr = new byte[i2];
                            bArr[c] = 40;
                            bArr[c2] = -45;
                            bArr[2] = 41;
                            bArr[i6] = -64;
                            bArr[c3] = 41;
                            bArr[5] = -63;
                            bArr[6] = 36;
                            bArr[i5] = -97;
                            bArr[8] = 46;
                            bArr[i4] = -41;
                            bArr[i3] = 48;
                            bArr[11] = -41;
                            bArr[12] = 61;
                            bArr[13] = -63;
                            bArr[14] = 57;
                            byte[] bArr2 = new byte[2];
                            bArr2[c] = 92;
                            bArr2[c2] = b;
                            String m38504a = C28162a.m38504a(bArr, bArr2);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(c28226d.f73313b);
                            byte[] bArr3 = new byte[23];
                            bArr3[c] = -98;
                            bArr3[c2] = -116;
                            bArr3[2] = -52;
                            bArr3[i6] = -103;
                            bArr3[c3] = -35;
                            bArr3[5] = -109;
                            bArr3[6] = -98;
                            bArr3[i5] = -101;
                            bArr3[8] = -33;
                            bArr3[i4] = -101;
                            bArr3[i3] = -42;
                            bArr3[11] = -99;
                            bArr3[12] = -98;
                            bArr3[13] = -98;
                            bArr3[14] = -41;
                            bArr3[i2] = -108;
                            bArr3[16] = -37;
                            bArr3[17] = -40;
                            bArr3[18] = -48;
                            bArr3[19] = -103;
                            bArr3[20] = -45;
                            bArr3[21] = -99;
                            bArr3[22] = -98;
                            byte[] bArr4 = new byte[2];
                            bArr4[c] = -66;
                            bArr4[c2] = -8;
                            sb2.append(C28162a.m38504a(bArr3, bArr4));
                            sb2.append(c28226d.f73312a);
                            LogUtil.m37901iv(m38504a, sb2.toString());
                            JSONObject jSONObject = new JSONObject(c28226d.f73313b);
                            byte[] bArr5 = new byte[i6];
                            bArr5[c] = -56;
                            bArr5[c2] = -7;
                            bArr5[2] = -47;
                            byte[] bArr6 = new byte[2];
                            bArr6[c] = -67;
                            bArr6[c2] = -117;
                            String optString = jSONObject.optString(C28162a.m38504a(bArr5, bArr6));
                            byte[] bArr7 = new byte[i5];
                            bArr7[c] = -100;
                            bArr7[c2] = -61;
                            bArr7[2] = -97;
                            bArr7[i6] = -45;
                            bArr7[c3] = -117;
                            bArr7[5] = -43;
                            bArr7[6] = -102;
                            byte[] bArr8 = new byte[2];
                            bArr8[c] = -18;
                            bArr8[c2] = -90;
                            String optString2 = jSONObject.optString(C28162a.m38504a(bArr7, bArr8));
                            byte[] bArr9 = new byte[i3];
                            bArr9[c] = 39;
                            bArr9[c2] = 108;
                            bArr9[2] = 39;
                            bArr9[i6] = 116;
                            bArr9[c3] = 54;
                            bArr9[5] = 69;
                            bArr9[6] = 54;
                            bArr9[i5] = 115;
                            bArr9[8] = 47;
                            bArr9[i4] = Byte.MAX_VALUE;
                            byte[] bArr10 = new byte[2];
                            bArr10[c] = 66;
                            bArr10[c2] = 26;
                            long optLong = jSONObject.optLong(C28162a.m38504a(bArr9, bArr10));
                            byte[] bArr11 = new byte[i4];
                            bArr11[c] = 38;
                            bArr11[c2] = 112;
                            bArr11[2] = 51;
                            bArr11[i6] = 97;
                            bArr11[c3] = 57;
                            bArr11[5] = 76;
                            bArr11[6] = 51;
                            bArr11[i5] = 111;
                            bArr11[8] = 55;
                            byte[] bArr12 = new byte[2];
                            bArr12[c] = 82;
                            bArr12[c2] = 2;
                            String optString3 = jSONObject.optString(C28162a.m38504a(bArr11, bArr12));
                            byte[] bArr13 = new byte[i6];
                            bArr13[c] = 101;
                            bArr13[c2] = 73;
                            bArr13[2] = 124;
                            byte[] bArr14 = new byte[2];
                            bArr14[c] = 16;
                            bArr14[c2] = 59;
                            jSONObject.remove(C28162a.m38504a(bArr13, bArr14));
                            byte[] bArr15 = new byte[i5];
                            bArr15[c] = -33;
                            bArr15[c2] = i4;
                            bArr15[2] = -36;
                            bArr15[i6] = 25;
                            bArr15[4] = -56;
                            bArr15[5] = 31;
                            bArr15[6] = -39;
                            byte[] bArr16 = new byte[2];
                            bArr16[c] = -83;
                            bArr16[c2] = 108;
                            jSONObject.remove(C28162a.m38504a(bArr15, bArr16));
                            byte[] bArr17 = new byte[i6];
                            bArr17[c] = 120;
                            bArr17[c2] = -3;
                            bArr17[2] = 107;
                            byte[] bArr18 = new byte[2];
                            bArr18[c] = 31;
                            bArr18[c2] = -104;
                            if (C28162a.m38504a(bArr17, bArr18).equals(optString2)) {
                                int i7 = i6;
                                int i8 = i5;
                                int i9 = i4;
                                try {
                                } catch (Throwable th4) {
                                    th = th4;
                                    z = false;
                                }
                                try {
                                    C28305b.m38259a(optString, 2, null, new C28224a(this, c28226d, context, optString, optLong, optString3));
                                    c3 = 4;
                                    i2 = 15;
                                    i3 = 10;
                                    i5 = i8;
                                    i6 = i7;
                                    i4 = i9;
                                    c = 0;
                                    c2 = 1;
                                    b = -78;
                                } catch (Throwable th5) {
                                    th = th5;
                                    scheduledExecutorService = null;
                                    z = false;
                                    th = th;
                                    C28220b c28220b22 = C28220b.this;
                                    c28220b22.f73298f = z;
                                    c28220b22.f73300h.shutdown();
                                    C28220b.m38386a(C28220b.this, scheduledExecutorService);
                                    throw th;
                                }
                            } else {
                                int i10 = i6;
                                int i11 = i4;
                                i = 10;
                                int i12 = i5;
                                byte[] bArr19 = new byte[4];
                                try {
                                    bArr19[0] = -59;
                                    bArr19[1] = 52;
                                    bArr19[2] = -58;
                                    bArr19[i10] = 47;
                                    byte[] bArr20 = new byte[2];
                                    try {
                                        bArr20[0] = -75;
                                        bArr20[1] = 91;
                                        if (C28162a.m38504a(bArr19, bArr20).equals(optString2)) {
                                            scheduledExecutorService = null;
                                            try {
                                                C28305b.m38258a(optString, 2, null, jSONObject.toString(), new C28225b(this, c28226d, context));
                                            } catch (Throwable th6) {
                                                th = th6;
                                                z = false;
                                            }
                                        }
                                        c3 = 4;
                                        i2 = 15;
                                        i5 = i12;
                                        i6 = i10;
                                        i4 = i11;
                                        c = 0;
                                        b = -78;
                                        c2 = 1;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        z = false;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    z = false;
                                }
                            }
                            scheduledExecutorService = null;
                            C28220b c28220b222 = C28220b.this;
                            c28220b222.f73298f = z;
                            c28220b222.f73300h.shutdown();
                            C28220b.m38386a(C28220b.this, scheduledExecutorService);
                            throw th;
                        }
                        i = i3;
                        i4 = i4;
                        i3 = i;
                    }
                }
                C28220b c28220b5 = C28220b.this;
                c28220b5.f73298f = false;
                c28220b5.f73300h.shutdown();
                C28220b.m38386a(C28220b.this, (ScheduledExecutorService) null);
            }
        }
    }

    /* renamed from: com.taurusx.tax.b.e.b$d */
    /* loaded from: classes7.dex */
    public static class C28226d {

        /* renamed from: a */
        public String f73312a;

        /* renamed from: b */
        public String f73313b;
    }

    public C28220b(Context context) {
        C28162a.m38504a(new byte[]{115, 108, 83, 116, 66, 78, 68, 123, 85, 113, 117, 123, 85, 114, 83}, new byte[]{54, 26});
        this.f73296d = C28162a.m38504a(new byte[]{55, -69, 54, -88, 54, -87, 59, -123, 55, -88, 34, -71, 40, -123, 32, -69, 32, -78, 38}, new byte[]{67, -38});
        this.f73297e = C28162a.m38504a(new byte[]{110, -14, 111, -31, 111, -32, 98, -52, 110, -31, 123, -16, 113, -52}, new byte[]{26, -109});
        this.f73293a = context;
        File file = new File(m38384b());
        this.f73294b = file;
        if (!file.exists()) {
            this.f73294b.mkdirs();
        }
        this.f73295c = C28503c.m38062b();
    }

    /* renamed from: b */
    public final String m38384b() {
        return this.f73293a.getFilesDir().getAbsolutePath().concat(File.separator).concat(this.f73296d);
    }

    /* renamed from: c */
    public List<C28226d> m38383c() {
        File[] listFiles = this.f73294b.listFiles(new C28221a(this));
        ArrayList arrayList = new ArrayList();
        for (File file : listFiles) {
            String m38006b = C28520g.m38006b(file);
            if (!TextUtils.isEmpty(m38006b)) {
                C28226d c28226d = new C28226d();
                c28226d.f73312a = file.getName();
                c28226d.f73313b = m38006b;
                arrayList.add(c28226d);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static /* synthetic */ ScheduledExecutorService m38386a(C28220b c28220b, ScheduledExecutorService scheduledExecutorService) {
        c28220b.f73300h = null;
        return null;
    }

    /* renamed from: a */
    public static C28220b m38389a(Context context) {
        if (f73292i == null) {
            synchronized (C28220b.class) {
                if (f73292i == null) {
                    f73292i = new C28220b(context != null ? context.getApplicationContext() : TaurusXAds.getContext());
                }
            }
        }
        return f73292i;
    }

    /* renamed from: a */
    public void m38385a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f73295c.execute(new RunnableC28222b(str));
    }

    /* renamed from: a */
    public static String m38387a(C28220b c28220b, String str) {
        return c28220b.f73297e.concat(String.valueOf(str.hashCode())).concat(C28162a.f73047a.m23824a(new byte[]{-39}, new byte[]{-122, UnsignedBytes.MAX_POWER_OF_TWO})).concat(String.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: a */
    public void m38390a() {
        if (this.f73298f || System.currentTimeMillis() - this.f73299g < 15000 || this.f73300h != null) {
            return;
        }
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f73300h = newSingleThreadScheduledExecutor;
        newSingleThreadScheduledExecutor.schedule(new RunnableC28223c(this.f73293a), 1L, TimeUnit.SECONDS);
    }
}
