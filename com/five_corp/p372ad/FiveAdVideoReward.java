package com.five_corp.p372ad;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.five_corp.p372ad.internal.C13617C;
import com.five_corp.p372ad.internal.C13618D;
import com.five_corp.p372ad.internal.C13773f;
import com.five_corp.p372ad.internal.C14068s;
import com.five_corp.p372ad.internal.C14161y;
import com.five_corp.p372ad.internal.InterfaceC13780h;
import com.five_corp.p372ad.internal.adselector.InterfaceC13701c;
import com.five_corp.p372ad.internal.context.C13757f;
import com.five_corp.p372ad.internal.context.C13760i;
import com.five_corp.p372ad.internal.context.EnumC13756e;
import com.five_corp.p372ad.internal.logger.C13836a;
import com.five_corp.p372ad.internal.soundstate.C14071c;

/* renamed from: com.five_corp.ad.FiveAdVideoReward */
/* loaded from: classes4.dex */
public class FiveAdVideoReward implements FiveAdInterface, InterfaceC13701c, InterfaceC13608c {

    /* renamed from: l */
    public static final String f25039l = FiveAdVideoReward.class.toString();

    /* renamed from: a */
    public final Context f25040a;

    /* renamed from: b */
    public final C13614i f25041b;

    /* renamed from: c */
    public final C13757f f25042c;

    /* renamed from: d */
    public final C13618D f25043d;

    /* renamed from: e */
    public final C14071c f25044e;

    /* renamed from: f */
    public final C13836a f25045f;

    /* renamed from: g */
    public final Object f25046g;

    /* renamed from: h */
    public FiveAdState f25047h;

    /* renamed from: i */
    public C13611f f25048i;

    /* renamed from: j */
    public C13617C f25049j;

    /* renamed from: k */
    public String f25050k;

    public FiveAdVideoReward(@NonNull Activity activity, String str) {
        this(activity.getApplicationContext(), str);
    }

    @Override // com.five_corp.p372ad.FiveAdInterface
    public void enableSound(boolean z) {
        this.f25044e.m78131a(z);
    }

    @Override // com.five_corp.p372ad.FiveAdInterface
    @NonNull
    public CreativeType getCreativeType() {
        C13611f c13611f;
        synchronized (this.f25046g) {
            c13611f = this.f25048i;
        }
        if (c13611f != null) {
            return c13611f.f25073l.f25591b.f25184b;
        }
        return CreativeType.NOT_LOADED;
    }

    @Override // com.five_corp.p372ad.FiveAdInterface
    @Nullable
    public String getFiveAdTag() {
        return this.f25050k;
    }

    @Override // com.five_corp.p372ad.FiveAdInterface
    @NonNull
    public String getSlotId() {
        return this.f25042c.f25586c;
    }

    @Override // com.five_corp.p372ad.FiveAdInterface
    @NonNull
    @Deprecated
    public FiveAdState getState() {
        FiveAdState fiveAdState;
        synchronized (this.f25046g) {
            fiveAdState = this.f25047h;
        }
        return fiveAdState;
    }

    @Override // com.five_corp.p372ad.FiveAdInterface
    public boolean isSoundEnabled() {
        return this.f25044e.m78134a().m78135a();
    }

    public void loadAdAsync() {
        boolean z;
        synchronized (this.f25046g) {
            if (this.f25047h == FiveAdState.NOT_LOADED && this.f25049j != null) {
                this.f25047h = FiveAdState.LOADING;
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            this.f25041b.f25102m.m78438a(this.f25042c, EnumC13756e.VIDEO_REWARD, this.f25044e.m78134a(), this);
            return;
        }
        C13618D c13618d = this.f25043d;
        FiveAdErrorCode fiveAdErrorCode = FiveAdErrorCode.INVALID_STATE;
        FiveAdLoadListener fiveAdLoadListener = (FiveAdLoadListener) c13618d.f25135b.get();
        if (fiveAdLoadListener != null) {
            fiveAdLoadListener.onFiveAdLoadError(c13618d.f25134a, fiveAdErrorCode);
        }
        Log.e(f25039l, "Invalid state, loadAdAsync is ignored.");
    }

    @Override // com.five_corp.p372ad.InterfaceC13608c
    public void onAdControllerClose() {
        synchronized (this.f25046g) {
            this.f25048i = null;
            this.f25047h = FiveAdState.CLOSED;
        }
    }

    @Override // com.five_corp.p372ad.InterfaceC13608c
    public void onAdControllerError() {
        synchronized (this.f25046g) {
            this.f25048i = null;
            this.f25047h = FiveAdState.ERROR;
        }
    }

    @Override // com.five_corp.p372ad.internal.adselector.InterfaceC13701c
    public void onAdSuccessfullySelected(@NonNull C13760i c13760i) {
        C13617C c13617c;
        synchronized (this.f25046g) {
            c13617c = this.f25049j;
            this.f25049j = null;
        }
        C13611f c13611f = new C13611f(this.f25040a, this.f25041b, null, this.f25043d, this.f25044e, c13760i, this);
        synchronized (this.f25046g) {
            this.f25048i = c13611f;
            this.f25047h = FiveAdState.LOADED;
        }
        if (c13617c != null) {
            c13617c.m78490b(c13760i);
        } else {
            this.f25045f.m78270a("notifyLoad failed @ FiveAdVideoReward.onAdSuccessfullySelected");
        }
    }

    @Override // com.five_corp.p372ad.internal.adselector.InterfaceC13701c
    public void onFailureToSelectAd(@NonNull C14068s c14068s) {
        C13617C c13617c;
        synchronized (this.f25046g) {
            c13617c = this.f25049j;
            this.f25049j = null;
            this.f25047h = FiveAdState.ERROR;
        }
        if (c13617c != null) {
            c13617c.m78491b(this.f25042c, EnumC13756e.VIDEO_REWARD, c14068s);
        } else {
            this.f25045f.m78270a("notifyLoadError failed @ FiveAdVideoReward.onFailureToSelectAd");
        }
    }

    public void setEventListener(@NonNull FiveAdVideoRewardEventListener fiveAdVideoRewardEventListener) {
        C13618D c13618d = this.f25043d;
        c13618d.f25137d.set(new C13773f(this, fiveAdVideoRewardEventListener));
        C13618D c13618d2 = this.f25043d;
        c13618d2.f25138e.set(new C14161y(this, fiveAdVideoRewardEventListener));
    }

    @Override // com.five_corp.p372ad.FiveAdInterface
    public void setFiveAdTag(@NonNull String str) {
        this.f25050k = str;
    }

    @Override // com.five_corp.p372ad.FiveAdInterface
    public void setLoadListener(@NonNull FiveAdLoadListener fiveAdLoadListener) {
        this.f25043d.f25135b.set(fiveAdLoadListener);
    }

    @Override // com.five_corp.p372ad.FiveAdInterface
    @Deprecated
    public void setViewEventListener(@NonNull FiveAdViewEventListener fiveAdViewEventListener) {
        this.f25043d.f25136c.set(fiveAdViewEventListener);
    }

    @Deprecated
    public boolean show() {
        C13611f c13611f;
        synchronized (this.f25046g) {
            c13611f = this.f25048i;
        }
        if (c13611f == null) {
            C13618D c13618d = this.f25043d;
            FiveAdErrorCode fiveAdErrorCode = FiveAdErrorCode.INVALID_STATE;
            FiveAdViewEventListener fiveAdViewEventListener = (FiveAdViewEventListener) c13618d.f25136c.get();
            if (fiveAdViewEventListener != null) {
                fiveAdViewEventListener.onFiveAdViewError(c13618d.f25134a, fiveAdErrorCode);
            }
            InterfaceC13780h interfaceC13780h = (InterfaceC13780h) c13618d.f25137d.get();
            if (interfaceC13780h != null) {
                interfaceC13780h.mo78381a(fiveAdErrorCode);
            }
            Log.e(f25039l, "Invalid state, showAd is ignored.");
            return false;
        }
        return c13611f.m78532p();
    }

    public void showAd() {
        C13611f c13611f;
        synchronized (this.f25046g) {
            c13611f = this.f25048i;
        }
        if (c13611f == null) {
            C13618D c13618d = this.f25043d;
            FiveAdErrorCode fiveAdErrorCode = FiveAdErrorCode.INVALID_STATE;
            FiveAdViewEventListener fiveAdViewEventListener = (FiveAdViewEventListener) c13618d.f25136c.get();
            if (fiveAdViewEventListener != null) {
                fiveAdViewEventListener.onFiveAdViewError(c13618d.f25134a, fiveAdErrorCode);
            }
            InterfaceC13780h interfaceC13780h = (InterfaceC13780h) c13618d.f25137d.get();
            if (interfaceC13780h != null) {
                interfaceC13780h.mo78381a(fiveAdErrorCode);
            }
            Log.e(f25039l, "Invalid state, showAd is ignored.");
            return;
        }
        c13611f.m78532p();
    }

    public FiveAdVideoReward(Context context, C13614i c13614i, C13760i c13760i) {
        this.f25046g = new Object();
        this.f25041b = c13614i;
        this.f25040a = context;
        this.f25042c = c13760i.f25596g;
        C13618D c13618d = new C13618D(this);
        this.f25043d = c13618d;
        C14071c c14071c = new C14071c(c13614i.m78530a());
        this.f25044e = c14071c;
        this.f25045f = c13614i.f25090a;
        this.f25047h = FiveAdState.LOADED;
        this.f25049j = null;
        this.f25048i = new C13611f(context, c13614i, null, c13618d, c14071c, c13760i, this);
    }

    public FiveAdVideoReward(@NonNull Context context, String str) {
        this.f25046g = new Object();
        C13614i c13614i = C14163j.m78039a().f26837a;
        this.f25041b = c13614i;
        this.f25040a = context;
        this.f25042c = c13614i.f25101l.m78398a(str);
        C13618D c13618d = new C13618D(this);
        this.f25043d = c13618d;
        C14071c c14071c = new C14071c(c13614i.m78530a());
        this.f25044e = c14071c;
        this.f25045f = c13614i.f25090a;
        this.f25047h = FiveAdState.NOT_LOADED;
        this.f25049j = new C13617C(c13618d, c13614i.f25107r, c14071c);
        this.f25048i = null;
    }

    @Deprecated
    public boolean show(@NonNull Activity activity) {
        C13611f c13611f;
        synchronized (this.f25046g) {
            c13611f = this.f25048i;
        }
        if (c13611f == null) {
            C13618D c13618d = this.f25043d;
            FiveAdErrorCode fiveAdErrorCode = FiveAdErrorCode.INVALID_STATE;
            FiveAdViewEventListener fiveAdViewEventListener = (FiveAdViewEventListener) c13618d.f25136c.get();
            if (fiveAdViewEventListener != null) {
                fiveAdViewEventListener.onFiveAdViewError(c13618d.f25134a, fiveAdErrorCode);
            }
            InterfaceC13780h interfaceC13780h = (InterfaceC13780h) c13618d.f25137d.get();
            if (interfaceC13780h != null) {
                interfaceC13780h.mo78381a(fiveAdErrorCode);
            }
            Log.e(f25039l, "Invalid state, showAd is ignored.");
            return false;
        }
        return c13611f.m78532p();
    }
}
