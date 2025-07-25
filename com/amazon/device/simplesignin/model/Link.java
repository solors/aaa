package com.amazon.device.simplesignin.model;

/* loaded from: classes2.dex */
public class Link {
    private String amazonUserId;
    private String identityProviderName;
    private String linkId;
    private long linkedTimestamp;
    private String partnerUserId;
    private Token ssiToken;

    protected boolean canEqual(Object obj) {
        return obj instanceof Link;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Link)) {
            return false;
        }
        Link link = (Link) obj;
        if (!link.canEqual(this) || getLinkedTimestamp() != link.getLinkedTimestamp()) {
            return false;
        }
        String linkId = getLinkId();
        String linkId2 = link.getLinkId();
        if (linkId != null ? !linkId.equals(linkId2) : linkId2 != null) {
            return false;
        }
        String amazonUserId = getAmazonUserId();
        String amazonUserId2 = link.getAmazonUserId();
        if (amazonUserId != null ? !amazonUserId.equals(amazonUserId2) : amazonUserId2 != null) {
            return false;
        }
        String partnerUserId = getPartnerUserId();
        String partnerUserId2 = link.getPartnerUserId();
        if (partnerUserId != null ? !partnerUserId.equals(partnerUserId2) : partnerUserId2 != null) {
            return false;
        }
        String identityProviderName = getIdentityProviderName();
        String identityProviderName2 = link.getIdentityProviderName();
        if (identityProviderName != null ? !identityProviderName.equals(identityProviderName2) : identityProviderName2 != null) {
            return false;
        }
        Token ssiToken = getSsiToken();
        Token ssiToken2 = link.getSsiToken();
        if (ssiToken != null ? ssiToken.equals(ssiToken2) : ssiToken2 == null) {
            return true;
        }
        return false;
    }

    public String getAmazonUserId() {
        return this.amazonUserId;
    }

    public String getIdentityProviderName() {
        return this.identityProviderName;
    }

    public String getLinkId() {
        return this.linkId;
    }

    public long getLinkedTimestamp() {
        return this.linkedTimestamp;
    }

    public String getPartnerUserId() {
        return this.partnerUserId;
    }

    public Token getSsiToken() {
        return this.ssiToken;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        long linkedTimestamp = getLinkedTimestamp();
        String linkId = getLinkId();
        int i = (((int) (linkedTimestamp ^ (linkedTimestamp >>> 32))) + 59) * 59;
        int i2 = 43;
        if (linkId == null) {
            hashCode = 43;
        } else {
            hashCode = linkId.hashCode();
        }
        int i3 = i + hashCode;
        String amazonUserId = getAmazonUserId();
        int i4 = i3 * 59;
        if (amazonUserId == null) {
            hashCode2 = 43;
        } else {
            hashCode2 = amazonUserId.hashCode();
        }
        int i5 = i4 + hashCode2;
        String partnerUserId = getPartnerUserId();
        int i6 = i5 * 59;
        if (partnerUserId == null) {
            hashCode3 = 43;
        } else {
            hashCode3 = partnerUserId.hashCode();
        }
        int i7 = i6 + hashCode3;
        String identityProviderName = getIdentityProviderName();
        int i8 = i7 * 59;
        if (identityProviderName == null) {
            hashCode4 = 43;
        } else {
            hashCode4 = identityProviderName.hashCode();
        }
        int i9 = i8 + hashCode4;
        Token ssiToken = getSsiToken();
        int i10 = i9 * 59;
        if (ssiToken != null) {
            i2 = ssiToken.hashCode();
        }
        return i10 + i2;
    }

    public void setAmazonUserId(String str) {
        this.amazonUserId = str;
    }

    public void setIdentityProviderName(String str) {
        this.identityProviderName = str;
    }

    public void setLinkId(String str) {
        this.linkId = str;
    }

    public void setLinkedTimestamp(long j) {
        this.linkedTimestamp = j;
    }

    public void setPartnerUserId(String str) {
        this.partnerUserId = str;
    }

    public void setSsiToken(Token token) {
        this.ssiToken = token;
    }
}
