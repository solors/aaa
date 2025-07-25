package com.fyber.inneractive.sdk.flow;

import android.os.CountDownTimer;
import com.fyber.inneractive.sdk.interfaces.InterfaceC14579e;

/* renamed from: com.fyber.inneractive.sdk.flow.K */
/* loaded from: classes4.dex */
public final class CountDownTimerC14484K extends CountDownTimer {

    /* renamed from: a */
    public final /* synthetic */ AbstractC14487N f27415a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC14484K(AbstractC14487N abstractC14487N, long j) {
        super(j, 1000L);
        this.f27415a = abstractC14487N;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        CountDownTimerC14484K countDownTimerC14484K = this.f27415a.f27429v;
        if (countDownTimerC14484K != null) {
            countDownTimerC14484K.cancel();
        }
        this.f27415a.m77868d(false);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        int i = ((int) j) / 1000;
        InterfaceC14579e interfaceC14579e = this.f27415a.f27418k;
        if (interfaceC14579e != null) {
            interfaceC14579e.updateCloseCountdown(i);
        }
    }
}
