package com.google.firebase.analytics;

import androidx.annotation.NonNull;
import com.google.firebase.Firebase;
import com.google.firebase.FirebaseKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.0.2 */
@Metadata
/* loaded from: classes4.dex */
public final class AnalyticsKt {
    @Nullable

    /* renamed from: a */
    private static volatile FirebaseAnalytics f42042a;
    @NotNull

    /* renamed from: b */
    private static final Object f42043b = new Object();

    @androidx.annotation.Nullable
    public static final FirebaseAnalytics getANALYTICS() {
        return f42042a;
    }

    @NotNull
    public static final FirebaseAnalytics getAnalytics(@NonNull Firebase firebase) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        if (f42042a == null) {
            synchronized (f42043b) {
                if (f42042a == null) {
                    f42042a = FirebaseAnalytics.getInstance(FirebaseKt.getApp(Firebase.INSTANCE).getApplicationContext());
                }
            }
        }
        FirebaseAnalytics firebaseAnalytics = f42042a;
        Intrinsics.m17074g(firebaseAnalytics);
        return firebaseAnalytics;
    }

    @NotNull
    public static final Object getLOCK() {
        return f42043b;
    }

    public static final void logEvent(@NonNull FirebaseAnalytics firebaseAnalytics, @NonNull String name, @NonNull Function1<? super ParametersBuilder, Unit> block) {
        Intrinsics.checkNotNullParameter(firebaseAnalytics, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block, "block");
        ParametersBuilder parametersBuilder = new ParametersBuilder();
        block.invoke(parametersBuilder);
        firebaseAnalytics.logEvent(name, parametersBuilder.getBundle());
    }

    public static final void setANALYTICS(@Nullable FirebaseAnalytics firebaseAnalytics) {
        f42042a = firebaseAnalytics;
    }

    public static final void setConsent(@NonNull FirebaseAnalytics firebaseAnalytics, @NonNull Function1<? super ConsentBuilder, Unit> block) {
        Intrinsics.checkNotNullParameter(firebaseAnalytics, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        ConsentBuilder consentBuilder = new ConsentBuilder();
        block.invoke(consentBuilder);
        firebaseAnalytics.setConsent(consentBuilder.asMap());
    }
}
