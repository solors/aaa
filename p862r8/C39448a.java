package p862r8;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import p741j8.ISignalCallbackListener;

/* compiled from: QueryInfoCallback.java */
/* renamed from: r8.a */
/* loaded from: classes7.dex */
public class C39448a extends QueryInfoGenerationCallback {

    /* renamed from: b */
    private String f103701b;

    /* renamed from: c */
    private ISignalCallbackListener f103702c;

    public C39448a(String str, ISignalCallbackListener iSignalCallbackListener) {
        this.f103701b = str;
        this.f103702c = iSignalCallbackListener;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onFailure(String str) {
        this.f103702c.onFailure(str);
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onSuccess(QueryInfo queryInfo) {
        this.f103702c.mo18521a(this.f103701b, queryInfo.getQuery(), queryInfo);
    }
}
