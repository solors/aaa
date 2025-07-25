package com.smaato.sdk.core.locationaware;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.util.List;

/* loaded from: classes7.dex */
public interface DnsLookup {
    @NonNull
    List<TxtRecord> blockingTxt(@NonNull String str) throws IOException;
}
