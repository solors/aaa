package net.pubnative.lite.sdk.vpaid.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.ProgressBar;
import android.widget.TextView;
import net.pubnative.lite.sdk.core.C38563R;

/* loaded from: classes10.dex */
public class PieChartCountdownView extends CountDownView {
    private boolean isBackgroundOn;
    private ProgressBar progressBarView;
    private TextView progressTextView;

    public PieChartCountdownView(Context context) {
        super(context);
        this.isBackgroundOn = false;
        init(context);
    }

    private void init(Context context) {
        View inflate = View.inflate(context, C38563R.C38567layout.player_count_down, this);
        this.progressBarView = (ProgressBar) inflate.findViewById(C38563R.C38566id.view_progress_bar);
        this.progressTextView = (TextView) inflate.findViewById(C38563R.C38566id.view_progress_text);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -90.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setFillAfter(true);
        this.progressBarView.startAnimation(rotateAnimation);
    }

    private void initBackground() {
        if (!this.isBackgroundOn) {
            this.isBackgroundOn = true;
            this.progressBarView.setBackground(getResources().getDrawable(C38563R.C38565drawable.circle_progress_background));
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.widget.CountDownView
    public void setProgress(int i, int i2) {
        initBackground();
        this.progressBarView.setMax(i2);
        this.progressBarView.setSecondaryProgress(i2);
        this.progressBarView.setProgress(i);
        this.progressTextView.setText(String.valueOf(((i2 - i) / 1000) + 1));
    }

    public PieChartCountdownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isBackgroundOn = false;
        init(context);
    }

    public PieChartCountdownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isBackgroundOn = false;
        init(context);
    }
}
