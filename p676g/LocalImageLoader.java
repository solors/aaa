package p676g;

import android.content.Context;
import androidx.compose.p015ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ReadOnlyComposable;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p644e.Coil;
import p644e.InterfaceC32886e;

@Metadata
/* renamed from: g.g */
/* loaded from: classes2.dex */
public final class LocalImageLoader {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocalImageLoader.kt */
    @Metadata
    /* renamed from: g.g$a */
    /* loaded from: classes2.dex */
    public static final class C33174a extends Lambda implements Functions<InterfaceC32886e> {

        /* renamed from: g */
        public static final C33174a f90624g = new C33174a();

        C33174a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        @Nullable
        /* renamed from: b */
        public final InterfaceC32886e invoke() {
            return null;
        }
    }

    /* renamed from: b */
    public static /* synthetic */ ProvidableCompositionLocal m24536b(ProvidableCompositionLocal providableCompositionLocal, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            providableCompositionLocal = CompositionLocalKt.staticCompositionLocalOf(C33174a.f90624g);
        }
        return m24537a(providableCompositionLocal);
    }

    @Composable
    @ReadOnlyComposable
    @NotNull
    /* renamed from: c */
    public static final InterfaceC32886e m24535c(ProvidableCompositionLocal<InterfaceC32886e> providableCompositionLocal, @Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-617597678, i, -1, "coil.compose.ImageLoaderProvidableCompositionLocal.<get-current> (LocalImageLoader.kt:49)");
        }
        InterfaceC32886e interfaceC32886e = (InterfaceC32886e) composer.consume(providableCompositionLocal);
        if (interfaceC32886e == null) {
            interfaceC32886e = Coil.m25620a((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return interfaceC32886e;
    }

    @NotNull
    /* renamed from: a */
    public static ProvidableCompositionLocal<InterfaceC32886e> m24537a(@NotNull ProvidableCompositionLocal<InterfaceC32886e> providableCompositionLocal) {
        return providableCompositionLocal;
    }
}
