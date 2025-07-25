package sg.bigo.ads.p881a.p882a;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import sg.bigo.ads.p881a.p882a.C42766b;

/* renamed from: sg.bigo.ads.a.a.a */
/* loaded from: classes10.dex */
public final class C42762a implements InterfaceC42769d {

    /* renamed from: a */
    public CustomTabsClient f111950a;

    /* renamed from: b */
    public CustomTabsServiceConnection f111951b;

    /* renamed from: c */
    public InterfaceC42764a f111952c;

    /* renamed from: d */
    public CustomTabsCallback f111953d;

    /* renamed from: e */
    private CustomTabsSession f111954e;

    /* renamed from: sg.bigo.ads.a.a.a$a */
    /* loaded from: classes10.dex */
    public interface InterfaceC42764a {
        /* renamed from: c */
        void mo6615c();

        /* renamed from: d */
        void mo6613d();
    }

    /* renamed from: sg.bigo.ads.a.a.a$b */
    /* loaded from: classes10.dex */
    public interface InterfaceC42765b {
        /* renamed from: a */
        void mo6611a(Context context, C42766b.C42767a c42767a);

        /* renamed from: a */
        void mo6610a(C42766b.C42767a c42767a);
    }

    /* renamed from: a */
    public final CustomTabsSession m6626a() {
        CustomTabsSession newSession;
        CustomTabsClient customTabsClient = this.f111950a;
        if (customTabsClient != null) {
            if (this.f111954e == null) {
                newSession = customTabsClient.newSession(new CustomTabsCallback() { // from class: sg.bigo.ads.a.a.a.1
                    @Override // androidx.browser.customtabs.CustomTabsCallback
                    public final void extraCallback(String str, Bundle bundle) {
                        super.extraCallback(str, bundle);
                    }

                    @Override // androidx.browser.customtabs.CustomTabsCallback
                    public final void onMessageChannelReady(Bundle bundle) {
                        super.onMessageChannelReady(bundle);
                    }

                    @Override // androidx.browser.customtabs.CustomTabsCallback
                    public final void onNavigationEvent(int i, @Nullable Bundle bundle) {
                        super.onNavigationEvent(i, bundle);
                        CustomTabsCallback customTabsCallback = C42762a.this.f111953d;
                        if (customTabsCallback != null) {
                            customTabsCallback.onNavigationEvent(i, bundle);
                        }
                    }

                    @Override // androidx.browser.customtabs.CustomTabsCallback
                    public final void onPostMessage(String str, Bundle bundle) {
                        super.onPostMessage(str, bundle);
                    }

                    @Override // androidx.browser.customtabs.CustomTabsCallback
                    public final void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
                        super.onRelationshipValidationResult(i, uri, z, bundle);
                    }
                });
            }
            return this.f111954e;
        }
        newSession = null;
        this.f111954e = newSession;
        return this.f111954e;
    }

    @Override // sg.bigo.ads.p881a.p882a.InterfaceC42769d
    /* renamed from: b */
    public final void mo6622b() {
        this.f111950a = null;
        this.f111954e = null;
        InterfaceC42764a interfaceC42764a = this.f111952c;
        if (interfaceC42764a != null) {
            interfaceC42764a.mo6613d();
        }
    }

    @Override // sg.bigo.ads.p881a.p882a.InterfaceC42769d
    /* renamed from: a */
    public final void mo6623a(CustomTabsClient customTabsClient) {
        this.f111950a = customTabsClient;
        customTabsClient.warmup(0L);
        InterfaceC42764a interfaceC42764a = this.f111952c;
        if (interfaceC42764a != null) {
            interfaceC42764a.mo6615c();
        }
    }
}
