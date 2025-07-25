package p741j8;

import com.unity3d.scar.adapter.common.DispatchGroup;

/* renamed from: j8.d */
/* loaded from: classes7.dex */
public class SignalCallbackListener<T> implements ISignalCallbackListener<T> {

    /* renamed from: a */
    private DispatchGroup f98460a;

    /* renamed from: b */
    private SignalsResult f98461b;

    public SignalCallbackListener(DispatchGroup dispatchGroup, SignalsResult signalsResult) {
        this(dispatchGroup, null, signalsResult);
    }

    @Override // p741j8.ISignalCallbackListener
    /* renamed from: a */
    public void mo18521a(String str, String str2, T t) {
        this.f98461b.m18516a(str, str2);
        this.f98460a.m37583b();
    }

    @Override // p741j8.ISignalCallbackListener
    public void onFailure(String str) {
        this.f98461b.m18513d(str);
        this.f98460a.m37583b();
    }

    public SignalCallbackListener(DispatchGroup dispatchGroup, SignalsStorage<T> signalsStorage, SignalsResult signalsResult) {
        this.f98460a = dispatchGroup;
        this.f98461b = signalsResult;
    }
}
