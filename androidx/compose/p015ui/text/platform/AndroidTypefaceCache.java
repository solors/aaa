package androidx.compose.p015ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.util.TypedValue;
import androidx.collection.LruCache;
import androidx.compose.p015ui.text.font.AndroidFont;
import androidx.compose.p015ui.text.font.AndroidPreloadedFont;
import androidx.compose.p015ui.text.font.Font;
import androidx.compose.p015ui.text.font.ResourceFont;
import androidx.core.content.res.ResourcesCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidFontListTypeface.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.platform.AndroidTypefaceCache */
/* loaded from: classes.dex */
public final class AndroidTypefaceCache {
    @NotNull
    public static final AndroidTypefaceCache INSTANCE = new AndroidTypefaceCache();
    @NotNull
    private static final LruCache<String, Typeface> cache = new LruCache<>(16);

    private AndroidTypefaceCache() {
    }

    @Nullable
    public final String getKey(@NotNull Context context, @NotNull Font font) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(font, "font");
        if (font instanceof ResourceFont) {
            TypedValue typedValue = new TypedValue();
            context.getResources().getValue(((ResourceFont) font).getResId(), typedValue, true);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("res:");
            CharSequence charSequence = typedValue.string;
            if (charSequence != null) {
                str = charSequence.toString();
            } else {
                str = null;
            }
            Intrinsics.m17074g(str);
            sb2.append(str);
            return sb2.toString();
        } else if (font instanceof AndroidPreloadedFont) {
            return ((AndroidPreloadedFont) font).getCacheKey();
        } else {
            throw new IllegalArgumentException("Unknown font type: " + font);
        }
    }

    @NotNull
    public final Typeface getOrCreate(@NotNull Context context, @NotNull Font font) {
        Typeface loadBlocking;
        Typeface it;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(font, "font");
        String key = getKey(context, font);
        if (key != null && (it = cache.get(key)) != null) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            return it;
        }
        if (font instanceof ResourceFont) {
            if (Build.VERSION.SDK_INT >= 26) {
                loadBlocking = AndroidResourceFontLoaderHelper.INSTANCE.create(context, ((ResourceFont) font).getResId());
            } else {
                loadBlocking = ResourcesCompat.getFont(context, ((ResourceFont) font).getResId());
                Intrinsics.m17074g(loadBlocking);
                Intrinsics.checkNotNullExpressionValue(loadBlocking, "{\n                    Re…esId)!!\n                }");
            }
        } else if (font instanceof AndroidFont) {
            AndroidFont androidFont = (AndroidFont) font;
            loadBlocking = androidFont.getTypefaceLoader().loadBlocking(context, androidFont);
        } else {
            throw new IllegalArgumentException("Unknown font type: " + font);
        }
        if (loadBlocking != null) {
            if (key != null) {
                cache.put(key, loadBlocking);
            }
            return loadBlocking;
        }
        throw new IllegalArgumentException("Unable to load font " + font);
    }
}
