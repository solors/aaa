package com.google.firebase.crashlytics;

import com.google.firebase.Firebase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: FirebaseCrashlytics.kt */
@Metadata
/* loaded from: classes4.dex */
public final class FirebaseCrashlyticsKt {
    @NotNull
    public static final FirebaseCrashlytics getCrashlytics(@NotNull Firebase firebase) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseCrashlytics, "getInstance()");
        return firebaseCrashlytics;
    }

    public static final void setCustomKeys(@NotNull FirebaseCrashlytics firebaseCrashlytics, @NotNull Function1<? super KeyValueBuilder, Unit> init) {
        Intrinsics.checkNotNullParameter(firebaseCrashlytics, "<this>");
        Intrinsics.checkNotNullParameter(init, "init");
        init.invoke(new KeyValueBuilder(firebaseCrashlytics));
    }
}
