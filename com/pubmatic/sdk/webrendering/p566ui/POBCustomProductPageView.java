package com.pubmatic.sdk.webrendering.p566ui;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.webrendering.POBUIUtil;
import com.pubmatic.sdk.webrendering.R$id;
import com.pubmatic.sdk.webrendering.R$layout;

/* renamed from: com.pubmatic.sdk.webrendering.ui.POBCustomProductPageView */
/* loaded from: classes7.dex */
public class POBCustomProductPageView extends FrameLayout {
    @NonNull

    /* renamed from: a */
    private final Button f71262a;

    public POBCustomProductPageView(@NonNull Context context) {
        super(context);
        View.inflate(context, R$layout.pob_custom_product_layout, this);
        Button button = (Button) findViewById(R$id.pob_install_btn);
        this.f71262a = button;
        button.setText(POBUIUtil.getLocalizedStringForKey(context, "pob_openwrap_install_button_title", "Install"));
        setOnClickListener(null);
    }

    public void enableDsaInfoBtn(@NonNull View.OnClickListener onClickListener) {
        ImageView imageView = (ImageView) findViewById(R$id.pob_dsa_info_btn);
        imageView.setVisibility(0);
        imageView.setOnClickListener(onClickListener);
    }

    public void setInstallButtonClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f71262a.setOnClickListener(onClickListener);
    }
}
