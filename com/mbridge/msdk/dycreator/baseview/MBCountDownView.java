package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.bus.EventBus;
import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.p426e.p427a.CountDownListener;
import com.mbridge.msdk.p426e.p427a.MBCountDownTimer;

/* loaded from: classes6.dex */
public class MBCountDownView extends MBTextView {

    /* renamed from: a */
    private MBCountDownTimer f55584a;

    /* renamed from: b */
    private MBCountDownView f55585b;

    public MBCountDownView(Context context) {
        super(context);
        this.f55585b = this;
    }

    public void initView(final String str, final String str2, int i) {
        this.f55584a = new MBCountDownTimer().m52905b(i * 1000).m52908a(1000L).m52907a(new CountDownListener() { // from class: com.mbridge.msdk.dycreator.baseview.MBCountDownView.1
            @Override // com.mbridge.msdk.p426e.p427a.CountDownListener
            public void onFinish() {
                MBCountDownView.this.f55584a.m52909a();
                SplashResData splashResData = new SplashResData();
                splashResData.seteAction(EAction.CLOSE);
                EventBus.getDefault().post(splashResData);
            }

            @Override // com.mbridge.msdk.p426e.p427a.CountDownListener
            public void onTick(long j) {
                if (str2.startsWith("zh")) {
                    MBCountDownView mBCountDownView = MBCountDownView.this.f55585b;
                    mBCountDownView.setText((j / 1000) + "s" + str);
                    return;
                }
                MBCountDownView mBCountDownView2 = MBCountDownView.this.f55585b;
                mBCountDownView2.setText(MBCountDownView.this.f55585b + " " + (j / 1000) + "s");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.dycreator.baseview.MBTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MBCountDownTimer mBCountDownTimer = this.f55584a;
        if (mBCountDownTimer != null) {
            mBCountDownTimer.m52906b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.dycreator.baseview.MBTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MBCountDownTimer mBCountDownTimer = this.f55584a;
        if (mBCountDownTimer != null) {
            mBCountDownTimer.m52909a();
        }
    }

    public MBCountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55585b = this;
    }

    public MBCountDownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f55585b = this;
    }
}
