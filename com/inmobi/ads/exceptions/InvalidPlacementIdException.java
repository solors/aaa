package com.inmobi.ads.exceptions;

import androidx.annotation.Keep;
import kotlin.Metadata;

@Keep
@Metadata
/* loaded from: classes6.dex */
public final class InvalidPlacementIdException extends IllegalArgumentException {
    public InvalidPlacementIdException() {
        super("AdPlacement id value is not supplied in XML layout. Banner creation failed.");
    }
}
