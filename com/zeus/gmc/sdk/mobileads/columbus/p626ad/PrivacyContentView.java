package com.zeus.gmc.sdk.mobileads.columbus.p626ad;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.zeus.gmc.sdk.mobileads.columbus.C32065R;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.nativead.NativeAd;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.PrivacyContentView */
/* loaded from: classes8.dex */
public class PrivacyContentView extends TextView {
    public static final int SIZE_IN_DP = 12;
    public static final int SIZE_IN_DP_SMALL = 8;
    private Context coo2iico;

    public PrivacyContentView(Context context) {
        super(context);
        this.coo2iico = context;
    }

    private void coo2iico(String str) {
        if (this.coo2iico != null && !TextUtils.isEmpty(str)) {
            setText(str);
            setMaxLines(1);
            setEllipsize(TextUtils.TruncateAt.END);
            setTextSize(1, 12.0f);
            setTextColor(ContextCompat.getColor(this.coo2iico, C32065R.C32066color.columbus_ad_os_text_color));
        }
    }

    public void startPrivacyToken(String str) {
        if (!TextUtils.isEmpty(str)) {
            coo2iico(str);
        } else {
            setVisibility(4);
        }
    }

    public PrivacyContentView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.coo2iico = context;
    }

    public PrivacyContentView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.coo2iico = context;
    }

    public PrivacyContentView(Context context, NativeAd nativeAd) {
        super(context);
        this.coo2iico = context;
        String privacyToken = nativeAd.getPrivacyToken();
        if (!TextUtils.isEmpty(privacyToken)) {
            coo2iico(privacyToken);
            setBackground(ContextCompat.getDrawable(this.coo2iico, C32065R.C32067drawable.columbus_token_bubble_bottom));
            return;
        }
        setVisibility(4);
    }
}
