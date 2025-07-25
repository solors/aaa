package com.zeus.gmc.sdk.mobileads.columbus.p626ad.interstitialad;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c22o22co22i.C32433cicc2iiccc;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32458cii2c2;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.mraid.CloseableLayout;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.interstitialad.coo2iico */
/* loaded from: classes8.dex */
abstract class AbstractActivityC32130coo2iico extends Activity {
    @Nullable
    private Long mBroadcastIdentifier;
    @Nullable
    private CloseableLayout mCloseableLayout;

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.interstitialad.coo2iico$coo2iico */
    /* loaded from: classes8.dex */
    class C32131coo2iico implements CloseableLayout.InterfaceC32138c2oc2i {
        C32131coo2iico() {
        }

        @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.mraid.CloseableLayout.InterfaceC32138c2oc2i
        public void onClose() {
            AbstractActivityC32130coo2iico.this.finish();
        }
    }

    protected static Long getBroadcastIdentifierFromIntent(Intent intent) {
        if (intent.hasExtra(C32433cicc2iiccc.c2oc2o)) {
            return Long.valueOf(intent.getLongExtra(C32433cicc2iiccc.c2oc2o, -1L));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void disableCloseButton() {
        CloseableLayout closeableLayout = this.mCloseableLayout;
        if (closeableLayout != null) {
            closeableLayout.setCloseVisible(false);
            this.mCloseableLayout.setCloseAlwaysInteractable(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void enableCloseButton() {
        CloseableLayout closeableLayout = this.mCloseableLayout;
        if (closeableLayout != null) {
            closeableLayout.setCloseVisible(true);
            this.mCloseableLayout.setCloseAlwaysInteractable(true);
        }
    }

    public abstract View getAdView();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public Long getBroadcastIdentifier() {
        return this.mBroadcastIdentifier;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Nullable
    public CloseableLayout getCloseableLayout() {
        return this.mCloseableLayout;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void hideInterstitialCloseButton() {
        CloseableLayout closeableLayout = this.mCloseableLayout;
        if (closeableLayout != null) {
            closeableLayout.setCloseVisible(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.mBroadcastIdentifier = getBroadcastIdentifierFromIntent(getIntent());
        requestWindowFeature(1);
        getWindow().addFlags(1024);
        View adView = getAdView();
        CloseableLayout closeableLayout = new CloseableLayout(this);
        this.mCloseableLayout = closeableLayout;
        closeableLayout.setOnCloseListener(new C32131coo2iico());
        this.mCloseableLayout.addView(adView, new FrameLayout.LayoutParams(-1, -1));
        setContentView(this.mCloseableLayout);
        C32458cii2c2.coo2iico((Activity) this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onDestroy() {
        CloseableLayout closeableLayout = this.mCloseableLayout;
        if (closeableLayout != null) {
            closeableLayout.removeAllViews();
        }
        C32458cii2c2.coi222o222((Activity) this);
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        C32458cii2c2.c2oc2i(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void showAdChoiceDelay(int i, String str, String str2) {
        CloseableLayout closeableLayout = this.mCloseableLayout;
        if (closeableLayout != null) {
            closeableLayout.coo2iico(i, str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void showInterstitialCloseButton() {
        CloseableLayout closeableLayout = this.mCloseableLayout;
        if (closeableLayout != null) {
            closeableLayout.setCloseVisible(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void showInterstitialCloseButtonDelay() {
        hideInterstitialCloseButton();
        CloseableLayout closeableLayout = this.mCloseableLayout;
        if (closeableLayout != null) {
            closeableLayout.cioccoiococ();
        }
    }
}
