package com.yandex.div.core;

import android.content.Context;
import androidx.annotation.AnyThread;
import com.yandex.div.core.DivKitConfiguration;
import com.yandex.div.core.dagger.DivKitComponent;
import com.yandex.div.core.dagger.Yatagan$DivKitComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.yandex.div.core.s */
/* loaded from: classes8.dex */
public final class DivKit {
    @NotNull

    /* renamed from: b */
    public static final C29621a f75363b = new C29621a(null);
    @NotNull

    /* renamed from: c */
    private static final DivKitConfiguration f75364c = new DivKitConfiguration.C29623a().m37171b();
    @Nullable

    /* renamed from: d */
    private static DivKitConfiguration f75365d;
    @Nullable

    /* renamed from: e */
    private static volatile DivKit f75366e;
    @NotNull

    /* renamed from: a */
    private final DivKitComponent f75367a;

    /* compiled from: DivKit.kt */
    @Metadata
    /* renamed from: com.yandex.div.core.s$a */
    /* loaded from: classes8.dex */
    public static final class C29621a {
        private C29621a() {
        }

        public /* synthetic */ C29621a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @AnyThread
        @NotNull
        /* renamed from: a */
        public final DivKit m37181a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            DivKit divKit = DivKit.f75366e;
            if (divKit != null) {
                return divKit;
            }
            synchronized (this) {
                DivKit divKit2 = DivKit.f75366e;
                if (divKit2 == null) {
                    DivKitConfiguration divKitConfiguration = DivKit.f75365d;
                    if (divKitConfiguration == null) {
                        divKitConfiguration = DivKit.f75364c;
                    }
                    DivKit divKit3 = new DivKit(context, divKitConfiguration, null);
                    DivKit.f75366e = divKit3;
                    return divKit3;
                }
                return divKit2;
            }
        }

        @NotNull
        /* renamed from: b */
        public final String m37180b() {
            return "30.14.0";
        }
    }

    public /* synthetic */ DivKit(Context context, DivKitConfiguration divKitConfiguration, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, divKitConfiguration);
    }

    @NotNull
    /* renamed from: e */
    public final DivKitComponent m37182e() {
        return this.f75367a;
    }

    private DivKit(Context context, DivKitConfiguration divKitConfiguration) {
        DivKitComponent.Builder builder = Yatagan$DivKitComponent.builder();
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.f75367a = builder.mo37419b(applicationContext).mo37420a(divKitConfiguration).build();
    }
}
