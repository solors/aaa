package com.smaato.sdk.interstitial.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import com.smaato.sdk.core.AndroidsInjector;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.mvvm.view.SmaatoSdkViewDelegate;
import com.smaato.sdk.core.mvvm.view.ViewDelegateStorage;
import com.smaato.sdk.core.p573ui.AdContentView;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.diinjection.Inject;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.interstitial.C27359R;
import com.smaato.sdk.interstitial.view.InterstitialAdActivity;
import com.smaato.sdk.video.C27640R;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;

/* loaded from: classes7.dex */
public class InterstitialAdActivity extends Activity {
    protected static final String KEY_BACKGROUND_COLOR = "KEY_BACKGROUND_COLOR";
    protected static final String KEY_IS_SPLASH = "KEY_IS_SPLASH";
    protected static final String KEY_VIEWDELEGATE_UUID = "KEY_PRESENTER_UUID";
    private static final long SPLASH_DELAY_CLOSE_AD_MS = 5000;
    private static final long SPLASH_DELAY_SHOW_CLOSE_BUTTON_MS = 3000;
    private ImageButton closeButton;
    private FrameLayout contentHolder;
    private WeakReference<TextView> countDownText;
    protected InterstitialAdBaseDelegate interstitialAdBaseDelegate;
    private boolean isBackButtonEnabled;
    private boolean isSplash;
    @Inject
    private Logger logger;
    @Nullable
    @Inject
    private ViewDelegateStorage viewDelegateStorage;
    private UUID viewModelUuid;
    private boolean splashTimersAreStarted = false;
    private final TimerTask showCloseButtonTask = new C27378a();
    private final TimerTask closeAdTask = new C27379b();
    private final Consumer<Boolean> closeButtonVisibilityChanger = new Consumer() { // from class: com.smaato.sdk.interstitial.view.l
        {
            InterstitialAdActivity.this = this;
        }

        @Override // com.smaato.sdk.core.util.p574fi.Consumer
        public final void accept(Object obj) {
            InterstitialAdActivity.this.lambda$new$0((Boolean) obj);
        }
    };
    private final Consumer<Boolean> backButtonEnabledChanger = new Consumer() { // from class: com.smaato.sdk.interstitial.view.m
        {
            InterstitialAdActivity.this = this;
        }

        @Override // com.smaato.sdk.core.util.p574fi.Consumer
        public final void accept(Object obj) {
            InterstitialAdActivity.this.lambda$new$1((Boolean) obj);
        }
    };
    private final Consumer<Long> countDownTextChanger = new Consumer() { // from class: com.smaato.sdk.interstitial.view.b
        {
            InterstitialAdActivity.this = this;
        }

        @Override // com.smaato.sdk.core.util.p574fi.Consumer
        public final void accept(Object obj) {
            InterstitialAdActivity.this.lambda$new$3((Long) obj);
        }
    };
    private final Consumer<Boolean> countDownTextVisibilityChanger = new Consumer() { // from class: com.smaato.sdk.interstitial.view.c
        {
            InterstitialAdActivity.this = this;
        }

        @Override // com.smaato.sdk.core.util.p574fi.Consumer
        public final void accept(Object obj) {
            InterstitialAdActivity.this.lambda$new$5((Boolean) obj);
        }
    };

    /* renamed from: com.smaato.sdk.interstitial.view.InterstitialAdActivity$a */
    /* loaded from: classes7.dex */
    public class C27378a extends TimerTask {
        C27378a() {
            InterstitialAdActivity.this = r1;
        }

        /* renamed from: d */
        public /* synthetic */ void m39225d() {
            Objects.onNotNull(InterstitialAdActivity.this.closeButton, new Consumer() { // from class: com.smaato.sdk.interstitial.view.o
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    ((ImageButton) obj).setVisibility(0);
                }
            });
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            InterstitialAdActivity.this.runOnUiThread(new Runnable() { // from class: com.smaato.sdk.interstitial.view.n
                {
                    InterstitialAdActivity.C27378a.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    InterstitialAdActivity.C27378a.this.m39225d();
                }
            });
        }
    }

    /* renamed from: com.smaato.sdk.interstitial.view.InterstitialAdActivity$b */
    /* loaded from: classes7.dex */
    public class C27379b extends TimerTask {
        C27379b() {
            InterstitialAdActivity.this = r1;
        }

        /* renamed from: b */
        public /* synthetic */ void m39223b() {
            InterstitialAdActivity.this.onCloseClicked();
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            InterstitialAdActivity.this.runOnUiThread(new Runnable() { // from class: com.smaato.sdk.interstitial.view.p
                {
                    InterstitialAdActivity.C27379b.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    InterstitialAdActivity.C27379b.this.m39223b();
                }
            });
        }
    }

    /* renamed from: com.smaato.sdk.interstitial.view.InterstitialAdActivity$c */
    /* loaded from: classes7.dex */
    public class ViewTreeObserver$OnGlobalLayoutListenerC27380c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: b */
        final /* synthetic */ AdContentView f72080b;

        ViewTreeObserver$OnGlobalLayoutListenerC27380c(AdContentView adContentView) {
            InterstitialAdActivity.this = r1;
            this.f72080b = adContentView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            InterstitialAdActivity.this.contentHolder.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            InterstitialAdActivity interstitialAdActivity = InterstitialAdActivity.this;
            float defineScaleFactor = interstitialAdActivity.defineScaleFactor(interstitialAdActivity.contentHolder, this.f72080b);
            defineScaleFactor = (Float.isNaN(defineScaleFactor) || Float.isInfinite(defineScaleFactor)) ? 1.0f : 1.0f;
            this.f72080b.setScaleX(defineScaleFactor);
            this.f72080b.setScaleY(defineScaleFactor);
        }
    }

    @NonNull
    public static Intent createIntent(@NonNull Context context, @NonNull UUID uuid, @ColorInt int i, boolean z) {
        Objects.requireNonNull(context);
        Objects.requireNonNull(uuid);
        return new Intent(context, InterstitialAdActivity.class).putExtra(KEY_VIEWDELEGATE_UUID, uuid).putExtra(KEY_BACKGROUND_COLOR, i).putExtra(KEY_IS_SPLASH, z);
    }

    public float defineScaleFactor(@NonNull FrameLayout frameLayout, @NonNull AdContentView adContentView) {
        return Math.min(frameLayout.getWidth() / adContentView.getWidth(), frameLayout.getHeight() / adContentView.getHeight());
    }

    private void initBackground() {
        findViewById(16908290).setBackgroundColor(getIntent().getIntExtra(KEY_BACKGROUND_COLOR, ViewCompat.MEASURED_STATE_MASK));
    }

    private void initCloseButton() {
        ImageButton imageButton = (ImageButton) findViewById(C27359R.C27362id.smaato_sdk_interstitial_close);
        this.closeButton = imageButton;
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.smaato.sdk.interstitial.view.f
            {
                InterstitialAdActivity.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InterstitialAdActivity.this.lambda$initCloseButton$7(view);
            }
        });
        this.interstitialAdBaseDelegate.setCloseButtonSize(this.closeButton);
        this.interstitialAdBaseDelegate.setFriendlyObstructionView(this.closeButton);
        reSizeCloseButtonForSmallerResolutions();
    }

    private void initCloseButtonCountDown() {
        this.countDownText = new WeakReference<>((TextView) findViewById(C27359R.C27362id.smaato_sdk_interstitial_countdown));
    }

    @NonNull
    private ProgressBar initProgressView() {
        return (ProgressBar) findViewById(C27640R.C27643id.smaato_sdk_video_video_progress);
    }

    public /* synthetic */ void lambda$initCloseButton$7(View view) {
        onCloseClicked();
    }

    public /* synthetic */ void lambda$new$0(Boolean bool) {
        int i;
        ImageButton imageButton = this.closeButton;
        if (bool.booleanValue()) {
            i = 0;
        } else {
            i = 8;
        }
        imageButton.setVisibility(i);
    }

    public /* synthetic */ void lambda$new$1(Boolean bool) {
        this.isBackButtonEnabled = bool.booleanValue();
    }

    public static /* synthetic */ void lambda$new$2(Long l, TextView textView) {
        textView.setText(String.valueOf(l));
    }

    public /* synthetic */ void lambda$new$3(final Long l) {
        Objects.onNotNull(this.countDownText.get(), new Consumer() { // from class: com.smaato.sdk.interstitial.view.d
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                InterstitialAdActivity.lambda$new$2(l, (TextView) obj);
            }
        });
    }

    public static /* synthetic */ void lambda$new$4(Boolean bool, TextView textView) {
        int i;
        if (bool.booleanValue()) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public /* synthetic */ void lambda$new$5(final Boolean bool) {
        Objects.onNotNull(this.countDownText.get(), new Consumer() { // from class: com.smaato.sdk.interstitial.view.e
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                InterstitialAdActivity.lambda$new$4(bool, (TextView) obj);
            }
        });
    }

    public /* synthetic */ void lambda$onDestroy$6(ViewDelegateStorage viewDelegateStorage) {
        viewDelegateStorage.remove(this.viewModelUuid);
    }

    public void onCloseClicked() {
        Objects.onNotNull(this.interstitialAdBaseDelegate, new Consumer() { // from class: com.smaato.sdk.interstitial.view.h
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ((InterstitialAdBaseDelegate) obj).onCloseClicked();
            }
        });
    }

    private void setAutomaticContentViewScaling(AdContentView adContentView) {
        this.contentHolder.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC27380c(adContentView));
    }

    private void startSplashClosingTimers() {
        new Timer().schedule(this.showCloseButtonTask, 3000L);
        new Timer().schedule(this.closeAdTask, 5000L);
        this.splashTimersAreStarted = true;
    }

    protected void initView(@Nullable AdContentView adContentView) {
        if (adContentView == null) {
            this.interstitialAdBaseDelegate.noContentViewFoundError();
            finish();
            return;
        }
        setContentView(C27359R.C27363layout.smaato_sdk_interstitial_activity);
        this.contentHolder = (FrameLayout) findViewById(C27359R.C27362id.smaato_sdk_interstitial_content);
        if (adContentView.getParent() != null) {
            ((ViewGroup) adContentView.getParent()).removeView(adContentView);
        }
        this.contentHolder.addView(adContentView);
        initCloseButton();
        initCloseButtonCountDown();
        initBackground();
        setAutomaticContentViewScaling(adContentView);
        this.interstitialAdBaseDelegate.setProgressBar(initProgressView());
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.isBackButtonEnabled) {
            onCloseClicked();
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        AndroidsInjector.inject(this);
        if (this.viewDelegateStorage == null) {
            Logger logger = this.logger;
            if (logger != null) {
                logger.error(LogDomain.INTERSTITIAL, "SmaatoSdk is not initialized.", new Object[0]);
            }
            finish();
            return;
        }
        UUID uuid = (UUID) getIntent().getSerializableExtra(KEY_VIEWDELEGATE_UUID);
        this.viewModelUuid = uuid;
        SmaatoSdkViewDelegate smaatoSdkViewDelegate = this.viewDelegateStorage.get(uuid);
        if (smaatoSdkViewDelegate instanceof InterstitialAdBaseDelegate) {
            InterstitialAdBaseDelegate interstitialAdBaseDelegate = (InterstitialAdBaseDelegate) smaatoSdkViewDelegate;
            this.interstitialAdBaseDelegate = interstitialAdBaseDelegate;
            interstitialAdBaseDelegate.setCloseButtonVisibility(false);
            this.interstitialAdBaseDelegate.setCloseButtonVisibilityChanger(this.closeButtonVisibilityChanger);
            this.interstitialAdBaseDelegate.setBackButtonEnabledChanger(this.backButtonEnabledChanger);
            this.interstitialAdBaseDelegate.setActivityFinisher(new Runnable() { // from class: com.smaato.sdk.interstitial.view.a
                {
                    InterstitialAdActivity.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    InterstitialAdActivity.this.finish();
                }
            });
            this.interstitialAdBaseDelegate.setCountDownTimerTextChanger(this.countDownTextChanger);
            this.interstitialAdBaseDelegate.setCountDownTimerVisibilityChanger(this.countDownTextVisibilityChanger);
            this.interstitialAdBaseDelegate.startFailsafeCountDownTimer();
            initView(this.interstitialAdBaseDelegate.getAdContentView());
        } else {
            Logger logger2 = this.logger;
            if (logger2 != null) {
                logger2.error(LogDomain.INTERSTITIAL, "No InterstitialAdBaseDelegate available", new Object[0]);
            }
            finish();
        }
        this.isSplash = getIntent().getBooleanExtra(KEY_IS_SPLASH, false);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (isFinishing()) {
            Objects.onNotNull(this.interstitialAdBaseDelegate, new Consumer() { // from class: com.smaato.sdk.interstitial.view.i
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    ((InterstitialAdBaseDelegate) obj).onActivityFinishing();
                }
            });
            Objects.onNotNull(this.viewDelegateStorage, new Consumer() { // from class: com.smaato.sdk.interstitial.view.j
                {
                    InterstitialAdActivity.this = this;
                }

                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    InterstitialAdActivity.this.lambda$onDestroy$6((ViewDelegateStorage) obj);
                }
            });
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        Objects.onNotNull(this.interstitialAdBaseDelegate, new Consumer() { // from class: com.smaato.sdk.interstitial.view.g
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ((InterstitialAdBaseDelegate) obj).onActivityPause();
            }
        });
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        Objects.onNotNull(this.interstitialAdBaseDelegate, new Consumer() { // from class: com.smaato.sdk.interstitial.view.k
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ((InterstitialAdBaseDelegate) obj).onActivityResume();
            }
        });
        if (this.isSplash && !this.splashTimersAreStarted) {
            startSplashClosingTimers();
        }
    }

    @VisibleForTesting
    void reSizeCloseButtonForSmallerResolutions() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i = displayMetrics.densityDpi;
            float scaleX = this.closeButton.getScaleX();
            float scaleY = this.closeButton.getScaleY();
            if (i <= 160) {
                this.closeButton.setScaleX(scaleX * 0.7f);
                this.closeButton.setScaleY(scaleY * 0.7f);
            } else if (i <= 240) {
                this.closeButton.setScaleX(scaleX * 0.65f);
                this.closeButton.setScaleY(scaleY * 0.65f);
            } else if (i <= 320) {
                this.closeButton.setScaleX(scaleX * 0.7f);
                this.closeButton.setScaleY(scaleY * 0.7f);
            }
        } catch (Exception e) {
            Logger logger = this.logger;
            if (logger != null) {
                logger.error(LogDomain.INTERSTITIAL, e, "error while getting display metrics", new Object[0]);
            }
        }
    }
}
