package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.n91;
import com.yandex.mobile.ads.impl.om1;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class sg0 {

    /* renamed from: a */
    private final am1 f85232a;

    /* renamed from: b */
    private final InterfaceC31357b f85233b;

    /* renamed from: c */
    private final HashMap<String, C31356a> f85234c = new HashMap<>();

    /* renamed from: d */
    private final HashMap<String, C31356a> f85235d = new HashMap<>();

    /* renamed from: e */
    private final Handler f85236e = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    private Runnable f85237f;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.sg0$a */
    /* loaded from: classes8.dex */
    public static class C31356a {

        /* renamed from: a */
        private final ml1<?> f85238a;

        /* renamed from: b */
        private Bitmap f85239b;

        /* renamed from: c */
        private yc2 f85240c;

        /* renamed from: d */
        private final ArrayList f85241d;

        public C31356a(xg0 xg0Var, C31358c c31358c) {
            ArrayList arrayList = new ArrayList();
            this.f85241d = arrayList;
            this.f85238a = xg0Var;
            arrayList.add(c31358c);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sg0$b */
    /* loaded from: classes8.dex */
    public interface InterfaceC31357b {
        @Nullable
        /* renamed from: a */
        Bitmap mo29612a(String str);

        /* renamed from: a */
        void mo29611a(String str, Bitmap bitmap);
    }

    /* renamed from: com.yandex.mobile.ads.impl.sg0$c */
    /* loaded from: classes8.dex */
    public class C31358c {

        /* renamed from: a */
        private Bitmap f85242a;

        /* renamed from: b */
        private final InterfaceC31359d f85243b;

        /* renamed from: c */
        private final String f85244c;

        public C31358c(Bitmap bitmap, String str, InterfaceC31359d interfaceC31359d) {
            this.f85242a = bitmap;
            this.f85244c = str;
            this.f85243b = interfaceC31359d;
        }

        @MainThread
        /* renamed from: a */
        public final void m29610a() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (this.f85243b == null) {
                    return;
                }
                C31356a c31356a = (C31356a) sg0.this.f85234c.get(this.f85244c);
                if (c31356a != null) {
                    c31356a.f85241d.remove(this);
                    if (c31356a.f85241d.size() == 0) {
                        c31356a.f85238a.mo27508a();
                        sg0.this.f85234c.remove(this.f85244c);
                        return;
                    }
                    return;
                }
                C31356a c31356a2 = (C31356a) sg0.this.f85235d.get(this.f85244c);
                if (c31356a2 != null) {
                    c31356a2.f85241d.remove(this);
                    if (c31356a2.f85241d.size() == 0) {
                        c31356a2.f85238a.mo27508a();
                    }
                    if (c31356a2.f85241d.size() == 0) {
                        sg0.this.f85235d.remove(this.f85244c);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new IllegalStateException("Must be invoked from the main thread.");
        }

        /* renamed from: b */
        public final Bitmap m29608b() {
            return this.f85242a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sg0$d */
    /* loaded from: classes8.dex */
    public interface InterfaceC31359d extends om1.InterfaceC31053a {
        /* renamed from: a */
        void mo29321a(C31358c c31358c, boolean z);
    }

    public sg0(am1 am1Var, n91.C30920b c30920b) {
        this.f85232a = am1Var;
        this.f85233b = c30920b;
    }

    /* renamed from: a */
    public String mo28994a(String str, int i, int i2, ImageView.ScaleType scaleType) {
        throw null;
    }

    /* renamed from: a */
    public final C31358c m29624a(String str, InterfaceC31359d interfaceC31359d, int i, int i2) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            String mo28994a = mo28994a(str, i, i2, scaleType);
            Bitmap mo29612a = this.f85233b.mo29612a(mo28994a);
            if (mo29612a != null) {
                C31358c c31358c = new C31358c(mo29612a, null, null);
                interfaceC31359d.mo29321a(c31358c, true);
                return c31358c;
            }
            C31358c c31358c2 = new C31358c(null, mo28994a, interfaceC31359d);
            interfaceC31359d.mo29321a(c31358c2, true);
            C31356a c31356a = this.f85234c.get(mo28994a);
            if (c31356a == null) {
                c31356a = this.f85235d.get(mo28994a);
            }
            if (c31356a != null) {
                c31356a.f85241d.add(c31358c2);
            } else {
                xg0 xg0Var = new xg0(str, new pg0(this, mo28994a), i, i2, scaleType, Bitmap.Config.RGB_565, new qg0(this, mo28994a));
                this.f85232a.m35826a(xg0Var);
                this.f85234c.put(mo28994a, new C31356a(xg0Var, c31358c2));
            }
            return c31358c2;
        }
        throw new IllegalStateException("Must be invoked from the main thread.");
    }
}
