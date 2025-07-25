package net.pubnative.lite.sdk.vpaid.widget;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import net.pubnative.lite.sdk.CountdownStyle;
import net.pubnative.lite.sdk.utils.ViewUtils;

/* loaded from: classes10.dex */
public class CountDownViewFactory {

    /* renamed from: net.pubnative.lite.sdk.vpaid.widget.CountDownViewFactory$1 */
    /* loaded from: classes10.dex */
    static /* synthetic */ class C388171 {
        static final /* synthetic */ int[] $SwitchMap$net$pubnative$lite$sdk$CountdownStyle;

        static {
            int[] iArr = new int[CountdownStyle.values().length];
            $SwitchMap$net$pubnative$lite$sdk$CountdownStyle = iArr;
            try {
                iArr[CountdownStyle.PIE_CHART.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$CountdownStyle[CountdownStyle.TIMER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$CountdownStyle[CountdownStyle.PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private ViewGroup.LayoutParams createPieChartLayoutParams(Context context, ViewGroup viewGroup) {
        if (viewGroup instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) ViewUtils.convertDpToPixel(40.0f, context), (int) ViewUtils.convertDpToPixel(40.0f, context));
            int convertDpToPixel = (int) ViewUtils.convertDpToPixel(5.0f, context);
            layoutParams.setMargins(convertDpToPixel, convertDpToPixel, convertDpToPixel, convertDpToPixel);
            layoutParams.addRule(10);
            layoutParams.addRule(20);
            return layoutParams;
        } else if (viewGroup instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) ViewUtils.convertDpToPixel(40.0f, context), (int) ViewUtils.convertDpToPixel(40.0f, context));
            int convertDpToPixel2 = (int) ViewUtils.convertDpToPixel(5.0f, context);
            layoutParams2.setMargins(convertDpToPixel2, convertDpToPixel2, convertDpToPixel2, convertDpToPixel2);
            layoutParams2.gravity = 8388659;
            return layoutParams2;
        } else {
            return new ViewGroup.LayoutParams((int) ViewUtils.convertDpToPixel(40.0f, context), (int) ViewUtils.convertDpToPixel(40.0f, context));
        }
    }

    private ViewGroup.LayoutParams createProgressLayoutParams(Context context, ViewGroup viewGroup) {
        if (viewGroup instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, 0, (int) ViewUtils.convertDpToPixel(40.0f, context));
            layoutParams.addRule(12);
            layoutParams.addRule(20);
            return layoutParams;
        } else if (viewGroup instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 8388691;
            layoutParams2.setMargins(0, 0, 0, (int) ViewUtils.convertDpToPixel(40.0f, context));
            return layoutParams2;
        } else {
            return new ViewGroup.LayoutParams(-2, -2);
        }
    }

    private ViewGroup.LayoutParams createTimerLayoutParams(Context context, ViewGroup viewGroup) {
        if (viewGroup instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, (int) ViewUtils.convertDpToPixel(35.0f, context));
            layoutParams.addRule(10);
            layoutParams.addRule(20);
            return layoutParams;
        } else if (viewGroup instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, (int) ViewUtils.convertDpToPixel(35.0f, context));
            layoutParams2.gravity = 8388659;
            return layoutParams2;
        } else {
            return new RelativeLayout.LayoutParams(-2, (int) ViewUtils.convertDpToPixel(35.0f, context));
        }
    }

    public CountDownView createCountdownView(Context context, CountdownStyle countdownStyle, ViewGroup viewGroup) {
        int i = C388171.$SwitchMap$net$pubnative$lite$sdk$CountdownStyle[countdownStyle.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return new PieChartCountdownView(context);
                }
                ProgressCountDownView progressCountDownView = new ProgressCountDownView(context);
                progressCountDownView.setLayoutParams(createProgressLayoutParams(context, viewGroup));
                return progressCountDownView;
            }
            TimerCountDownView timerCountDownView = new TimerCountDownView(context);
            timerCountDownView.setLayoutParams(createTimerLayoutParams(context, viewGroup));
            return timerCountDownView;
        }
        PieChartCountdownView pieChartCountdownView = new PieChartCountdownView(context);
        pieChartCountdownView.setLayoutParams(createPieChartLayoutParams(context, viewGroup));
        return pieChartCountdownView;
    }
}
