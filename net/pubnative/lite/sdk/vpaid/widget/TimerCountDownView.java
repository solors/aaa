package net.pubnative.lite.sdk.vpaid.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import net.pubnative.lite.sdk.core.C38563R;

/* loaded from: classes10.dex */
public class TimerCountDownView extends CountDownView {
    private TextView progressTextView;
    private RelativeLayout timerContainer;

    public TimerCountDownView(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        View inflate = View.inflate(context, C38563R.C38567layout.timer_count_down, this);
        this.progressTextView = (TextView) inflate.findViewById(C38563R.C38566id.view_progress_text);
        this.timerContainer = (RelativeLayout) inflate.findViewById(C38563R.C38566id.timer_container);
    }

    @Override // net.pubnative.lite.sdk.vpaid.widget.CountDownView
    public void setProgress(int i, int i2) {
        String str;
        String str2;
        if (this.timerContainer.getVisibility() == 8) {
            this.timerContainer.setVisibility(0);
        }
        int i3 = ((i2 - i) / 1000) + 1;
        int i4 = i3 / 60;
        int i5 = i3 % 60;
        if (i4 >= 10) {
            str = Integer.toString(i4);
        } else {
            str = "0" + i4;
        }
        if (i5 >= 10) {
            str2 = Integer.toString(i5);
        } else {
            str2 = "0" + i5;
        }
        this.progressTextView.setText(str + ":" + str2);
    }

    public TimerCountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public TimerCountDownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }
}
