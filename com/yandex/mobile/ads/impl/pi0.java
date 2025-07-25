package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.yandex.mobile.ads.impl.oi0;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import p1046xd.C44980k;

/* loaded from: classes8.dex */
public final class pi0 {
    @NotNull

    /* renamed from: a */
    private final Context f83985a;
    @NotNull

    /* renamed from: b */
    private final mi0 f83986b;

    public pi0(@NotNull Context context, @NotNull mi0 fileProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileProvider, "fileProvider");
        this.f83985a = context;
        this.f83986b = fileProvider;
    }

    @NotNull
    /* renamed from: a */
    public final oi0 m30653a(@NotNull String reportText) {
        long j;
        Intrinsics.checkNotNullParameter(reportText, "reportText");
        try {
            File m31997a = this.f83986b.m31997a();
            File parentFile = m31997a.getParentFile();
            if (parentFile != null) {
                j = parentFile.getFreeSpace();
            } else {
                j = 0;
            }
            byte[] bytes = reportText.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            if (bytes.length < j) {
                C44980k.m1183j(m31997a, bytes);
                String packageName = this.f83985a.getPackageName();
                Uri uriForFile = FileProvider.getUriForFile(this.f83985a, packageName + ".monetization.ads.inspector.fileprovider", m31997a);
                Intrinsics.m17074g(uriForFile);
                return new oi0.C31046c(uriForFile);
            }
            return new oi0.C31044a("Not enough space error");
        } catch (Exception unused) {
            um0.m28726c(new Object[0]);
            return new oi0.C31044a("Failed to save report");
        }
    }
}
