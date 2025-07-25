package com.smaato.sdk.video.vast.tracking.macro;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.collections.Maps;
import com.smaato.sdk.core.util.p574fi.BiFunction;
import com.smaato.sdk.video.utils.UriUtils;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes7.dex */
public final class MacroInjector {
    @NonNull
    private final AdBreakInfoMacros adBreakInfoMacros;
    @NonNull
    private final CapabilitiesInfoMacro capabilitiesInfoMacro;
    @NonNull
    private final ClickInfoMacros clickInfoMacros;
    @NonNull
    private final ClientInfoMacros clientInfoMacros;
    @NonNull
    private final ErrorInfoMacros errorInfoMacros;
    @NonNull
    private final GenericMacros genericMacros;
    @NonNull
    private final PlayerStateInfoMacros playerStateInfoMacros;
    @NonNull
    private final PublisherInfoMacro publisherInfoMacro;
    @NonNull
    private final RegulationInfoMacros regulationInfoMacros;
    @NonNull
    private final UriUtils uriUtils;
    @NonNull
    private final VerificationInfoMacros verificationInfoMacros;

    public MacroInjector(@NonNull UriUtils uriUtils, @NonNull AdBreakInfoMacros adBreakInfoMacros, @NonNull CapabilitiesInfoMacro capabilitiesInfoMacro, @NonNull ClientInfoMacros clientInfoMacros, @NonNull GenericMacros genericMacros, @NonNull PlayerStateInfoMacros playerStateInfoMacros, @NonNull PublisherInfoMacro publisherInfoMacro, @NonNull RegulationInfoMacros regulationInfoMacros, @NonNull VerificationInfoMacros verificationInfoMacros, @NonNull ClickInfoMacros clickInfoMacros, @NonNull ErrorInfoMacros errorInfoMacros) {
        this.uriUtils = (UriUtils) Objects.requireNonNull(uriUtils);
        this.adBreakInfoMacros = (AdBreakInfoMacros) Objects.requireNonNull(adBreakInfoMacros);
        this.capabilitiesInfoMacro = (CapabilitiesInfoMacro) Objects.requireNonNull(capabilitiesInfoMacro);
        this.clientInfoMacros = (ClientInfoMacros) Objects.requireNonNull(clientInfoMacros);
        this.genericMacros = (GenericMacros) Objects.requireNonNull(genericMacros);
        this.playerStateInfoMacros = (PlayerStateInfoMacros) Objects.requireNonNull(playerStateInfoMacros);
        this.publisherInfoMacro = (PublisherInfoMacro) Objects.requireNonNull(publisherInfoMacro);
        this.regulationInfoMacros = (RegulationInfoMacros) Objects.requireNonNull(regulationInfoMacros);
        this.verificationInfoMacros = (VerificationInfoMacros) Objects.requireNonNull(verificationInfoMacros);
        this.clickInfoMacros = (ClickInfoMacros) Objects.requireNonNull(clickInfoMacros);
        this.errorInfoMacros = (ErrorInfoMacros) Objects.requireNonNull(errorInfoMacros);
    }

    @NonNull
    private Map<String, String> createMacros(@NonNull PlayerState playerState) {
        return Maps.merge(this.adBreakInfoMacros.m38723d(playerState), this.capabilitiesInfoMacro.m38721a(), this.clientInfoMacros.m38715c(), this.genericMacros.m38720a(), this.playerStateInfoMacros.m38712c(playerState), this.publisherInfoMacro.m38710b(), this.regulationInfoMacros.m38706d(), this.verificationInfoMacros.m38705a(), this.clickInfoMacros.m38718b(playerState.clickPositionX, playerState.clickPositionY), this.errorInfoMacros.m38722a(playerState.errorCode));
    }

    @NonNull
    private String inject(@NonNull String str, @NonNull Map<String, String> map) {
        return (String) Maps.reduce(map, str, new BiFunction() { // from class: com.smaato.sdk.video.vast.tracking.macro.c0
            {
                MacroInjector.this = this;
            }

            @Override // com.smaato.sdk.core.util.p574fi.BiFunction
            public final Object apply(Object obj, Object obj2) {
                String lambda$inject$0;
                lambda$inject$0 = MacroInjector.this.lambda$inject$0((Map.Entry) obj, (String) obj2);
                return lambda$inject$0;
            }
        });
    }

    public /* synthetic */ String lambda$inject$0(Map.Entry entry, String str) {
        return str.replace((CharSequence) entry.getKey(), this.uriUtils.encodeQueryString((String) entry.getValue()));
    }

    @NonNull
    public String injectMacros(@NonNull String str, @NonNull PlayerState playerState) {
        return inject(str, createMacros(playerState));
    }

    @NonNull
    public Set<String> injectMacros(@NonNull Collection<String> collection, @NonNull PlayerState playerState) {
        Map<String, String> createMacros = createMacros(playerState);
        HashSet hashSet = new HashSet(collection.size());
        for (String str : collection) {
            hashSet.add(inject(str, createMacros));
        }
        return hashSet;
    }
}
