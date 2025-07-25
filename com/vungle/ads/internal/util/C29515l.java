package com.vungle.ads.internal.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.LruCache;
import com.vungle.ads.internal.util.C29518o;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ImageLoader.kt */
@Metadata
/* renamed from: com.vungle.ads.internal.util.l */
/* loaded from: classes7.dex */
public final class C29515l {
    @NotNull
    private static final String FILE_SCHEME = "file://";
    @Nullable
    private Executor ioExecutor;
    @NotNull
    private final LruCache<String, Bitmap> lruCache = new C29516a(((int) (Runtime.getRuntime().maxMemory() / 1024)) / 8);
    @NotNull
    public static final C29517b Companion = new C29517b(null);
    private static final String TAG = C29515l.class.getSimpleName();
    @NotNull
    private static final C29515l instance = new C29515l();

    /* compiled from: ImageLoader.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.util.l$a */
    /* loaded from: classes7.dex */
    public static final class C29516a extends LruCache<String, Bitmap> {
        C29516a(int i) {
            super(i);
        }

        @Override // android.util.LruCache
        public int sizeOf(@Nullable String str, @NotNull Bitmap value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value.getByteCount() / 1024;
        }
    }

    /* compiled from: ImageLoader.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.util.l$b */
    /* loaded from: classes7.dex */
    public static final class C29517b {
        private C29517b() {
        }

        public /* synthetic */ C29517b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final C29515l getInstance() {
            return C29515l.instance;
        }
    }

    private C29515l() {
    }

    /* renamed from: displayImage$lambda-0 */
    public static final void m110398displayImage$lambda0(String str, C29515l this$0, Function1 onImageLoaded) {
        boolean m16624M;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(onImageLoaded, "$onImageLoaded");
        m16624M = StringsJVM.m16624M(str, "file://", false, 2, null);
        if (!m16624M) {
            return;
        }
        Bitmap bitmap = this$0.lruCache.get(str);
        if (bitmap != null && !bitmap.isRecycled()) {
            onImageLoaded.invoke(bitmap);
            return;
        }
        String substring = str.substring(7);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
        Bitmap decodeFile = BitmapFactory.decodeFile(substring);
        if (decodeFile != null) {
            this$0.lruCache.put(str, decodeFile);
            onImageLoaded.invoke(decodeFile);
            return;
        }
        C29518o.C29519a c29519a = C29518o.Companion;
        String TAG2 = TAG;
        Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
        c29519a.m37463w(TAG2, "decode bitmap failed.");
    }

    public final void displayImage(@Nullable final String str, @NotNull final Function1<? super Bitmap, Unit> onImageLoaded) {
        boolean z;
        Intrinsics.checkNotNullParameter(onImageLoaded, "onImageLoaded");
        if (this.ioExecutor == null) {
            C29518o.C29519a c29519a = C29518o.Companion;
            String TAG2 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            c29519a.m37463w(TAG2, "ImageLoader not initialized.");
            return;
        }
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C29518o.C29519a c29519a2 = C29518o.Companion;
            String TAG3 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            c29519a2.m37463w(TAG3, "the uri is required.");
            return;
        }
        Executor executor = this.ioExecutor;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: com.vungle.ads.internal.util.k
                @Override // java.lang.Runnable
                public final void run() {
                    C29515l.m110398displayImage$lambda0(str, this, onImageLoaded);
                }
            });
        }
    }

    public final void init(@NotNull Executor ioExecutor) {
        Intrinsics.checkNotNullParameter(ioExecutor, "ioExecutor");
        this.ioExecutor = ioExecutor;
    }
}
