package com.smaato.sdk.core.mvvm.model.csm;

import com.smaato.sdk.core.mvvm.model.AdResponse;
import com.smaato.sdk.core.mvvm.model.AdResponseParser;
import com.smaato.sdk.core.p568ad.AdType;
import com.smaato.sdk.core.util.HeaderValueUtils;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public class SomaCsmResponseParser extends AdResponseParser {
    public SomaCsmResponseParser(HeaderValueUtils headerValueUtils) {
        super(AdType.IMAGE, headerValueUtils);
    }

    private CsmParameters createCsmParameters(AdResponse.Builder builder) {
        AdResponse build = builder.setAdType(AdType.IMAGE).setWidth(0).setHeight(0).setImpressionTrackingUrls(new ArrayList()).setClickTrackingUrls(new ArrayList()).build();
        return new CsmParameters(build.getSessionId(), build.getSci(), build.getImpressionCountingType(), build.getTtlMs(), build.getBundleId());
    }

    @Override // com.smaato.sdk.core.mvvm.model.AdResponseParser
    protected AdResponse parseResponse(AdResponse.Builder builder, String str, long j) throws IOException {
        throw new CsmException(str, createCsmParameters(builder));
    }
}
