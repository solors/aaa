package io.bidmachine;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.explorestack.protobuf.openrtb.Response;
import io.bidmachine.core.NetworkRequest;
import io.bidmachine.utils.BMError;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.bidmachine.q4 */
/* loaded from: classes9.dex */
public class NetworkRequestManager {
    private static volatile NetworkRequestManager instance;
    private final Object lock = new Object();
    @VisibleForTesting
    final Map<String, NetworkRequest<?, Response, BMError>> networkRequestMap = new HashMap();

    NetworkRequestManager() {
    }

    @NonNull
    public static NetworkRequestManager get() {
        NetworkRequestManager networkRequestManager = instance;
        if (networkRequestManager == null) {
            synchronized (NetworkRequestManager.class) {
                networkRequestManager = instance;
                if (networkRequestManager == null) {
                    networkRequestManager = new NetworkRequestManager();
                    instance = networkRequestManager;
                }
            }
        }
        return networkRequestManager;
    }

    public void add(@NonNull String str, @NonNull NetworkRequest<?, Response, BMError> networkRequest) {
        synchronized (this.lock) {
            this.networkRequestMap.put(str, networkRequest);
        }
    }

    public boolean contains(@NonNull String str) {
        boolean containsKey;
        synchronized (this.lock) {
            containsKey = this.networkRequestMap.containsKey(str);
        }
        return containsKey;
    }

    public NetworkRequest<?, Response, BMError> remove(@NonNull String str) {
        NetworkRequest<?, Response, BMError> remove;
        synchronized (this.lock) {
            remove = this.networkRequestMap.remove(str);
        }
        return remove;
    }
}
