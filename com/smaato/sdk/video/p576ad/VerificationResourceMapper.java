package com.smaato.sdk.video.p576ad;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.openmeasurement.ViewabilityVerificationResource;
import com.smaato.sdk.core.util.collections.Iterables;
import com.smaato.sdk.core.util.p574fi.BiFunction;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.core.util.p574fi.Function;
import com.smaato.sdk.video.vast.model.JavaScriptResource;
import com.smaato.sdk.video.vast.model.Verification;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.smaato.sdk.video.ad.VerificationResourceMapper */
/* loaded from: classes7.dex */
public final class VerificationResourceMapper implements Function<List<Verification>, Map<String, List<ViewabilityVerificationResource>>> {
    /* renamed from: a */
    public static /* synthetic */ void m38951a(HashMap hashMap, Verification verification, JavaScriptResource javaScriptResource) {
        lambda$apply$0(hashMap, verification, javaScriptResource);
    }

    /* renamed from: b */
    public static /* synthetic */ HashMap m38950b(Verification verification, HashMap hashMap) {
        return lambda$apply$1(verification, hashMap);
    }

    public static /* synthetic */ void lambda$apply$0(HashMap hashMap, Verification verification, JavaScriptResource javaScriptResource) {
        String str = javaScriptResource.apiFramework;
        List list = (List) hashMap.get(str);
        if (list == null) {
            list = new ArrayList();
            hashMap.put(str, list);
        }
        list.add(new ViewabilityVerificationResource(verification.vendor, javaScriptResource.uri, javaScriptResource.apiFramework, verification.verificationParameters, javaScriptResource.browserOptional));
    }

    public static /* synthetic */ HashMap lambda$apply$1(final Verification verification, final HashMap hashMap) {
        Iterables.forEach(verification.javaScriptResources, new Consumer() { // from class: com.smaato.sdk.video.ad.a
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                VerificationResourceMapper.m38951a(hashMap, verification, (JavaScriptResource) obj);
            }
        });
        return hashMap;
    }

    @Override // com.smaato.sdk.core.util.p574fi.Function
    @NonNull
    public Map<String, List<ViewabilityVerificationResource>> apply(@NonNull List<Verification> list) {
        return (Map) Iterables.reduce(list, new HashMap(), new BiFunction() { // from class: com.smaato.sdk.video.ad.b
            @Override // com.smaato.sdk.core.util.p574fi.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return VerificationResourceMapper.m38950b((Verification) obj, (HashMap) obj2);
            }
        });
    }
}
