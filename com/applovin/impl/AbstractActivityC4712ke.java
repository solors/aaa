package com.applovin.impl;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.AbstractC5223r;
import com.applovin.impl.AbstractView$OnClickListenerC4251dc;
import com.applovin.impl.C4648je;
import com.applovin.impl.C4771le;
import com.applovin.impl.sdk.C5416j;
import com.applovin.mediation.MaxDebuggerMultiAdActivity;
import com.applovin.sdk.C6200R;

/* renamed from: com.applovin.impl.ke */
/* loaded from: classes2.dex */
public abstract class AbstractActivityC4712ke extends AbstractActivityC5263re {

    /* renamed from: a */
    private C4771le f7542a;

    /* renamed from: b */
    private ListView f7543b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.applovin.impl.ke$a */
    /* loaded from: classes2.dex */
    public class C4713a implements AbstractView$OnClickListenerC4251dc.InterfaceC4252a {

        /* renamed from: a */
        final /* synthetic */ C4648je f7544a;

        /* renamed from: com.applovin.impl.ke$a$a */
        /* loaded from: classes2.dex */
        class C4714a implements AbstractC5223r.InterfaceC5225b {
            C4714a() {
            }

            @Override // com.applovin.impl.AbstractC5223r.InterfaceC5225b
            /* renamed from: a */
            public void mo93279a(MaxDebuggerMultiAdActivity maxDebuggerMultiAdActivity) {
                maxDebuggerMultiAdActivity.initialize(C4713a.this.f7544a);
            }
        }

        C4713a(C4648je c4648je) {
            this.f7544a = c4648je;
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc.InterfaceC4252a
        /* renamed from: a */
        public void mo93836a(C4708kb c4708kb, C4176cc c4176cc) {
            if (c4708kb.m97991b() == C4771le.EnumC4772a.TEST_ADS.ordinal()) {
                C5416j m98202o = this.f7544a.m98202o();
                C4648je.EnumC4650b m98192y = this.f7544a.m98192y();
                if (AbstractActivityC4712ke.this.f7542a.m97715a(c4708kb)) {
                    if (C4648je.EnumC4650b.READY == m98192y) {
                        AbstractC5223r.m96217a(AbstractActivityC4712ke.this, MaxDebuggerMultiAdActivity.class, m98202o.m95100e(), new C4714a());
                        return;
                    } else if (C4648je.EnumC4650b.DISABLED == m98192y) {
                        m98202o.m95076k0().m93414a();
                        AbstractC5927yp.m92679a(c4176cc.m100218c(), c4176cc.m100219b(), AbstractActivityC4712ke.this);
                        return;
                    } else {
                        AbstractC5927yp.m92679a(c4176cc.m100218c(), c4176cc.m100219b(), AbstractActivityC4712ke.this);
                        return;
                    }
                }
                AbstractC5927yp.m92679a(c4176cc.m100218c(), c4176cc.m100219b(), AbstractActivityC4712ke.this);
                return;
            }
            AbstractC5927yp.m92679a(c4176cc.m100218c(), c4176cc.m100219b(), AbstractActivityC4712ke.this);
        }
    }

    public AbstractActivityC4712ke() {
        this.communicatorTopics.add("adapter_initialization_status");
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    @Override // com.applovin.impl.AbstractActivityC5263re
    protected C5416j getSdk() {
        C4771le c4771le = this.f7542a;
        if (c4771le != null) {
            return c4771le.m97701h().m98202o();
        }
        return null;
    }

    public void initialize(C4648je c4648je) {
        setTitle(c4648je.m98210g());
        C4771le c4771le = new C4771le(c4648je, this);
        this.f7542a = c4771le;
        c4771le.m99823a(new C4713a(c4648je));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.AbstractActivityC5263re, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C6200R.C6206layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(C6200R.C6205id.listView);
        this.f7543b = listView;
        listView.setAdapter((ListAdapter) this.f7542a);
    }

    @Override // com.applovin.impl.AbstractActivityC5263re, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (this.f7542a.m97701h().m98215b().equals(appLovinCommunicatorMessage.getMessageData().getString("adapter_class", ""))) {
            this.f7542a.m97698k();
            this.f7542a.m99821c();
        }
    }
}
