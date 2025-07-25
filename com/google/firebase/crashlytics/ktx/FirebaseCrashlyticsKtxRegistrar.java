package com.google.firebase.crashlytics.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: FirebaseCrashlytics.kt */
@Keep
@Metadata
/* loaded from: classes4.dex */
public final class FirebaseCrashlyticsKtxRegistrar implements ComponentRegistrar {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* compiled from: FirebaseCrashlytics.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<Component<?>> getComponents() {
        List<Component<?>> m17166m;
        m17166m = C37563v.m17166m();
        return m17166m;
    }
}
