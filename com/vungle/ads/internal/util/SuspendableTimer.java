package com.vungle.ads.internal.util;

import android.os.CountDownTimer;
import androidx.annotation.VisibleForTesting;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.vungle.ads.internal.util.t */
/* loaded from: classes7.dex */
public final class SuspendableTimer {
    private final double durationSecs;
    private boolean isCanceled;
    private boolean isPaused;
    private double nextDurationSecs;
    @NotNull
    private final Functions<Unit> onFinish;
    @NotNull
    private final Functions<Unit> onTick;
    private final boolean repeats;
    private long startTimeMillis;
    @Nullable
    private CountDownTimer timer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SuspendableTimer.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.util.t$a */
    /* loaded from: classes7.dex */
    public static final class C29521a extends Lambda implements Functions<Unit> {
        public static final C29521a INSTANCE = new C29521a();

        C29521a() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Functions
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f99208a;
        }
    }

    /* compiled from: SuspendableTimer.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.util.t$b */
    /* loaded from: classes7.dex */
    public static final class CountDownTimerC29522b extends CountDownTimer {
        final /* synthetic */ SuspendableTimer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        CountDownTimerC29522b(long j, SuspendableTimer suspendableTimer) {
            super(j, j);
            this.this$0 = suspendableTimer;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            SuspendableTimer suspendableTimer = this.this$0;
            suspendableTimer.onFinish.invoke();
            if (suspendableTimer.repeats && !suspendableTimer.isCanceled) {
                suspendableTimer.setNextDurationSecs$vungle_ads_release(suspendableTimer.durationSecs);
                suspendableTimer.start();
                return;
            }
            suspendableTimer.cancel();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            this.this$0.onTick.invoke();
        }
    }

    public SuspendableTimer(double d, boolean z, @NotNull Functions<Unit> onTick, @NotNull Functions<Unit> onFinish) {
        Intrinsics.checkNotNullParameter(onTick, "onTick");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        this.durationSecs = d;
        this.repeats = z;
        this.onTick = onTick;
        this.onFinish = onFinish;
        this.nextDurationSecs = d;
    }

    private final CountDownTimer createCountdown(long j) {
        return new CountDownTimerC29522b(j, this);
    }

    private final long getDurationMillis() {
        return (long) (this.durationSecs * 1000);
    }

    private final double getElapsedSecs() {
        return getElapsedMillis$vungle_ads_release() / 1000;
    }

    private final long getNextDurationMillis() {
        return (long) (this.nextDurationSecs * 1000);
    }

    public final void cancel() {
        this.isPaused = false;
        this.isCanceled = true;
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.timer = null;
    }

    public final long getElapsedMillis$vungle_ads_release() {
        long currentTimeMillis;
        long j;
        if (this.isPaused) {
            currentTimeMillis = getDurationMillis();
            j = getNextDurationMillis();
        } else {
            currentTimeMillis = System.currentTimeMillis();
            j = this.startTimeMillis;
        }
        return currentTimeMillis - j;
    }

    public final double getNextDurationSecs$vungle_ads_release() {
        return this.nextDurationSecs;
    }

    public final long getStartTimeMillis$vungle_ads_release() {
        return this.startTimeMillis;
    }

    @Nullable
    public final CountDownTimer getTimer$vungle_ads_release() {
        return this.timer;
    }

    public final void pause() {
        if (this.timer == null) {
            return;
        }
        this.nextDurationSecs -= getElapsedSecs();
        this.isPaused = true;
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.timer = null;
    }

    public final void reset() {
        cancel();
        start();
    }

    public final void resume() {
        if (!this.isPaused) {
            return;
        }
        this.isPaused = false;
        start();
    }

    public final void setNextDurationSecs$vungle_ads_release(double d) {
        this.nextDurationSecs = d;
    }

    public final void setStartTimeMillis$vungle_ads_release(long j) {
        this.startTimeMillis = j;
    }

    public final void setTimer$vungle_ads_release(@Nullable CountDownTimer countDownTimer) {
        this.timer = countDownTimer;
    }

    public final void start() {
        this.startTimeMillis = System.currentTimeMillis();
        CountDownTimer createCountdown = createCountdown(getNextDurationMillis());
        this.timer = createCountdown;
        if (createCountdown != null) {
            createCountdown.start();
        }
    }

    public /* synthetic */ SuspendableTimer(double d, boolean z, Functions functions, Functions functions2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, z, (i & 4) != 0 ? C29521a.INSTANCE : functions, functions2);
    }

    @VisibleForTesting
    public static /* synthetic */ void getElapsedMillis$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getNextDurationSecs$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getStartTimeMillis$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getTimer$vungle_ads_release$annotations() {
    }
}
