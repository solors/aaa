package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.AbstractView$OnClickListenerC4251dc;
import com.applovin.impl.C4176cc;
import com.applovin.impl.sdk.C5416j;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.C6200R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.applovin.impl.un */
/* loaded from: classes2.dex */
public abstract class AbstractActivityC5648un extends AbstractActivityC5263re {

    /* renamed from: a */
    private C5416j f11337a;

    /* renamed from: b */
    private List f11338b;

    /* renamed from: c */
    private List f11339c;

    /* renamed from: d */
    private AbstractView$OnClickListenerC4251dc f11340d;

    /* renamed from: f */
    private List f11341f;

    /* renamed from: g */
    private List f11342g;

    /* renamed from: h */
    private ListView f11343h;

    /* renamed from: com.applovin.impl.un$a */
    /* loaded from: classes2.dex */
    class C5649a extends AbstractView$OnClickListenerC4251dc {
        C5649a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc
        /* renamed from: a */
        protected C4176cc mo93837a() {
            return new C4176cc.C4178b(C4176cc.EnumC4179c.SECTION_CENTERED).m100198d("Select a network to load ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").m100211a();
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc
        /* renamed from: b */
        protected int mo92914b() {
            return EnumC5651c.COUNT.ordinal();
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc
        /* renamed from: c */
        protected List mo92913c(int i) {
            if (i != EnumC5651c.BIDDERS.ordinal()) {
                return AbstractActivityC5648un.this.f11342g;
            }
            return AbstractActivityC5648un.this.f11341f;
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc
        /* renamed from: d */
        protected int mo92911d(int i) {
            if (i == EnumC5651c.BIDDERS.ordinal()) {
                return AbstractActivityC5648un.this.f11341f.size();
            }
            return AbstractActivityC5648un.this.f11342g.size();
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc
        /* renamed from: e */
        protected C4176cc mo92909e(int i) {
            if (i == EnumC5651c.BIDDERS.ordinal()) {
                return new C4398fj("BIDDERS");
            }
            return new C4398fj("WATERFALL");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.applovin.impl.un$b */
    /* loaded from: classes2.dex */
    public class C5650b extends C4122bg {

        /* renamed from: p */
        final /* synthetic */ C4582ic f11345p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5650b(C4648je c4648je, Context context, C4582ic c4582ic) {
            super(c4648je, context);
            this.f11345p = c4582ic;
        }

        @Override // com.applovin.impl.C4122bg, com.applovin.impl.C4176cc
        /* renamed from: d */
        public int mo93835d() {
            if (AbstractActivityC5648un.this.f11337a.m95076k0().m93410b() != null && AbstractActivityC5648un.this.f11337a.m95076k0().m93410b().equals(this.f11345p.m98447b())) {
                return C6200R.C6203drawable.applovin_ic_check_mark_borderless;
            }
            return 0;
        }

        @Override // com.applovin.impl.C4122bg, com.applovin.impl.C4176cc
        /* renamed from: e */
        public int mo93834e() {
            if (AbstractActivityC5648un.this.f11337a.m95076k0().m93410b() != null && AbstractActivityC5648un.this.f11337a.m95076k0().m93410b().equals(this.f11345p.m98447b())) {
                return -16776961;
            }
            return super.mo93834e();
        }

        @Override // com.applovin.impl.C4176cc
        /* renamed from: k */
        public SpannedString mo93833k() {
            int i;
            if (mo92899o()) {
                i = ViewCompat.MEASURED_STATE_MASK;
            } else {
                i = -7829368;
            }
            return StringUtils.createSpannedString(this.f11345p.m98449a(), i, 18, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.applovin.impl.un$c */
    /* loaded from: classes2.dex */
    public enum EnumC5651c {
        BIDDERS,
        WATERFALL,
        COUNT
    }

    public AbstractActivityC5648un() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    @Override // com.applovin.impl.AbstractActivityC5263re
    protected C5416j getSdk() {
        return this.f11337a;
    }

    public void initialize(List<C4582ic> list, List<C4582ic> list2, final C5416j c5416j) {
        this.f11337a = c5416j;
        this.f11338b = list;
        this.f11339c = list2;
        this.f11341f = m94043a(list);
        this.f11342g = m94043a(list2);
        C5649a c5649a = new C5649a(this);
        this.f11340d = c5649a;
        c5649a.m99823a(new AbstractView$OnClickListenerC4251dc.InterfaceC4252a() { // from class: com.applovin.impl.t60
            @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc.InterfaceC4252a
            /* renamed from: a */
            public final void mo93836a(C4708kb c4708kb, C4176cc c4176cc) {
                AbstractActivityC5648un.this.m94046a(c5416j, c4708kb, c4176cc);
            }
        });
        this.f11340d.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.AbstractActivityC5263re, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Live Network");
        setContentView(C6200R.C6206layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(C6200R.C6205id.listView);
        this.f11343h = listView;
        listView.setAdapter((ListAdapter) this.f11340d);
    }

    @Override // com.applovin.impl.AbstractActivityC5263re, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f11341f = m94043a(this.f11338b);
        this.f11342g = m94043a(this.f11339c);
        this.f11340d.m99821c();
    }

    /* renamed from: a */
    private List m94043a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4582ic c4582ic = (C4582ic) it.next();
            arrayList.add(new C5650b(c4582ic.m98445d(), this, c4582ic));
        }
        return arrayList;
    }

    /* renamed from: a */
    private C4582ic m94047a(C4708kb c4708kb) {
        if (c4708kb.m97991b() == EnumC5651c.BIDDERS.ordinal()) {
            return (C4582ic) this.f11338b.get(c4708kb.m97992a());
        }
        return (C4582ic) this.f11339c.get(c4708kb.m97992a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m94046a(C5416j c5416j, C4708kb c4708kb, C4176cc c4176cc) {
        List m98447b = m94047a(c4708kb).m98447b();
        if (m98447b.equals(c5416j.m95076k0().m93410b())) {
            c5416j.m95076k0().m93412a((List) null);
        } else {
            c5416j.m95076k0().m93412a(m98447b);
        }
        this.f11340d.notifyDataSetChanged();
    }
}
