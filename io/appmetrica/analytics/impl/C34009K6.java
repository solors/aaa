package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@DoNotInline
@Metadata
/* renamed from: io.appmetrica.analytics.impl.K6 */
/* loaded from: classes9.dex */
public final class C34009K6 implements InterfaceC33985J6 {
    @NotNull

    /* renamed from: a */
    private final InterfaceC34429bg f93100a;

    public C34009K6(@NotNull InterfaceC34429bg interfaceC34429bg) {
        this.f93100a = interfaceC34429bg;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33985J6
    @NotNull
    /* renamed from: a */
    public File mo22496a(@NotNull Context context, @NotNull String str) {
        return new File(context.getNoBackupFilesDir(), this.f93100a.mo21931a(str));
    }
}
