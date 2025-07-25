package p1003v;

import android.graphics.Bitmap;
import android.os.Build;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: v.a */
/* loaded from: classes2.dex */
public final class Bitmaps {
    /* renamed from: a */
    public static final int m2856a(@NotNull Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                return m2855b(bitmap.getConfig()) * bitmap.getWidth() * bitmap.getHeight();
            }
        }
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
    }

    /* renamed from: b */
    public static final int m2855b(@Nullable Bitmap.Config config) {
        Bitmap.Config config2;
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
            return 2;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            config2 = Bitmap.Config.RGBA_F16;
            if (config == config2) {
                return 8;
            }
        }
        return 4;
    }

    @NotNull
    /* renamed from: c */
    public static final Bitmap.Config m2854c(@NotNull Bitmap bitmap) {
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            return Bitmap.Config.ARGB_8888;
        }
        return config;
    }

    /* renamed from: d */
    public static final boolean m2853d(@NotNull Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            config2 = Bitmap.Config.HARDWARE;
            if (config == config2) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    /* renamed from: e */
    public static final Bitmap.Config m2852e(@Nullable Bitmap.Config config) {
        if (config == null || m2853d(config)) {
            return Bitmap.Config.ARGB_8888;
        }
        return config;
    }
}
