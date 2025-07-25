package com.mobilefuse.sdk.internal.repository;

import com.mobilefuse.sdk.component.ParsedAdMarkup;
import com.mobilefuse.sdk.network.model.MfxBidResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AdRepositoryDataModel.kt */
@Metadata
/* loaded from: classes7.dex */
public final class ParsedAdMarkupResponse implements AdRepositoryResponse {
    @NotNull
    private final MfxBidResponse bidResponse;
    @NotNull
    private final ParsedAdMarkup markup;

    public ParsedAdMarkupResponse(@NotNull MfxBidResponse bidResponse, @NotNull ParsedAdMarkup markup) {
        Intrinsics.checkNotNullParameter(bidResponse, "bidResponse");
        Intrinsics.checkNotNullParameter(markup, "markup");
        this.bidResponse = bidResponse;
        this.markup = markup;
    }

    public static /* synthetic */ ParsedAdMarkupResponse copy$default(ParsedAdMarkupResponse parsedAdMarkupResponse, MfxBidResponse mfxBidResponse, ParsedAdMarkup parsedAdMarkup, int i, Object obj) {
        if ((i & 1) != 0) {
            mfxBidResponse = parsedAdMarkupResponse.getBidResponse();
        }
        if ((i & 2) != 0) {
            parsedAdMarkup = parsedAdMarkupResponse.markup;
        }
        return parsedAdMarkupResponse.copy(mfxBidResponse, parsedAdMarkup);
    }

    @NotNull
    public final MfxBidResponse component1() {
        return getBidResponse();
    }

    @NotNull
    public final ParsedAdMarkup component2() {
        return this.markup;
    }

    @NotNull
    public final ParsedAdMarkupResponse copy(@NotNull MfxBidResponse bidResponse, @NotNull ParsedAdMarkup markup) {
        Intrinsics.checkNotNullParameter(bidResponse, "bidResponse");
        Intrinsics.checkNotNullParameter(markup, "markup");
        return new ParsedAdMarkupResponse(bidResponse, markup);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof ParsedAdMarkupResponse) {
                ParsedAdMarkupResponse parsedAdMarkupResponse = (ParsedAdMarkupResponse) obj;
                if (!Intrinsics.m17075f(getBidResponse(), parsedAdMarkupResponse.getBidResponse()) || !Intrinsics.m17075f(this.markup, parsedAdMarkupResponse.markup)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // com.mobilefuse.sdk.internal.repository.AdRepositoryResponse
    @NotNull
    public MfxBidResponse getBidResponse() {
        return this.bidResponse;
    }

    @NotNull
    public final ParsedAdMarkup getMarkup() {
        return this.markup;
    }

    public int hashCode() {
        int i;
        MfxBidResponse bidResponse = getBidResponse();
        int i2 = 0;
        if (bidResponse != null) {
            i = bidResponse.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        ParsedAdMarkup parsedAdMarkup = this.markup;
        if (parsedAdMarkup != null) {
            i2 = parsedAdMarkup.hashCode();
        }
        return i3 + i2;
    }

    @NotNull
    public String toString() {
        return "ParsedAdMarkupResponse(bidResponse=" + getBidResponse() + ", markup=" + this.markup + ")";
    }
}
