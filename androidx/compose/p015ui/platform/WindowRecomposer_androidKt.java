package androidx.compose.p015ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.p015ui.C0825R;
import androidx.compose.p015ui.ExperimentalComposeUiApi;
import androidx.compose.p015ui.MotionDurationScale;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.PausableMonotonicFrameClock;
import androidx.compose.runtime.Recomposer;
import androidx.core.p017os.HandlerCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import ge.C33329j;
import ge.InterfaceC33330j0;
import ge.StateFlow;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.C37586g;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C37609n0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C37756k;
import kotlinx.coroutines.C37785p0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p674fe.C33119g;
import p674fe.Channel;

/* compiled from: WindowRecomposer.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt */
/* loaded from: classes.dex */
public final class WindowRecomposer_androidKt {
    @NotNull
    private static final Map<Context, StateFlow<Float>> animationScale = new LinkedHashMap();

    /* JADX WARN: Type inference failed for: r0v14, types: [T, androidx.compose.ui.platform.MotionDurationScaleImpl] */
    @ExperimentalComposeUiApi
    @NotNull
    public static final Recomposer createLifecycleAwareWindowRecomposer(@NotNull final View view, @NotNull CoroutineContext coroutineContext, @Nullable Lifecycle lifecycle) {
        final PausableMonotonicFrameClock pausableMonotonicFrameClock;
        CoroutineContext coroutineContext2;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        if (coroutineContext.get(ContinuationInterceptor.f99287Z7) == null || coroutineContext.get(MonotonicFrameClock.Key) == null) {
            coroutineContext = AndroidUiDispatcher.Companion.getCurrentThread().plus(coroutineContext);
        }
        MonotonicFrameClock monotonicFrameClock = (MonotonicFrameClock) coroutineContext.get(MonotonicFrameClock.Key);
        if (monotonicFrameClock != null) {
            PausableMonotonicFrameClock pausableMonotonicFrameClock2 = new PausableMonotonicFrameClock(monotonicFrameClock);
            pausableMonotonicFrameClock2.pause();
            pausableMonotonicFrameClock = pausableMonotonicFrameClock2;
        } else {
            pausableMonotonicFrameClock = null;
        }
        final C37609n0 c37609n0 = new C37609n0();
        MotionDurationScale motionDurationScale = (MotionDurationScale) coroutineContext.get(MotionDurationScale.Key);
        MotionDurationScale motionDurationScale2 = motionDurationScale;
        if (motionDurationScale == null) {
            ?? motionDurationScaleImpl = new MotionDurationScaleImpl();
            c37609n0.f99327b = motionDurationScaleImpl;
            motionDurationScale2 = motionDurationScaleImpl;
        }
        if (pausableMonotonicFrameClock != null) {
            coroutineContext2 = pausableMonotonicFrameClock;
        } else {
            coroutineContext2 = C37586g.f99289b;
        }
        CoroutineContext plus = coroutineContext.plus(coroutineContext2).plus(motionDurationScale2);
        final Recomposer recomposer = new Recomposer(plus);
        final CoroutineScope m16131a = C37785p0.m16131a(plus);
        if (lifecycle == null) {
            LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(view);
            if (lifecycleOwner != null) {
                lifecycle = lifecycleOwner.getLifecycle();
            } else {
                lifecycle = null;
            }
        }
        if (lifecycle != null) {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NotNull View v) {
                    Intrinsics.checkNotNullParameter(v, "v");
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@NotNull View v) {
                    Intrinsics.checkNotNullParameter(v, "v");
                    view.removeOnAttachStateChangeListener(this);
                    recomposer.cancel();
                }
            });
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2

                /* compiled from: WindowRecomposer.android.kt */
                @Metadata
                /* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$WhenMappings */
                /* loaded from: classes.dex */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[Lifecycle.Event.values().length];
                        iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
                        iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
                        iArr[Lifecycle.Event.ON_STOP.ordinal()] = 3;
                        iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
                        iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 5;
                        iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 6;
                        iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(@NotNull LifecycleOwner lifecycleOwner2, @NotNull Lifecycle.Event event) {
                    Intrinsics.checkNotNullParameter(lifecycleOwner2, "lifecycleOwner");
                    Intrinsics.checkNotNullParameter(event, "event");
                    int i = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
                    if (i == 1) {
                        C37756k.m16221d(CoroutineScope.this, null, CoroutineStart.UNDISPATCHED, new C0963x149b840a(c37609n0, recomposer, lifecycleOwner2, this, view, null), 1, null);
                    } else if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                recomposer.cancel();
                                return;
                            }
                            return;
                        }
                        PausableMonotonicFrameClock pausableMonotonicFrameClock3 = pausableMonotonicFrameClock;
                        if (pausableMonotonicFrameClock3 != null) {
                            pausableMonotonicFrameClock3.pause();
                        }
                    } else {
                        PausableMonotonicFrameClock pausableMonotonicFrameClock4 = pausableMonotonicFrameClock;
                        if (pausableMonotonicFrameClock4 != null) {
                            pausableMonotonicFrameClock4.resume();
                        }
                    }
                }
            });
            return recomposer;
        }
        throw new IllegalStateException(("ViewTreeLifecycleOwner not found from " + view).toString());
    }

    public static /* synthetic */ Recomposer createLifecycleAwareWindowRecomposer$default(View view, CoroutineContext coroutineContext, Lifecycle lifecycle, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = C37586g.f99289b;
        }
        if ((i & 2) != 0) {
            lifecycle = null;
        }
        return createLifecycleAwareWindowRecomposer(view, coroutineContext, lifecycle);
    }

    @Nullable
    public static final CompositionContext findViewTreeCompositionContext(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        CompositionContext compositionContext = getCompositionContext(view);
        if (compositionContext != null) {
            return compositionContext;
        }
        for (ViewParent parent = view.getParent(); compositionContext == null && (parent instanceof View); parent = parent.getParent()) {
            compositionContext = getCompositionContext((View) parent);
        }
        return compositionContext;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1] */
    public static final StateFlow<Float> getAnimationScaleFlowFor(Context context) {
        StateFlow<Float> stateFlow;
        Map<Context, StateFlow<Float>> map = animationScale;
        synchronized (map) {
            StateFlow<Float> stateFlow2 = map.get(context);
            if (stateFlow2 == null) {
                ContentResolver contentResolver = context.getContentResolver();
                Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                final Channel m24689b = C33119g.m24689b(-1, null, null, 6, null);
                stateFlow2 = C33329j.m24105N(C33329j.m24118A(new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(contentResolver, uriFor, new ContentObserver(HandlerCompat.createAsync(Looper.getMainLooper())) { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1
                    @Override // android.database.ContentObserver
                    public void onChange(boolean z, @Nullable Uri uri) {
                        m24689b.mo24641p(Unit.f99208a);
                    }
                }, m24689b, context, null)), C37785p0.m16130b(), InterfaceC33330j0.C33331a.m24073b(InterfaceC33330j0.f90958a, 0L, 0L, 3, null), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                map.put(context, stateFlow2);
            }
            stateFlow = stateFlow2;
        }
        return stateFlow;
    }

    @Nullable
    public static final CompositionContext getCompositionContext(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object tag = view.getTag(C0825R.C0827id.androidx_compose_ui_view_composition_context);
        if (tag instanceof CompositionContext) {
            return (CompositionContext) tag;
        }
        return null;
    }

    private static final View getContentChild(View view) {
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() == 16908290) {
                return view;
            }
            parent = view2.getParent();
            view = view2;
        }
        return view;
    }

    @NotNull
    public static final Recomposer getWindowRecomposer(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.isAttachedToWindow()) {
            View contentChild = getContentChild(view);
            CompositionContext compositionContext = getCompositionContext(contentChild);
            if (compositionContext == null) {
                return WindowRecomposerPolicy.INSTANCE.createAndInstallWindowRecomposer$ui_release(contentChild);
            }
            if (compositionContext instanceof Recomposer) {
                return (Recomposer) compositionContext;
            }
            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer".toString());
        }
        throw new IllegalStateException(("Cannot locate windowRecomposer; View " + view + " is not attached to a window").toString());
    }

    public static final void setCompositionContext(@NotNull View view, @Nullable CompositionContext compositionContext) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(C0825R.C0827id.androidx_compose_ui_view_composition_context, compositionContext);
    }

    public static /* synthetic */ void getWindowRecomposer$annotations(View view) {
    }
}
