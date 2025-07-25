package p645e0;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: e0.b */
/* loaded from: classes2.dex */
public class DefaultLottieNetworkFetcher implements LottieNetworkFetcher {
    @Override // p645e0.LottieNetworkFetcher
    @NonNull
    /* renamed from: a */
    public LottieFetchResult mo25542a(@NonNull String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new DefaultLottieFetchResult(httpURLConnection);
    }
}
