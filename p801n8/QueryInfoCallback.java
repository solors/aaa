package p801n8;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import p741j8.ISignalCallbackListener;

/* renamed from: n8.a */
/* loaded from: classes7.dex */
public class QueryInfoCallback extends QueryInfoGenerationCallback {

    /* renamed from: b */
    private String f101803b;

    /* renamed from: c */
    private ISignalCallbackListener f101804c;

    public QueryInfoCallback(String str, ISignalCallbackListener iSignalCallbackListener) {
        this.f101803b = str;
        this.f101804c = iSignalCallbackListener;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onFailure(String str) {
        this.f101804c.onFailure(str);
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onSuccess(QueryInfo queryInfo) {
        this.f101804c.mo18521a(this.f101803b, queryInfo.getQuery(), queryInfo);
    }
}
