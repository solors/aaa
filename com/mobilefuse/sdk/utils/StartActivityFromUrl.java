package com.mobilefuse.sdk.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.mobilefuse.sdk.utils.StartActivityFromUrlKt */
/* loaded from: classes7.dex */
public final class StartActivityFromUrl {
    public static final void startActivityFromUrl(@NotNull Context startActivityFromUrl, @NotNull String url, @Nullable Functions<Unit> functions, @Nullable Function1<? super Throwable, Unit> function1) {
        Intrinsics.checkNotNullParameter(startActivityFromUrl, "$this$startActivityFromUrl");
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
            intent.addFlags(268435456);
            startActivityFromUrl.startActivity(intent);
            if (functions != null) {
                functions.invoke();
            }
        } catch (Throwable th) {
            if (function1 != null) {
                function1.invoke(th);
            }
        }
    }

    public static /* synthetic */ void startActivityFromUrl$default(Context context, String str, Functions functions, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            functions = null;
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        startActivityFromUrl(context, str, functions, function1);
    }
}
