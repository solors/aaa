package com.ironsource;

import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.ext.SdkExtensions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.g1 */
/* loaded from: classes6.dex */
public final class C19949g1 {
    @NotNull

    /* renamed from: a */
    public static final C19949g1 f50166a = new C19949g1();

    private C19949g1() {
    }

    @SuppressLint({"WrongConstant", "NewApi"})
    /* renamed from: a */
    public static final int m58483a() {
        if (Build.VERSION.SDK_INT < 30) {
            return 0;
        }
        try {
            return SdkExtensions.getExtensionVersion(1000000);
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            return 0;
        }
    }

    @SuppressLint({"NewApi"})
    @Nullable
    /* renamed from: a */
    public static final MeasurementManager m58482a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 30) {
            if (m58483a() >= 4) {
                try {
                } catch (Exception unused) {
                    return null;
                }
            }
            return (MeasurementManager) context.getSystemService(MeasurementManager.class);
        }
        return null;
    }

    /* renamed from: b */
    public static /* synthetic */ void m58481b() {
    }
}
