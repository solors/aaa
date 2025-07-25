package p812o5;

import android.view.ViewGroup;
import com.meevii.adsdk.common.IADListener;
import p1038x5.AdUnit;
import p798n5.LoadApi;

/* compiled from: BaseAd.java */
/* renamed from: o5.b */
/* loaded from: classes6.dex */
public abstract class AbstractC39104b implements LoadApi {

    /* renamed from: a */
    private LoadApi f102723a;

    public AbstractC39104b(String str) {
        this.f102723a = mo13929b(str);
    }

    @Override // p798n5.LoadApi
    /* renamed from: a */
    public void mo12948a(IADListener iADListener) {
        LoadApi loadApi = this.f102723a;
        if (loadApi != null) {
            loadApi.mo12948a(iADListener);
        }
    }

    /* renamed from: b */
    public abstract LoadApi mo13929b(String str);

    /* renamed from: c */
    public LoadApi m13930c() {
        return this.f102723a;
    }

    @Override // p798n5.LoadApi
    public AdUnit isReady() {
        LoadApi loadApi = this.f102723a;
        if (loadApi != null) {
            return loadApi.isReady();
        }
        return null;
    }

    @Override // p798n5.LoadApi
    public AdUnit isValid() {
        LoadApi loadApi = this.f102723a;
        if (loadApi != null) {
            return loadApi.isValid();
        }
        return null;
    }

    @Override // p798n5.LoadApi
    public void load() {
        LoadApi loadApi = this.f102723a;
        if (loadApi != null) {
            loadApi.load();
        }
    }

    @Override // p798n5.LoadApi
    public AdUnit show() {
        return null;
    }

    @Override // p798n5.LoadApi
    public AdUnit show(ViewGroup viewGroup) {
        return null;
    }

    @Override // p798n5.LoadApi
    public void destroy() {
    }
}
