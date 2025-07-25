package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class b00 {
    @NotNull
    /* renamed from: a */
    public static File m35724a(@NotNull Context context, @NotNull String cacheDirName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cacheDirName, "cacheDirName");
        String path = context.getCacheDir().getPath();
        String str = File.separator;
        return new File(path + str + cacheDirName);
    }
}
