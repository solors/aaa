package io.appmetrica.analytics.coreutils.internal.p726io;

import android.annotation.TargetApi;
import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DoNotInline
@Metadata
@TargetApi(24)
/* renamed from: io.appmetrica.analytics.coreutils.internal.io.AppDataDirProviderForN */
/* loaded from: classes9.dex */
public final class AppDataDirProviderForN {
    @NotNull
    public static final AppDataDirProviderForN INSTANCE = new AppDataDirProviderForN();

    private AppDataDirProviderForN() {
    }

    @Nullable
    public final File dataDir(@NotNull Context context) {
        return context.getDataDir();
    }
}
