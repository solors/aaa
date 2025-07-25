package com.taurusx.tax.p583c.p586b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.api.TaurusXAds;
import com.taurusx.tax.p578b.C28206a;
import com.taurusx.tax.p578b.C28207b;
import com.taurusx.tax.p583c.p584a.C28265a;
import com.taurusx.tax.p583c.p587c.C28283c;
import com.taurusx.tax.p583c.p589e.C28291a;
import com.taurusx.tax.p583c.p590f.C28292a;
import com.taurusx.tax.p583c.p590f.C28294c;
import com.taurusx.tax.p606j.C28518e;
import com.taurusx.tax.p606j.C28536s;
import com.taurusx.tax.p606j.p616z.C28564d;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONObject;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.c.b.a */
/* loaded from: classes7.dex */
public class C28276a {

    /* renamed from: j */
    public static String f73449j = C28162a.f73047a.m23824a(new byte[]{-8, -8, -40, -32, -55, -36, -40, -2, -46, -4, -55}, new byte[]{-67, -114});

    /* renamed from: a */
    public Context f73450a;

    /* renamed from: b */
    public boolean f73451b;

    /* renamed from: c */
    public C28291a f73452c;

    /* renamed from: d */
    public C28265a f73453d;

    /* renamed from: e */
    public long f73454e;

    /* renamed from: f */
    public long f73455f = 10000;

    /* renamed from: g */
    public int f73456g = 20;

    /* renamed from: h */
    public Handler f73457h;

    /* renamed from: i */
    public HandlerThread f73458i;

    /* renamed from: com.taurusx.tax.c.b.a$a */
    /* loaded from: classes7.dex */
    public class HandlerC28277a extends Handler {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HandlerC28277a(Looper looper) {
            super(looper);
            C28276a.this = r1;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            NetworkInfo networkInfo;
            boolean z;
            if (message.what == 1) {
                C28276a c28276a = C28276a.this;
                try {
                    networkInfo = ((ConnectivityManager) c28276a.f73450a.getApplicationContext().getSystemService(C28162a.f73047a.m23824a(new byte[]{-48, -61, -35, -62, -42, -49, -57, -59, -59, -59, -57, -43}, new byte[]{-77, -84}))).getActiveNetworkInfo();
                } catch (Error | Exception e) {
                    e.printStackTrace();
                    networkInfo = null;
                }
                if (networkInfo != null && networkInfo.isConnected()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    Log.d(C28276a.f73449j, C28162a.f73047a.m23824a(new byte[]{75, -49, 113, -35, 106, -40, 110, -118, 75, -59, 113, -118, 70, -59, 107, -60, 96, -55, 113, -49, 97}, new byte[]{5, -86}));
                    c28276a.m38331a();
                    return;
                }
                String str = c28276a.f73452c.f73482f;
                if (TextUtils.isEmpty(str)) {
                    Log.d(C28276a.f73449j, C28162a.f73047a.m23824a(new byte[]{-16, 42, -27, 59, -17, 120, -32, 57, -16, 57, -92, 48, -21, 43, -16, 120, -19, 43, -92, 61, -23, 40, -16, 33}, new byte[]{-124, 88}));
                    c28276a.m38331a();
                } else if (c28276a.f73453d.f73432c.get() > c28276a.f73456g) {
                    c28276a.m38328a(str, false);
                } else {
                    c28276a.m38328a(str, true);
                }
            }
        }
    }

    /* renamed from: com.taurusx.tax.c.b.a$b */
    /* loaded from: classes7.dex */
    public class C28278b implements InterfaceC28279c {

        /* renamed from: a */
        public final /* synthetic */ List f73460a;

        /* renamed from: b */
        public final /* synthetic */ boolean f73461b;

        public C28278b(List list, boolean z) {
            C28276a.this = r1;
            this.f73460a = list;
            this.f73461b = z;
        }

        /* renamed from: a */
        public void m38327a(boolean z) {
            if (z) {
                C28276a c28276a = C28276a.this;
                StringFogImpl stringFogImpl = C28162a.f73047a;
                C28276a.m38329a(c28276a, stringFogImpl.m23824a(new byte[]{68, -44, 121, -43, 55, -14, 118, -46, Byte.MAX_VALUE, -44, 115, -111, 82, -57, 114, -33, 99, -111, 68, -60, 116, -46, 114, -62, 100, -99, 55, -29, 114, -36, 120, -57, 114, -111, 81, -61, 120, -36, 55, -14, 118, -46, Byte.MAX_VALUE, -44}, new byte[]{23, -79}));
                C28265a c28265a = C28276a.this.f73453d;
                List<C28265a.C28268c> list = this.f73460a;
                synchronized (c28265a) {
                    try {
                        Log.d(c28265a.f73430a, stringFogImpl.m23824a(new byte[]{-107, 90, -118, 80, -111, 90, -92, 94, -124, 87, -126, 19, -57, 76, -114, 69, -126, 5, -57}, new byte[]{-25, 63}) + list.size());
                        int m38333a = c28265a.f73433d.m38333a(list);
                        Log.d(c28265a.f73430a, stringFogImpl.m23824a(new byte[]{35, -62, 60, -56, 39, -62, 18, -58, 50, -49, 52, -121, 34, -46, 50, -60, 52, -44, 34, -117, 113, -44, 56, -35, 52, -99, 113}, new byte[]{81, -89}) + m38333a);
                        for (int i = 0; i < list.size(); i++) {
                            c28265a.f73432c.decrementAndGet();
                        }
                        Log.d(c28265a.f73430a, C28162a.f73047a.m23824a(new byte[]{-104, -43, -72, -36, -66, -108, -98, -62, -66, -38, -81, -108, -104, -37, -82, -38, -81, -114, -5}, new byte[]{-37, -76}) + c28265a.f73432c.get());
                    } catch (Error | Exception e) {
                        e.printStackTrace();
                    }
                }
            } else {
                C28276a.m38329a(C28276a.this, C28162a.f73047a.m23824a(new byte[]{-41, 5, -22, 4, -92, 35, -27, 3, -20, 5, -32, SignedBytes.MAX_POWER_OF_TWO, -63, 22, -31, 14, -16, SignedBytes.MAX_POWER_OF_TWO, -62, 1, -19, 12}, new byte[]{-124, 96}));
            }
            C28276a.this.f73454e = System.currentTimeMillis();
            C28276a c28276a2 = C28276a.this;
            C28276a.m38329a(c28276a2, C28162a.f73047a.m23824a(new byte[]{-82, 93, -119, 75, -94, 74, -125, 75, -85, 79, -66, 20, -25}, new byte[]{-57, 46}) + this.f73461b);
            if (this.f73461b) {
                C28276a.this.m38331a();
            } else {
                C28276a.this.f73457h.sendEmptyMessage(1);
            }
        }
    }

    /* renamed from: com.taurusx.tax.c.b.a$c */
    /* loaded from: classes7.dex */
    public interface InterfaceC28279c {
    }

    public C28276a(C28291a c28291a, C28265a c28265a) {
        this.f73452c = c28291a;
        this.f73453d = c28265a;
        HandlerThread handlerThread = new HandlerThread(C28162a.m38504a(new byte[]{17, 60, 16, 47, 16, 46, 29}, new byte[]{101, 93}));
        this.f73458i = handlerThread;
        handlerThread.start();
        this.f73457h = new HandlerC28277a(this.f73458i.getLooper());
    }

    /* renamed from: a */
    public static void m38329a(C28276a c28276a, String str) {
        c28276a.getClass();
        Log.d(f73449j, str);
    }

    /* renamed from: a */
    public final void m38331a() {
        this.f73457h.sendEmptyMessageDelayed(1, this.f73455f);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:43|44|45|(2:48|46)|49|50|51|(7:55|56|57|58|59|60|(2:66|67)(2:64|65))|73|57|58|59|60|(1:62)|66|67) */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x00d9, code lost:
        if (r6 == null) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v11, types: [com.taurusx.tax.c.b.a$c, com.taurusx.tax.c.b.a$b] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m38328a(java.lang.String r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 945
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.p583c.p586b.C28276a.m38328a(java.lang.String, boolean):void");
    }

    /* renamed from: a */
    public final void m38330a(Context context, JSONObject jSONObject) {
        try {
            jSONObject.put(C28162a.m38504a(new byte[]{26, -48}, new byte[]{96, -65}), (TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 1000) / 60);
            long m38300b = C28292a.m38300b(context);
            if (m38300b > 0) {
                jSONObject.put(C28162a.m38504a(new byte[]{-98, -24, -116}, new byte[]{-8, -127}), m38300b);
            }
            jSONObject.put(C28162a.m38504a(new byte[]{UnsignedBytes.MAX_POWER_OF_TWO, Byte.MAX_VALUE, -110}, new byte[]{-26, 19}), C28294c.m38285a().m38283a(C28162a.m38504a(new byte[]{-103, 91, -115, 65, -117, 109, -109, 83, -118, 92, -100, 90, -96, 70, -106, 95, -102}, new byte[]{-1, 50})));
            jSONObject.put(C28162a.m38504a(new byte[]{101, -12, 116}, new byte[]{16, -99}), this.f73452c.m38307e());
            jSONObject.put(C28162a.m38504a(new byte[]{-59, 0, -64}, new byte[]{-92, 105}), ((C28283c) this.f73452c.m38311b()).m38326a(context));
            jSONObject.put(C28162a.m38504a(new byte[]{54, -62, 56, -57}, new byte[]{81, -93}), ((C28283c) this.f73452c.m38311b()).m38325b(context));
            jSONObject.put(C28162a.m38504a(new byte[]{10, -46, 12, -41}, new byte[]{101, -77}), ((C28283c) this.f73452c.m38311b()).m38323d(context));
            String language = Locale.getDefault().getLanguage();
            String country = Locale.getDefault().getCountry();
            String m38504a = C28162a.m38504a(new byte[]{-80, 5, -78, 3}, new byte[]{-36, 100});
            jSONObject.put(m38504a, language + C28162a.m38504a(new byte[]{-48}, new byte[]{-3, 9}) + country);
            jSONObject.put(C28162a.m38504a(new byte[]{2, -43, 14, -60, 12, -59}, new byte[]{96, -96}), context.getPackageName());
            jSONObject.put(C28162a.m38504a(new byte[]{-55, -110, -40, -117, -52}, new byte[]{-88, -30}), this.f73452c.m38315a());
            jSONObject.put(C28162a.m38504a(new byte[]{48, -107, 54, -111}, new byte[]{93, -12}), Build.MANUFACTURER);
            jSONObject.put(C28162a.m38504a(new byte[]{-82, 19, -89, 25, -81}, new byte[]{-61, 124}), Build.MODEL);
            jSONObject.put(C28162a.m38504a(new byte[]{-105, -91}, new byte[]{-8, -42}), 2);
            jSONObject.put(C28162a.m38504a(new byte[]{92, -84, 69}, new byte[]{51, -33}), Build.VERSION.RELEASE);
            jSONObject.put(C28162a.m38504a(new byte[]{-120, -49, -125, -42, -114}, new byte[]{-22, -70}), Build.DISPLAY);
            jSONObject.put(C28162a.m38504a(new byte[]{21, -44, 4, -5, 2, -63, 6}, new byte[]{116, -92}), C28207b.m38433j(context));
            jSONObject.put(C28162a.m38504a(new byte[]{-63, -108, -48, -69, -42, -127, -46, -69, -61, -117, -60, -127}, new byte[]{-96, -28}), String.valueOf(C28207b.m38434i(context)));
            jSONObject.put(C28162a.m38504a(new byte[]{67, -86, 91, -111, 70, -85, 66}, new byte[]{48, -50}), this.f73452c.m38309c());
            jSONObject.put(C28162a.m38504a(new byte[]{-95, 118, -71, 77, -92, 119, -96, 77, -68, 115, -65, 119}, new byte[]{-46, 18}), this.f73452c.m38308d());
            jSONObject.put(C28162a.m38504a(new byte[]{15, 86, 28, 75, 16}, new byte[]{120, 63}), C28207b.m38436g(context));
            jSONObject.put(C28162a.m38504a(new byte[]{-120, -75, -119, -73, -120, -92}, new byte[]{-32, -48}), C28207b.m38437f(context));
            jSONObject.put(C28162a.m38504a(new byte[]{35, 21, 46, 14, 57, 10, 37}, new byte[]{SignedBytes.MAX_POWER_OF_TWO, 122}), C28207b.m38445b(context));
            jSONObject.put(C28162a.m38504a(new byte[]{-96, 68, -74}, new byte[]{-61, 52}), C28292a.m38305a());
            jSONObject.put(C28162a.m38504a(new byte[]{102, 124, 119, 111, 108, 120, 119}, new byte[]{5, 29}), C28292a.m38295e(context));
            jSONObject.put(C28162a.m38504a(new byte[]{83, -101}, new byte[]{33, -17}), C28292a.m38301b() ? 1 : 2);
            jSONObject.put(C28162a.m38504a(new byte[]{48}, new byte[]{84, 32}), C28292a.m38292h(context) ? 1 : 2);
            jSONObject.put(C28162a.m38504a(new byte[]{14, 39}, new byte[]{125, 73}), C28292a.m38294f(context));
            jSONObject.put(C28162a.m38504a(new byte[]{-55, 52}, new byte[]{-66, 68}), C28292a.m38287m(context) ? 1 : 2);
            jSONObject.put(C28162a.m38504a(new byte[]{-118, 114}, new byte[]{-4, 17}), C28292a.m38299c() ? 1 : 2);
            jSONObject.put(C28162a.m38504a(new byte[]{-63, 98}, new byte[]{-89, 5}), C28292a.m38290j(context) ? 1 : 2);
            jSONObject.put(C28162a.m38504a(new byte[]{15, 3}, new byte[]{106, 119}), C28292a.m38291i(context) ? 1 : 2);
            jSONObject.put(C28162a.m38504a(new byte[]{-1, 47}, new byte[]{-119, 91}), C28292a.m38297d() ? 1 : 2);
            jSONObject.put(C28162a.m38504a(new byte[]{-8, -9}, new byte[]{-112, -100}), C28292a.m38289k(context) ? 1 : 2);
            jSONObject.put(C28162a.m38504a(new byte[]{-103, 47, -107}, new byte[]{-5, 91}), C28292a.m38304a(context));
            jSONObject.put(C28162a.m38504a(new byte[]{-116, 66}, new byte[]{-32, 49}), C28292a.m38293g(context) ? 1 : 2);
            jSONObject.put(C28162a.m38504a(new byte[]{33, -112, 57}, new byte[]{74, -29}), C28292a.m38296d(context));
            jSONObject.put(C28162a.m38504a(new byte[]{32, 104, 52, 111, 50, 117, 38, 115, 54, 94, 32, 105, 50, 48}, new byte[]{83, 1}), C28207b.m38435h(TaurusXAds.getContext()));
            jSONObject.put(C28162a.m38504a(new byte[]{66, 67, 80, 82, 95, 86, 67}, new byte[]{38, 38}), C28518e.m38017c(context));
            jSONObject.put(C28162a.m38504a(new byte[]{-3, 77}, new byte[]{-120, 44}), C28536s.m37986a(context));
            jSONObject.put(C28162a.m38504a(new byte[]{79, -29, 87}, new byte[]{35, -114}), ((C28283c) this.f73452c.m38311b()).m38324c(context) ? C28162a.m38504a(new byte[]{-110}, new byte[]{-93, -106}) : C28162a.m38504a(new byte[]{-1}, new byte[]{-49, -121}));
            jSONObject.put(C28162a.m38504a(new byte[]{97, -65, 121, -115, 98, -77, 100, -74}, new byte[]{13, -46}), ((C28283c) this.f73452c.m38311b()).m38322e(context) ? C28162a.m38504a(new byte[]{53}, new byte[]{4, 77}) : C28162a.m38504a(new byte[]{93}, new byte[]{109, -86}));
            jSONObject.put(C28162a.m38504a(new byte[]{-13, 68, -19}, new byte[]{-101, 51}), Build.HARDWARE);
            jSONObject.put(C28162a.m38504a(new byte[]{59, 77, 57, 84, 63, 92, 36}, new byte[]{75, 53}), C28518e.m38013d(context));
            jSONObject.put(C28162a.m38504a(new byte[]{23, -84, 4, -82, 43, -85, 27, -112, 26, -96, 0, -112, 7, -86, 24, -93}, new byte[]{116, -49}), C28206a.m38470e().m38475a());
            jSONObject.put(C28162a.m38504a(new byte[]{-109, 2, UnsignedBytes.MAX_POWER_OF_TWO, 29, -111, 50, -103, 30, -81, 12, -105, 8, -81, 31, -107, 30, -124, 31, -103, 14, -124, 8, -108, 50, -123, 30, -107, 31}, new byte[]{-16, 109}), C28206a.m38470e().m38472c());
            jSONObject.put(C28162a.m38504a(new byte[]{-121, -78, -112, -92, -65, -78, -127, -94, -127, -119, -125, -71, -116, -70, -123, -75, -108, -65, -113, -72}, new byte[]{-32, -42}), C28206a.m38470e().m38471d());
            jSONObject.put(C28162a.m38504a(new byte[]{63, -80, 35, -77, 12, -76, 60, -71, 32, -78, 61, -93}, new byte[]{83, -41}), C28206a.m38470e().m38469f());
            jSONObject.put(C28162a.m38504a(new byte[]{-7, 17, -17, 16, -18, 12, -29}, new byte[]{-102, 126}), C28564d.m37923a());
            if (TextUtils.isEmpty(C28206a.m38470e().m38473b())) {
                return;
            }
            jSONObject.put(C28162a.m38504a(new byte[]{-110, -104, -112, -98, -97, -107, -99}, new byte[]{-15, -16}), C28206a.m38470e().m38473b());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
