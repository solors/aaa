package com.pubmatic.sdk.webrendering.p566ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.webrendering.POBUIUtil;
import com.pubmatic.sdk.webrendering.R$drawable;
import com.pubmatic.sdk.webrendering.R$id;
import java.lang.ref.WeakReference;

@SuppressLint({"SetJavaScriptEnabled"})
/* renamed from: com.pubmatic.sdk.webrendering.ui.POBFullScreenDialog */
/* loaded from: classes7.dex */
public class POBFullScreenDialog extends Dialog {
    @Nullable

    /* renamed from: a */
    private OnDialogCloseListener f71272a;
    @NonNull

    /* renamed from: b */
    private WeakReference<Context> f71273b;

    /* renamed from: c */
    private boolean f71274c;
    @Nullable

    /* renamed from: d */
    private Integer f71275d;

    /* renamed from: com.pubmatic.sdk.webrendering.ui.POBFullScreenDialog$OnDialogCloseListener */
    /* loaded from: classes7.dex */
    public interface OnDialogCloseListener {
        void onClose();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.webrendering.ui.POBFullScreenDialog$a */
    /* loaded from: classes7.dex */
    public class View$OnClickListenerC26949a implements View.OnClickListener {
        View$OnClickListenerC26949a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            POBFullScreenDialog.this.dismiss();
        }
    }

    public POBFullScreenDialog(@NonNull Context context, @NonNull WebView webView, @NonNull OnDialogCloseListener onDialogCloseListener) {
        super(context, 16973834);
        this.f71273b = new WeakReference<>(context);
        m39835a(onDialogCloseListener);
        setContentView(m39836a(webView, -1, -1));
    }

    /* renamed from: a */
    private void m39835a(OnDialogCloseListener onDialogCloseListener) {
        this.f71272a = onDialogCloseListener;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        OnDialogCloseListener onDialogCloseListener = this.f71272a;
        if (onDialogCloseListener != null) {
            onDialogCloseListener.onClose();
        }
        if (this.f71274c && this.f71275d != null) {
            Context context = this.f71273b.get();
            if (context instanceof Activity) {
                ((Activity) context).setRequestedOrientation(this.f71275d.intValue());
            }
        }
        this.f71272a = null;
        super.dismiss();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            dismiss();
        }
    }

    public void show(int i) {
        Activity ownerActivity;
        show();
        if (this.f71274c && (ownerActivity = getOwnerActivity()) != null) {
            this.f71275d = Integer.valueOf(ownerActivity.getRequestedOrientation());
            m39837a(ownerActivity, i);
        }
    }

    @NonNull
    /* renamed from: a */
    private FrameLayout m39836a(@NonNull View view, int i, int i2) {
        FrameLayout frameLayout = new FrameLayout(view.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2);
        layoutParams.gravity = 17;
        layoutParams.setMargins(0, 0, 0, 0);
        frameLayout.addView(view, layoutParams);
        ImageButton createSkipButton = POBUIUtil.createSkipButton(view.getContext(), R$id.pob_close_btn, R$drawable.pob_ic_close_black_24dp);
        frameLayout.addView(createSkipButton);
        createSkipButton.setOnClickListener(new View$OnClickListenerC26949a());
        return frameLayout;
    }

    /* renamed from: a */
    private void m39837a(@NonNull Activity activity, int i) {
        if (i == 0) {
            activity.setRequestedOrientation(-1);
        } else if (i == 2) {
            activity.setRequestedOrientation(6);
        } else if (i == 1) {
            activity.setRequestedOrientation(7);
        }
    }
}
