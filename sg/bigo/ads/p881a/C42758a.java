package sg.bigo.ads.p881a;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;

/* renamed from: sg.bigo.ads.a.a */
/* loaded from: classes10.dex */
public final class C42758a {

    /* renamed from: a */
    public final String f111936a;
    @ColorInt

    /* renamed from: b */
    public final int f111937b;
    @ColorInt

    /* renamed from: c */
    public final int f111938c;

    /* renamed from: d */
    public final boolean f111939d;

    /* renamed from: e */
    public final Bitmap f111940e;

    /* renamed from: f */
    public final InterfaceC42761c f111941f;

    /* renamed from: g */
    public final InterfaceC42760b f111942g;

    /* renamed from: sg.bigo.ads.a.a$a */
    /* loaded from: classes10.dex */
    public static class C42759a {

        /* renamed from: a */
        public String f111943a;

        /* renamed from: b */
        public InterfaceC42761c f111944b;

        /* renamed from: c */
        public InterfaceC42760b f111945c;
        @ColorInt

        /* renamed from: d */
        private int f111946d = 0;
        @ColorInt

        /* renamed from: e */
        private int f111947e = 0;

        /* renamed from: f */
        private boolean f111948f = true;

        /* renamed from: g */
        private Bitmap f111949g;

        /* renamed from: a */
        public final C42758a m6625a() {
            return new C42758a(this.f111943a, this.f111946d, this.f111947e, this.f111948f, this.f111949g, this.f111944b, this.f111945c);
        }
    }

    /* renamed from: sg.bigo.ads.a.a$b */
    /* loaded from: classes10.dex */
    public interface InterfaceC42760b {
        /* renamed from: a */
        void mo4016a(Context context, String str, int i, @Nullable String str2);

        /* renamed from: a */
        void mo4015a(String str, String str2, String str3);
    }

    /* renamed from: sg.bigo.ads.a.a$c */
    /* loaded from: classes10.dex */
    public interface InterfaceC42761c {
        /* renamed from: a */
        void mo4054a();

        /* renamed from: b */
        void mo4052b();

        /* renamed from: c */
        void mo4051c();

        /* renamed from: d */
        void mo4050d();

        /* renamed from: e */
        void mo4049e();

        /* renamed from: o */
        void mo4048o();
    }

    public C42758a(String str, int i, int i2, boolean z, Bitmap bitmap, InterfaceC42761c interfaceC42761c, InterfaceC42760b interfaceC42760b) {
        this.f111936a = str;
        this.f111937b = i;
        this.f111938c = i2;
        this.f111939d = z;
        this.f111940e = bitmap;
        this.f111941f = interfaceC42761c;
        this.f111942g = interfaceC42760b;
    }
}
