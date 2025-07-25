package androidx.compose.p015ui.platform;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.p015ui.text.font.Font;
import androidx.compose.p015ui.text.font.ResourceFont;
import androidx.core.content.res.ResourcesCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidFontResourceLoader.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.AndroidFontResourceLoader */
/* loaded from: classes.dex */
public final class AndroidFontResourceLoader implements Font.ResourceLoader {
    @NotNull
    private final Context context;

    public AndroidFontResourceLoader(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // androidx.compose.p015ui.text.font.Font.ResourceLoader
    @NotNull
    public Typeface load(@NotNull Font font) {
        Intrinsics.checkNotNullParameter(font, "font");
        if (font instanceof ResourceFont) {
            if (Build.VERSION.SDK_INT >= 26) {
                return AndroidFontResourceLoaderHelper.INSTANCE.create(this.context, ((ResourceFont) font).getResId());
            }
            Typeface font2 = ResourcesCompat.getFont(this.context, ((ResourceFont) font).getResId());
            Intrinsics.m17074g(font2);
            Intrinsics.checkNotNullExpressionValue(font2, "{\n                    Re…esId)!!\n                }");
            return font2;
        }
        throw new IllegalArgumentException("Unknown font type: " + font);
    }
}
