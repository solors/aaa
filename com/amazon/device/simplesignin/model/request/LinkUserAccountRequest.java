package com.amazon.device.simplesignin.model.request;

import com.amazon.device.simplesignin.model.Token;

/* loaded from: classes2.dex */
public class LinkUserAccountRequest {
    private String identityProviderName;
    private String linkSigningKey;
    private Token linkToken;
    private String partnerUserId;
    private String userLoginName;

    public String getIdentityProviderName() {
        return this.identityProviderName;
    }

    public String getLinkSigningKey() {
        return this.linkSigningKey;
    }

    public Token getLinkToken() {
        return this.linkToken;
    }

    public String getPartnerUserId() {
        return this.partnerUserId;
    }

    public String getUserLoginName() {
        return this.userLoginName;
    }

    public void setIdentityProviderName(String str) {
        this.identityProviderName = str;
    }

    public void setLinkSigningKey(String str) {
        this.linkSigningKey = str;
    }

    public void setLinkToken(Token token) {
        this.linkToken = token;
    }

    public void setPartnerUserId(String str) {
        this.partnerUserId = str;
    }

    public void setUserLoginName(String str) {
        this.userLoginName = str;
    }
}
