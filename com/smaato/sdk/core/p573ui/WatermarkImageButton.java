package com.smaato.sdk.core.p573ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.smaato.sdk.core.C26996R;
import com.smaato.sdk.core.SmaatoSdk;
import com.smaato.sdk.core.util.Intents;

/* renamed from: com.smaato.sdk.core.ui.WatermarkImageButton */
/* loaded from: classes7.dex */
public final class WatermarkImageButton extends ImageButton {
    public WatermarkImageButton(@NonNull Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!SmaatoSdk.isWatermarkEnabled()) {
            setVisibility(8);
            return;
        }
        setImageDrawable(getResources().getDrawable(C26996R.C26998drawable.smaato_sdk_core_watermark));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388661);
        setPadding(0, 0, 0, 0);
        setLayoutParams(layoutParams);
        setBackgroundColor(getResources().getColor(17170445));
        setOnClickListener(new View.OnClickListener() { // from class: com.smaato.sdk.core.ui.b
            {
                WatermarkImageButton.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WatermarkImageButton.this.lambda$init$0(view);
            }
        });
    }

    public /* synthetic */ void lambda$init$0(View view) {
        Intents.startIntent(getContext(), Intents.createViewIntent("https://www.smaato.com/privacy/"));
    }

    public WatermarkImageButton(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public WatermarkImageButton(@NonNull Context context, @NonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    @RequiresApi(api = 21)
    public WatermarkImageButton(@NonNull Context context, @NonNull AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init();
    }
}
