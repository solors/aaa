package io.bidmachine.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* loaded from: classes9.dex */
public interface DataRestrictions {
    boolean canSendDeviceInfo();

    boolean canSendGeoPosition();

    boolean canSendIfa();

    boolean canSendUserInfo();

    @Nullable
    List<Integer> getGPPIds();

    @Nullable
    String getGPPString();

    @NonNull
    String getIABGDPRString();

    @Nullable
    String getUSPrivacyString();

    boolean isUserAgeRestricted();

    boolean isUserGdprProtected();

    boolean isUserHasCcpaConsent();

    boolean isUserHasConsent();

    boolean isUserInCcpaScope();

    boolean isUserInGdprScope();
}
