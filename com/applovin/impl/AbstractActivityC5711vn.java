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

/* renamed from: com.applovin.impl.vn */
/* loaded from: classes2.dex */
public abstract class AbstractActivityC5711vn extends AbstractActivityC5263re {

    /* renamed from: a */
    private C5416j f11507a;

    /* renamed from: b */
    private List f11508b;

    /* renamed from: c */
    private AbstractView$OnClickListenerC4251dc f11509c;

    /* renamed from: d */
    private List f11510d;

    /* renamed from: f */
    private ListView f11511f;

    /* renamed from: com.applovin.impl.vn$a */
    /* loaded from: classes2.dex */
    class C5712a extends AbstractView$OnClickListenerC4251dc {

        /* renamed from: f */
        final /* synthetic */ List f11512f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5712a(Context context, List list) {
            super(context);
            this.f11512f = list;
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc
        /* renamed from: a */
        protected C4176cc mo93837a() {
            return new C4176cc.C4178b(C4176cc.EnumC4179c.SECTION_CENTERED).m100198d("Select a network to load test ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").m100211a();
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc
        /* renamed from: b */
        protected int mo92914b() {
            return 1;
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc
        /* renamed from: c */
        protected List mo92913c(int i) {
            return AbstractActivityC5711vn.this.f11510d;
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc
        /* renamed from: d */
        protected int mo92911d(int i) {
            return this.f11512f.size();
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc
        /* renamed from: e */
        protected C4176cc mo92909e(int i) {
            return new C4398fj("TEST MODE NETWORKS");
        }
    }

    /* renamed from: com.applovin.impl.vn$b */
    /* loaded from: classes2.dex */
    class C5713b implements AbstractView$OnClickListenerC4251dc.InterfaceC4252a {

        /* renamed from: a */
        final /* synthetic */ List f11514a;

        /* renamed from: b */
        final /* synthetic */ C5416j f11515b;

        C5713b(List list, C5416j c5416j) {
            this.f11514a = list;
            this.f11515b = c5416j;
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc.InterfaceC4252a
        /* renamed from: a */
        public void mo93836a(C4708kb c4708kb, C4176cc c4176cc) {
            List m98196u = ((C4648je) this.f11514a.get(c4708kb.m97992a())).m98196u();
            if (m98196u.equals(this.f11515b.m95076k0().m93410b())) {
                this.f11515b.m95076k0().m93412a((List) null);
            } else {
                this.f11515b.m95076k0().m93412a(m98196u);
            }
            AbstractActivityC5711vn.this.f11509c.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.applovin.impl.vn$c */
    /* loaded from: classes2.dex */
    public class C5714c extends C4122bg {

        /* renamed from: p */
        final /* synthetic */ C4648je f11517p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5714c(C4648je c4648je, Context context, C4648je c4648je2) {
            super(c4648je, context);
            this.f11517p = c4648je2;
        }

        @Override // com.applovin.impl.C4122bg, com.applovin.impl.C4176cc
        /* renamed from: d */
        public int mo93835d() {
            if (this.f11517p.m98196u().equals(AbstractActivityC5711vn.this.f11507a.m95076k0().m93410b())) {
                return C6200R.C6203drawable.applovin_ic_check_mark_borderless;
            }
            return 0;
        }

        @Override // com.applovin.impl.C4122bg, com.applovin.impl.C4176cc
        /* renamed from: e */
        public int mo93834e() {
            if (this.f11517p.m98196u().equals(AbstractActivityC5711vn.this.f11507a.m95076k0().m93410b())) {
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
            return StringUtils.createSpannedString(this.f11517p.m98210g(), i, 18, 1);
        }
    }

    public AbstractActivityC5711vn() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    @Override // com.applovin.impl.AbstractActivityC5263re
    protected C5416j getSdk() {
        return this.f11507a;
    }

    public void initialize(List<C4648je> list, C5416j c5416j) {
        this.f11507a = c5416j;
        this.f11508b = list;
        this.f11510d = m93840a(list);
        C5712a c5712a = new C5712a(this, list);
        this.f11509c = c5712a;
        c5712a.m99823a(new C5713b(list, c5416j));
        this.f11509c.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.AbstractActivityC5263re, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Test Mode Network");
        setContentView(C6200R.C6206layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(C6200R.C6205id.listView);
        this.f11511f = listView;
        listView.setAdapter((ListAdapter) this.f11509c);
    }

    @Override // com.applovin.impl.AbstractActivityC5263re, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f11510d = m93840a(this.f11508b);
        this.f11509c.notifyDataSetChanged();
    }

    /* renamed from: a */
    private List m93840a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4648je c4648je = (C4648je) it.next();
            arrayList.add(new C5714c(c4648je, this, c4648je));
        }
        return arrayList;
    }
}
