package com.p551my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.widget.ImageView;
import com.p551my.target.AbstractC25749f5;
import com.p551my.target.common.models.ImageData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.my.target.o2 */
/* loaded from: classes7.dex */
public final class C25974o2 {

    /* renamed from: e */
    public static final WeakHashMap f67463e = new WeakHashMap();

    /* renamed from: a */
    public final List f67464a;

    /* renamed from: b */
    public InterfaceC25976b f67465b;

    /* renamed from: c */
    public int f67466c = 0;

    /* renamed from: d */
    public String f67467d;

    /* renamed from: com.my.target.o2$a */
    /* loaded from: classes7.dex */
    public class C25975a implements AbstractC25749f5.InterfaceC25750a {

        /* renamed from: a */
        public final /* synthetic */ ImageData f67468a;

        /* renamed from: b */
        public final /* synthetic */ String f67469b;

        /* renamed from: c */
        public final /* synthetic */ Context f67470c;

        /* renamed from: d */
        public final /* synthetic */ AtomicInteger f67471d;

        /* renamed from: e */
        public final /* synthetic */ InterfaceC25976b f67472e;

        public C25975a(ImageData imageData, String str, Context context, AtomicInteger atomicInteger, InterfaceC25976b interfaceC25976b) {
            C25974o2.this = r1;
            this.f67468a = imageData;
            this.f67469b = str;
            this.f67470c = context;
            this.f67471d = atomicInteger;
            this.f67472e = interfaceC25976b;
        }

        @Override // com.p551my.target.AbstractC25749f5.InterfaceC25750a
        /* renamed from: a */
        public void mo42889a() {
            m43267b();
        }

        /* renamed from: b */
        public final void m43267b() {
            if (this.f67471d.decrementAndGet() == 0) {
                this.f67472e.mo42740a(true);
            }
        }

        @Override // com.p551my.target.AbstractC25749f5.InterfaceC25750a
        /* renamed from: a */
        public void mo42888a(Bitmap bitmap) {
            this.f67468a.setData(bitmap);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (this.f67468a.getHeight() == 0 || this.f67468a.getWidth() == 0) {
                this.f67468a.setHeight(height);
                this.f67468a.setWidth(width);
            }
            int width2 = this.f67468a.getWidth();
            int height2 = this.f67468a.getHeight();
            if (width2 != width || height2 != height) {
                String format = String.format(Locale.getDefault(), "JSON image params (%d x %d) differ than loaded bitmap params (%d x %d)", Integer.valueOf(width2), Integer.valueOf(height2), Integer.valueOf(width), Integer.valueOf(height));
                AbstractC25846ja.m43674d(format);
                C25974o2.this.m43276a(format, this.f67469b, this.f67470c);
            }
            m43267b();
        }
    }

    /* renamed from: com.my.target.o2$b */
    /* loaded from: classes7.dex */
    public interface InterfaceC25976b {
        /* renamed from: a */
        void mo42740a(boolean z);
    }

    public C25974o2(List list) {
        this.f67464a = list;
    }

    /* renamed from: a */
    public static void m43280a(ImageData imageData, ImageView imageView) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            AbstractC25846ja.m43678b("ImageLoaderUtils: Method cancel called from worker thread");
            return;
        }
        WeakHashMap weakHashMap = f67463e;
        if (weakHashMap.get(imageView) == imageData) {
            weakHashMap.remove(imageView);
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void m43271b() {
        InterfaceC25976b interfaceC25976b = this.f67465b;
        if (interfaceC25976b != null) {
            interfaceC25976b.mo42740a(true);
            this.f67465b = null;
        }
    }

    /* renamed from: b */
    public static void m43269b(ImageData imageData, ImageView imageView) {
        m43279a(imageData, imageView, (InterfaceC25976b) null);
    }

    /* renamed from: a */
    public void m43285a() {
        if (this.f67465b == null) {
            return;
        }
        AbstractC25671c0.m44121e(new Runnable() { // from class: com.my.target.he
            @Override // java.lang.Runnable
            public final void run() {
                C25974o2.this.m43271b();
            }
        });
    }

    /* renamed from: a */
    public static /* synthetic */ void m43273a(CountDownLatch countDownLatch, boolean z) {
        countDownLatch.countDown();
    }

    /* renamed from: b */
    public void m43270b(Context context) {
        if (this.f67464a.isEmpty()) {
            m43285a();
            return;
        }
        m43277a(new InterfaceC25976b() { // from class: com.my.target.ie
            @Override // com.p551my.target.C25974o2.InterfaceC25976b
            /* renamed from: a */
            public final void mo42740a(boolean z) {
                C25974o2.this.m43272a(z);
            }
        }, context.getApplicationContext());
    }

    /* renamed from: a */
    public static /* synthetic */ void m43275a(WeakReference weakReference, ImageData imageData, InterfaceC25976b interfaceC25976b, boolean z) {
        ImageView imageView = (ImageView) weakReference.get();
        if (imageView != null) {
            WeakHashMap weakHashMap = f67463e;
            if (imageData == ((ImageData) weakHashMap.get(imageView))) {
                weakHashMap.remove(imageView);
                Bitmap bitmap = imageData.getBitmap();
                if (bitmap != null) {
                    m43282a(bitmap, imageView);
                }
            }
        }
        if (interfaceC25976b != null) {
            interfaceC25976b.mo42740a(imageData.getBitmap() != null);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void m43272a(boolean z) {
        m43285a();
    }

    /* renamed from: a */
    public void m43283a(Context context) {
        if (AbstractC25671c0.m44128a()) {
            AbstractC25846ja.m43678b("ImageLoaderUtils: Method load called from main thread");
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        m43277a(new InterfaceC25976b() { // from class: com.my.target.je
            @Override // com.p551my.target.C25974o2.InterfaceC25976b
            /* renamed from: a */
            public final void mo42740a(boolean z) {
                C25974o2.m43273a(countDownLatch, z);
            }
        }, context);
        try {
            countDownLatch.await();
            AbstractC25846ja.m43680a("ImageLoaderUtils: success media loading");
        } catch (InterruptedException unused) {
            AbstractC25846ja.m43680a("ImageLoaderUtils: awaiting media files load failed");
        }
    }

    /* renamed from: a */
    public static void m43279a(final ImageData imageData, ImageView imageView, final InterfaceC25976b interfaceC25976b) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            AbstractC25846ja.m43678b("ImageLoaderUtils: Method loadAndDisplay called from worker thread");
            return;
        }
        WeakHashMap weakHashMap = f67463e;
        if (weakHashMap.get(imageView) == imageData) {
            return;
        }
        weakHashMap.remove(imageView);
        if (imageData.getBitmap() != null) {
            m43282a(imageData.getBitmap(), imageView);
            return;
        }
        weakHashMap.put(imageView, imageData);
        final WeakReference weakReference = new WeakReference(imageView);
        m43281a(imageData).m43278a(new InterfaceC25976b() { // from class: com.my.target.ge
            @Override // com.p551my.target.C25974o2.InterfaceC25976b
            /* renamed from: a */
            public final void mo42740a(boolean z) {
                C25974o2.m43275a(weakReference, imageData, interfaceC25976b, z);
            }
        }).m43270b(imageView.getContext());
    }

    /* renamed from: a */
    public final void m43277a(InterfaceC25976b interfaceC25976b, Context context) {
        AtomicInteger atomicInteger = new AtomicInteger(this.f67464a.size());
        int i = 0;
        for (ImageData imageData : this.f67464a) {
            if (imageData.getBitmap() != null) {
                atomicInteger.decrementAndGet();
                i++;
            } else {
                String url = imageData.getUrl();
                C25926n2.m43418a().m43416b(url, new C25975a(imageData, url, context, atomicInteger, interfaceC25976b), context);
            }
        }
        if (i == this.f67464a.size()) {
            interfaceC25976b.mo42740a(true);
        }
    }

    /* renamed from: a */
    public static C25974o2 m43281a(ImageData imageData) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(imageData);
        return new C25974o2(arrayList);
    }

    /* renamed from: a */
    public static C25974o2 m43274a(List list) {
        return new C25974o2(list);
    }

    /* renamed from: a */
    public void m43276a(String str, String str2, Context context) {
        C25656b5 m44176b = C25656b5.m44178a("Bad value").m44173e(str).m44180a(Math.max(this.f67466c, 0)).m44176b(str2);
        String str3 = this.f67467d;
        if (str3 == null) {
            str3 = null;
        }
        m44176b.m44175c(str3).m44177b(context);
    }

    /* renamed from: a */
    public static void m43282a(Bitmap bitmap, ImageView imageView) {
        if (imageView instanceof C26038q9) {
            ((C26038q9) imageView).setImageBitmap(bitmap, true);
        } else {
            imageView.setImageBitmap(bitmap);
        }
    }

    /* renamed from: a */
    public C25974o2 m43284a(int i, String str) {
        this.f67466c = i;
        this.f67467d = str;
        return this;
    }

    /* renamed from: a */
    public C25974o2 m43278a(InterfaceC25976b interfaceC25976b) {
        this.f67465b = interfaceC25976b;
        return this;
    }
}
