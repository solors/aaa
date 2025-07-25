package com.iab.omid.library.bigosg.adsession.video;

/* loaded from: classes6.dex */
public enum InteractionType {
    CLICK("click"),
    INVITATION_ACCEPTED("invitationAccept");
    
    String interactionType;

    InteractionType(String str) {
        this.interactionType = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.interactionType;
    }
}
