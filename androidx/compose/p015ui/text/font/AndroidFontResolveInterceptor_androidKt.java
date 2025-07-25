package androidx.compose.p015ui.text.font;

import android.content.Context;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidFontResolveInterceptor.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.font.AndroidFontResolveInterceptor_androidKt */
/* loaded from: classes.dex */
public final class AndroidFontResolveInterceptor_androidKt {
    @NotNull
    public static final AndroidFontResolveInterceptor AndroidFontResolveInterceptor(@NotNull Context context) {
        int i;
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 31) {
            i = context.getResources().getConfiguration().fontWeightAdjustment;
        } else {
            i = 0;
        }
        return new AndroidFontResolveInterceptor(i);
    }
}
