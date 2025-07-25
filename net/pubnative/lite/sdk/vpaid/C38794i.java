package net.pubnative.lite.sdk.vpaid;

/* compiled from: R8$$SyntheticClass */
/* renamed from: net.pubnative.lite.sdk.vpaid.i */
/* loaded from: classes10.dex */
public final /* synthetic */ class C38794i implements CloseButtonListener {

    /* renamed from: a */
    public final /* synthetic */ BaseVideoAdInternal f102175a;

    public /* synthetic */ C38794i(BaseVideoAdInternal baseVideoAdInternal) {
        this.f102175a = baseVideoAdInternal;
    }

    @Override // net.pubnative.lite.sdk.vpaid.CloseButtonListener
    public final void onCloseButtonVisible() {
        this.f102175a.onAdCloseButtonVisible();
    }
}
