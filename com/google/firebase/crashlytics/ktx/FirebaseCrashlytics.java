package com.google.firebase.crashlytics.ktx;

import com.google.firebase.ktx.Firebase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.google.firebase.crashlytics.ktx.FirebaseCrashlyticsKt */
/* loaded from: classes4.dex */
public final class FirebaseCrashlytics {
    @NotNull
    public static final com.google.firebase.crashlytics.FirebaseCrashlytics getCrashlytics(@NotNull Firebase firebase) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        com.google.firebase.crashlytics.FirebaseCrashlytics firebaseCrashlytics = com.google.firebase.crashlytics.FirebaseCrashlytics.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseCrashlytics, "getInstance()");
        return firebaseCrashlytics;
    }

    public static final void setCustomKeys(@NotNull com.google.firebase.crashlytics.FirebaseCrashlytics firebaseCrashlytics, @NotNull Function1<? super KeyValueBuilder, Unit> init) {
        Intrinsics.checkNotNullParameter(firebaseCrashlytics, "<this>");
        Intrinsics.checkNotNullParameter(init, "init");
        init.invoke(new KeyValueBuilder(firebaseCrashlytics));
    }
}
