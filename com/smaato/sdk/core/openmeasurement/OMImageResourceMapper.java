package com.smaato.sdk.core.openmeasurement;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.smaato.adsession.VerificationScriptResource;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.core.util.p574fi.Function;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class OMImageResourceMapper implements Function<List<ViewabilityVerificationResource>, List<VerificationScriptResource>> {
    @NonNull
    private VerificationScriptResource createOmScriptResource(@NonNull String str, @NonNull URL url, @Nullable String str2) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            return VerificationScriptResource.createVerificationScriptResourceWithParameters(str, url, str2);
        }
        return VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url);
    }

    @Nullable
    private URL parseUrl(@NonNull String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    @Override // com.smaato.sdk.core.util.p574fi.Function
    @NonNull
    public List<VerificationScriptResource> apply(@NonNull List<ViewabilityVerificationResource> list) {
        ArrayList arrayList = new ArrayList();
        for (ViewabilityVerificationResource viewabilityVerificationResource : list) {
            URL parseUrl = parseUrl(viewabilityVerificationResource.getJsScriptUrl());
            if (parseUrl != null) {
                arrayList.add(createOmScriptResource(viewabilityVerificationResource.getVendor(), parseUrl, viewabilityVerificationResource.getParameters()));
            }
        }
        return arrayList;
    }
}
