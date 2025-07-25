package sg.bigo.ads.p883ad.splash;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.InputDeviceCompat;
import com.ironsource.C19658bt;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.SplashAd;
import sg.bigo.ads.api.SplashAdInteractionListener;
import sg.bigo.ads.common.p932t.C43782a;

/* renamed from: sg.bigo.ads.ad.splash.AdSplashActivity */
/* loaded from: classes10.dex */
public class AdSplashActivity extends Activity {

    /* renamed from: a */
    private static final Map<Integer, C43481b> f113794a = new HashMap();

    /* renamed from: b */
    private C43481b f113795b;

    /* renamed from: c */
    private final AtomicBoolean f113796c = new AtomicBoolean(false);

    /* renamed from: a */
    public static void m5604a(@NonNull Context context, @NonNull C43481b c43481b) {
        Class cls;
        if (c43481b.getStyle() == SplashAd.Style.HORIZONTAL) {
            cls = LandscapeAdSplashActivity.class;
        } else {
            cls = AdSplashActivity.class;
        }
        Intent intent = new Intent(context, cls);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        int hashCode = c43481b.hashCode();
        intent.putExtra("splash_hash", hashCode);
        f113794a.put(Integer.valueOf(hashCode), c43481b);
        context.startActivity(intent);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        if (this.f113795b != null && this.f113796c.compareAndSet(false, true)) {
            this.f113795b.f113967v.onAdClosed();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        Window window = getWindow();
        if (window != null) {
            window.setFlags(1024, 1024);
            if (Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                attributes.flags |= 67108864;
                window.setAttributes(attributes);
            }
        }
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        int intExtra = intent.getIntExtra("splash_hash", -1);
        Map<Integer, C43481b> map = f113794a;
        C43481b c43481b = map.get(Integer.valueOf(intExtra));
        if (c43481b == null) {
            finish();
            return;
        }
        map.remove(Integer.valueOf(intExtra));
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setBackgroundColor(-1);
        setContentView(frameLayout);
        this.f113795b = c43481b;
        c43481b.f113967v.f113999c = new SplashAdInteractionListener() { // from class: sg.bigo.ads.ad.splash.AdSplashActivity.1
            @Override // sg.bigo.ads.api.AdInteractionListener
            public final void onAdClicked() {
                C43782a.m5010a(0, 3, "AdSplashActivity", "onAdClicked");
            }

            @Override // sg.bigo.ads.api.AdInteractionListener
            public final void onAdClosed() {
                C43782a.m5010a(0, 3, "AdSplashActivity", "onAdClosed");
            }

            @Override // sg.bigo.ads.api.AdInteractionListener
            public final void onAdError(@NonNull AdError adError) {
                if (adError == null) {
                    return;
                }
                C43782a.m5010a(0, 3, "AdSplashActivity", "onAdError: " + adError.getCode() + " " + adError.getMessage());
            }

            @Override // sg.bigo.ads.api.SplashAdInteractionListener
            public final void onAdFinished() {
                C43782a.m5010a(0, 3, "AdSplashActivity", "onAdFinished");
            }

            @Override // sg.bigo.ads.api.AdInteractionListener
            public final void onAdImpression() {
                C43782a.m5010a(0, 3, "AdSplashActivity", "onAdImpression");
            }

            @Override // sg.bigo.ads.api.AdInteractionListener
            public final void onAdOpened() {
                C43782a.m5010a(0, 3, "AdSplashActivity", C19658bt.f49340c);
            }

            @Override // sg.bigo.ads.api.SplashAdInteractionListener
            public final void onAdSkipped() {
                C43782a.m5010a(0, 3, "AdSplashActivity", "onAdSkipped");
                AdSplashActivity.this.finish();
            }
        };
        c43481b.m5522a(frameLayout);
        C43481b c43481b2 = this.f113795b;
        if (c43481b2 != null) {
            c43481b2.f113967v.onAdOpened();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (this.f113795b != null && this.f113796c.compareAndSet(false, true)) {
            this.f113795b.f113967v.onAdClosed();
        }
        C43481b c43481b = this.f113795b;
        if (c43481b != null) {
            c43481b.destroy();
            this.f113795b = null;
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            C43481b c43481b = this.f113795b;
            if (c43481b != null && c43481b.isSkippable()) {
                this.f113795b.m5512d(8);
                return true;
            }
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    protected void onResume() {
        View decorView;
        super.onResume();
        Window window = getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
        }
    }
}
