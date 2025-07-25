package p741j8;

import android.content.Context;
import com.unity3d.scar.adapter.common.DispatchGroup;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p715i8.UnityAdFormat;

/* renamed from: j8.e */
/* loaded from: classes7.dex */
public abstract class SignalsCollectorBase implements ISignalsCollector {

    /* compiled from: SignalsCollectorBase.java */
    /* renamed from: j8.e$a */
    /* loaded from: classes7.dex */
    static /* synthetic */ class C37297a {

        /* renamed from: a */
        static final /* synthetic */ int[] f98462a;

        static {
            int[] iArr = new int[UnityAdFormat.values().length];
            f98462a = iArr;
            try {
                iArr[UnityAdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f98462a[UnityAdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f98462a[UnityAdFormat.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: SignalsCollectorBase.java */
    /* renamed from: j8.e$b */
    /* loaded from: classes7.dex */
    private class RunnableC37298b implements Runnable {

        /* renamed from: b */
        private ISignalCollectionListener f98463b;

        /* renamed from: c */
        private SignalsResult f98464c;

        public RunnableC37298b(ISignalCollectionListener iSignalCollectionListener, SignalsResult signalsResult) {
            this.f98463b = iSignalCollectionListener;
            this.f98464c = signalsResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            Map<String, String> m18514c = this.f98464c.m18514c();
            if (m18514c.size() > 0) {
                this.f98463b.onSignalsCollected(new JSONObject(m18514c).toString());
            } else if (this.f98464c.m18515b() == null) {
                this.f98463b.onSignalsCollected("");
            } else {
                this.f98463b.onSignalsCollectionFailed(this.f98464c.m18515b());
            }
        }
    }

    @Override // p741j8.ISignalsCollector
    /* renamed from: a */
    public void mo18520a(Context context, boolean z, ISignalCollectionListener iSignalCollectionListener) {
        DispatchGroup dispatchGroup = new DispatchGroup();
        SignalsResult signalsResult = new SignalsResult();
        dispatchGroup.m37584a();
        mo12628e(context, UnityAdFormat.INTERSTITIAL, dispatchGroup, signalsResult);
        dispatchGroup.m37584a();
        mo12628e(context, UnityAdFormat.REWARDED, dispatchGroup, signalsResult);
        if (z) {
            dispatchGroup.m37584a();
            mo12628e(context, UnityAdFormat.BANNER, dispatchGroup, signalsResult);
        }
        dispatchGroup.m37582c(new RunnableC37298b(iSignalCollectionListener, signalsResult));
    }

    @Override // p741j8.ISignalsCollector
    /* renamed from: b */
    public void mo18519b(Context context, List<UnityAdFormat> list, ISignalCollectionListener iSignalCollectionListener) {
        DispatchGroup dispatchGroup = new DispatchGroup();
        SignalsResult signalsResult = new SignalsResult();
        for (UnityAdFormat unityAdFormat : list) {
            dispatchGroup.m37584a();
            mo12628e(context, unityAdFormat, dispatchGroup, signalsResult);
        }
        dispatchGroup.m37582c(new RunnableC37298b(iSignalCollectionListener, signalsResult));
    }

    @Override // p741j8.ISignalsCollector
    /* renamed from: c */
    public void mo18518c(Context context, String str, UnityAdFormat unityAdFormat, ISignalCollectionListener iSignalCollectionListener) {
        DispatchGroup dispatchGroup = new DispatchGroup();
        SignalsResult signalsResult = new SignalsResult();
        dispatchGroup.m37584a();
        mo12629d(context, str, unityAdFormat, dispatchGroup, signalsResult);
        dispatchGroup.m37582c(new RunnableC37298b(iSignalCollectionListener, signalsResult));
    }

    /* renamed from: f */
    public String m18517f(UnityAdFormat unityAdFormat) {
        int i = C37297a.f98462a[unityAdFormat.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return "";
                }
                return "gmaScarBiddingRewardedSignal";
            }
            return "gmaScarBiddingInterstitialSignal";
        }
        return "gmaScarBiddingBannerSignal";
    }
}
