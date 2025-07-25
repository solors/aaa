package com.smaato.sdk.core.mvvm.model.csm;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.csm.CsmAdResponse;
import com.smaato.sdk.core.csm.Network;
import com.smaato.sdk.core.mvvm.model.AdResponse;
import com.smaato.sdk.core.mvvm.model.soma.SomaAdRequest;
import com.smaato.sdk.core.network.SomaException;
import com.smaato.sdk.core.util.p574fi.Consumer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class CsmRemoteSource {
    /* renamed from: a */
    public static /* synthetic */ int m39471a(Network network, Network network2) {
        return lambda$getSortedNetworkList$0(network, network2);
    }

    public static /* synthetic */ int lambda$getSortedNetworkList$0(Network network, Network network2) {
        return Integer.compare(network.getPriority(), network2.getPriority());
    }

    @NonNull
    public List<Network> getSortedNetworkList(CsmAdResponse csmAdResponse) throws IOException {
        if (!csmAdResponse.getNetworks().isEmpty()) {
            ArrayList arrayList = new ArrayList(csmAdResponse.getNetworks());
            Collections.sort(arrayList, new Comparator() { // from class: com.smaato.sdk.core.mvvm.model.csm.a
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return CsmRemoteSource.m39471a((Network) obj, (Network) obj2);
                }
            });
            return arrayList;
        }
        throw new SomaException(SomaException.Type.BAD_RESPONSE, "List of csm networks is empty");
    }

    public abstract void loadAd(@NonNull String str, @NonNull SomaAdRequest somaAdRequest, Consumer<AdResponse> consumer, Consumer<Throwable> consumer2, @NonNull CsmParameters csmParameters) throws IOException;
}
