package androidx.compose.p015ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.p017os.HandlerCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* compiled from: AndroidUiDispatcher.android.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* renamed from: androidx.compose.ui.platform.AndroidUiDispatcher */
/* loaded from: classes.dex */
public final class AndroidUiDispatcher extends CoroutineDispatcher {
    @NotNull
    private static final InterfaceC38501j<CoroutineContext> Main$delegate;
    @NotNull
    private static final ThreadLocal<CoroutineContext> currentThread;
    @NotNull
    private final Choreographer choreographer;
    @NotNull
    private final AndroidUiDispatcher$dispatchCallback$1 dispatchCallback;
    @NotNull
    private final MonotonicFrameClock frameClock;
    @NotNull
    private final Handler handler;
    @NotNull
    private final Object lock;
    private boolean scheduledFrameDispatch;
    private boolean scheduledTrampolineDispatch;
    @NotNull
    private List<Choreographer.FrameCallback> spareToRunOnFrame;
    @NotNull
    private List<Choreographer.FrameCallback> toRunOnFrame;
    @NotNull
    private final ArrayDeque<Runnable> toRunTrampolined;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AndroidUiDispatcher.android.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.platform.AndroidUiDispatcher$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CoroutineContext getCurrentThread() {
            boolean isMainThread;
            isMainThread = AndroidUiDispatcher_androidKt.isMainThread();
            if (isMainThread) {
                return getMain();
            }
            CoroutineContext coroutineContext = (CoroutineContext) AndroidUiDispatcher.currentThread.get();
            if (coroutineContext != null) {
                return coroutineContext;
            }
            throw new IllegalStateException("no AndroidUiDispatcher for this thread".toString());
        }

        @NotNull
        public final CoroutineContext getMain() {
            return (CoroutineContext) AndroidUiDispatcher.Main$delegate.getValue();
        }
    }

    static {
        InterfaceC38501j<CoroutineContext> m14554a;
        m14554a = LazyJVM.m14554a(AndroidUiDispatcher$Companion$Main$2.INSTANCE);
        Main$delegate = m14554a;
        currentThread = new ThreadLocal<CoroutineContext>() { // from class: androidx.compose.ui.platform.AndroidUiDispatcher$Companion$currentThread$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            @NotNull
            public CoroutineContext initialValue() {
                Choreographer choreographer = Choreographer.getInstance();
                Intrinsics.checkNotNullExpressionValue(choreographer, "getInstance()");
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    Handler createAsync = HandlerCompat.createAsync(myLooper);
                    Intrinsics.checkNotNullExpressionValue(createAsync, "createAsync(\n           …d\")\n                    )");
                    AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(choreographer, createAsync, null);
                    return androidUiDispatcher.plus(androidUiDispatcher.getFrameClock());
                }
                throw new IllegalStateException("no Looper on this thread".toString());
            }
        };
    }

    public /* synthetic */ AndroidUiDispatcher(Choreographer choreographer, Handler handler, DefaultConstructorMarker defaultConstructorMarker) {
        this(choreographer, handler);
    }

    private final Runnable nextTask() {
        Runnable m17491l;
        synchronized (this.lock) {
            m17491l = this.toRunTrampolined.m17491l();
        }
        return m17491l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performFrameDispatch(long j) {
        synchronized (this.lock) {
            if (!this.scheduledFrameDispatch) {
                return;
            }
            this.scheduledFrameDispatch = false;
            List<Choreographer.FrameCallback> list = this.toRunOnFrame;
            this.toRunOnFrame = this.spareToRunOnFrame;
            this.spareToRunOnFrame = list;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).doFrame(j);
            }
            list.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performTrampolineDispatch() {
        boolean z;
        do {
            Runnable nextTask = nextTask();
            while (nextTask != null) {
                nextTask.run();
                nextTask = nextTask();
            }
            synchronized (this.lock) {
                if (this.toRunTrampolined.isEmpty()) {
                    z = false;
                    this.scheduledTrampolineDispatch = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(@NotNull CoroutineContext context, @NotNull Runnable block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (this.lock) {
            this.toRunTrampolined.addLast(block);
            if (!this.scheduledTrampolineDispatch) {
                this.scheduledTrampolineDispatch = true;
                this.handler.post(this.dispatchCallback);
                if (!this.scheduledFrameDispatch) {
                    this.scheduledFrameDispatch = true;
                    this.choreographer.postFrameCallback(this.dispatchCallback);
                }
            }
            Unit unit = Unit.f99208a;
        }
    }

    @NotNull
    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    @NotNull
    public final MonotonicFrameClock getFrameClock() {
        return this.frameClock;
    }

    public final void postFrameCallback$ui_release(@NotNull Choreographer.FrameCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (this.lock) {
            this.toRunOnFrame.add(callback);
            if (!this.scheduledFrameDispatch) {
                this.scheduledFrameDispatch = true;
                this.choreographer.postFrameCallback(this.dispatchCallback);
            }
            Unit unit = Unit.f99208a;
        }
    }

    public final void removeFrameCallback$ui_release(@NotNull Choreographer.FrameCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (this.lock) {
            this.toRunOnFrame.remove(callback);
        }
    }

    private AndroidUiDispatcher(Choreographer choreographer, Handler handler) {
        this.choreographer = choreographer;
        this.handler = handler;
        this.lock = new Object();
        this.toRunTrampolined = new ArrayDeque<>();
        this.toRunOnFrame = new ArrayList();
        this.spareToRunOnFrame = new ArrayList();
        this.dispatchCallback = new AndroidUiDispatcher$dispatchCallback$1(this);
        this.frameClock = new AndroidUiFrameClock(choreographer);
    }
}
