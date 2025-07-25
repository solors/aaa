package com.facebook.share.internal;

import com.facebook.internal.Validate;
import com.facebook.share.model.GameRequestContent;

/* loaded from: classes4.dex */
public class GameRequestValidation {
    public static void validate(GameRequestContent gameRequestContent) {
        boolean z;
        boolean z2;
        Validate.notNull(gameRequestContent.getMessage(), "message");
        int i = 0;
        if (gameRequestContent.getObjectId() != null) {
            z = true;
        } else {
            z = false;
        }
        if (gameRequestContent.getActionType() != GameRequestContent.ActionType.ASKFOR && gameRequestContent.getActionType() != GameRequestContent.ActionType.SEND) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!(z ^ z2)) {
            if (gameRequestContent.getRecipients() != null) {
                i = 1;
            }
            if (gameRequestContent.getSuggestions() != null) {
                i++;
            }
            if (gameRequestContent.getFilters() != null) {
                i++;
            }
            if (i <= 1) {
                return;
            }
            throw new IllegalArgumentException("Parameters to, filters and suggestions are mutually exclusive");
        }
        throw new IllegalArgumentException("Object id should be provided if and only if action type is send or askfor");
    }
}
