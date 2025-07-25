package p1003v;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import java.io.Closeable;
import java.io.File;
import kotlin.Metadata;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import kotlin.text.StringNumberConversions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1077ze.C45327u;
import p644e.InterfaceC32878c;
import p659f.C33072a;
import p689h.DataSource;
import p706i.DiskCache;
import p765l.C37888c;
import p765l.InterfaceC37886b;
import p804nd.NoWhenBranchMatchedException;
import p837q.C39311o;
import p837q.Tags;
import p837q.ViewTargetRequestManager;
import p853r.AbstractC39420c;
import p853r.EnumC39423h;

/* compiled from: Utils.kt */
@Metadata
/* renamed from: v.j */
/* loaded from: classes2.dex */
public final class C44477j {
    @NotNull

    /* renamed from: a */
    private static final Bitmap.Config[] f116746a;
    @NotNull

    /* renamed from: b */
    private static final Bitmap.Config f116747b;
    @NotNull

    /* renamed from: c */
    private static final C45327u f116748c;

    /* compiled from: Utils.kt */
    @Metadata
    /* renamed from: v.j$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C44478a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[DataSource.values().length];
            iArr[DataSource.MEMORY_CACHE.ordinal()] = 1;
            iArr[DataSource.MEMORY.ordinal()] = 2;
            iArr[DataSource.DISK.ordinal()] = 3;
            iArr[DataSource.NETWORK.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
            iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[EnumC39423h.values().length];
            iArr3[EnumC39423h.FILL.ordinal()] = 1;
            iArr3[EnumC39423h.FIT.ordinal()] = 2;
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    static {
        Bitmap.Config[] configArr;
        Bitmap.Config config;
        Bitmap.Config config2;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            config2 = Bitmap.Config.RGBA_F16;
            configArr = new Bitmap.Config[]{Bitmap.Config.ARGB_8888, config2};
        } else {
            configArr = new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        }
        f116746a = configArr;
        if (i >= 26) {
            config = Bitmap.Config.HARDWARE;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        f116747b = config;
        f116748c = new C45327u.C45328a().m190e();
    }

    /* renamed from: a */
    public static final void m2834a(@NotNull DiskCache.InterfaceC33579b interfaceC33579b) {
        try {
            interfaceC33579b.abort();
        } catch (Exception unused) {
        }
    }

    @NotNull
    /* renamed from: b */
    public static final C45327u.C45328a m2833b(@NotNull C45327u.C45328a c45328a, @NotNull String str) {
        int m16568d0;
        boolean z;
        CharSequence m16571b1;
        m16568d0 = C37690r.m16568d0(str, ':', 0, false, 6, null);
        if (m16568d0 != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String substring = str.substring(0, m16568d0);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            m16571b1 = C37690r.m16571b1(substring);
            String obj = m16571b1.toString();
            String substring2 = str.substring(m16568d0 + 1);
            Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
            c45328a.m191d(obj, substring2);
            return c45328a;
        }
        throw new IllegalArgumentException(("Unexpected header: " + str).toString());
    }

    /* renamed from: c */
    public static final int m2832c(@NotNull Context context, double d) {
        int i;
        boolean z;
        try {
            Object systemService = ContextCompat.getSystemService(context, ActivityManager.class);
            Intrinsics.m17074g(systemService);
            ActivityManager activityManager = (ActivityManager) systemService;
            if ((context.getApplicationInfo().flags & 1048576) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = activityManager.getLargeMemoryClass();
            } else {
                i = activityManager.getMemoryClass();
            }
        } catch (Exception unused) {
            i = 256;
        }
        double d2 = 1024;
        return (int) (d * i * d2 * d2);
    }

    /* renamed from: d */
    public static final void m2831d(@NotNull Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public static final double m2830e(@NotNull Context context) {
        try {
            Object systemService = ContextCompat.getSystemService(context, ActivityManager.class);
            Intrinsics.m17074g(systemService);
            if (!((ActivityManager) systemService).isLowRamDevice()) {
                return 0.2d;
            }
            return 0.15d;
        } catch (Exception unused) {
            return 0.2d;
        }
    }

    @NotNull
    /* renamed from: f */
    public static final Bitmap.Config m2829f() {
        return f116747b;
    }

    @NotNull
    /* renamed from: g */
    public static final InterfaceC32878c m2828g(@NotNull InterfaceC37886b.InterfaceC37887a interfaceC37887a) {
        if (interfaceC37887a instanceof C37888c) {
            return ((C37888c) interfaceC37887a).m15845d();
        }
        return InterfaceC32878c.f89639b;
    }

    @Nullable
    /* renamed from: h */
    public static final String m2827h(@NotNull Uri uri) {
        Object m17529r0;
        m17529r0 = _Collections.m17529r0(uri.getPathSegments());
        return (String) m17529r0;
    }

    /* renamed from: i */
    public static final int m2826i(@NotNull Drawable drawable) {
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        if (drawable instanceof BitmapDrawable) {
            bitmapDrawable = (BitmapDrawable) drawable;
        } else {
            bitmapDrawable = null;
        }
        if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
            return bitmap.getHeight();
        }
        return drawable.getIntrinsicHeight();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @org.jetbrains.annotations.Nullable
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String m2825j(@org.jetbrains.annotations.NotNull android.webkit.MimeTypeMap r3, @org.jetbrains.annotations.Nullable java.lang.String r4) {
        /*
            if (r4 == 0) goto Lb
            boolean r0 = kotlin.text.C37686h.m16727B(r4)
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            r1 = 0
            if (r0 == 0) goto L10
            return r1
        L10:
            r0 = 35
            r2 = 2
            java.lang.String r4 = kotlin.text.C37686h.m16698Y0(r4, r0, r1, r2, r1)
            r0 = 63
            java.lang.String r4 = kotlin.text.C37686h.m16698Y0(r4, r0, r1, r2, r1)
            r0 = 47
            java.lang.String r4 = kotlin.text.C37686h.m16707Q0(r4, r0, r1, r2, r1)
            r0 = 46
            java.lang.String r1 = ""
            java.lang.String r4 = kotlin.text.C37686h.m16710O0(r4, r0, r1)
            java.lang.String r3 = r3.getMimeTypeFromExtension(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p1003v.C44477j.m2825j(android.webkit.MimeTypeMap, java.lang.String):java.lang.String");
    }

    /* renamed from: k */
    public static final int m2824k(@NotNull Configuration configuration) {
        return configuration.uiMode & 48;
    }

    @NotNull
    /* renamed from: l */
    public static final ViewTargetRequestManager m2823l(@NotNull View view) {
        View.OnAttachStateChangeListener onAttachStateChangeListener;
        int i = C33072a.coil_request_manager;
        Object tag = view.getTag(i);
        ViewTargetRequestManager viewTargetRequestManager = null;
        if (tag instanceof ViewTargetRequestManager) {
            onAttachStateChangeListener = (ViewTargetRequestManager) tag;
        } else {
            onAttachStateChangeListener = null;
        }
        if (onAttachStateChangeListener == null) {
            synchronized (view) {
                Object tag2 = view.getTag(i);
                if (tag2 instanceof ViewTargetRequestManager) {
                    viewTargetRequestManager = (ViewTargetRequestManager) tag2;
                }
                if (viewTargetRequestManager != null) {
                    onAttachStateChangeListener = viewTargetRequestManager;
                } else {
                    onAttachStateChangeListener = new ViewTargetRequestManager(view);
                    view.addOnAttachStateChangeListener(onAttachStateChangeListener);
                    view.setTag(i, onAttachStateChangeListener);
                }
            }
        }
        return onAttachStateChangeListener;
    }

    @NotNull
    /* renamed from: m */
    public static final File m2822m(@NotNull Context context) {
        File cacheDir = context.getCacheDir();
        cacheDir.mkdirs();
        return cacheDir;
    }

    @NotNull
    /* renamed from: n */
    public static final EnumC39423h m2821n(@NotNull ImageView imageView) {
        int i;
        ImageView.ScaleType scaleType = imageView.getScaleType();
        if (scaleType == null) {
            i = -1;
        } else {
            i = C44478a.$EnumSwitchMapping$1[scaleType.ordinal()];
        }
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            return EnumC39423h.FILL;
        }
        return EnumC39423h.FIT;
    }

    @NotNull
    /* renamed from: o */
    public static final Bitmap.Config[] m2820o() {
        return f116746a;
    }

    /* renamed from: p */
    public static final int m2819p(@NotNull Drawable drawable) {
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        if (drawable instanceof BitmapDrawable) {
            bitmapDrawable = (BitmapDrawable) drawable;
        } else {
            bitmapDrawable = null;
        }
        if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
            return bitmap.getWidth();
        }
        return drawable.getIntrinsicWidth();
    }

    /* renamed from: q */
    public static final boolean m2818q(@NotNull Uri uri) {
        if (Intrinsics.m17075f(uri.getScheme(), "file") && Intrinsics.m17075f(m2827h(uri), "android_asset")) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public static final boolean m2817r() {
        return Intrinsics.m17075f(Looper.myLooper(), Looper.getMainLooper());
    }

    /* renamed from: s */
    public static final boolean m2816s(int i) {
        if (i != Integer.MIN_VALUE && i != Integer.MAX_VALUE) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public static final boolean m2815t(@NotNull InterfaceC37886b.InterfaceC37887a interfaceC37887a) {
        if ((interfaceC37887a instanceof C37888c) && ((C37888c) interfaceC37887a).m15844e()) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public static final boolean m2814u(@NotNull Drawable drawable) {
        if (!(drawable instanceof VectorDrawable) && !(drawable instanceof VectorDrawableCompat)) {
            return false;
        }
        return true;
    }

    @NotNull
    /* renamed from: v */
    public static final C39311o m2813v(@Nullable C39311o c39311o) {
        if (c39311o == null) {
            return C39311o.f103363d;
        }
        return c39311o;
    }

    @NotNull
    /* renamed from: w */
    public static final Tags m2812w(@Nullable Tags tags) {
        if (tags == null) {
            return Tags.f103379c;
        }
        return tags;
    }

    @NotNull
    /* renamed from: x */
    public static final C45327u m2811x(@Nullable C45327u c45327u) {
        if (c45327u == null) {
            return f116748c;
        }
        return c45327u;
    }

    /* renamed from: y */
    public static final int m2810y(@NotNull String str, int i) {
        Long m16638o;
        m16638o = StringNumberConversions.m16638o(str);
        if (m16638o != null) {
            long longValue = m16638o.longValue();
            if (longValue > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (longValue < 0) {
                return 0;
            }
            return (int) longValue;
        }
        return i;
    }

    /* renamed from: z */
    public static final int m2809z(@NotNull AbstractC39420c abstractC39420c, @NotNull EnumC39423h enumC39423h) {
        if (abstractC39420c instanceof AbstractC39420c.C39421a) {
            return ((AbstractC39420c.C39421a) abstractC39420c).f103635a;
        }
        int i = C44478a.$EnumSwitchMapping$2[enumC39423h.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return Integer.MAX_VALUE;
            }
            throw new NoWhenBranchMatchedException();
        }
        return Integer.MIN_VALUE;
    }
}
