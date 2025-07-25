package com.ironsource;

import java.io.InputStream;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata
/* renamed from: com.ironsource.v9 */
/* loaded from: classes6.dex */
public final class C21124v9 implements InterfaceC20572o8 {
    @NotNull

    /* renamed from: a */
    public static final C21124v9 f54176a = new C21124v9();

    private C21124v9() {
    }

    @Override // com.ironsource.InterfaceC20572o8
    @NotNull
    /* renamed from: a */
    public InputStream mo54501a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        InputStream openStream = new URL(url).openStream();
        Intrinsics.checkNotNullExpressionValue(openStream, "URL(url).openStream()");
        return openStream;
    }
}
