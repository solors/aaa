package net.pubnative.lite.sdk.vpaid.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import net.pubnative.lite.sdk.core.C38563R;
import net.pubnative.lite.sdk.utils.ProgressTimeFormatter;

/* loaded from: classes10.dex */
public class LinearCountDownView extends FrameLayout {
    private ProgressBar progressBarView;
    private TextView progressTextView;

    public LinearCountDownView(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        View inflate = View.inflate(context, C38563R.C38567layout.linear_player_count_down, this);
        this.progressBarView = (ProgressBar) inflate.findViewById(C38563R.C38566id.view_progress_bar);
        this.progressTextView = (TextView) inflate.findViewById(C38563R.C38566id.view_progress_text);
    }

    public void reset() {
        this.progressTextView.setText(ProgressTimeFormatter.formatSeconds(0));
    }

    public void setProgress(int i, int i2) {
        this.progressBarView.setMax(i2);
        this.progressBarView.setSecondaryProgress(i2);
        this.progressBarView.setProgress(i);
        int i3 = ((i2 - i) / 1000) + 1;
        if (i3 < 0) {
            i3 = 0;
        }
        this.progressTextView.setText(ProgressTimeFormatter.formatSeconds(i3));
    }

    public LinearCountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public LinearCountDownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }
}
