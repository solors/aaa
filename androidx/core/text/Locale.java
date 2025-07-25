package androidx.core.text;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
@SuppressLint({"ClassVerificationFailure"})
/* renamed from: androidx.core.text.LocaleKt */
/* loaded from: classes.dex */
public final class Locale {
    @RequiresApi(17)
    public static final int getLayoutDirection(@NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "<this>");
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }
}
