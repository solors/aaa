package com.moloco.sdk.internal.android_context;

import android.content.Context;
import androidx.startup.Initializer;
import com.moloco.sdk.internal.MolocoLogger;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes7.dex */
public final class ApplicationContextStartupComponentInitialization implements Initializer<Unit> {
    @NotNull

    /* renamed from: a */
    public static final C23934a f61955a = new C23934a(null);

    /* renamed from: b */
    public static boolean f61956b;

    /* renamed from: com.moloco.sdk.internal.android_context.ApplicationContextStartupComponentInitialization$a */
    /* loaded from: classes7.dex */
    public static final class C23934a {
        public /* synthetic */ C23934a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C23934a() {
        }
    }

    /* renamed from: a */
    public void m47319a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C23936b.m47316a(context);
        f61956b = true;
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "ApplicationContextStartupComponentInitialization", "initialized", false, 4, null);
    }

    @Override // androidx.startup.Initializer
    public /* bridge */ /* synthetic */ Unit create(Context context) {
        m47319a(context);
        return Unit.f99208a;
    }

    @Override // androidx.startup.Initializer
    @NotNull
    public List<Class<? extends Initializer<?>>> dependencies() {
        List<Class<? extends Initializer<?>>> m17166m;
        m17166m = C37563v.m17166m();
        return m17166m;
    }
}
