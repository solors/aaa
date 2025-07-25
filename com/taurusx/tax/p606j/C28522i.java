package com.taurusx.tax.p606j;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.LruCache;
import android.widget.ImageView;
import com.google.common.primitives.SignedBytes;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.p578b.p582f.C28260o;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.j.i */
/* loaded from: classes7.dex */
public class C28522i {

    /* renamed from: a */
    public static ExecutorService f73962a = Executors.newSingleThreadExecutor();

    /* renamed from: b */
    public static int f73963b;

    /* renamed from: c */
    public static LruCache<String, Bitmap> f73964c;

    /* renamed from: com.taurusx.tax.j.i$a */
    /* loaded from: classes7.dex */
    public class RunnableC28523a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f73965a;

        /* renamed from: b */
        public final /* synthetic */ ImageView f73966b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC28525c f73967c;

        public RunnableC28523a(String str, ImageView imageView, InterfaceC28525c interfaceC28525c) {
            this.f73965a = str;
            this.f73966b = imageView;
            this.f73967c = interfaceC28525c;
        }

        @Override // java.lang.Runnable
        public void run() {
            StringFogImpl stringFogImpl = C28162a.f73047a;
            LogUtil.m37901iv(stringFogImpl.m23824a(new byte[]{72, -90, 73, -75, 73, -76, 68, -22, 78, -94, 80, -94, 93, -76, 89}, new byte[]{60, -57}), stringFogImpl.m23824a(new byte[]{-30, 83, -22, 89, -18, 30, -7, 91, -6, 75, -18, 77, -1, 30, -30, 77, -85, 77, -1, 95, -7, 74, -30, 80, -20}, new byte[]{-117, 62}));
            Bitmap bitmap = null;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f73965a).openConnection();
                httpURLConnection.setConnectTimeout(6000);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.connect();
                InputStream inputStream = httpURLConnection.getInputStream();
                bitmap = BitmapFactory.decodeStream(inputStream);
                inputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            StringFogImpl stringFogImpl2 = C28162a.f73047a;
            LogUtil.m37901iv(stringFogImpl2.m23824a(new byte[]{-53, 18, -54, 1, -54, 0, -57, 94, -51, 22, -45, 22, -34, 0, -38}, new byte[]{-65, 115}), stringFogImpl2.m23824a(new byte[]{90, 89, 82, 83, 86, 20, 65, 81, 66, 65, 86, 71, 71, 20, 90, 71, 19, 87, 92, 89, 67, 88, 86, SignedBytes.MAX_POWER_OF_TWO, 86}, new byte[]{51, 52}));
            if (bitmap != null) {
                C28522i.f73964c.put(this.f73965a, bitmap);
            }
            ImageView imageView = this.f73966b;
            InterfaceC28525c interfaceC28525c = this.f73967c;
            if (imageView != null && bitmap != null) {
                C28521h.m38005a(new RunnableC28526j(bitmap, imageView, this.f73965a, interfaceC28525c));
            }
        }
    }

    /* renamed from: com.taurusx.tax.j.i$b */
    /* loaded from: classes7.dex */
    public class C28524b extends LruCache<String, Bitmap> {
        public C28524b(int i) {
            super(i);
        }

        @Override // android.util.LruCache
        public int sizeOf(String str, Bitmap bitmap) {
            try {
                return bitmap.getByteCount();
            } catch (Exception unused) {
                return 0;
            }
        }
    }

    /* renamed from: com.taurusx.tax.j.i$c */
    /* loaded from: classes7.dex */
    public interface InterfaceC28525c {
    }

    static {
        new HashMap();
        f73963b = (int) (Runtime.getRuntime().maxMemory() / 8);
        f73964c = new C28524b(f73963b);
    }

    /* renamed from: a */
    public static void m38002a(ImageView imageView, String str) {
        try {
            m38001a(imageView, str, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m38001a(ImageView imageView, String str, InterfaceC28525c interfaceC28525c) {
        if (TextUtils.isEmpty(str)) {
            if (interfaceC28525c != null) {
                ((C28260o) interfaceC28525c).m38340a(null);
                return;
            }
            return;
        }
        if (imageView != null) {
            imageView.setTag(str);
        }
        Bitmap bitmap = f73964c.get(str);
        if (bitmap != null) {
            C28521h.m38005a(new RunnableC28526j(bitmap, imageView, str, interfaceC28525c));
            StringFogImpl stringFogImpl = C28162a.f73047a;
            LogUtil.m37901iv(stringFogImpl.m23824a(new byte[]{37, -57, 36, -44, 36, -43, 41, -117, 35, -61, 61, -61, 48, -43, 52}, new byte[]{81, -90}), stringFogImpl.m23824a(new byte[]{14, -47, 18, -50, 93, -48, 16, -40, 26, -36, 93, -33, 15, -42, 16, -103, 30, -40, 30, -47, 24}, new byte[]{125, -71}));
            return;
        }
        f73962a.execute(new RunnableC28523a(str, imageView, interfaceC28525c));
    }
}
