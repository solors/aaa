package com.zeus.gmc.sdk.mobileads.columbus.p626ad;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.zeus.gmc.sdk.mobileads.columbus.C32065R;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32458cii2c2;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.CMPView */
/* loaded from: classes8.dex */
public class CMPView extends FrameLayout implements View.OnClickListener {
    private static final String coo2iico = "CMPView";

    public CMPView(Context context) {
        super(context);
        coo2iico(context);
    }

    private void coo2iico(Context context) {
        addView(LayoutInflater.from(context).inflate(C32065R.C32069layout.columbus_cmp_layout, (ViewGroup) null, false));
        setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            C32458cii2c2.coo2iico();
        } catch (Exception e) {
            MLog.m25889e(coo2iico, "onClick exception：" + e.getMessage());
        }
    }

    public CMPView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        coo2iico(context);
    }

    public CMPView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
