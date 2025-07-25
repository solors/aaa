package com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.zeus.gmc.sdk.mobileads.columbus.C32065R;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.PrivacyContentView;
import com.zeus.gmc.sdk.mobileads.columbus.util.AndroidUtils;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.coiio2 */
/* loaded from: classes8.dex */
public class C32470coiio2 {
    private static final String coo2iico = "PrivacyViewUtils";

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.coiio2$coi222o222 */
    /* loaded from: classes8.dex */
    public class View$OnClickListenerC32471coi222o222 implements View.OnClickListener {
        final /* synthetic */ Context coi222o222;
        final /* synthetic */ String coo2iico;

        View$OnClickListenerC32471coi222o222(String str, Context context) {
            this.coo2iico = str;
            this.coi222o222 = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.coo2iico));
                intent.setFlags(268435456);
                this.coi222o222.startActivity(intent);
            } catch (Exception e) {
                MLog.m25889e(C32470coiio2.coo2iico, "PrivacyTokenView jump exception：" + e.getMessage());
            }
        }
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.coiio2$coo2iico */
    /* loaded from: classes8.dex */
    public class View$OnClickListenerC32472coo2iico implements View.OnClickListener {
        final /* synthetic */ PrivacyContentView coo2iico;

        View$OnClickListenerC32472coo2iico(PrivacyContentView privacyContentView) {
            this.coo2iico = privacyContentView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.coo2iico.getVisibility() == 4) {
                this.coo2iico.setVisibility(0);
            } else {
                this.coo2iico.setVisibility(4);
            }
        }
    }

    public static View c2oc2i(Context context, String str, String str2) {
        try {
            View inflate = LayoutInflater.from(context).inflate(C32065R.C32069layout.columbus_privacy_token_top_layout, (ViewGroup) null);
            if (!AndroidUtils.isRegionRU(context)) {
                MLog.m25892d(coo2iico, "not ru");
                return inflate;
            } else if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                MLog.m25892d(coo2iico, "token && url is null");
                return inflate;
            } else {
                coo2iico(context, inflate, str, str2, false);
                return inflate;
            }
        } catch (Exception e) {
            MLog.m25888e(coo2iico, "createPrivacyView error", e);
            return null;
        }
    }

    public static View coi222o222(Context context, String str, String str2) {
        return coo2iico(context, str, str2, 1, true, false);
    }

    public static View coo2iico(Context context, String str, String str2) {
        return coo2iico(context, str, str2, 1, false, false);
    }

    public static View coo2iico(Context context, String str, String str2, boolean z) {
        return coo2iico(context, str, str2, 1, false, z);
    }

    public static View coo2iico(Context context, String str, String str2, int i) {
        return coo2iico(context, str, str2, i, false, false);
    }

    public static View coo2iico(Context context, String str, String str2, int i, boolean z, boolean z2) {
        int i2;
        if (context == null) {
            MLog.m25892d(coo2iico, "context is null");
            return null;
        }
        try {
            LayoutInflater from = LayoutInflater.from(context);
            if (z) {
                i2 = C32065R.C32069layout.columbus_privacy_token_left_layout;
            } else {
                i2 = C32065R.C32069layout.columbus_privacy_token_bottom_layout;
            }
            View inflate = from.inflate(i2, (ViewGroup) null);
            coo2iico(inflate, i);
            if (!AndroidUtils.isRegionRU(context)) {
                MLog.m25892d(coo2iico, "not ru");
                return inflate;
            } else if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                MLog.m25892d(coo2iico, "token && url is null");
                return inflate;
            } else {
                coo2iico(context, inflate, str, str2, z2);
                return inflate;
            }
        } catch (Exception e) {
            MLog.m25888e(coo2iico, "createPrivacyView error", e);
            return null;
        }
    }

    private static void coo2iico(View view, int i) {
        TextView textView = (TextView) view.findViewById(C32065R.C32068id.columbus_privacy_ad_os);
        if (i == 0) {
            textView.setVisibility(0);
        }
    }

    private static void coo2iico(Context context, View view, String str, String str2, boolean z) {
        ImageView imageView = (ImageView) view.findViewById(C32065R.C32068id.columbus_privacy_info);
        PrivacyContentView privacyContentView = (PrivacyContentView) view.findViewById(C32065R.C32068id.columbus_privacy_token);
        imageView.setVisibility(0);
        privacyContentView.setVisibility(4);
        if (!TextUtils.isEmpty(str)) {
            privacyContentView.startPrivacyToken(str);
            imageView.setOnClickListener(new View$OnClickListenerC32472coo2iico(privacyContentView));
        } else if (!TextUtils.isEmpty(str2)) {
            imageView.setOnClickListener(new View$OnClickListenerC32471coi222o222(str2, context));
        }
        if (z) {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(C32065R.dimen.columbus_privacy_info_small_size);
            int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(C32065R.dimen.columbus_privacy_info_margin);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
            layoutParams.setMarginEnd(dimensionPixelSize2);
            imageView.setLayoutParams(layoutParams);
            privacyContentView.setBackground(ContextCompat.getDrawable(context, C32065R.C32067drawable.columbus_token_bubble_bottom_half));
            privacyContentView.setTextSize(1, 8.0f);
        }
    }
}
