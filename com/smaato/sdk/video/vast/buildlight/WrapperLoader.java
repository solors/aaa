package com.smaato.sdk.video.vast.buildlight;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.Call;
import com.smaato.sdk.core.network.Callback;
import com.smaato.sdk.core.network.HttpClient;
import com.smaato.sdk.core.network.Request;
import com.smaato.sdk.core.network.Response;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.p577fi.NonNullConsumer;
import com.smaato.sdk.video.vast.exceptions.wrapper.GeneralWrapperErrorException;
import com.smaato.sdk.video.vast.model.VastTree;
import com.smaato.sdk.video.vast.model.Wrapper;
import com.smaato.sdk.video.vast.parser.ParseResult;
import com.smaato.sdk.video.vast.parser.VastResponseParser;

/* loaded from: classes7.dex */
public class WrapperLoader {
    @NonNull
    private final HttpClient httpClient;
    @NonNull
    private final VastResponseParser vastResponseParser;

    /* renamed from: com.smaato.sdk.video.vast.buildlight.WrapperLoader$a */
    /* loaded from: classes7.dex */
    class C27711a implements Callback {

        /* renamed from: a */
        final /* synthetic */ Logger f72437a;

        /* renamed from: b */
        final /* synthetic */ NonNullConsumer f72438b;

        /* renamed from: c */
        final /* synthetic */ String f72439c;

        C27711a(Logger logger, NonNullConsumer nonNullConsumer, String str) {
            this.f72437a = logger;
            this.f72438b = nonNullConsumer;
            this.f72439c = str;
        }

        @Override // com.smaato.sdk.core.network.Callback
        public void onFailure(@NonNull Call call, @NonNull Exception exc) {
            String format = String.format("Failed to load Vast url: %s due to error: %s", this.f72439c, exc);
            this.f72437a.error(LogDomain.VAST, format, new Object[0]);
            this.f72438b.accept(ParseResult.error("Wrapper", new GeneralWrapperErrorException(format)));
        }

        @Override // com.smaato.sdk.core.network.Callback
        public void onResponse(@NonNull Call call, @NonNull Response response) {
            if (response.responseCode() == 200) {
                WrapperLoader.this.vastResponseParser.parseVastResponse(this.f72437a, response.body().source(), response.encoding(), this.f72438b);
                return;
            }
            String format = String.format("Failed to load Vast url: %s response code: %d", this.f72439c, Integer.valueOf(response.responseCode()));
            this.f72437a.error(LogDomain.VAST, format, new Object[0]);
            this.f72438b.accept(ParseResult.error("Wrapper", new GeneralWrapperErrorException(format)));
        }
    }

    public WrapperLoader(@NonNull VastResponseParser vastResponseParser, @NonNull HttpClient httpClient) {
        this.vastResponseParser = (VastResponseParser) Objects.requireNonNull(vastResponseParser);
        this.httpClient = (HttpClient) Objects.requireNonNull(httpClient);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void loadWrapper(@NonNull Logger logger, @Nullable String str, @NonNull NonNullConsumer<ParseResult<VastTree>> nonNullConsumer) {
        if (str != null && !TextUtils.isEmpty(str)) {
            this.httpClient.newCall(Request.get(str)).enqueue(new C27711a(logger, nonNullConsumer, str));
            return;
        }
        nonNullConsumer.accept(ParseResult.error(Wrapper.VAST_AD_TAG_URI, new GeneralWrapperErrorException("Cannot resolve wrapper: vastAdTagUri is missing")));
    }
}
