package com.smaato.sdk.core.p573ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.C26996R;

/* renamed from: com.smaato.sdk.core.ui.ProgressView */
/* loaded from: classes7.dex */
public final class ProgressView extends FrameLayout {
    public ProgressView(@NonNull Context context) {
        super(context);
        init();
    }

    /* renamed from: a */
    public static /* synthetic */ void m39361a(View view) {
        lambda$init$0(view);
    }

    public void init() {
        setId(C26996R.C26999id.smaato_sdk_core_progress_view_id);
        setBackgroundResource(C26996R.C26997color.smaato_sdk_core_ui_semitransparent);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setOnClickListener(new View.OnClickListener() { // from class: com.smaato.sdk.core.ui.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProgressView.m39361a(view);
            }
        });
        ProgressBar progressBar = new ProgressBar(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        progressBar.setIndeterminateDrawable(getContext().getDrawable(C26996R.C26998drawable.smaato_sdk_core_progress_bar));
        progressBar.setLayoutParams(layoutParams);
        addView(progressBar);
    }

    public ProgressView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public ProgressView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public ProgressView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init();
    }

    public static /* synthetic */ void lambda$init$0(View view) {
    }
}
