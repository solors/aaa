package com.amazon.device.simplesignin;

import com.amazon.device.simplesignin.model.response.GetUserAndLinksResponse;
import com.amazon.device.simplesignin.model.response.LinkUserAccountResponse;
import com.amazon.device.simplesignin.model.response.RecordMetricsEventResponse;
import com.amazon.device.simplesignin.model.response.ShowLoginSelectionResponse;

/* loaded from: classes2.dex */
public interface ISimpleSignInResponseHandler {
    void onGetUserAndLinksResponse(GetUserAndLinksResponse getUserAndLinksResponse);

    void onLinkUserAccountResponse(LinkUserAccountResponse linkUserAccountResponse);

    void onRecordMetricsEventResponse(RecordMetricsEventResponse recordMetricsEventResponse);

    void onShowLoginSelectionResponse(ShowLoginSelectionResponse showLoginSelectionResponse);
}
