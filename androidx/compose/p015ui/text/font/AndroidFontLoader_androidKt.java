package androidx.compose.p015ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import androidx.core.content.res.ResourcesCompat;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C37734i;
import kotlinx.coroutines.Dispatchers;

/* compiled from: AndroidFontLoader.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.font.AndroidFontLoader_androidKt */
/* loaded from: classes.dex */
public final class AndroidFontLoader_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Typeface load(ResourceFont resourceFont, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return ResourceFontHelper.INSTANCE.load(context, resourceFont);
        }
        Typeface font = ResourcesCompat.getFont(context, resourceFont.getResId());
        Intrinsics.m17074g(font);
        Intrinsics.checkNotNullExpressionValue(font, "{\n        ResourcesCompa…t(context, resId)!!\n    }");
        return font;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object loadAsync(ResourceFont resourceFont, Context context, Continuation<? super Typeface> continuation) {
        return C37734i.m16317g(Dispatchers.m16377b(), new AndroidFontLoader_androidKt$loadAsync$2(resourceFont, context, null), continuation);
    }
}
