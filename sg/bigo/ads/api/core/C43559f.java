package sg.bigo.ads.api.core;

import androidx.annotation.NonNull;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.InterfaceC43501Ad;
import sg.bigo.ads.common.p926n.C43727d;

/* renamed from: sg.bigo.ads.api.core.f */
/* loaded from: classes10.dex */
public final class C43559f<T extends InterfaceC43501Ad> implements AdLoadListener<T> {

    /* renamed from: a */
    private AdLoadListener<T> f114085a;

    public C43559f() {
    }

    public C43559f(AdLoadListener<T> adLoadListener) {
        this.f114085a = adLoadListener;
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public final void onAdLoaded(@NonNull final T t) {
        if (this.f114085a != null) {
            C43727d.m5108a(2, new Runnable() { // from class: sg.bigo.ads.api.core.f.2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    C43559f.this.f114085a.onAdLoaded(t);
                }
            });
        }
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public final void onError(@NonNull final AdError adError) {
        if (this.f114085a != null) {
            C43727d.m5108a(2, new Runnable() { // from class: sg.bigo.ads.api.core.f.1
                @Override // java.lang.Runnable
                public final void run() {
                    C43559f.this.f114085a.onError(adError);
                }
            });
        }
    }
}
