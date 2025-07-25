package com.applovin.impl;

import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.webkit.internal.AssetHelper;
import com.applovin.impl.AbstractC5223r;
import com.applovin.impl.AbstractView$OnClickListenerC4251dc;
import com.applovin.impl.C5506se;
import com.applovin.impl.sdk.C5416j;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitsListActivity;
import com.applovin.mediation.MaxDebuggerDetailActivity;
import com.applovin.mediation.MaxDebuggerTcfConsentStatusesListActivity;
import com.applovin.mediation.MaxDebuggerTcfInfoListActivity;
import com.applovin.mediation.MaxDebuggerTestLiveNetworkActivity;
import com.applovin.mediation.MaxDebuggerTestModeNetworkActivity;
import com.applovin.mediation.MaxDebuggerUnifiedFlowActivity;
import com.applovin.sdk.C6200R;

/* renamed from: com.applovin.impl.qe */
/* loaded from: classes2.dex */
public abstract class AbstractActivityC5180qe extends AbstractActivityC5263re {

    /* renamed from: a */
    private C5506se f9187a;

    /* renamed from: b */
    private DataSetObserver f9188b;

    /* renamed from: c */
    private FrameLayout f9189c;

    /* renamed from: d */
    private ListView f9190d;

    /* renamed from: f */
    private C5038o f9191f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.applovin.impl.qe$a */
    /* loaded from: classes2.dex */
    public class C5181a extends DataSetObserver {
        C5181a() {
            AbstractActivityC5180qe.this = r1;
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            AbstractActivityC5180qe.this.m96390a();
            AbstractActivityC5180qe abstractActivityC5180qe = AbstractActivityC5180qe.this;
            abstractActivityC5180qe.m96385b((Context) abstractActivityC5180qe);
        }
    }

    /* renamed from: com.applovin.impl.qe$b */
    /* loaded from: classes2.dex */
    public class C5182b implements AbstractView$OnClickListenerC4251dc.InterfaceC4252a {

        /* renamed from: a */
        final /* synthetic */ C5163q f9193a;

        /* renamed from: com.applovin.impl.qe$b$a */
        /* loaded from: classes2.dex */
        class C5183a implements AbstractC5223r.InterfaceC5225b {
            C5183a() {
                C5182b.this = r1;
            }

            @Override // com.applovin.impl.AbstractC5223r.InterfaceC5225b
            /* renamed from: a */
            public void mo93279a(MaxDebuggerUnifiedFlowActivity maxDebuggerUnifiedFlowActivity) {
                maxDebuggerUnifiedFlowActivity.initialize(AbstractActivityC5180qe.this.f9187a.m94640s());
            }
        }

        /* renamed from: com.applovin.impl.qe$b$b */
        /* loaded from: classes2.dex */
        class C5184b implements AbstractC5223r.InterfaceC5225b {
            C5184b() {
                C5182b.this = r1;
            }

            @Override // com.applovin.impl.AbstractC5223r.InterfaceC5225b
            /* renamed from: a */
            public void mo93279a(MaxDebuggerTcfInfoListActivity maxDebuggerTcfInfoListActivity) {
                maxDebuggerTcfInfoListActivity.initialize(AbstractActivityC5180qe.this.f9187a.m94640s());
            }
        }

        /* renamed from: com.applovin.impl.qe$b$c */
        /* loaded from: classes2.dex */
        class C5185c implements AbstractC5223r.InterfaceC5225b {
            C5185c() {
                C5182b.this = r1;
            }

            @Override // com.applovin.impl.AbstractC5223r.InterfaceC5225b
            /* renamed from: a */
            public void mo93279a(MaxDebuggerTcfConsentStatusesListActivity maxDebuggerTcfConsentStatusesListActivity) {
                maxDebuggerTcfConsentStatusesListActivity.initialize(AbstractActivityC5180qe.this.f9187a.m94640s());
            }
        }

        /* renamed from: com.applovin.impl.qe$b$d */
        /* loaded from: classes2.dex */
        class C5186d implements AbstractC5223r.InterfaceC5225b {
            C5186d() {
                C5182b.this = r1;
            }

            @Override // com.applovin.impl.AbstractC5223r.InterfaceC5225b
            /* renamed from: a */
            public void mo93279a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(AbstractActivityC5180qe.this.f9187a.m94654e(), false, AbstractActivityC5180qe.this.f9187a.m94640s());
            }
        }

        /* renamed from: com.applovin.impl.qe$b$e */
        /* loaded from: classes2.dex */
        class C5187e implements AbstractC5223r.InterfaceC5225b {
            C5187e() {
                C5182b.this = r1;
            }

            @Override // com.applovin.impl.AbstractC5223r.InterfaceC5225b
            /* renamed from: a */
            public void mo93279a(MaxDebuggerTestLiveNetworkActivity maxDebuggerTestLiveNetworkActivity) {
                maxDebuggerTestLiveNetworkActivity.initialize(AbstractActivityC5180qe.this.f9187a.m94649j(), AbstractActivityC5180qe.this.f9187a.m94638u(), AbstractActivityC5180qe.this.f9187a.m94640s());
            }
        }

        /* renamed from: com.applovin.impl.qe$b$f */
        /* loaded from: classes2.dex */
        class C5188f implements AbstractC5223r.InterfaceC5225b {
            C5188f() {
                C5182b.this = r1;
            }

            @Override // com.applovin.impl.AbstractC5223r.InterfaceC5225b
            /* renamed from: a */
            public void mo93279a(MaxDebuggerTestModeNetworkActivity maxDebuggerTestModeNetworkActivity) {
                maxDebuggerTestModeNetworkActivity.initialize(AbstractActivityC5180qe.this.f9187a.m94639t(), AbstractActivityC5180qe.this.f9187a.m94640s());
            }
        }

        /* renamed from: com.applovin.impl.qe$b$g */
        /* loaded from: classes2.dex */
        class C5189g implements AbstractC5223r.InterfaceC5225b {
            C5189g() {
                C5182b.this = r1;
            }

            @Override // com.applovin.impl.AbstractC5223r.InterfaceC5225b
            /* renamed from: a */
            public void mo93279a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(AbstractActivityC5180qe.this.f9187a.m94645n(), true, AbstractActivityC5180qe.this.f9187a.m94640s());
            }
        }

        /* renamed from: com.applovin.impl.qe$b$h */
        /* loaded from: classes2.dex */
        class C5190h implements AbstractC5223r.InterfaceC5225b {

            /* renamed from: a */
            final /* synthetic */ C4176cc f9202a;

            C5190h(C4176cc c4176cc) {
                C5182b.this = r1;
                this.f9202a = c4176cc;
            }

            @Override // com.applovin.impl.AbstractC5223r.InterfaceC5225b
            /* renamed from: a */
            public void mo93279a(MaxDebuggerDetailActivity maxDebuggerDetailActivity) {
                maxDebuggerDetailActivity.initialize(((C4122bg) this.f9202a).m100443r());
            }
        }

        C5182b(C5163q c5163q) {
            AbstractActivityC5180qe.this = r1;
            this.f9193a = c5163q;
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc.InterfaceC4252a
        /* renamed from: a */
        public void mo93836a(C4708kb c4708kb, C4176cc c4176cc) {
            int m97991b = c4708kb.m97991b();
            if (m97991b == C5506se.EnumC5511e.APP_INFO.ordinal()) {
                AbstractC5927yp.m92679a(c4176cc.m100218c(), c4176cc.m100219b(), AbstractActivityC5180qe.this);
            } else if (m97991b == C5506se.EnumC5511e.MAX.ordinal()) {
                if (AbstractActivityC5180qe.this.f9187a.m94672a(c4176cc)) {
                    AbstractC5223r.m96217a(AbstractActivityC5180qe.this, MaxDebuggerUnifiedFlowActivity.class, this.f9193a, new C5183a());
                } else {
                    AbstractC5927yp.m92679a(c4176cc.m100218c(), c4176cc.m100219b(), AbstractActivityC5180qe.this);
                }
            } else if (m97991b == C5506se.EnumC5511e.PRIVACY.ordinal()) {
                if (c4708kb.m97992a() == C5506se.EnumC5510d.CMP.ordinal()) {
                    if (StringUtils.isValidString(AbstractActivityC5180qe.this.f9187a.m94640s().m95079j0().m96255k())) {
                        AbstractC5223r.m96217a(AbstractActivityC5180qe.this, MaxDebuggerTcfInfoListActivity.class, this.f9193a, new C5184b());
                    } else {
                        AbstractC5927yp.m92679a(c4176cc.m100218c(), c4176cc.m100219b(), AbstractActivityC5180qe.this);
                    }
                } else if (c4708kb.m97992a() == C5506se.EnumC5510d.NETWORK_CONSENT_STATUSES.ordinal()) {
                    AbstractC5223r.m96217a(AbstractActivityC5180qe.this, MaxDebuggerTcfConsentStatusesListActivity.class, this.f9193a, new C5185c());
                }
            } else if (m97991b == C5506se.EnumC5511e.ADS.ordinal()) {
                if (c4708kb.m97992a() == C5506se.EnumC5508b.AD_UNITS.ordinal()) {
                    if (AbstractActivityC5180qe.this.f9187a.m94654e().size() > 0) {
                        AbstractC5223r.m96217a(AbstractActivityC5180qe.this, MaxDebuggerAdUnitsListActivity.class, this.f9193a, new C5186d());
                    } else {
                        AbstractC5927yp.m92679a("No live ad units", "Please setup or enable your MAX ad units on https://applovin.com.", AbstractActivityC5180qe.this);
                    }
                } else if (c4708kb.m97992a() == C5506se.EnumC5508b.SELECT_LIVE_NETWORKS.ordinal()) {
                    if (AbstractActivityC5180qe.this.f9187a.m94649j().size() <= 0 && AbstractActivityC5180qe.this.f9187a.m94638u().size() <= 0) {
                        AbstractC5927yp.m92679a("Complete Integrations", "Please complete integrations in order to access this.", AbstractActivityC5180qe.this);
                    } else if (AbstractActivityC5180qe.this.f9187a.m94640s().m95076k0().m93409c()) {
                        AbstractC5927yp.m92679a("Restart Required", c4176cc.m100219b(), AbstractActivityC5180qe.this);
                    } else {
                        AbstractC5223r.m96217a(AbstractActivityC5180qe.this, MaxDebuggerTestLiveNetworkActivity.class, this.f9193a, new C5187e());
                    }
                } else if (c4708kb.m97992a() == C5506se.EnumC5508b.SELECT_TEST_MODE_NETWORKS.ordinal()) {
                    if (!AbstractActivityC5180qe.this.f9187a.m94640s().m95076k0().m93409c()) {
                        AbstractActivityC5180qe.this.getSdk().m95076k0().m93414a();
                        AbstractC5927yp.m92679a("Restart Required", c4176cc.m100219b(), AbstractActivityC5180qe.this);
                    } else if (AbstractActivityC5180qe.this.f9187a.m94639t().size() > 0) {
                        AbstractC5223r.m96217a(AbstractActivityC5180qe.this, MaxDebuggerTestModeNetworkActivity.class, this.f9193a, new C5188f());
                    } else {
                        AbstractC5927yp.m92679a("Complete Integrations", "Please complete integrations in order to access this.", AbstractActivityC5180qe.this);
                    }
                } else if (c4708kb.m97992a() == C5506se.EnumC5508b.INITIALIZATION_AD_UNITS.ordinal()) {
                    AbstractC5223r.m96217a(AbstractActivityC5180qe.this, MaxDebuggerAdUnitsListActivity.class, this.f9193a, new C5189g());
                }
            } else if ((m97991b == C5506se.EnumC5511e.MICRO_SDK_PARTNER_NETWORKS.ordinal() || m97991b == C5506se.EnumC5511e.INCOMPLETE_NETWORKS.ordinal() || m97991b == C5506se.EnumC5511e.COMPLETED_NETWORKS.ordinal()) && (c4176cc instanceof C4122bg)) {
                AbstractC5223r.m96217a(AbstractActivityC5180qe.this, MaxDebuggerDetailActivity.class, this.f9193a, new C5190h(c4176cc));
            }
        }
    }

    /* renamed from: c */
    private void m96382c() {
        m96390a();
        C5038o c5038o = new C5038o(this, 50, 16842874);
        this.f9191f = c5038o;
        c5038o.setColor(-3355444);
        this.f9189c.addView(this.f9191f, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f9189c.bringChildToFront(this.f9191f);
        this.f9191f.m96904a();
    }

    @Override // com.applovin.impl.AbstractActivityC5263re
    protected C5416j getSdk() {
        C5506se c5506se = this.f9187a;
        if (c5506se != null) {
            return c5506se.m94640s();
        }
        return null;
    }

    @Override // com.applovin.impl.AbstractActivityC5263re, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Mediation Debugger");
        setContentView(C6200R.C6206layout.mediation_debugger_list_view);
        this.f9189c = (FrameLayout) findViewById(16908290);
        ListView listView = (ListView) findViewById(C6200R.C6205id.listView);
        this.f9190d = listView;
        listView.setAdapter((ListAdapter) this.f9187a);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C6200R.C6207menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    @Override // com.applovin.impl.AbstractActivityC5263re, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C5506se c5506se = this.f9187a;
        if (c5506se != null) {
            c5506se.unregisterDataSetObserver(this.f9188b);
            this.f9187a.m99823a((AbstractView$OnClickListenerC4251dc.InterfaceC4252a) null);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C6200R.C6205id.action_share == menuItem.getItemId()) {
            m96386b();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        C5506se c5506se = this.f9187a;
        if (c5506se != null && !c5506se.m94637v()) {
            m96382c();
        }
    }

    public void setListAdapter(C5506se c5506se, C5163q c5163q) {
        DataSetObserver dataSetObserver;
        C5506se c5506se2 = this.f9187a;
        if (c5506se2 != null && (dataSetObserver = this.f9188b) != null) {
            c5506se2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f9187a = c5506se;
        this.f9188b = new C5181a();
        m96385b((Context) this);
        this.f9187a.registerDataSetObserver(this.f9188b);
        this.f9187a.m99823a(new C5182b(c5163q));
    }

    /* renamed from: a */
    public /* synthetic */ void m96389a(Context context) {
        AbstractC5927yp.m92679a(this.f9187a.m94651h(), this.f9187a.m94652g(), context);
    }

    /* renamed from: b */
    public void m96385b(final Context context) {
        if (!StringUtils.isValidString(this.f9187a.m94652g()) || this.f9187a.m94656d()) {
            return;
        }
        this.f9187a.m94658b(true);
        runOnUiThread(new Runnable() { // from class: com.applovin.impl.g10
            {
                AbstractActivityC5180qe.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractActivityC5180qe.this.m96389a(context);
            }
        });
    }

    /* renamed from: a */
    public void m96390a() {
        C5038o c5038o = this.f9191f;
        if (c5038o != null) {
            c5038o.m96903b();
            this.f9189c.removeView(this.f9191f);
            this.f9191f = null;
        }
    }

    /* renamed from: b */
    private void m96386b() {
        String m94644o = this.f9187a.m94644o();
        if (TextUtils.isEmpty(m94644o)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        intent.putExtra("android.intent.extra.TEXT", m94644o);
        intent.putExtra("android.intent.extra.TITLE", "Mediation Debugger logs");
        intent.putExtra("android.intent.extra.SUBJECT", "MAX Mediation Debugger logs");
        startActivity(Intent.createChooser(intent, null));
    }
}
