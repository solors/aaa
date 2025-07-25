package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.AbstractC5223r;
import com.applovin.impl.AbstractView$OnClickListenerC4251dc;
import com.applovin.impl.C4176cc;
import com.applovin.impl.C5280rn;
import com.applovin.impl.sdk.C5416j;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerCmpNetworksListActivity;
import com.applovin.mediation.MaxDebuggerTcfStringActivity;
import com.applovin.sdk.C6200R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.applovin.impl.pn */
/* loaded from: classes2.dex */
public abstract class AbstractActivityC5130pn extends AbstractActivityC5263re {

    /* renamed from: a */
    private C5416j f9023a;

    /* renamed from: b */
    private AbstractView$OnClickListenerC4251dc f9024b;

    /* renamed from: c */
    private final List f9025c = new ArrayList();

    /* renamed from: d */
    private final List f9026d = new ArrayList();

    /* renamed from: f */
    private final List f9027f = new ArrayList();

    /* renamed from: g */
    private final List f9028g = new ArrayList();

    /* renamed from: h */
    private final List f9029h = new ArrayList();

    /* renamed from: com.applovin.impl.pn$a */
    /* loaded from: classes2.dex */
    class C5131a extends AbstractView$OnClickListenerC4251dc {
        C5131a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc
        /* renamed from: b */
        protected int mo92914b() {
            return EnumC5137e.values().length;
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc
        /* renamed from: c */
        protected List mo92913c(int i) {
            return i == EnumC5137e.IAB_TCF_PARAMETERS.ordinal() ? AbstractActivityC5130pn.this.m96521c() : AbstractActivityC5130pn.this.m96529a();
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc
        /* renamed from: d */
        protected int mo92911d(int i) {
            if (i == EnumC5137e.IAB_TCF_PARAMETERS.ordinal()) {
                return EnumC5136d.values().length;
            }
            return EnumC5135c.values().length;
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc
        /* renamed from: e */
        protected C4176cc mo92909e(int i) {
            if (i == EnumC5137e.IAB_TCF_PARAMETERS.ordinal()) {
                return new C4398fj("IAB TCF Parameters");
            }
            return new C4398fj("CMP CONFIGURATION");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.applovin.impl.pn$b */
    /* loaded from: classes2.dex */
    public class C5132b implements AbstractView$OnClickListenerC4251dc.InterfaceC4252a {

        /* renamed from: a */
        final /* synthetic */ SharedPreferences$OnSharedPreferenceChangeListenerC5208qn f9031a;

        /* renamed from: b */
        final /* synthetic */ C5416j f9032b;

        /* renamed from: com.applovin.impl.pn$b$a */
        /* loaded from: classes2.dex */
        class C5133a implements AbstractC5223r.InterfaceC5225b {

            /* renamed from: a */
            final /* synthetic */ String f9034a;

            /* renamed from: b */
            final /* synthetic */ String f9035b;

            C5133a(String str, String str2) {
                this.f9034a = str;
                this.f9035b = str2;
            }

            @Override // com.applovin.impl.AbstractC5223r.InterfaceC5225b
            /* renamed from: a */
            public void mo93279a(MaxDebuggerTcfStringActivity maxDebuggerTcfStringActivity) {
                maxDebuggerTcfStringActivity.initialize(this.f9034a, this.f9035b, C5132b.this.f9032b);
            }
        }

        /* renamed from: com.applovin.impl.pn$b$b */
        /* loaded from: classes2.dex */
        class C5134b implements AbstractC5223r.InterfaceC5225b {
            C5134b() {
            }

            @Override // com.applovin.impl.AbstractC5223r.InterfaceC5225b
            /* renamed from: a */
            public void mo93279a(MaxDebuggerCmpNetworksListActivity maxDebuggerCmpNetworksListActivity) {
                maxDebuggerCmpNetworksListActivity.initialize(AbstractActivityC5130pn.this.f9027f, AbstractActivityC5130pn.this.f9028g, AbstractActivityC5130pn.this.f9025c, AbstractActivityC5130pn.this.f9026d, AbstractActivityC5130pn.this.f9029h, C5132b.this.f9032b);
            }
        }

        C5132b(SharedPreferences$OnSharedPreferenceChangeListenerC5208qn sharedPreferences$OnSharedPreferenceChangeListenerC5208qn, C5416j c5416j) {
            this.f9031a = sharedPreferences$OnSharedPreferenceChangeListenerC5208qn;
            this.f9032b = c5416j;
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc.InterfaceC4252a
        /* renamed from: a */
        public void mo93836a(C4708kb c4708kb, C4176cc c4176cc) {
            String m94076a;
            String m96267c;
            if (c4708kb.m97991b() == EnumC5137e.IAB_TCF_PARAMETERS.ordinal()) {
                if (c4708kb.m97992a() == EnumC5136d.TC_STRING.ordinal()) {
                    m94076a = C5639uj.f11303s.m94076a();
                    m96267c = this.f9031a.m96255k();
                } else {
                    m94076a = C5639uj.f11304t.m94076a();
                    m96267c = this.f9031a.m96267c();
                }
                AbstractC5223r.m96217a(AbstractActivityC5130pn.this, MaxDebuggerTcfStringActivity.class, this.f9032b.m95100e(), new C5133a(m94076a, m96267c));
            } else if (c4708kb.m97992a() == EnumC5135c.CONFIGURED_NETWORKS.ordinal()) {
                AbstractC5223r.m96217a(AbstractActivityC5130pn.this, MaxDebuggerCmpNetworksListActivity.class, this.f9032b.m95100e(), new C5134b());
            } else {
                AbstractC5927yp.m92679a(c4176cc.m100218c(), c4176cc.m100219b(), AbstractActivityC5130pn.this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.pn$c */
    /* loaded from: classes2.dex */
    public enum EnumC5135c {
        CMP_SDK_ID,
        CMP_SDK_VERSION,
        INSTRUCTIONS,
        CONFIGURED_NETWORKS
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.pn$d */
    /* loaded from: classes2.dex */
    public enum EnumC5136d {
        GDPR_APPLIES,
        TC_STRING,
        AC_STRING
    }

    /* renamed from: com.applovin.impl.pn$e */
    /* loaded from: classes2.dex */
    private enum EnumC5137e {
        IAB_TCF_PARAMETERS,
        CMP_CONFIGURATION
    }

    @Override // com.applovin.impl.AbstractActivityC5263re
    protected C5416j getSdk() {
        return this.f9023a;
    }

    public void initialize(C5416j c5416j) {
        this.f9023a = c5416j;
        SharedPreferences$OnSharedPreferenceChangeListenerC5208qn m95079j0 = c5416j.m95079j0();
        m96524a(m95079j0.m96257i());
        C5131a c5131a = new C5131a(this);
        this.f9024b = c5131a;
        c5131a.m99823a(new C5132b(m95079j0, c5416j));
        this.f9024b.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.AbstractActivityC5263re, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C6200R.C6206layout.mediation_debugger_list_view);
        setTitle("CMP (Consent Management Platform)");
        ((ListView) findViewById(C6200R.C6205id.listView)).setAdapter((ListAdapter) this.f9024b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.AbstractActivityC5263re, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AbstractView$OnClickListenerC4251dc abstractView$OnClickListenerC4251dc = this.f9024b;
        if (abstractView$OnClickListenerC4251dc != null) {
            abstractView$OnClickListenerC4251dc.m99823a((AbstractView$OnClickListenerC4251dc.InterfaceC4252a) null);
        }
    }

    /* renamed from: a */
    private void m96527a(C5280rn c5280rn, List list) {
        if (c5280rn.m95804d() != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (c5280rn.m95804d().equals(((C5280rn) it.next()).m95804d())) {
                    return;
                }
            }
        }
        list.add(c5280rn);
    }

    /* renamed from: b */
    private C4176cc m96523b() {
        C4176cc.C4178b m100206a;
        String m94076a = C5639uj.f11300p.m94076a();
        Integer m96261e = this.f9023a.m95079j0().m96261e();
        if (StringUtils.isValidString(this.f9023a.m95079j0().m96264d())) {
            m100206a = C4176cc.m100220a(C4176cc.EnumC4179c.RIGHT_DETAIL);
        } else {
            C4176cc.C4178b m100203b = C4176cc.m100220a(C4176cc.EnumC4179c.DETAIL).m100203b("Unknown CMP SDK ID");
            m100206a = m100203b.m100207a("Your integrated CMP might not be Google-certified. " + ("SharedPreferences value for key " + m94076a + " is " + m96261e + ".") + "\n\nIf you use Google AdMob or Google Ad Manager, make sure that the integrated CMP is included in the list of Google-certified CMPs at: https://support.google.com/admob/answer/13554116").m100210a(C6200R.C6203drawable.applovin_ic_warning).m100205b(AbstractC5539t3.m94551a(C6200R.C6202color.applovin_sdk_warningColor, this)).m100206a(true);
        }
        m100206a.m100198d(m94076a);
        m100206a.m100200c(m96261e != null ? m96261e.toString() : "No value set");
        m100206a.m100201c(m96261e != null ? ViewCompat.MEASURED_STATE_MASK : SupportMenu.CATEGORY_MASK);
        return m100206a.m100211a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public List m96521c() {
        ArrayList arrayList = new ArrayList(EnumC5136d.values().length);
        Integer m96259g = this.f9023a.m95079j0().m96259g();
        String m96255k = this.f9023a.m95079j0().m96255k();
        String m96267c = this.f9023a.m95079j0().m96267c();
        arrayList.add(m96526a(C5639uj.f11302r.m94076a(), m96259g));
        arrayList.add(m96525a(C5639uj.f11303s.m94076a(), m96255k, !AbstractC5574tn.m94380b(m96255k)));
        arrayList.add(m96525a(C5639uj.f11304t.m94076a(), m96267c, false));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public List m96529a() {
        String str;
        ArrayList arrayList = new ArrayList(EnumC5135c.values().length);
        int size = this.f9027f.size() + this.f9028g.size();
        arrayList.add(m96523b());
        arrayList.add(m96526a(C5639uj.f11301q.m94076a(), this.f9023a.m95079j0().m96260f()));
        arrayList.add(C4176cc.m100220a(C4176cc.EnumC4179c.DETAIL).m100198d("To check which networks are missing from your CMP, first make sure that you have granted consent to all networks through your CMP flow. Then add the following networks to your CMP network list.").m100211a());
        C4176cc.C4178b m100198d = C4176cc.m100220a(C4176cc.EnumC4179c.RIGHT_DETAIL).m100198d("Configured CMP Networks");
        if (size > 0) {
            str = "Missing " + size + " network(s)";
        } else {
            str = "";
        }
        arrayList.add(m100198d.m100200c(str).m100201c(size > 0 ? SupportMenu.CATEGORY_MASK : ViewCompat.MEASURED_STATE_MASK).m100209a(this).m100206a(true).m100211a());
        return arrayList;
    }

    /* renamed from: a */
    private C4176cc m96525a(String str, String str2, boolean z) {
        boolean isValidString = StringUtils.isValidString(str2);
        if (isValidString && str2.length() > 35) {
            str2 = str2.substring(0, 35) + APSSharedUtil.TRUNCATE_SEPARATOR;
        }
        C4176cc.C4178b m100198d = C4176cc.m100220a(C4176cc.EnumC4179c.DETAIL).m100198d(str);
        if (!isValidString) {
            str2 = "No value set";
        }
        C4176cc.C4178b m100206a = m100198d.m100200c(str2).m100201c(z ? SupportMenu.CATEGORY_MASK : ViewCompat.MEASURED_STATE_MASK).m100206a(isValidString);
        if (isValidString) {
            m100206a.m100209a(this);
        }
        return m100206a.m100211a();
    }

    /* renamed from: a */
    private C4176cc m96526a(String str, Integer num) {
        return C4176cc.m100220a(C4176cc.EnumC4179c.RIGHT_DETAIL).m100198d(str).m100200c(num != null ? num.toString() : "No value set").m100201c(num != null ? ViewCompat.MEASURED_STATE_MASK : SupportMenu.CATEGORY_MASK).m100211a();
    }

    /* renamed from: a */
    private void m96524a(List list) {
        boolean m96270b = this.f9023a.m95079j0().m96270b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5280rn c5280rn = (C5280rn) it.next();
            if (c5280rn.m95802f() == C5280rn.EnumC5281a.TCF_VENDOR) {
                if (Boolean.TRUE.equals(c5280rn.m95808a())) {
                    m96527a(c5280rn, this.f9025c);
                } else {
                    m96527a(c5280rn, this.f9027f);
                }
            } else if (c5280rn.m95802f() != C5280rn.EnumC5281a.ATP_NETWORK) {
                this.f9029h.add(c5280rn);
            } else if (m96270b) {
                if (Boolean.TRUE.equals(c5280rn.m95808a())) {
                    m96527a(c5280rn, this.f9026d);
                } else {
                    m96527a(c5280rn, this.f9028g);
                }
            } else {
                this.f9029h.add(c5280rn);
            }
        }
    }
}
