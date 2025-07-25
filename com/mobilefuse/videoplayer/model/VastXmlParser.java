package com.mobilefuse.videoplayer.model;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VastDataModelFromXml.kt */
@Metadata
/* loaded from: classes7.dex */
public final class VastXmlParser {
    @NotNull
    private final List<VastTag> vastTagChain = new ArrayList();

    @NotNull
    public final List<VastTag> getVastTagChain() {
        return this.vastTagChain;
    }
}
