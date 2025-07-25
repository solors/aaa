package com.unity3d.ads.core.domain.privacy;

import com.unity3d.services.core.misc.JsonFlattenerRules;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.collections.CollectionsJVM;
import org.jetbrains.annotations.NotNull;

/* compiled from: DeveloperConsentFlattenerRulesUseCase.kt */
@Metadata
/* loaded from: classes7.dex */
public final class DeveloperConsentFlattenerRulesUseCase implements FlattenerRulesUseCase {
    @Override // com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase
    @NotNull
    public JsonFlattenerRules invoke() {
        List m17160s;
        List m17175e;
        List m17160s2;
        m17160s = C37563v.m17160s("privacy", "gdpr", "pipl", "user");
        m17175e = CollectionsJVM.m17175e("value");
        m17160s2 = C37563v.m17160s("ts");
        return new JsonFlattenerRules(m17160s, m17175e, m17160s2);
    }
}
