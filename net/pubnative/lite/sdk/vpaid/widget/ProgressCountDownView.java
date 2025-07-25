package net.pubnative.lite.sdk.vpaid.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import net.pubnative.lite.sdk.core.C38563R;

/* loaded from: classes10.dex */
public class ProgressCountDownView extends CountDownView {
    private TextView progressTextView;
    private RelativeLayout timerContainer;

    public ProgressCountDownView(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        View inflate = View.inflate(context, C38563R.C38567layout.progress_count_down, this);
        this.progressTextView = (TextView) inflate.findViewById(C38563R.C38566id.view_progress_text);
        this.timerContainer = (RelativeLayout) inflate.findViewById(C38563R.C38566id.progress_container);
    }

    @Override // net.pubnative.lite.sdk.vpaid.widget.CountDownView
    public void setProgress(int i, int i2) {
        if (this.timerContainer.getVisibility() == 8) {
            this.timerContainer.setVisibility(0);
        }
        this.progressTextView.setText("You can skip\nad in " + (((i2 - i) / 1000) + 1) + "s");
    }

    public ProgressCountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public ProgressCountDownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }
}
