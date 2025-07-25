package com.pubmatic.sdk.webrendering.p566ui;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.cache.POBAdViewCacheService;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.p565ui.POBFullScreenActivityBackPressListener;
import com.pubmatic.sdk.common.p565ui.POBFullScreenActivityListener;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.webrendering.R$id;
import java.util.Objects;

/* renamed from: com.pubmatic.sdk.webrendering.ui.POBFullScreenActivity */
/* loaded from: classes7.dex */
public class POBFullScreenActivity extends Activity {
    public static final String ALLOW_ORIENTATION_CHANGE = "AllowOrientation";
    public static final String ENABLE_BACK_PRESS = "EnableBackPress";
    public static final String RENDERER_IDENTIFIER = "RendererIdentifier";
    public static final String REQUESTED_ORIENTATION = "RequestedOrientation";
    @Nullable

    /* renamed from: a */
    private ViewGroup f71263a;

    /* renamed from: b */
    private int f71264b;
    @Nullable

    /* renamed from: c */
    private LocalBroadcastManager f71265c;
    @Nullable

    /* renamed from: d */
    private POBFullScreenActivityListener f71266d;
    @Nullable

    /* renamed from: e */
    private POBFullScreenActivityBackPressListener f71267e;

    /* renamed from: g */
    private boolean f71269g = false;
    @NonNull

    /* renamed from: f */
    private BroadcastReceiver f71268f = new C26948a();

    /* renamed from: com.pubmatic.sdk.webrendering.ui.POBFullScreenActivity$ACTIONS */
    /* loaded from: classes7.dex */
    public enum ACTIONS {
        POB_CLOSE,
        POB_BACK_PRESS
    }

    /* renamed from: com.pubmatic.sdk.webrendering.ui.POBFullScreenActivity$a */
    /* loaded from: classes7.dex */
    class C26948a extends BroadcastReceiver {
        C26948a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NonNull Context context, @NonNull Intent intent) {
            if (Objects.equals(Integer.valueOf(intent.getIntExtra(POBFullScreenActivity.RENDERER_IDENTIFIER, 0)), Integer.valueOf(POBFullScreenActivity.this.f71264b))) {
                POBFullScreenActivity.this.onBroadcastReceived(intent);
            }
        }
    }

    public static void closeActivity(@NonNull Context context, int i) {
        String name = ACTIONS.POB_CLOSE.name();
        Intent intent = new Intent(name);
        intent.putExtra(RENDERER_IDENTIFIER, i);
        try {
            sendBroadcast(context, intent);
        } catch (Exception e) {
            POBLog.warn("POBFullScreenActivity", "Unable to close full screen activity for %s. Error: %s", name, e.getMessage());
        }
    }

    public static void sendBroadcast(@NonNull Context context, @NonNull Intent intent) throws Exception {
        try {
            LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
        } catch (Exception e) {
            POBLog.warn("POBFullScreenActivity", "Unable to send broadcast for %s", intent.getAction());
            throw new Exception(e);
        }
    }

    public static void startActivity(@NonNull Context context, @NonNull Intent intent) throws Exception {
        intent.setClass(context, POBFullScreenActivity.class);
        intent.addFlags(268435456);
        POBUtils.startActivity(context, intent);
    }

    public static void startFullScreenActivity(@NonNull Context context, int i, @NonNull POBAdDescriptor pOBAdDescriptor, int i2) throws Exception {
        Intent intent = new Intent();
        intent.putExtra(REQUESTED_ORIENTATION, i);
        intent.putExtra(RENDERER_IDENTIFIER, i2);
        intent.putExtra(ENABLE_BACK_PRESS, false);
        if (!pOBAdDescriptor.isVideo()) {
            intent.putExtra(ALLOW_ORIENTATION_CHANGE, Boolean.FALSE);
        }
        startActivity(context, intent);
    }

    public static void updateBackButtonState(@NonNull Context context, int i, boolean z) {
        String name = ACTIONS.POB_BACK_PRESS.name();
        Intent intent = new Intent(name);
        intent.putExtra(RENDERER_IDENTIFIER, i);
        intent.putExtra(ENABLE_BACK_PRESS, z);
        try {
            sendBroadcast(context, intent);
        } catch (Exception e) {
            POBLog.warn("POBFullScreenActivity", "Unable to update back button state for %s. Error: %s", name, e.getMessage());
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.f71269g) {
            POBFullScreenActivityBackPressListener pOBFullScreenActivityBackPressListener = this.f71267e;
            if (pOBFullScreenActivityBackPressListener != null) {
                pOBFullScreenActivityBackPressListener.onBackPressed();
            } else {
                super.onBackPressed();
            }
        }
    }

    protected void onBroadcastReceived(@NonNull Intent intent) {
        String action = intent.getAction();
        if (Objects.equals(action, ACTIONS.POB_CLOSE.name())) {
            finish();
        } else if (Objects.equals(action, ACTIONS.POB_BACK_PRESS.name())) {
            this.f71269g = intent.getBooleanExtra(ENABLE_BACK_PRESS, false);
        }
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra(REQUESTED_ORIENTATION, POBUtils.getDeviceOrientation(getApplicationContext()));
        boolean booleanExtra = intent.getBooleanExtra(ALLOW_ORIENTATION_CHANGE, true);
        this.f71269g = intent.getBooleanExtra(ENABLE_BACK_PRESS, false);
        int intExtra2 = intent.getIntExtra(RENDERER_IDENTIFIER, 0);
        this.f71264b = intExtra2;
        if (intExtra2 != 0) {
            POBAdViewCacheService.AdViewConfig popStoredAdView = POBInstanceProvider.getAdViewCacheService().popStoredAdView(Integer.valueOf(this.f71264b));
            if (popStoredAdView != null) {
                this.f71263a = (ViewGroup) popStoredAdView.getAdView();
                this.f71266d = popStoredAdView.getEventListener();
                this.f71267e = popStoredAdView.getBackPressListener();
                this.f71263a.setId(R$id.pob_modal_view);
                setContentView(this.f71263a);
                try {
                    LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(getApplicationContext());
                    this.f71265c = localBroadcastManager;
                    localBroadcastManager.registerReceiver(this.f71268f, m39840a());
                } catch (Exception e) {
                    POBLog.warn("POBFullScreenActivity", "Unable to register broadcast receiver for %s. Error: %s", Integer.valueOf(this.f71264b), e.getMessage());
                }
                POBFullScreenActivityListener pOBFullScreenActivityListener = this.f71266d;
                if (pOBFullScreenActivityListener != null) {
                    pOBFullScreenActivityListener.onCreate(this);
                }
            } else {
                POBLog.error("POBFullScreenActivity", "Unable to retrieve stored ad view config for %s", Integer.valueOf(this.f71264b));
                finish();
                return;
            }
        }
        if (booleanExtra) {
            setRequestedOrientation(-1);
        } else {
            m39839a(intExtra);
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        ViewGroup viewGroup = this.f71263a;
        if (viewGroup != null && (viewGroup.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.f71263a.getParent()).removeView(this.f71263a);
            this.f71263a.removeAllViews();
        }
        super.onDestroy();
        setRequestedOrientation(-1);
        POBFullScreenActivityListener pOBFullScreenActivityListener = this.f71266d;
        if (pOBFullScreenActivityListener != null) {
            pOBFullScreenActivityListener.onDestroy();
        }
        try {
            LocalBroadcastManager localBroadcastManager = this.f71265c;
            if (localBroadcastManager != null) {
                localBroadcastManager.unregisterReceiver(this.f71268f);
            }
        } catch (Exception e) {
            POBLog.warn("POBFullScreenActivity", "Unable to unregister broadcast receiver for %s. Error: %s", Integer.valueOf(this.f71264b), e.getMessage());
        }
    }

    /* renamed from: a */
    private IntentFilter m39840a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ACTIONS.POB_CLOSE.name());
        intentFilter.addAction(ACTIONS.POB_BACK_PRESS.name());
        return intentFilter;
    }

    /* renamed from: a */
    private void m39839a(int i) {
        if (i == 0) {
            setRequestedOrientation(-1);
        } else if (i == 2) {
            setRequestedOrientation(6);
        } else if (i == 1) {
            setRequestedOrientation(7);
        }
    }

    public static void startFullScreenActivity(@NonNull Context context, boolean z, int i) throws Exception {
        Intent intent = new Intent();
        intent.putExtra(RENDERER_IDENTIFIER, i);
        if (z) {
            intent.putExtra(ENABLE_BACK_PRESS, false);
        } else {
            intent.putExtra(ALLOW_ORIENTATION_CHANGE, Boolean.FALSE);
        }
        startActivity(context, intent);
    }
}
