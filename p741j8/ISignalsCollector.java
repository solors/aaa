package p741j8;

import android.content.Context;
import com.unity3d.scar.adapter.common.DispatchGroup;
import java.util.List;
import p715i8.UnityAdFormat;

/* renamed from: j8.c */
/* loaded from: classes7.dex */
public interface ISignalsCollector {
    /* renamed from: a */
    void mo18520a(Context context, boolean z, ISignalCollectionListener iSignalCollectionListener);

    /* renamed from: b */
    void mo18519b(Context context, List<UnityAdFormat> list, ISignalCollectionListener iSignalCollectionListener);

    /* renamed from: c */
    void mo18518c(Context context, String str, UnityAdFormat unityAdFormat, ISignalCollectionListener iSignalCollectionListener);

    /* renamed from: d */
    void mo12629d(Context context, String str, UnityAdFormat unityAdFormat, DispatchGroup dispatchGroup, SignalsResult signalsResult);

    /* renamed from: e */
    void mo12628e(Context context, UnityAdFormat unityAdFormat, DispatchGroup dispatchGroup, SignalsResult signalsResult);
}
