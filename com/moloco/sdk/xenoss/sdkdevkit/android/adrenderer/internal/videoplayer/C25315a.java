package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC24530i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a */
/* loaded from: classes7.dex */
public final class C25315a implements InterfaceC24530i {
    @NotNull

    /* renamed from: b */
    public final Lifecycle f65732b;
    @NotNull

    /* renamed from: c */
    public final LifecycleEventObserver f65733c;

    @Metadata
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a$a */
    /* loaded from: classes7.dex */
    public static final class C25316a implements LifecycleEventObserver {

        /* renamed from: b */
        public final /* synthetic */ Functions<Unit> f65734b;

        /* renamed from: c */
        public final /* synthetic */ Functions<Unit> f65735c;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a$a$a */
        /* loaded from: classes7.dex */
        public /* synthetic */ class C25317a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f65736a;

            static {
                int[] iArr = new int[Lifecycle.Event.values().length];
                try {
                    iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Lifecycle.Event.ON_STOP.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f65736a = iArr;
            }
        }

        public C25316a(Functions<Unit> functions, Functions<Unit> functions2) {
            this.f65734b = functions;
            this.f65735c = functions2;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(@NotNull LifecycleOwner lifecycleOwner, @NotNull Lifecycle.Event event) {
            Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(event, "event");
            int i = C25317a.f65736a[event.ordinal()];
            if (i != 1) {
                if (i != 2 && i != 3 && i == 4) {
                    this.f65735c.invoke();
                    return;
                }
                return;
            }
            this.f65734b.invoke();
        }
    }

    public C25315a(@NotNull Lifecycle lifecycle, @NotNull Functions<Unit> onExoResume, @NotNull Functions<Unit> onExoPause) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(onExoResume, "onExoResume");
        Intrinsics.checkNotNullParameter(onExoPause, "onExoPause");
        this.f65732b = lifecycle;
        C25316a c25316a = new C25316a(onExoResume, onExoPause);
        this.f65733c = c25316a;
        lifecycle.addObserver(c25316a);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC24530i
    public void destroy() {
        this.f65732b.removeObserver(this.f65733c);
    }
}
