package com.taurusx.tax.p618ui;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.iab.omid.library.taurusx.adsession.AdEvents;
import com.iab.omid.library.taurusx.adsession.AdSession;
import com.iab.omid.library.taurusx.adsession.CreativeType;
import com.iab.omid.library.taurusx.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.taurusx.adsession.media.InteractionType;
import com.iab.omid.library.taurusx.adsession.media.MediaEvents;
import com.taurusx.tax.C28154R;
import com.taurusx.tax.api.TaurusXAds;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.p578b.C28206a;
import com.taurusx.tax.p578b.C28207b;
import com.taurusx.tax.p578b.p579c.C28210c;
import com.taurusx.tax.p578b.p580d.C28218b;
import com.taurusx.tax.p578b.p581e.C28219a;
import com.taurusx.tax.p578b.p581e.C28231g;
import com.taurusx.tax.p578b.p581e.C28236i;
import com.taurusx.tax.p578b.p581e.C28237j;
import com.taurusx.tax.p578b.p582f.C28248g;
import com.taurusx.tax.p578b.p582f.C28250i;
import com.taurusx.tax.p594e.C28363r0;
import com.taurusx.tax.p603h.C28435d;
import com.taurusx.tax.p604i.C28445h;
import com.taurusx.tax.p604i.C28447i;
import com.taurusx.tax.p604i.C28458r;
import com.taurusx.tax.p604i.RunnableC28457q;
import com.taurusx.tax.p604i.RunnableC28459s;
import com.taurusx.tax.p606j.C28518e;
import com.taurusx.tax.p606j.C28521h;
import com.taurusx.tax.p606j.C28528l;
import com.taurusx.tax.p606j.C28529m;
import com.taurusx.tax.p606j.C28549x;
import com.taurusx.tax.p606j.p615y.C28560d;
import com.taurusx.tax.vast.VastCompanionAdConfig;
import com.taurusx.tax.vast.VastConfig;
import com.taurusx.tax.vast.VastManager;
import com.taurusx.tax.vast.VastTracker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.taurusx.tax.ui.TaxVideoActivity */
/* loaded from: classes7.dex */
public class TaxVideoActivity extends Activity implements View.OnClickListener {

    /* renamed from: A */
    public String f74210A;

    /* renamed from: B */
    public int f74211B;

    /* renamed from: C */
    public boolean f74212C;

    /* renamed from: D */
    public boolean f74213D;

    /* renamed from: E */
    public int f74214E;

    /* renamed from: F */
    public int f74215F;

    /* renamed from: H */
    public boolean f74217H;

    /* renamed from: I */
    public C28210c f74218I;

    /* renamed from: J */
    public String f74219J;

    /* renamed from: K */
    public int f74220K;

    /* renamed from: L */
    public int f74221L;

    /* renamed from: M */
    public boolean f74222M;

    /* renamed from: N */
    public boolean f74223N;

    /* renamed from: O */
    public AdSession f74224O;

    /* renamed from: P */
    public AdEvents f74225P;

    /* renamed from: Q */
    public MediaEvents f74226Q;

    /* renamed from: R */
    public boolean f74227R;

    /* renamed from: S */
    public boolean f74228S;

    /* renamed from: T */
    public boolean f74229T;

    /* renamed from: U */
    public boolean f74230U;

    /* renamed from: V */
    public boolean f74231V;

    /* renamed from: W */
    public boolean f74232W;

    /* renamed from: Z */
    public long f74235Z;

    /* renamed from: a */
    public RelativeLayout f74236a;

    /* renamed from: a0 */
    public boolean f74237a0;

    /* renamed from: b */
    public ImageView f74238b;

    /* renamed from: b0 */
    public int f74239b0;

    /* renamed from: c */
    public ImageView f74240c;

    /* renamed from: c0 */
    public Bitmap f74241c0;

    /* renamed from: d */
    public ImageView f74242d;

    /* renamed from: d0 */
    public int f74243d0;

    /* renamed from: e */
    public LinearLayout f74244e;

    /* renamed from: e0 */
    public float f74245e0;

    /* renamed from: f */
    public ImageView f74246f;

    /* renamed from: f0 */
    public float f74247f0;

    /* renamed from: g */
    public ImageView f74248g;

    /* renamed from: g0 */
    public int f74249g0;

    /* renamed from: h */
    public TextView f74250h;

    /* renamed from: i */
    public TaxMediaView f74252i;

    /* renamed from: j */
    public LinearLayout f74254j;

    /* renamed from: j0 */
    public boolean f74255j0;

    /* renamed from: k */
    public ViewGroup f74256k;

    /* renamed from: k0 */
    public boolean f74257k0;

    /* renamed from: l */
    public C28445h f74258l;

    /* renamed from: m */
    public LinearLayout f74259m;

    /* renamed from: n */
    public ImageView f74260n;

    /* renamed from: o */
    public ImageView f74261o;

    /* renamed from: p */
    public ImageView f74262p;

    /* renamed from: q */
    public TextView f74263q;

    /* renamed from: r */
    public TextView f74264r;

    /* renamed from: s */
    public ImageView f74265s;

    /* renamed from: t */
    public ImageView f74266t;

    /* renamed from: u */
    public C28210c.C28211a f74267u;

    /* renamed from: v */
    public VastConfig f74268v;

    /* renamed from: w */
    public C28236i f74269w;

    /* renamed from: x */
    public String f74270x;

    /* renamed from: y */
    public boolean f74271y;

    /* renamed from: z */
    public C28248g f74272z;

    /* renamed from: G */
    public boolean f74216G = true;

    /* renamed from: X */
    public C28219a f74233X = new C28219a();

    /* renamed from: Y */
    public C28237j f74234Y = new C28237j();

    /* renamed from: h0 */
    public Handler f74251h0 = new HandlerC28592d();

    /* renamed from: i0 */
    public View.OnTouchListener f74253i0 = new View$OnTouchListenerC28593e();

    /* renamed from: com.taurusx.tax.ui.TaxVideoActivity$a */
    /* loaded from: classes7.dex */
    public class RunnableC28589a implements Runnable {
        public RunnableC28589a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TaxVideoActivity.this.f74261o.setVisibility(0);
            TaxVideoActivity.this.f74262p.setVisibility(0);
        }
    }

    /* renamed from: com.taurusx.tax.ui.TaxVideoActivity$c */
    /* loaded from: classes7.dex */
    public class RunnableC28591c implements Runnable {
        public RunnableC28591c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LogUtil.m37901iv("TaxVideoActivity", "valid number  = " + C28549x.m37969a(TaxVideoActivity.this.f74218I));
            TaxVideoActivity taxVideoActivity = TaxVideoActivity.this;
            if (taxVideoActivity.f74243d0 >= C28549x.m37969a(taxVideoActivity.f74218I) && TaxVideoActivity.this.f74259m.getVisibility() != 0) {
                TaxVideoActivity.this.f74240c.setVisibility(0);
                TaxVideoActivity.this.f74242d.setVisibility(0);
            }
        }
    }

    /* renamed from: com.taurusx.tax.ui.TaxVideoActivity$d */
    /* loaded from: classes7.dex */
    public class HandlerC28592d extends Handler {
        public HandlerC28592d() {
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            super.handleMessage(message);
            TaxVideoActivity taxVideoActivity = TaxVideoActivity.this;
            int i = taxVideoActivity.f74249g0;
            if (i > 0) {
                if (!taxVideoActivity.f74257k0) {
                    taxVideoActivity.f74249g0 = i - 1;
                    TextView textView = taxVideoActivity.f74250h;
                    textView.setText(TaxVideoActivity.this.f74249g0 + "s");
                }
                sendEmptyMessageDelayed(0, 1000L);
                return;
            }
            taxVideoActivity.f74250h.setVisibility(8);
            TaxVideoActivity taxVideoActivity2 = TaxVideoActivity.this;
            if (taxVideoActivity2.f74211B == 1 && !taxVideoActivity2.f74212C) {
                taxVideoActivity2.f74212C = true;
                TaxVideoActivity.m37829c(TaxVideoActivity.this);
            }
            TaxVideoActivity.this.m37827d();
        }
    }

    /* renamed from: com.taurusx.tax.ui.TaxVideoActivity$e */
    /* loaded from: classes7.dex */
    public class View$OnTouchListenerC28593e implements View.OnTouchListener {
        public View$OnTouchListenerC28593e() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                TaxVideoActivity.this.f74234Y.f73355a = System.currentTimeMillis();
                TaxVideoActivity.this.f74233X.f73285a = String.valueOf((int) motionEvent.getX());
                TaxVideoActivity.this.f74233X.f73286b = String.valueOf((int) motionEvent.getY());
            } else if (motionEvent.getAction() == 1) {
                TaxVideoActivity.this.f74234Y.f73356b = System.currentTimeMillis();
                TaxVideoActivity.this.f74234Y.f73357c = motionEvent.getDownTime();
                TaxVideoActivity.this.f74234Y.f73358d = motionEvent.getEventTime();
                TaxVideoActivity.this.f74234Y.m38361a(motionEvent);
                TaxVideoActivity.this.f74233X.f73287c = String.valueOf((int) motionEvent.getX());
                TaxVideoActivity.this.f74233X.f73288d = String.valueOf((int) motionEvent.getY());
                TaxVideoActivity.this.f74233X.f73290f = String.valueOf(view.getHeight());
                TaxVideoActivity.this.f74233X.f73289e = String.valueOf(view.getWidth());
                TaxVideoActivity.this.f74233X.f73291g = String.valueOf(System.currentTimeMillis());
                LogUtil.m37905d("CoordinateInfo", "the coordinate info " + TaxVideoActivity.this.f74233X.toString());
                TaxVideoActivity taxVideoActivity = TaxVideoActivity.this;
                C28219a c28219a = taxVideoActivity.f74233X;
                C28237j c28237j = taxVideoActivity.f74234Y;
                VastConfig vastConfig = taxVideoActivity.f74268v;
                if (vastConfig != null) {
                    String clickThroughUrl = vastConfig.getClickThroughUrl();
                    if (!TextUtils.isEmpty(clickThroughUrl)) {
                        TaxMediaView taxMediaView = taxVideoActivity.f74252i;
                        MediaEvents mediaEvents = taxMediaView.f74204z;
                        if (mediaEvents != null && taxMediaView.f74177A != null) {
                            mediaEvents.adUserInteraction(InteractionType.CLICK);
                        }
                        C28248g c28248g = taxVideoActivity.f74272z;
                        if (c28248g != null) {
                            c28248g.onAdClicked();
                        }
                        taxVideoActivity.m37845a(taxVideoActivity, clickThroughUrl, taxVideoActivity.f74270x);
                        if (!(view instanceof TaxMediaView) && !(view instanceof LinearLayout) && !(view instanceof RelativeLayout)) {
                            if (view instanceof ImageView) {
                                taxVideoActivity.m37836b(c28219a, c28237j);
                            }
                        } else {
                            taxVideoActivity.m37844a(c28219a, c28237j);
                        }
                    }
                }
            }
            return true;
        }
    }

    /* renamed from: com.taurusx.tax.ui.TaxVideoActivity$f */
    /* loaded from: classes7.dex */
    public class RunnableC28594f implements Runnable {
        public RunnableC28594f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TaxVideoActivity taxVideoActivity = TaxVideoActivity.this;
            AdEvents adEvents = taxVideoActivity.f74225P;
            if (adEvents != null && !taxVideoActivity.f74213D) {
                adEvents.impressionOccurred();
            }
        }
    }

    /* renamed from: a */
    public final void m37846a(Context context, String str) {
        Intent intent;
        if (C28528l.f73973a) {
            intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addCategory("android.intent.category.BROWSABLE");
        } else {
            intent = new Intent(context, TaxWebViewActivity.class);
            intent.putExtra("url", str);
            String uuid = UUID.randomUUID().toString();
            C28560d.m37928a().m37927a(uuid, this.f74218I);
            intent.putExtra("ad_response_cache_key", uuid);
            intent.putExtra("ad_pid_key", this.f74270x);
        }
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    /* renamed from: d */
    public final void m37827d() {
        this.f74244e.setVisibility(8);
        this.f74250h.setVisibility(8);
        this.f74246f.setVisibility(8);
        this.f74248g.setVisibility(8);
        this.f74238b.setVisibility(8);
        C28521h.m38003b(new RunnableC28591c(), this.f74220K * 1000);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.f74245e0 = motionEvent.getX();
        this.f74247f0 = motionEvent.getY();
        LogUtil.m37900v("taurusx", "dispatchTouchEvent at x = " + motionEvent.getX() + " and y = " + motionEvent.getY());
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e */
    public final boolean m37826e() {
        m37827d();
        Set<VastCompanionAdConfig> vastCompanionAdConfigs = this.f74268v.getVastCompanionAdConfigs();
        if (vastCompanionAdConfigs != null) {
            for (VastCompanionAdConfig vastCompanionAdConfig : vastCompanionAdConfigs) {
                if (vastCompanionAdConfig != null) {
                    List<VastTracker> creativeViewTrackers = vastCompanionAdConfig.getCreativeViewTrackers();
                    ArrayList arrayList = new ArrayList();
                    for (VastTracker vastTracker : creativeViewTrackers) {
                        arrayList.add(vastTracker.getContent());
                    }
                    C28231g.m38377a(this, arrayList, "ad-companion-imp");
                }
            }
        }
        if (TextUtils.isEmpty(this.f74210A)) {
            return false;
        }
        this.f74266t.setVisibility(0);
        this.f74252i.setVisibility(8);
        this.f74254j.setVisibility(0);
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == C28154R.C28157id.tax_img_mute) {
            boolean z = !this.f74271y;
            this.f74271y = z;
            this.f74238b.setSelected(!z);
            TaxMediaView taxMediaView = this.f74252i;
            if (taxMediaView != null) {
                taxMediaView.setMute(this.f74271y);
            }
        } else if (id2 == C28154R.C28157id.tax_imageview_close_click) {
            if (this.f74222M) {
                this.f74259m.setVisibility(0);
                this.f74240c.setVisibility(8);
                this.f74254j.setVisibility(8);
                this.f74266t.setVisibility(8);
                this.f74252i.setVisibility(8);
                Bitmap bitmap = this.f74241c0;
                if (bitmap != null) {
                    this.f74265s.setImageBitmap(bitmap);
                }
                if (this.f74252i.m37865c()) {
                    this.f74252i.m37863d();
                    this.f74217H = true;
                }
                this.f74244e.setVisibility(8);
                this.f74250h.setVisibility(8);
                this.f74246f.setVisibility(8);
                this.f74248g.setVisibility(8);
                this.f74238b.setVisibility(8);
                C28521h.m38003b(new RunnableC28589a(), this.f74221L * 1000);
                return;
            }
            if (this.f74272z != null) {
                this.f74269w.m38373a(this.f74245e0, this.f74247f0);
                C28435d.m38091a().m38089a(this.f74268v);
                this.f74272z.onAdClosed();
                this.f74237a0 = true;
            }
            finish();
        } else if (id2 == C28154R.C28157id.btn_endcard2_close_click) {
            this.f74259m.setVisibility(8);
            if (this.f74272z != null) {
                this.f74269w.m38373a(this.f74245e0, this.f74247f0);
                C28435d.m38091a().m38089a(this.f74268v);
                this.f74272z.onAdClosed();
                this.f74237a0 = true;
            }
            finish();
        } else if (id2 == C28154R.C28157id.tax_skip_click) {
            this.f74217H = true;
            TaxMediaView taxMediaView2 = this.f74252i;
            if (taxMediaView2 != null) {
                taxMediaView2.setIsSkip(true);
            }
            this.f74246f.setVisibility(8);
            this.f74248g.setVisibility(8);
            MediaEvents mediaEvents = this.f74226Q;
            if (mediaEvents != null) {
                mediaEvents.skipped();
            }
            if (this.f74211B == 1 && !this.f74212C) {
                TaxMediaView taxMediaView3 = this.f74252i;
                if (taxMediaView3 != null && taxMediaView3.m37865c()) {
                    this.f74252i.m37863d();
                    return;
                }
                return;
            }
            TaxMediaView taxMediaView4 = this.f74252i;
            if (taxMediaView4 != null && taxMediaView4.m37865c()) {
                TaxMediaView taxMediaView5 = this.f74252i;
                taxMediaView5.getClass();
                LogUtil.m37905d("taurusx", "seekToEnd()");
                MediaPlayer mediaPlayer = taxMediaView5.f74200v;
                if (mediaPlayer != null) {
                    mediaPlayer.seekTo(mediaPlayer.getDuration());
                }
                this.f74252i.m37863d();
                if (!TextUtils.isEmpty(this.f74210A)) {
                    this.f74266t.setVisibility(0);
                    this.f74252i.setVisibility(8);
                    this.f74254j.setVisibility(0);
                    this.f74244e.setVisibility(8);
                    this.f74250h.setVisibility(8);
                    this.f74246f.setVisibility(8);
                    this.f74248g.setVisibility(8);
                    this.f74238b.setVisibility(8);
                }
                C28435d.m38091a().m38086d(this.f74268v);
            }
        } else if (id2 == C28154R.C28157id.layout_ad) {
            m37846a(view.getContext(), C28218b.m38414c());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x035e, code lost:
        if (r0 > 0.0f) goto L66;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r6) {
        /*
            Method dump skipped, instructions count: 956
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.p618ui.TaxVideoActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public void onDestroy() {
        LogUtil.m37902i("taurusx-release", "onDestroy hasCallClose: " + this.f74237a0);
        if (!this.f74237a0 && this.f74272z != null) {
            this.f74269w.m38374a();
            this.f74272z.onAdClosed();
            this.f74237a0 = true;
        }
        this.f74216G = false;
        AdSession adSession = this.f74224O;
        if (adSession != null) {
            adSession.removeAllFriendlyObstructions();
            this.f74224O.finish();
            this.f74224O = null;
        }
        C28250i.C28251a c28251a = C28250i.C28251a.C28252a.f73402a;
        c28251a.f73401a.remove(this.f74270x);
        TaxMediaView taxMediaView = this.f74252i;
        if (taxMediaView != null) {
            taxMediaView.m37861e();
        }
        Bitmap bitmap = this.f74241c0;
        if (bitmap != null) {
            bitmap.recycle();
            this.f74241c0 = null;
        }
        this.f74251h0.removeCallbacksAndMessages(null);
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
        this.f74257k0 = true;
        TaxMediaView taxMediaView = this.f74252i;
        if (taxMediaView != null && !this.f74217H) {
            taxMediaView.m37863d();
            C28435d.m38091a().m38088b(this.f74268v);
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public void onResume() {
        this.f74257k0 = false;
        TaxMediaView taxMediaView = this.f74252i;
        if (taxMediaView != null && !taxMediaView.m37865c() && !this.f74217H) {
            this.f74252i.m37859f();
            C28435d.m38091a().m38087c(this.f74268v);
        }
        m37847a((Activity) this);
        super.onResume();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        LogUtil.m37902i("taurusx-release", "onStop hasCallClose: " + this.f74237a0 + ",isFinishing: " + isFinishing());
        if (!this.f74237a0 && isFinishing() && this.f74272z != null) {
            this.f74269w.m38374a();
            this.f74272z.onAdClosed();
            this.f74237a0 = true;
        }
    }

    /* renamed from: b */
    public static void m37832b(String str) {
        Intent intent = new Intent(TaurusXAds.getContext(), TaxVideoActivity.class);
        intent.putExtra("placementId", str);
        intent.putExtra("orientation", C28518e.m38011e(TaurusXAds.getContext()));
        intent.addFlags(268435456);
        TaurusXAds.getContext().startActivity(intent);
    }

    /* renamed from: c */
    public final void m37831c() {
        C28210c.C28211a c28211a;
        if (!this.f74227R) {
            ArrayList arrayList = new ArrayList();
            C28210c.C28211a c28211a2 = this.f74267u;
            if (c28211a2 != null) {
                arrayList.addAll(c28211a2.f73236g);
            }
            VastConfig vastConfig = this.f74268v;
            if (vastConfig != null) {
                Iterator<VastTracker> it = vastConfig.getImpressionTrackers().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getContent());
                }
            }
            C28231g.m38377a(this, arrayList, "ad-imp");
            C28231g.m38381a(TaurusXAds.getContext(), C28231g.m38376a(this.f74267u), "IMP", 0L, this.f74218I);
            this.f74227R = true;
            C28206a.m38470e().f73193i.m38313a("IMP", this.f74270x);
        }
        if (!this.f74228S && (c28211a = this.f74267u) != null) {
            C28231g.m38377a(this, c28211a.f73238i, "ad-bill");
            C28231g.m38381a(TaurusXAds.getContext(), this.f74267u.f73235f, "BILL", 0L, this.f74218I);
            this.f74228S = true;
        }
        C28248g c28248g = this.f74272z;
        if (c28248g != null) {
            c28248g.onAdImpression();
        }
        C28521h.m38005a(new RunnableC28594f());
        C28521h.m38005a(new RunnableC28459s(this));
    }

    /* renamed from: com.taurusx.tax.ui.TaxVideoActivity$b */
    /* loaded from: classes7.dex */
    public class C28590b implements C28445h.InterfaceC28446a {

        /* renamed from: a */
        public final /* synthetic */ C28236i f74274a;

        /* renamed from: b */
        public final /* synthetic */ C28210c.C28211a f74275b;

        public C28590b(C28236i c28236i, C28210c.C28211a c28211a) {
            this.f74274a = c28236i;
            this.f74275b = c28211a;
        }

        @Override // com.taurusx.tax.p604i.C28445h.InterfaceC28446a
        /* renamed from: a */
        public void mo37824a(C28219a c28219a, C28237j c28237j) {
            Log.v("TaxVideoActivity", "onClicked");
            TaxVideoActivity.this.f74255j0 = true;
            C28248g c28248g = TaxVideoActivity.this.f74272z;
            if (c28248g != null) {
                c28248g.onAdClicked();
            }
            TaxVideoActivity.this.m37836b(c28219a, c28237j);
        }

        @Override // com.taurusx.tax.p604i.C28445h.InterfaceC28446a
        /* renamed from: a */
        public boolean mo37823a(String str) {
            LogUtil.m37900v("TaxVideoActivity", "onJump :" + str);
            if (!TextUtils.isEmpty(str)) {
                TaxVideoActivity taxVideoActivity = TaxVideoActivity.this;
                if (taxVideoActivity.f74255j0) {
                    return taxVideoActivity.m37845a(taxVideoActivity, str, this.f74274a.f73353b);
                }
                if (!taxVideoActivity.f74232W) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("html", this.f74275b.f73230a);
                        C28231g.m38380a(TaxVideoActivity.this.f74258l.getContext(), this.f74275b.f73235f, "AUTO_JUMP", 0L, TaxVideoActivity.this.f74218I, jSONObject, (C28231g.InterfaceC28234c) null);
                        TaxVideoActivity.this.f74232W = true;
                    } catch (JSONException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            return false;
        }

        @Override // com.taurusx.tax.p604i.C28445h.InterfaceC28446a
        /* renamed from: b */
        public void mo37822b() {
        }

        @Override // com.taurusx.tax.p604i.C28445h.InterfaceC28446a
        /* renamed from: a */
        public void mo37825a() {
            TaxVideoActivity taxVideoActivity = TaxVideoActivity.this;
            C28210c.C28211a c28211a = taxVideoActivity.f74267u;
            if (c28211a == null || c28211a.f73242m != 7) {
                return;
            }
            taxVideoActivity.f74224O = C28207b.m38461a(TaurusXAds.getContext(), TaxVideoActivity.this.f74258l, "", CreativeType.HTML_DISPLAY);
            TaxVideoActivity taxVideoActivity2 = TaxVideoActivity.this;
            AdSession adSession = taxVideoActivity2.f74224O;
            if (adSession != null) {
                adSession.registerAdView(taxVideoActivity2.f74258l);
                TaxVideoActivity.this.f74224O.start();
                TaxVideoActivity taxVideoActivity3 = TaxVideoActivity.this;
                taxVideoActivity3.f74225P = AdEvents.createAdEvents(taxVideoActivity3.f74224O);
                AdEvents adEvents = TaxVideoActivity.this.f74225P;
                if (adEvents != null) {
                    adEvents.loaded();
                    TaxVideoActivity.this.f74225P.impressionOccurred();
                }
            }
        }
    }

    /* renamed from: b */
    public final void m37837b() {
        if (C28549x.m37963b(this.f74218I)) {
            m37831c();
            return;
        }
        LogUtil.m37900v("TaxVideoActivity", "checkVisible:");
        C28521h.m38004a(new RunnableC28457q(this), 1000L);
    }

    /* renamed from: b */
    public final void m37835b(C28236i c28236i, C28210c.C28211a c28211a) {
        this.f74258l = new C28447i(this, c28211a != null && c28211a.f73242m == 7);
        m37830c(c28236i, c28211a);
    }

    /* renamed from: a */
    public void m37847a(Activity activity) {
        activity.getWindow().getDecorView().setSystemUiVisibility(4102);
        ActionBar actionBar = activity.getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        activity.getWindow().setFlags(1024, 1024);
    }

    /* renamed from: b */
    public void m37836b(C28219a c28219a, C28237j c28237j) {
        VastConfig vastConfig;
        if (!this.f74230U && (vastConfig = this.f74268v) != null) {
            Set<VastCompanionAdConfig> vastCompanionAdConfigs = vastConfig.getVastCompanionAdConfigs();
            if (vastCompanionAdConfigs != null) {
                for (VastCompanionAdConfig vastCompanionAdConfig : vastCompanionAdConfigs) {
                    if (vastCompanionAdConfig != null) {
                        List<VastTracker> clickTrackers = vastCompanionAdConfig.getClickTrackers();
                        ArrayList arrayList = new ArrayList();
                        for (VastTracker vastTracker : clickTrackers) {
                            arrayList.add(vastTracker.getContent());
                        }
                        C28231g.m38377a(this, C28529m.m37998a(arrayList, c28219a), "ad-companion-click");
                    }
                }
            }
            this.f74230U = true;
        }
        m37844a(c28219a, c28237j);
    }

    /* renamed from: a */
    public Bitmap m37848a() {
        C28210c.C28214b c28214b;
        C28210c.C28214b.C28216b c28216b;
        C28210c.C28214b c28214b2;
        C28210c.C28214b.C28216b c28216b2;
        VastConfig vastConfig = this.f74268v;
        String str = "";
        String diskMediaFileUrl = vastConfig != null ? vastConfig.getDiskMediaFileUrl() : "";
        C28210c c28210c = this.f74218I;
        if (c28210c == null || (c28214b2 = c28210c.f73228d) == null || (c28216b2 = c28214b2.f73249b) == null || !c28216b2.f73267o) {
            str = diskMediaFileUrl;
        } else {
            VastConfig vastConfig2 = this.f74268v;
            if (vastConfig2 != null) {
                str = vastConfig2.getNetworkMediaFileUrl();
            }
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        C28210c c28210c2 = this.f74218I;
        if (c28210c2 != null && (c28214b = c28210c2.f73228d) != null && (c28216b = c28214b.f73249b) != null && c28216b.f73267o) {
            mediaMetadataRetriever.setDataSource(str, new HashMap());
        } else {
            mediaMetadataRetriever.setDataSource(str);
        }
        Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime();
        mediaMetadataRetriever.release();
        return frameAtTime;
    }

    /* renamed from: b */
    public static void m37834b(TaxVideoActivity taxVideoActivity) {
        taxVideoActivity.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(taxVideoActivity.f74238b);
        arrayList.add(taxVideoActivity.f74240c);
        arrayList.add(taxVideoActivity.f74242d);
        arrayList.add(taxVideoActivity.f74246f);
        arrayList.add(taxVideoActivity.f74248g);
        arrayList.add(taxVideoActivity.f74250h);
        arrayList.add(taxVideoActivity.f74266t);
        arrayList.add(taxVideoActivity.findViewById(C28154R.C28157id.tax_progress_root));
        arrayList.add(taxVideoActivity.findViewById(C28154R.C28157id.layout_ad));
        arrayList.add(taxVideoActivity.findViewById(C28154R.C28157id.tv_tips));
        arrayList.add(taxVideoActivity.f74254j);
        arrayList.add(taxVideoActivity.f74259m);
        arrayList.add(taxVideoActivity.f74265s);
        if (taxVideoActivity.f74224O != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                if (view != null) {
                    taxVideoActivity.f74224O.addFriendlyObstruction(view, FriendlyObstructionPurpose.OTHER, null);
                }
            }
        }
    }

    /* renamed from: c */
    public static void m37829c(TaxVideoActivity taxVideoActivity) {
        if (taxVideoActivity.f74231V || !taxVideoActivity.f74212C || taxVideoActivity.f74272z == null || taxVideoActivity.f74211B != 1) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("extra", taxVideoActivity.f74219J);
            jSONObject.put("totalDuration", taxVideoActivity.f74252i.getVideoLength());
            C28231g.m38380a(taxVideoActivity, taxVideoActivity.f74267u.f73235f, "REWARDED", 0L, taxVideoActivity.f74218I, jSONObject, new C28458r(taxVideoActivity));
            taxVideoActivity.f74231V = true;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static void m37842a(TaxVideoActivity taxVideoActivity) {
        taxVideoActivity.getClass();
        LogUtil.m37900v("TaxVideoActivity", "checkVisible:");
        C28521h.m38004a(new RunnableC28457q(taxVideoActivity), 1000L);
    }

    /* renamed from: a */
    public final void m37843a(C28236i c28236i, C28210c.C28211a c28211a) {
        boolean z = c28211a != null && c28211a.f73242m == 7;
        C28363r0 c28363r0 = new C28363r0(this, C28363r0.EnumC28366c.ENABLED, C28363r0.EnumC28370g.AD_CONTROLLED, C28363r0.EnumC28373j.INLINE);
        c28363r0.f73635p = z;
        this.f74258l = c28363r0;
        m37830c(c28236i, c28211a);
    }

    /* renamed from: c */
    public final void m37830c(C28236i c28236i, C28210c.C28211a c28211a) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 17;
        this.f74254j.addView(this.f74258l, layoutParams);
        this.f74258l.setWebViewListener(new C28590b(c28236i, c28211a));
    }

    /* renamed from: a */
    public final void m37838a(String str) {
        C28236i c28236i = this.f74269w;
        if (c28236i != null) {
            c28236i.m38372a(4);
        }
        if (this.f74268v != null) {
            HashSet hashSet = new HashSet();
            Iterator<VastTracker> it = this.f74268v.getErrorTrackers().iterator();
            while (it.hasNext()) {
                VastTracker next = it.next();
                if (!TextUtils.isEmpty(next.getContent())) {
                    hashSet.add(next.getContent());
                }
            }
            C28207b.m38450a(hashSet, str, VastManager.getVastNetworkMediaUrl(this.f74268v));
        }
    }

    /* renamed from: a */
    public static void m37841a(TaxVideoActivity taxVideoActivity, int i) {
        if (taxVideoActivity.f74268v == null) {
            return;
        }
        C28435d.m38091a().m38090a(i, taxVideoActivity.f74268v);
    }

    /* renamed from: a */
    public final boolean m37845a(Context context, String str, String str2) {
        C28210c.C28211a c28211a = this.f74267u;
        String str3 = c28211a.f73240k;
        String str4 = c28211a.f73241l;
        if (!TextUtils.isEmpty(str3)) {
            if (C28518e.m38037a(context, str3)) {
                C28518e.m38023b(context, str3);
                return true;
            } else if (!TextUtils.isEmpty(str4)) {
                C28518e.m38023b(context, str4);
                return true;
            }
        }
        try {
        } catch (Throwable th) {
            LogUtil.m37900v("TaxVideoActivity", "onClickEvent:" + th.getMessage());
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
                m37846a(context, str);
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public void m37844a(C28219a c28219a, C28237j c28237j) {
        if (this.f74229T || this.f74267u == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        C28210c.C28211a c28211a = this.f74267u;
        if (c28211a != null) {
            arrayList.addAll(c28211a.f73237h);
        }
        VastConfig vastConfig = this.f74268v;
        if (vastConfig != null) {
            Iterator<VastTracker> it = vastConfig.getClickTrackers().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getContent());
            }
        }
        C28231g.m38377a(this, C28529m.m37998a(arrayList, c28219a), "ad-click");
        C28231g.m38380a(this, this.f74267u.f73235f, "CLICK", 0L, this.f74218I, C28231g.m38375a(c28219a), (C28231g.InterfaceC28234c) null);
        this.f74229T = true;
        this.f74269w.m38369a(c28219a, c28237j);
        C28206a.m38470e().f73193i.m38313a("CLICK", this.f74270x);
    }
}
