package sg.bigo.ads.controller.p949e;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.api.core.BaseAdActivityImpl;
import sg.bigo.ads.controller.landing.C44076d;
import sg.bigo.ads.p883ad.AbstractC42869c;

/* renamed from: sg.bigo.ads.controller.e.b */
/* loaded from: classes10.dex */
public abstract class AbstractC44026b<T extends AbstractC42869c<?, ?>> extends BaseAdActivityImpl {
    @Nullable

    /* renamed from: K */
    protected T f115474K;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC44026b(@NonNull Activity activity) {
        super(activity);
        try {
            this.f115474K = (T) C44076d.m4017b(this.f114066I.getIntent().getIntExtra("ad_identifier", -1));
        } catch (Exception unused) {
        }
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    @CallSuper
    /* renamed from: W */
    public void mo3623W() {
        if (this.f115474K != null) {
            C44076d.m4027a();
        }
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    /* renamed from: N */
    public void mo3627N() {
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    /* renamed from: T */
    public void mo3626T() {
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    /* renamed from: U */
    public void mo3625U() {
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    /* renamed from: V */
    public void mo3624V() {
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    /* renamed from: a */
    public final void mo3620a(int i, int i2, Intent intent) {
    }
}
