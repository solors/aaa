package com.applovin.impl;

import android.app.Activity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity;
import com.applovin.impl.AbstractC5223r;
import com.applovin.impl.AbstractView$OnClickListenerC4251dc;
import com.applovin.impl.C5748w4;
import com.applovin.sdk.C6200R;

/* renamed from: com.applovin.impl.v4 */
/* loaded from: classes2.dex */
public abstract class AbstractActivityC5675v4 extends Activity {

    /* renamed from: a */
    private C5748w4 f11440a;

    /* renamed from: b */
    private FrameLayout f11441b;

    /* renamed from: c */
    private ListView f11442c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.applovin.impl.v4$a */
    /* loaded from: classes2.dex */
    public class C5676a implements AbstractView$OnClickListenerC4251dc.InterfaceC4252a {

        /* renamed from: a */
        final /* synthetic */ C5163q f11443a;

        /* renamed from: com.applovin.impl.v4$a$a */
        /* loaded from: classes2.dex */
        class C5677a implements AbstractC5223r.InterfaceC5225b {

            /* renamed from: a */
            final /* synthetic */ C4708kb f11445a;

            C5677a(C4708kb c4708kb) {
                this.f11445a = c4708kb;
            }

            @Override // com.applovin.impl.AbstractC5223r.InterfaceC5225b
            /* renamed from: a */
            public void mo93279a(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
                maxCreativeDebuggerDisplayedAdActivity.m94531a((C5679v6) AbstractActivityC5675v4.this.f11440a.m93707d().get(this.f11445a.m97992a()), AbstractActivityC5675v4.this.f11440a.m93706e());
            }
        }

        C5676a(C5163q c5163q) {
            this.f11443a = c5163q;
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc.InterfaceC4252a
        /* renamed from: a */
        public void mo93836a(C4708kb c4708kb, C4176cc c4176cc) {
            if (c4708kb.m97991b() != C5748w4.EnumC5749a.RECENT_ADS.ordinal()) {
                return;
            }
            AbstractC5223r.m96217a(AbstractActivityC5675v4.this, MaxCreativeDebuggerDisplayedAdActivity.class, this.f11443a, new C5677a(c4708kb));
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Creative Debugger");
        setContentView(C6200R.C6206layout.mediation_debugger_list_view);
        this.f11441b = (FrameLayout) findViewById(16908290);
        this.f11442c = (ListView) findViewById(C6200R.C6205id.listView);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        C5748w4 c5748w4 = this.f11440a;
        if (c5748w4 != null) {
            c5748w4.m99823a((AbstractView$OnClickListenerC4251dc.InterfaceC4252a) null);
            this.f11440a.m93704g();
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        C5748w4 c5748w4 = this.f11440a;
        if (c5748w4 == null) {
            finish();
            return;
        }
        this.f11442c.setAdapter((ListAdapter) c5748w4);
        C5748w4 c5748w42 = this.f11440a;
        if (c5748w42 != null && !c5748w42.m93706e().m95045v().m93291g()) {
            m93972a(C6200R.C6208string.applovin_creative_debugger_disabled_text);
            return;
        }
        C5748w4 c5748w43 = this.f11440a;
        if (c5748w43 != null && c5748w43.m93705f()) {
            m93972a(C6200R.C6208string.applovin_creative_debugger_no_ads_text);
        }
    }

    /* renamed from: a */
    public void m93970a(C5748w4 c5748w4, C5163q c5163q) {
        this.f11440a = c5748w4;
        c5748w4.m99823a(new C5676a(c5163q));
    }

    /* renamed from: a */
    private void m93972a(int i) {
        TextView textView = new TextView(this);
        textView.setGravity(17);
        textView.setTextSize(18.0f);
        textView.setText(i);
        this.f11441b.addView(textView, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f11441b.bringChildToFront(textView);
    }
}
