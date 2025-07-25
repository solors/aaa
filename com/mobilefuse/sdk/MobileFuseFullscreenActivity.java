package com.mobilefuse.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.mobilefuse.sdk.core.C23493R;
import com.mobilefuse.sdk.fullscreen.BaseContentController;
import com.mobilefuse.sdk.fullscreen.MraidContentController;
import com.mobilefuse.sdk.fullscreen.VastContentController;
import com.mobilefuse.sdk.network.model.AdmMediaType;

/* loaded from: classes7.dex */
public class MobileFuseFullscreenActivity extends Activity {
    private static AdController adController;
    private BaseContentController contentController;
    private FrameLayout mainContainer;

    private BaseContentController.ContentListener createContentListener() throws Throwable {
        return new BaseContentController.ContentListener() { // from class: com.mobilefuse.sdk.MobileFuseFullscreenActivity.1
            @Override // com.mobilefuse.sdk.fullscreen.BaseContentController.ContentListener
            public void onAdClosed() throws Throwable {
                MobileFuseFullscreenActivity.this.finish();
            }

            @Override // com.mobilefuse.sdk.fullscreen.BaseContentController.ContentListener
            public void onAdError() throws Throwable {
                MobileFuseFullscreenActivity.this.finish();
            }

            @Override // com.mobilefuse.sdk.fullscreen.BaseContentController.ContentListener
            public void onAdClicked() throws Throwable {
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void showAd(AdController adController2) throws Throwable {
        Class cls;
        adController = adController2;
        Context context = adController2.getContext();
        if (adController2.isTransparentBackground()) {
            cls = MobileFuseFullscreenTransparentActivity.class;
        } else {
            cls = MobileFuseFullscreenActivity.class;
        }
        Intent intent = new Intent(context, cls);
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C23493R.C23497layout.mobilefuse_ad_fullscreen);
        try {
            this.mainContainer = (FrameLayout) findViewById(C23493R.C23496id.mainContainer);
            AdController adController2 = adController;
            if (adController2 == null) {
                finish();
            } else if (adController2.isDestroyed()) {
                finish();
            } else {
                adController.setRenderingActivity(this);
                AdmMediaType type = adController.bidResponse.getType();
                if (type == AdmMediaType.VIDEO) {
                    this.contentController = new VastContentController(adController, this, createContentListener());
                } else if (type == AdmMediaType.BANNER) {
                    this.contentController = new MraidContentController(adController, this, createContentListener());
                }
                this.contentController.init(this.mainContainer);
            }
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        try {
            BaseContentController baseContentController = this.contentController;
            if (baseContentController != null) {
                baseContentController.onActivityDestroy();
            }
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            BaseContentController baseContentController = this.contentController;
            if (baseContentController != null) {
                baseContentController.onActivityPause();
            }
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        try {
            BaseContentController baseContentController = this.contentController;
            if (baseContentController != null) {
                baseContentController.onActivityResume();
            }
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        try {
            BaseContentController baseContentController = this.contentController;
            if (baseContentController != null) {
                baseContentController.onActivityStart();
            }
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        try {
            BaseContentController baseContentController = this.contentController;
            if (baseContentController != null) {
                baseContentController.onActivityStop();
            }
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }
}
