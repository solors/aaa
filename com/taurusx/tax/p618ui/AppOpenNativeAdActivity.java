package com.taurusx.tax.p618ui;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.taurusx.adsession.AdEvents;
import com.iab.omid.library.taurusx.adsession.AdSession;
import com.taurusx.tax.C28154R;
import com.taurusx.tax.api.TaurusXAds;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.p578b.C28206a;
import com.taurusx.tax.p578b.C28207b;
import com.taurusx.tax.p578b.p579c.C28208a;
import com.taurusx.tax.p578b.p579c.C28210c;
import com.taurusx.tax.p578b.p580d.C28218b;
import com.taurusx.tax.p578b.p581e.C28219a;
import com.taurusx.tax.p578b.p581e.C28231g;
import com.taurusx.tax.p578b.p581e.C28236i;
import com.taurusx.tax.p578b.p581e.C28237j;
import com.taurusx.tax.p578b.p582f.C28248g;
import com.taurusx.tax.p578b.p582f.C28262q;
import com.taurusx.tax.p604i.RunnableC28441e;
import com.taurusx.tax.p604i.RunnableC28444g;
import com.taurusx.tax.p604i.View$OnClickListenerC28442f;
import com.taurusx.tax.p606j.C28518e;
import com.taurusx.tax.p606j.C28521h;
import com.taurusx.tax.p606j.C28522i;
import com.taurusx.tax.p606j.C28528l;
import com.taurusx.tax.p606j.C28529m;
import com.taurusx.tax.p606j.C28549x;
import com.taurusx.tax.p606j.p615y.C28560d;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.taurusx.tax.ui.AppOpenNativeAdActivity */
/* loaded from: classes7.dex */
public class AppOpenNativeAdActivity extends Activity implements View.OnClickListener {

    /* renamed from: A */
    public boolean f74130A;

    /* renamed from: B */
    public boolean f74131B;

    /* renamed from: C */
    public int f74132C;

    /* renamed from: D */
    public float f74133D;

    /* renamed from: E */
    public float f74134E;

    /* renamed from: I */
    public boolean f74138I;

    /* renamed from: J */
    public boolean f74139J;

    /* renamed from: K */
    public boolean f74140K;

    /* renamed from: L */
    public AdSession f74141L;

    /* renamed from: M */
    public AdEvents f74142M;

    /* renamed from: O */
    public int f74144O;

    /* renamed from: a */
    public RelativeLayout f74147a;

    /* renamed from: b */
    public ImageView f74148b;

    /* renamed from: c */
    public ImageView f74149c;

    /* renamed from: d */
    public ImageView f74150d;

    /* renamed from: e */
    public TextView f74151e;

    /* renamed from: f */
    public TextView f74152f;

    /* renamed from: g */
    public LinearLayout f74153g;

    /* renamed from: h */
    public ImageView f74154h;

    /* renamed from: i */
    public ImageView f74155i;

    /* renamed from: j */
    public ImageView f74156j;

    /* renamed from: k */
    public LinearLayout f74157k;

    /* renamed from: l */
    public ImageView f74158l;

    /* renamed from: m */
    public TextView f74159m;

    /* renamed from: n */
    public TextView f74160n;

    /* renamed from: o */
    public C28210c.C28211a f74161o;

    /* renamed from: p */
    public C28248g f74162p;

    /* renamed from: q */
    public C28236i f74163q;

    /* renamed from: r */
    public String f74164r;

    /* renamed from: s */
    public C28210c f74165s;

    /* renamed from: t */
    public String f74166t;

    /* renamed from: u */
    public Bitmap f74167u;

    /* renamed from: v */
    public long f74168v;

    /* renamed from: w */
    public boolean f74169w;

    /* renamed from: x */
    public float f74170x;

    /* renamed from: y */
    public int f74171y;

    /* renamed from: z */
    public boolean f74172z;

    /* renamed from: F */
    public boolean f74135F = true;

    /* renamed from: G */
    public C28219a f74136G = new C28219a();

    /* renamed from: H */
    public C28237j f74137H = new C28237j();

    /* renamed from: N */
    public View.OnLayoutChangeListener f74143N = new View$OnLayoutChangeListenerC28579a();

    /* renamed from: P */
    public Handler f74145P = new HandlerC28582d(this);

    /* renamed from: Q */
    public View.OnTouchListener f74146Q = new View$OnTouchListenerC28581c();

    /* renamed from: com.taurusx.tax.ui.AppOpenNativeAdActivity$a */
    /* loaded from: classes7.dex */
    public class View$OnLayoutChangeListenerC28579a implements View.OnLayoutChangeListener {
        public View$OnLayoutChangeListenerC28579a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (i != i5 || i2 != i6 || i3 != i7 || i4 != i8) {
                AppOpenNativeAdActivity appOpenNativeAdActivity = AppOpenNativeAdActivity.this;
                float f = appOpenNativeAdActivity.f74170x;
                if (f <= 0.0f) {
                    f = 1.0f;
                }
                appOpenNativeAdActivity.f74170x = f;
                BigDecimal bigDecimal = new BigDecimal(String.valueOf(AppOpenNativeAdActivity.this.f74170x));
                int doubleValue = (int) new BigDecimal(String.valueOf(AppOpenNativeAdActivity.this.f74153g.getHeight())).multiply(bigDecimal).doubleValue();
                ViewGroup.LayoutParams layoutParams = AppOpenNativeAdActivity.this.f74154h.getLayoutParams();
                layoutParams.width = (int) new BigDecimal(String.valueOf(AppOpenNativeAdActivity.this.f74153g.getWidth())).multiply(bigDecimal).doubleValue();
                layoutParams.height = doubleValue;
                AppOpenNativeAdActivity.this.f74154h.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: com.taurusx.tax.ui.AppOpenNativeAdActivity$b */
    /* loaded from: classes7.dex */
    public class RunnableC28580b implements Runnable {
        public RunnableC28580b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AdEvents adEvents = AppOpenNativeAdActivity.this.f74142M;
            if (adEvents != null) {
                adEvents.impressionOccurred();
            }
        }
    }

    /* renamed from: com.taurusx.tax.ui.AppOpenNativeAdActivity$c */
    /* loaded from: classes7.dex */
    public class View$OnTouchListenerC28581c implements View.OnTouchListener {
        public View$OnTouchListenerC28581c() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                AppOpenNativeAdActivity.this.f74137H.f73355a = System.currentTimeMillis();
                AppOpenNativeAdActivity.this.f74136G.f73285a = String.valueOf((int) motionEvent.getX());
                AppOpenNativeAdActivity.this.f74136G.f73286b = String.valueOf((int) motionEvent.getY());
            } else if (motionEvent.getAction() == 1) {
                AppOpenNativeAdActivity.this.f74137H.f73356b = System.currentTimeMillis();
                AppOpenNativeAdActivity.this.f74137H.f73357c = motionEvent.getDownTime();
                AppOpenNativeAdActivity.this.f74137H.f73358d = motionEvent.getEventTime();
                AppOpenNativeAdActivity.this.f74137H.m38361a(motionEvent);
                AppOpenNativeAdActivity.this.f74136G.f73287c = String.valueOf((int) motionEvent.getX());
                AppOpenNativeAdActivity.this.f74136G.f73288d = String.valueOf((int) motionEvent.getY());
                AppOpenNativeAdActivity.this.f74136G.f73290f = String.valueOf(view.getHeight());
                AppOpenNativeAdActivity.this.f74136G.f73289e = String.valueOf(view.getWidth());
                AppOpenNativeAdActivity.this.f74136G.f73291g = String.valueOf(System.currentTimeMillis());
                LogUtil.m37905d("CoordinateInfo", "the coordinate info " + AppOpenNativeAdActivity.this.f74136G.toString());
                C28248g c28248g = AppOpenNativeAdActivity.this.f74162p;
                if (c28248g != null) {
                    c28248g.onAdClicked();
                }
                AppOpenNativeAdActivity appOpenNativeAdActivity = AppOpenNativeAdActivity.this;
                appOpenNativeAdActivity.m37877a(appOpenNativeAdActivity, appOpenNativeAdActivity.f74166t);
                AppOpenNativeAdActivity appOpenNativeAdActivity2 = AppOpenNativeAdActivity.this;
                C28219a c28219a = appOpenNativeAdActivity2.f74136G;
                C28237j c28237j = appOpenNativeAdActivity2.f74137H;
                if (!appOpenNativeAdActivity2.f74140K && appOpenNativeAdActivity2.f74161o != null) {
                    ArrayList arrayList = new ArrayList();
                    C28210c.C28211a c28211a = appOpenNativeAdActivity2.f74161o;
                    if (c28211a != null) {
                        arrayList.addAll(c28211a.f73237h);
                    }
                    C28231g.m38377a(appOpenNativeAdActivity2, C28529m.m37998a(arrayList, c28219a), "ad-click");
                    C28231g.m38380a(appOpenNativeAdActivity2, appOpenNativeAdActivity2.f74161o.f73235f, "CLICK", 0L, appOpenNativeAdActivity2.f74165s, C28231g.m38375a(c28219a), (C28231g.InterfaceC28234c) null);
                    appOpenNativeAdActivity2.f74140K = true;
                    appOpenNativeAdActivity2.f74163q.m38369a(c28219a, c28237j);
                    C28206a.m38470e().f73193i.m38313a("CLICK", appOpenNativeAdActivity2.f74164r);
                }
            }
            return true;
        }
    }

    /* renamed from: com.taurusx.tax.ui.AppOpenNativeAdActivity$d */
    /* loaded from: classes7.dex */
    public static class HandlerC28582d extends Handler {

        /* renamed from: a */
        public WeakReference<AppOpenNativeAdActivity> f74176a;

        public HandlerC28582d(AppOpenNativeAdActivity appOpenNativeAdActivity) {
            this.f74176a = new WeakReference<>(appOpenNativeAdActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            super.handleMessage(message);
            AppOpenNativeAdActivity appOpenNativeAdActivity = this.f74176a.get();
            if (appOpenNativeAdActivity == null) {
                return;
            }
            int i = message.what;
            if (i != 0) {
                if (i == 1) {
                    if (appOpenNativeAdActivity.f74172z) {
                        appOpenNativeAdActivity.f74153g.setVisibility(0);
                        appOpenNativeAdActivity.f74154h.setVisibility(0);
                        return;
                    }
                    appOpenNativeAdActivity.f74155i.setVisibility(0);
                    appOpenNativeAdActivity.f74156j.setVisibility(0);
                    return;
                }
                return;
            }
            int i2 = appOpenNativeAdActivity.f74144O;
            if (i2 > 0) {
                if (!appOpenNativeAdActivity.f74130A) {
                    appOpenNativeAdActivity.f74144O = i2 - 1;
                    TextView textView = appOpenNativeAdActivity.f74160n;
                    textView.setText(appOpenNativeAdActivity.f74144O + "s");
                }
                sendEmptyMessageDelayed(0, 1000L);
                return;
            }
            appOpenNativeAdActivity.f74160n.setText("0s");
            if (appOpenNativeAdActivity.f74169w) {
                appOpenNativeAdActivity.m37879a();
            }
        }
    }

    /* renamed from: a */
    public static void m37875a(String str) {
        Intent intent = new Intent(TaurusXAds.getContext(), AppOpenNativeAdActivity.class);
        intent.putExtra("placementId", str);
        intent.putExtra("orientation", C28518e.m38011e(TaurusXAds.getContext()));
        intent.addFlags(268435456);
        TaurusXAds.getContext().startActivity(intent);
    }

    /* renamed from: b */
    public final void m37873b(Context context, String str) {
        Intent intent;
        if (C28528l.f73973a) {
            intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addCategory("android.intent.category.BROWSABLE");
        } else {
            intent = new Intent(context, TaxWebViewActivity.class);
            intent.putExtra("url", str);
            String uuid = UUID.randomUUID().toString();
            C28560d.m37928a().m37927a(uuid, this.f74165s);
            intent.putExtra("ad_response_cache_key", uuid);
            intent.putExtra("ad_pid_key", this.f74164r);
        }
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    /* renamed from: c */
    public final void m37872c() {
        if (this.f74172z) {
            this.f74153g.addOnLayoutChangeListener(this.f74143N);
            return;
        }
        float f = this.f74170x;
        if (f <= 0.0f) {
            f = 1.0f;
        }
        this.f74170x = f;
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(this.f74170x));
        ViewGroup.LayoutParams layoutParams = this.f74156j.getLayoutParams();
        float doubleValue = (int) new BigDecimal(String.valueOf(30.0f)).multiply(bigDecimal).doubleValue();
        layoutParams.width = C28518e.m38042a(getApplicationContext(), doubleValue);
        layoutParams.height = C28518e.m38042a(getApplicationContext(), doubleValue);
        this.f74156j.setLayoutParams(layoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.f74133D = motionEvent.getX();
        this.f74134E = motionEvent.getY();
        LogUtil.m37900v("taurusx", "dispatchTouchEvent at x = " + motionEvent.getX() + " and y = " + motionEvent.getY());
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == C28154R.C28157id.layout_ad) {
            m37873b(view.getContext(), C28218b.m38414c());
        } else if (id2 == C28154R.C28157id.skip_click) {
            C28236i c28236i = this.f74163q;
            if (c28236i != null) {
                c28236i.m38362c();
            }
            m37879a();
        } else if (id2 == C28154R.C28157id.tax_imageview_close_click) {
            m37879a();
        }
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        Bitmap bitmap;
        String str;
        C28210c.C28211a.C28212a c28212a;
        super.onCreate(bundle);
        setContentView(C28154R.C28158layout.taurusx_activity_appopen_native);
        m37878a((Activity) this);
        this.f74147a = (RelativeLayout) findViewById(C28154R.C28157id.inner_activity_main);
        this.f74157k = (LinearLayout) findViewById(C28154R.C28157id.app_layout);
        this.f74158l = (ImageView) findViewById(C28154R.C28157id.app_icon);
        this.f74159m = (TextView) findViewById(C28154R.C28157id.app_name);
        this.f74153g = (LinearLayout) findViewById(C28154R.C28157id.skip_ll);
        this.f74154h = (ImageView) findViewById(C28154R.C28157id.skip_click);
        this.f74160n = (TextView) findViewById(C28154R.C28157id.tax_textView_time);
        this.f74155i = (ImageView) findViewById(C28154R.C28157id.tax_imageview_close);
        ImageView imageView = (ImageView) findViewById(C28154R.C28157id.tax_imageview_close_click);
        this.f74156j = imageView;
        imageView.setOnClickListener(this);
        this.f74147a.setOnTouchListener(this.f74146Q);
        this.f74154h.setOnClickListener(this);
        this.f74148b = (ImageView) findViewById(C28154R.C28157id.native_img);
        this.f74149c = (ImageView) findViewById(C28154R.C28157id.blur_img);
        this.f74150d = (ImageView) findViewById(C28154R.C28157id.icon_img);
        this.f74151e = (TextView) findViewById(C28154R.C28157id.title);
        this.f74152f = (TextView) findViewById(C28154R.C28157id.cta);
        String stringExtra = getIntent().getStringExtra("placementId");
        this.f74164r = stringExtra;
        C28208a c28208a = C28262q.C28263a.C28264a.f73429a.f73428a.get(stringExtra);
        if (c28208a != null) {
            this.f74165s = c28208a.f73197a;
            this.f74161o = c28208a.f73205i;
            this.f74168v = c28208a.f73215s;
            this.f74169w = c28208a.f73213q;
            this.f74170x = c28208a.f73214r;
            this.f74171y = c28208a.f73216t;
            this.f74172z = c28208a.f73217u;
            this.f74163q = c28208a.f73202f;
            this.f74162p = c28208a.f73203g;
            try {
                JSONObject jSONObject = new JSONObject(this.f74161o.f73230a);
                String optString = jSONObject.optString("image");
                C28522i.m38002a(this.f74148b, optString);
                C28522i.m38002a(this.f74150d, jSONObject.optString("icon"));
                this.f74151e.setText(jSONObject.optString("title"));
                this.f74152f.setText(jSONObject.optString("cta"));
                this.f74166t = jSONObject.optString("link");
                LruCache<String, Bitmap> lruCache = C28522i.f73964c;
                if (lruCache != null) {
                    bitmap = lruCache.get(optString);
                } else {
                    bitmap = null;
                }
                if (bitmap != null) {
                    Bitmap m37973a = C28549x.m37973a(TaurusXAds.getContext(), bitmap);
                    this.f74167u = m37973a;
                    if (m37973a != null) {
                        this.f74149c.setImageBitmap(m37973a);
                    }
                }
                if (C28206a.m38470e().f73196l != 0) {
                    this.f74157k.setVisibility(0);
                    this.f74158l.setImageResource(C28206a.m38470e().f73196l);
                    this.f74159m.setText(C28207b.m38440c(this));
                }
                this.f74145P.sendEmptyMessageDelayed(1, this.f74168v);
                this.f74144O = this.f74171y;
                TextView textView = this.f74160n;
                textView.setText(this.f74144O + "s");
                this.f74145P.sendEmptyMessageDelayed(0, 1000L);
                m37872c();
                C28210c.C28211a c28211a = this.f74161o;
                if (c28211a != null && (c28212a = c28211a.f73243n) != null) {
                    str = c28212a.f73245b;
                } else {
                    str = "";
                }
                if (!TextUtils.isEmpty(str)) {
                    int i = C28154R.C28157id.btn_ru_ado;
                    findViewById(i).setVisibility(0);
                    findViewById(i).setOnClickListener(new View$OnClickListenerC28442f(this, str));
                }
                if (C28549x.m37963b(this.f74165s)) {
                    m37874b();
                } else {
                    LogUtil.m37900v("AppOpenNativeAdActivity", "checkVisible:");
                    C28521h.m38004a(new RunnableC28444g(this), 1000L);
                }
                C28521h.m38005a(new RunnableC28441e(this));
                return;
            } catch (JSONException unused) {
                return;
            }
        }
        C28248g c28248g = this.f74162p;
        if (c28248g != null) {
            c28248g.onAdClosed();
            this.f74131B = true;
        }
        finish();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        C28236i c28236i;
        LogUtil.m37902i("taurusx-release", "onDestroy hasCallClose: " + this.f74131B);
        if (!this.f74131B && this.f74162p != null && (c28236i = this.f74163q) != null) {
            c28236i.m38374a();
            this.f74162p.onAdClosed();
            this.f74131B = true;
        }
        this.f74135F = false;
        C28262q.C28263a.C28264a.f73429a.f73428a.remove(this.f74164r);
        Handler handler = this.f74145P;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        LinearLayout linearLayout = this.f74153g;
        if (linearLayout != null) {
            linearLayout.removeOnLayoutChangeListener(this.f74143N);
        }
        AdSession adSession = this.f74141L;
        if (adSession != null) {
            adSession.finish();
            this.f74141L = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (4 == i) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    public void onPause() {
        this.f74130A = true;
        super.onPause();
    }

    @Override // android.app.Activity
    public void onResume() {
        this.f74130A = false;
        m37878a((Activity) this);
        super.onResume();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        LogUtil.m37902i("taurusx-release", "onStop hasCallClose: " + this.f74131B + ",isFinishing: " + isFinishing());
        if (!this.f74131B && isFinishing() && this.f74162p != null) {
            this.f74163q.m38374a();
            this.f74162p.onAdClosed();
            this.f74131B = true;
        }
    }

    /* renamed from: a */
    public void m37878a(Activity activity) {
        activity.getWindow().getDecorView().setSystemUiVisibility(4102);
        ActionBar actionBar = activity.getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        activity.getWindow().setFlags(1024, 1024);
    }

    /* renamed from: a */
    public static void m37876a(AppOpenNativeAdActivity appOpenNativeAdActivity) {
        appOpenNativeAdActivity.getClass();
        LogUtil.m37900v("AppOpenNativeAdActivity", "checkVisible:");
        C28521h.m38004a(new RunnableC28444g(appOpenNativeAdActivity), 1000L);
    }

    /* renamed from: b */
    public final void m37874b() {
        C28210c.C28211a c28211a;
        if (!this.f74138I) {
            ArrayList arrayList = new ArrayList();
            C28210c.C28211a c28211a2 = this.f74161o;
            if (c28211a2 != null) {
                arrayList.addAll(c28211a2.f73236g);
            }
            C28231g.m38377a(this, arrayList, "ad-imp");
            C28231g.m38381a(TaurusXAds.getContext(), C28231g.m38376a(this.f74161o), "IMP", 0L, this.f74165s);
            this.f74138I = true;
            C28206a.m38470e().f73193i.m38313a("IMP", this.f74164r);
        }
        if (!this.f74139J && (c28211a = this.f74161o) != null) {
            C28231g.m38377a(this, c28211a.f73238i, "ad-bill");
            C28231g.m38381a(TaurusXAds.getContext(), this.f74161o.f73235f, "BILL", 0L, this.f74165s);
            this.f74139J = true;
        }
        C28248g c28248g = this.f74162p;
        if (c28248g != null) {
            c28248g.onAdImpression();
        }
        C28521h.m38005a(new RunnableC28580b());
    }

    /* renamed from: a */
    public final boolean m37877a(Context context, String str) {
        C28210c.C28211a c28211a = this.f74161o;
        String str2 = c28211a.f73240k;
        String str3 = c28211a.f73241l;
        if (!TextUtils.isEmpty(str2)) {
            if (C28518e.m38037a(context, str2)) {
                C28518e.m38023b(context, str2);
                return true;
            } else if (!TextUtils.isEmpty(str3)) {
                C28518e.m38023b(context, str3);
                return true;
            }
        }
        try {
        } catch (Throwable th) {
            LogUtil.m37900v("AppOpenNativeAdActivity", "onClickEvent:" + th.getMessage());
        }
        if (str.startsWith("market:")) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            intent.setFlags(268435456);
            context.startActivity(intent);
            return true;
        } else if (C28518e.m38034a(str)) {
            return C28518e.m38038a(context, (WebView) null, str);
        } else {
            if (str.startsWith("http")) {
                m37873b(context, str);
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public final void m37879a() {
        if (this.f74162p == null || this.f74131B) {
            return;
        }
        this.f74163q.m38373a(this.f74133D, this.f74134E);
        this.f74162p.onAdClosed();
        this.f74131B = true;
        finish();
    }
}
